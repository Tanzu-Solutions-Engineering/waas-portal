package com.vmware.tanzu.se.waasportal.service;

import java.util.ArrayList;
import java.util.List;

import com.vmware.tanzu.learningcenter.models.V1beta1Workshop;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopList;
import com.vmware.tanzu.se.waasportal.model.Workshop;

import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import io.kubernetes.client.common.KubernetesListObject;
import io.kubernetes.client.common.KubernetesObject;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

@Service
public class WorkshopService {
  
  private EducatesApiService apiService;
  private ConversionService conversionService;

  public WorkshopService(EducatesApiService apiService, ConversionService conversionService) {
    this.apiService = apiService;
    this.conversionService = conversionService;
  }

  public Workshop[] getAvailableWorkshops() {
      GenericKubernetesApi<? extends KubernetesObject,? extends KubernetesListObject> workshopClient = apiService.getWorkshopClient();
      KubernetesListObject workshopList = new EmptyKubernetesListObject();
      try {
          workshopList = workshopClient.list()
              .throwsApiException().getObject();
      }
      catch(ApiException e) {
          throw new RuntimeException(e);
      }

      List<Workshop> workshops = new ArrayList<Workshop>();
      for(KubernetesObject workshop : workshopList.getItems()) {
        workshops.add(conversionService.convert(workshop, Workshop.class));
      }
      return workshops.toArray(new Workshop[workshops.size()]);

  }
}
