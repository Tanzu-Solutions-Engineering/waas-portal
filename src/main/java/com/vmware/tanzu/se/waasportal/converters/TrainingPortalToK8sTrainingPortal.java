package com.vmware.tanzu.se.waasportal.converters;

import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpec;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecWorkshops;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;

import org.springframework.core.convert.converter.Converter;

import io.kubernetes.client.openapi.models.V1ObjectMeta;

import static java.util.Map.entry;

import java.util.Collections;
import java.util.Map;    

public class TrainingPortalToK8sTrainingPortal
  implements Converter<TrainingPortal, V1beta1TrainingPortal> {

    @Override
    public V1beta1TrainingPortal convert(TrainingPortal from) {
      V1beta1TrainingPortal converted = new V1beta1TrainingPortal();
      converted.setApiVersion("learningcenter.tanzu.vmware.com/v1beta1");
      converted.setKind("TrainingPortal");

      V1ObjectMeta metadata = new V1ObjectMeta();
      metadata.setName(from.getName());
      String ownerEmail[] = from.getOwner().split("@");
      metadata.setAnnotations(Collections.singletonMap("janitor/expires", from.getExpires().toString()));
      metadata.setLabels(Map.ofEntries(
        entry("waas/owner-email-prefix", ownerEmail[0]),
        entry("waas/owner-email-domain", ownerEmail[1])
      ));
      converted.setMetadata(metadata);

      V1beta1TrainingPortalSpec spec = new V1beta1TrainingPortalSpec();
      for( String workshop : from.getWorkshops()) {
        V1beta1TrainingPortalSpecWorkshops workshopsItem = new V1beta1TrainingPortalSpecWorkshops();
        spec.addWorkshopsItem(
          workshopsItem.name(workshop)
            .capacity(20)
            .reserved(2)
            .orphaned("20m")
            .expires("60m")
        );
      }
      converted.setSpec(spec);
      
      return converted;
    }
}