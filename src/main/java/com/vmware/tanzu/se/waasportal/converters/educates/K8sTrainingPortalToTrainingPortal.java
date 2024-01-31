package com.vmware.tanzu.se.waasportal.converters.educates;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.convert.converter.Converter;

import com.vmware.tanzu.se.waasportal.model.TrainingPortal;
import com.vmware.tanzu.se.waasportal.model.TrainingPortalWorkshop;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal.AuthType;
import com.vmware.tanzu.se.waasportal.model.TrainingPortal.TrainingPortalBuilder;

import dev.educates.training.V1beta1TrainingPortal;
import dev.educates.training.V1beta1TrainingPortalSpec;
import dev.educates.training.V1beta1TrainingPortalSpecPortal;
import dev.educates.training.V1beta1TrainingPortalSpecPortalLabels;
import dev.educates.training.V1beta1TrainingPortalSpecPortalRegistration;
import dev.educates.training.V1beta1TrainingPortalSpecWorkshops;
import dev.educates.training.V1beta1TrainingPortalStatus;
import dev.educates.training.V1beta1TrainingPortalStatusEducates;
import dev.educates.training.V1beta1TrainingPortalStatusEducatesCredentials;
import dev.educates.training.V1beta1TrainingPortalStatusEducatesCredentialsAdmin;

public class K8sTrainingPortalToTrainingPortal
    implements Converter<V1beta1TrainingPortal, TrainingPortal> {

  @Override
  public TrainingPortal convert(V1beta1TrainingPortal from) {
    ZoneId zone = ZoneId.of(from.getMetadata().getAnnotations().get("waas/timezone"));
    TrainingPortalBuilder trainingPortal = TrainingPortal.builder()
        .name(from.getMetadata().getName())
        .zone(zone)
        .expires(
            LocalDateTime.ofInstant(Instant.parse(from.getMetadata().getAnnotations().get("janitor/expires")), zone))
        .owner("%s@%s".formatted(
        from.getMetadata().getLabels().get("waas/owner-email-prefix"),
        from.getMetadata().getLabels().get("waas/owner-email-domain")));

    V1beta1TrainingPortalStatus status = from.getStatus();
    if (status != null) {
      V1beta1TrainingPortalStatusEducates statusEducates = status.getEducates();
      if (statusEducates != null) {
        trainingPortal.url(statusEducates.getUrl());
        V1beta1TrainingPortalStatusEducatesCredentials creds = statusEducates.getCredentials();
        if (creds != null) {
          V1beta1TrainingPortalStatusEducatesCredentialsAdmin adminCreds = creds.getAdmin();
          trainingPortal.adminUsername(adminCreds.getUsername());
          trainingPortal.adminPassword(adminCreds.getPassword());
        }
      }
    }

    V1beta1TrainingPortalSpec spec = from.getSpec();
    if (spec != null) {
      ArrayList<TrainingPortalWorkshop> workshops = new ArrayList<TrainingPortalWorkshop>();
      List<V1beta1TrainingPortalSpecWorkshops> k8sObjWorkshops = spec.getWorkshops();
      if (k8sObjWorkshops != null) {
        for (V1beta1TrainingPortalSpecWorkshops workshop : spec.getWorkshops()) {
          List<V1beta1TrainingPortalSpecPortalLabels> envList = workshop.getEnv();
          Map<String, String> envMap = new HashMap<>();
          if (envList != null) {
            for (V1beta1TrainingPortalSpecPortalLabels env : workshop.getEnv()) {
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

      trainingPortal.authType(TrainingPortal.AuthType.ONE_STEP);
      V1beta1TrainingPortalSpecPortal k8sObjPortal = spec.getPortal();
      if (k8sObjPortal != null) {
        V1beta1TrainingPortalSpecPortalRegistration k8sObjReg = k8sObjPortal.getRegistration();
        if (k8sObjReg != null) {
          String k8sObjRegType = k8sObjReg.getType();
          if ("anonymous".equals(k8sObjRegType)) {
            trainingPortal.authType(AuthType.ANONYMOUS);
          }
        }
        trainingPortal.portalPassword(k8sObjPortal.getPassword());
      }
    }

    return trainingPortal.build();

  }
}