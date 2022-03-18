package com.vmware.tanzu.se.waasportal.service;

import java.util.ArrayList;
import java.util.List;

import com.vmware.tanzu.learningcenter.models.V1beta1Workshop;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopList;
import com.vmware.tanzu.se.waasportal.model.Workshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;

@Service
public class WorkshopService {
  
  private ApiClient apiClient;
  private ConversionService conversionService;

  @Autowired
  public WorkshopService(ApiClient apiClient, ConversionService conversionService) {
    this.apiClient = apiClient;
    this.conversionService = conversionService;
  }

  public Workshop[] getAvailableWorkshops() {
    GenericKubernetesApi<V1beta1Workshop,V1beta1WorkshopList> workshopClient = 
      new GenericKubernetesApi<>(V1beta1Workshop.class, V1beta1WorkshopList.class, "learningcenter.tanzu.vmware.com", "v1beta1", "workshops", apiClient);

      V1beta1WorkshopList workshopList;
      try {
          workshopList = workshopClient.list()
              .throwsApiException().getObject();
      }
      catch(ApiException e) {
          throw new RuntimeException(e);
      }

      List<Workshop> workshops = new ArrayList<Workshop>();
      for(V1beta1Workshop workshop : workshopList.getItems()) {
        workshops.add(conversionService.convert(workshop, Workshop.class));
      }
      return workshops.toArray(new Workshop[workshops.size()]);

  }
}
