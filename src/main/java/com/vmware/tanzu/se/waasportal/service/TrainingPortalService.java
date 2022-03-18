package com.vmware.tanzu.se.waasportal.service;

import java.util.ArrayList;
import java.util.List;

import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalList;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.util.generic.GenericKubernetesApi;
import io.kubernetes.client.util.generic.options.ListOptions;

@Service
public class TrainingPortalService {

    private ApiClient apiClient;
    private ConversionService conversionService;

    @Autowired
    public TrainingPortalService(ApiClient apiClient, ConversionService conversionService) {
        this.apiClient = apiClient;
        this.conversionService = conversionService;
    }

    public TrainingPortal[] getTrainingPortalsForUser(String user) {
        GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList> trainingPortalClient = 
            new GenericKubernetesApi<>(V1beta1TrainingPortal.class, V1beta1TrainingPortalList.class, "learningcenter.tanzu.vmware.com", "v1beta1", "trainingportals", apiClient);

        String userParts[] = user.split("@");
        String ownerEmailPrefix = userParts[0];
        String ownerEmailDomain = userParts[1];

        ListOptions ownerLabels = new ListOptions();
        ownerLabels.setLabelSelector(String.format("waas/owner-email-prefix=%s,waas/owner-email-domain=%s", ownerEmailPrefix, ownerEmailDomain));

        V1beta1TrainingPortalList portalList;
        try {
            portalList = trainingPortalClient.list(ownerLabels)
                .throwsApiException().getObject();
        }
        catch(ApiException e) {
            throw new RuntimeException(e);
        }

        List<TrainingPortal> portals = new ArrayList<TrainingPortal>();
        for(V1beta1TrainingPortal portal : portalList.getItems()) {
            portals.add(conversionService.convert(portal, TrainingPortal.class));
        }
        return portals.toArray(new TrainingPortal[portals.size()]);
    }

    public TrainingPortal getTrainingPortal(String name) {
        GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList> trainingPortalClient = 
            new GenericKubernetesApi<>(V1beta1TrainingPortal.class, V1beta1TrainingPortalList.class, "learningcenter.tanzu.vmware.com", "v1beta1", "trainingportals", apiClient);

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
        GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList> trainingPortalClient = 
            new GenericKubernetesApi<>(V1beta1TrainingPortal.class, V1beta1TrainingPortalList.class, "learningcenter.tanzu.vmware.com", "v1beta1", "trainingportals", apiClient);
 
        try {
            V1beta1TrainingPortal savedTrainingPortal = trainingPortalClient.create(
                conversionService.convert(trainingPortal, V1beta1TrainingPortal.class)
            )
            .throwsApiException()
            .getObject();
            return conversionService.convert(savedTrainingPortal, TrainingPortal.class);
        }
        catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String name) {
        GenericKubernetesApi<V1beta1TrainingPortal,V1beta1TrainingPortalList> trainingPortalClient = 
            new GenericKubernetesApi<>(V1beta1TrainingPortal.class, V1beta1TrainingPortalList.class, "learningcenter.tanzu.vmware.com", "v1beta1", "trainingportals", apiClient);
 
        try {
            trainingPortalClient.delete(name).throwsApiException();
        }
        catch (ApiException e) {
            throw new RuntimeException(e);
        }
    }
    
}
