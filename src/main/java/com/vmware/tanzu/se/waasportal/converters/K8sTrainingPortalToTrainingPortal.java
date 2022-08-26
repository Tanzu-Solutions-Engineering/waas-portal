package com.vmware.tanzu.se.waasportal.converters;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpec;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecEnv;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecWorkshops;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalStatus;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalStatusLearningcenter;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalStatusLearningcenterCredentials;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortalWorkshop;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal.TrainingPortalBuilder;

import org.springframework.core.convert.converter.Converter;

public class K8sTrainingPortalToTrainingPortal
  implements Converter<V1beta1TrainingPortal, TrainingPortal> {

    @Override
    public TrainingPortal convert(V1beta1TrainingPortal from) {
      ZoneId zone = ZoneId.of(from.getMetadata().getAnnotations().get("waas/timezone"));
      TrainingPortalBuilder trainingPortal = TrainingPortal.builder()
        .name(from.getMetadata().getName())
        .zone(zone)
        .expires(LocalDateTime.ofInstant(Instant.parse(from.getMetadata().getAnnotations().get("janitor/expires")), zone))
        .owner(String.format("%s@%s", 
            from.getMetadata().getLabels().get("waas/owner-email-prefix"),
            from.getMetadata().getLabels().get("waas/owner-email-domain")
          )
        );
      
      V1beta1TrainingPortalStatus status = from.getStatus();
      if(status != null) {
        V1beta1TrainingPortalStatusLearningcenter statusLearningcenter = status.getLearningcenter();
        if(statusLearningcenter != null) {
          trainingPortal.url(statusLearningcenter.getUrl());
          V1beta1TrainingPortalStatusLearningcenterCredentials creds = statusLearningcenter.getCredentials();
          if(creds != null) {
            V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin adminCreds = creds.getAdmin();
            trainingPortal.adminUsername(adminCreds.getUsername());
            trainingPortal.adminPassword(adminCreds.getPassword());
          }
        }
      }

      V1beta1TrainingPortalSpec spec = from.getSpec();
      if(spec != null) {
        ArrayList<TrainingPortalWorkshop> workshops = new ArrayList<TrainingPortalWorkshop>();
        List<V1beta1TrainingPortalSpecWorkshops> k8sObjWorkshops = spec.getWorkshops();
        if(k8sObjWorkshops != null) {
          for(V1beta1TrainingPortalSpecWorkshops workshop : spec.getWorkshops()){
            List<V1beta1TrainingPortalSpecEnv> envList = workshop.getEnv();
            Map<String, String> envMap = new HashMap<>();
            if(envList != null) {
              for(V1beta1TrainingPortalSpecEnv env : workshop.getEnv()) {
                envMap.put(env.getName(), env.getValue());
              }
            }
            workshops.add(TrainingPortalWorkshop.builder()
              .name(workshop.getName())
              .capacity(workshop.getCapacity())
              .env(envMap)
              .expires(workshop.getExpires())
              .initial(workshop.getInitial())
              .orphaned(workshop.getOrphaned())
              .reserved(workshop.getReserved())
              .build());
          }
        }
        trainingPortal.workshops(workshops.toArray(new TrainingPortalWorkshop[workshops.size()]));
      }

      return trainingPortal.build();
        
    }
}