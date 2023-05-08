package com.vmware.tanzu.se.waasportal.converters;

import com.vmware.tanzu.learningcenter.models.V1beta1Workshop;
import com.vmware.tanzu.se.waasportal.model.Workshop;

import org.springframework.core.convert.converter.Converter;

public class K8sWorkshopToWorkshop
  implements Converter<V1beta1Workshop, Workshop> {

    @Override
    public Workshop convert(V1beta1Workshop from) {

      return Workshop.builder()
        .name(from.getMetadata().getName())
        .title(from.getSpec().getTitle())
        .description(from.getSpec().getDescription())
        .url(from.getSpec().getUrl())
        .build();
        
    }
}