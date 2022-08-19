package com.vmware.tanzu.se.waasportal.converters;

import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortal;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpec;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecWorkshops;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortalWorkshop;

import org.springframework.core.convert.converter.Converter;

import io.kubernetes.client.openapi.models.V1ObjectMeta;

import static java.util.Map.entry;

import java.util.Map;    

public class TrainingPortalToK8sTrainingPortal
  implements Converter<TrainingPortal, V1beta1TrainingPortal> {

    public static final String OWNER_EMAIL_DOMAIN_ANNOTATION = "waas/owner-email-domain";
    public static final String OWNER_EMAIL_PREFIX_ANNOTATION = "waas/owner-email-prefix";
    public static final String EXPIRY_ANNOTATION = "janitor/expires";
    public static final String EXPIRY_TIMEZONE_ANNOTATION = "waas/timezone";

    @Override
    public V1beta1TrainingPortal convert(TrainingPortal from) {
      V1beta1TrainingPortal converted = new V1beta1TrainingPortal();
      converted.setApiVersion("learningcenter.tanzu.vmware.com/v1beta1");
      converted.setKind("TrainingPortal");

      V1ObjectMeta metadata = new V1ObjectMeta();
      metadata.setName(from.getName());
      String ownerEmail[] = from.getOwner().split("@");
      metadata.setAnnotations(Map.ofEntries(
        entry(EXPIRY_ANNOTATION, from.getExpires().atZone(from.getZone()).toInstant().toString()),
        entry(EXPIRY_TIMEZONE_ANNOTATION, from.getZone().toString())
      ));
      metadata.setLabels(Map.ofEntries(
        entry(OWNER_EMAIL_PREFIX_ANNOTATION, ownerEmail[0]),
        entry(OWNER_EMAIL_DOMAIN_ANNOTATION, ownerEmail[1])
      ));
      converted.setMetadata(metadata);

      V1beta1TrainingPortalSpec spec = new V1beta1TrainingPortalSpec();
      for( TrainingPortalWorkshop workshop : from.getWorkshops()) {
        V1beta1TrainingPortalSpecWorkshops workshopsItem = new V1beta1TrainingPortalSpecWorkshops();
        spec.addWorkshopsItem(
          workshopsItem.name(workshop.getName())
            .capacity(workshop.getCapacity())
            .reserved(workshop.getReserved())
            .orphaned(workshop.getOrphaned())
            .expires(workshop.getExpires())
        );
      }
      converted.setSpec(spec);
      
      return converted;
    }
}