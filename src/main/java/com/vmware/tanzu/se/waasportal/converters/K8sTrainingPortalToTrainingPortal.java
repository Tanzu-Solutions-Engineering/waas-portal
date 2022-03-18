package com.vmware.tanzu.se.waasportal.converters;

import java.time.Instant;
import java.util.ArrayList;

import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpec;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecWorkshops;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal.TrainingPortalBuilder;

import org.springframework.core.convert.converter.Converter;

public class K8sTrainingPortalToTrainingPortal
  implements Converter<V1beta1TrainingPortal, TrainingPortal> {

    @Override
    public TrainingPortal convert(V1beta1TrainingPortal from) {

      TrainingPortalBuilder trainingPortal = TrainingPortal.builder()
        .name(from.getMetadata().getName())
        .expires(Instant.parse(from.getMetadata().getAnnotations().get("janitor/expires")))
        .owner(String.format("%s@%s", 
            from.getMetadata().getAnnotations().get("waas/owner-email-prefix"),
            from.getMetadata().getAnnotations().get("waas/owner-email-domain")
          )
        )
        .url(from.getStatus() != null ? from.getStatus().getLearningcenter().getUrl() : null);

      V1beta1TrainingPortalSpec spec = from.getSpec();
      if(spec != null) {
        ArrayList<String> workshops = new ArrayList<String>();
        for(V1beta1TrainingPortalSpecWorkshops workshop : spec.getWorkshops()){
          workshops.add(workshop.getName());
        }
        trainingPortal.workshops(workshops.toArray(new String[workshops.size()]));
      }

      return trainingPortal.build();
        
    }
}