package com.vmware.tanzu.se.waasportal;

import com.vmware.tanzu.se.waasportal.converters.educates.K8sTrainingPortalToTrainingPortal;
import com.vmware.tanzu.se.waasportal.converters.educates.K8sWorkshopToWorkshop;
import com.vmware.tanzu.se.waasportal.converters.educates.TrainingPortalToK8sTrainingPortal;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new com.vmware.tanzu.se.waasportal.converters.TrainingPortalToK8sTrainingPortal());
        registry.addConverter(new com.vmware.tanzu.se.waasportal.converters.K8sTrainingPortalToTrainingPortal());
        registry.addConverter(new com.vmware.tanzu.se.waasportal.converters.K8sWorkshopToWorkshop());
        registry.addConverter(new TrainingPortalToK8sTrainingPortal());
        registry.addConverter(new K8sTrainingPortalToTrainingPortal());
        registry.addConverter(new K8sWorkshopToWorkshop());

    }
}