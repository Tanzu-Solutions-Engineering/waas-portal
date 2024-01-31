package com.vmware.tanzu.se.waasportal.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dev.educates.training.V1beta1TrainingPortal;
import dev.educates.training.V1beta1TrainingPortalList;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.service.EducatesApiService.EnvType;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.models.V1ListMeta;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.ListOptions;

@Service
public class TrainingPortalService {

    private EducatesApiService apiService;
    private ConversionService conversionService;

    public TrainingPortalService(EducatesApiService apiService, ConversionService conversionService) {
        this.apiService = apiService;
        this.conversionService = conversionService;
    }

    public TrainingPortal[] getTrainingPortalsForUser(String user) {
        String userParts[] = user.split("@");
        String ownerEmailPrefix = userParts[0];
        String ownerEmailDomain = userParts[1];

        ListOptions ownerLabels = new ListOptions();
        ownerLabels.setLabelSelector("waas/owner-email-prefix=%s,waas/owner-email-domain=%s".formatted(ownerEmailPrefix, ownerEmailDomain));

        List<TrainingPortal> portals = new ArrayList<TrainingPortal>();

        GenericKubernetesApi<? extends KubernetesObject,? extends KubernetesListObject> trainingPortalClient = apiService.getTrainingPortalClient();
        KubernetesListObject portalList = new EmptyKubernetesListObject();
        try {
            portalList = trainingPortalClient.list(ownerLabels)
                .throwsApiException().getObject();
        }
        catch(ApiException e) {
            throw new RuntimeException(e);
        }

        for(KubernetesObject portal : portalList.getItems()) {
            portals.add(conversionService.convert(portal, TrainingPortal.class));
        }

        return portals.toArray(new TrainingPortal[portals.size()]);
    }

    public TrainingPortal getTrainingPortal(String name) {
        GenericKubernetesApi<? extends KubernetesObject,? extends KubernetesListObject> trainingPortalClient = apiService.getTrainingPortalClient();

        TrainingPortal trainingPortal = null;
        
        try {
            trainingPortal = conversionService.convert(
                trainingPortalClient.get(name).throwsApiException().getObject(),
                TrainingPortal.class
            );
        }
        catch (ApiException e) {
            throw new RuntimeException(e);
        }

        return trainingPortal;
    }

    public TrainingPortal save(TrainingPortal trainingPortal) {
        GenericKubernetesApi<? extends KubernetesObject,? extends KubernetesListObject> unknownTrainingPortalClient = apiService.getTrainingPortalClient();

        try {
            KubernetesObject savedTrainingPortal = null;
            if(EnvType.LEARNING_CENTER == apiService.getEnvType()) {
                @SuppressWarnings("unchecked")
                GenericKubernetesApi<com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal,com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalList> trainingPortalClient = 
                    (GenericKubernetesApi<com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal,com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalList>)unknownTrainingPortalClient;
                savedTrainingPortal = trainingPortalClient.create(
                    conversionService.convert(trainingPortal, com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal.class)
                )
                .throwsApiException()
                .getObject();
            } else if (EnvType.EDUCATES == apiService.getEnvType()) {
                @SuppressWarnings("unchecked")
                GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList> trainingPortalClient = 
                    (GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList>)unknownTrainingPortalClient;
                savedTrainingPortal = trainingPortalClient.create(
                    conversionService.convert(trainingPortal, V1beta1TrainingPortal.class)
                )
                .throwsApiException()
                .getObject();
            }
            return conversionService.convert(savedTrainingPortal, TrainingPortal.class);
        }
        catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String name) {
        GenericKubernetesApi<? extends KubernetesObject,? extends KubernetesListObject> trainingPortalClient = apiService.getTrainingPortalClient();

        try {
            trainingPortalClient.delete(name).throwsApiException();
        }
        catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

}
