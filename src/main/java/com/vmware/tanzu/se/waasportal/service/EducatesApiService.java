package com.vmware.tanzu.se.waasportal.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import dev.educates.training.V1beta1TrainingPortal;
import dev.educates.training.V1beta1TrainingPortalList;
import dev.educates.training.V1beta1Workshop;
import dev.educates.training.V1beta1WorkshopList;
import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.ApisApi;
import io.kubernetes.client.openapi.models.V1APIGroupList;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

@Service
public class EducatesApiService {
  private ApiClient apiClient;

  private static String LEARNING_CENTER_GV = "learningcenter.tanzu.vmware.com/v1beta1";
  private static String EDUCATES_GV = "training.educates.dev/v1beta1";

  private EnvType envType;

  public EducatesApiService(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public EnvType getEnvType() {
    if (envType == null) {
      ApisApi api = new ApisApi(apiClient);
      V1APIGroupList apiVersions = new V1APIGroupList();
      try {
        apiVersions = api.getAPIVersions();
      } catch (ApiException e) {
        throw new RuntimeException(e);
      }
      Set<String> groupVersionSet = apiVersions.getGroups().stream()
          .map(apiVersionItem -> apiVersionItem.getPreferredVersion().getGroupVersion())
          .collect(Collectors.toSet());
      if (groupVersionSet.contains(LEARNING_CENTER_GV)) {
        this.envType = EnvType.LEARNING_CENTER;
      } else if (groupVersionSet.contains(EDUCATES_GV)) {
        this.envType = EnvType.EDUCATES;
      } else {
        throw new RuntimeException(
            "Cannot find expected API Resources for Learning Center or Educates in this cluster");
      }
    }
    return envType;
  }

  public GenericKubernetesApi<? extends KubernetesObject, ? extends KubernetesListObject> getTrainingPortalClient() {
    if (EnvType.LEARNING_CENTER == getEnvType()) {
      return new GenericKubernetesApi<com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal, com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalList>(
          com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal.class,
          com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalList.class, "learningcenter.tanzu.vmware.com",
          "v1beta1", "trainingportals", apiClient);

    } else if (EnvType.EDUCATES == getEnvType()) {
      return new GenericKubernetesApi<>(V1beta1TrainingPortal.class, V1beta1TrainingPortalList.class,
          "training.educates.dev", "v1beta1", "trainingportals", apiClient);
    } else {
      throw new RuntimeException("Can't determine environment type (Learning Center vs Educates).");
    }
  }

  public GenericKubernetesApi<? extends KubernetesObject, ? extends KubernetesListObject> getWorkshopClient() {
    if (EnvType.LEARNING_CENTER == getEnvType()) {
      return new GenericKubernetesApi<>(
          com.vmware.tanzu.learningcenter.models.V1beta1Workshop.class,
          com.vmware.tanzu.learningcenter.models.V1beta1WorkshopList.class, "learningcenter.tanzu.vmware.com",
          "v1beta1", "workshops", apiClient);

    } else if (EnvType.EDUCATES == getEnvType()) {
      return new GenericKubernetesApi<>(V1beta1Workshop.class, V1beta1WorkshopList.class,
          "training.educates.dev", "v1beta1", "workshops", apiClient);
    } else {
      throw new RuntimeException("Can't determine environment type (Learning Center vs Educates).");
    }
  }

  enum EnvType {
    LEARNING_CENTER, EDUCATES
  }

}
