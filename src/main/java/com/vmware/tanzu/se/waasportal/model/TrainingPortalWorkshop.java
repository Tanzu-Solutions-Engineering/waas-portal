package com.vmware.tanzu.se.waasportal.model;

import java.util.Map;

public class TrainingPortalWorkshop {
  Integer capacity;
  Map<String, String> env;
  String expires;
  Integer initial;
  String name;
  String orphaned;
  Integer reserved;

  public TrainingPortalWorkshop() {
  }

  public TrainingPortalWorkshop(Integer capacity, Map<String, String> env, String expires, Integer initial, String name,
      String orphaned, Integer reserved) {
    this.capacity = capacity;
    this.env = env;
    this.expires = expires;
    this.initial = initial;
    this.name = name;
    this.orphaned = orphaned;
    this.reserved = reserved;
  }

  public Integer getCapacity() {
    return capacity;
  }

  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }

  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public String getExpires() {
    return expires;
  }

  public void setExpires(String expires) {
    this.expires = expires;
  }

  public Integer getInitial() {
    return initial;
  }

  public void setInitial(Integer initial) {
    this.initial = initial;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrphaned() {
    return orphaned;
  }

  public void setOrphaned(String orphaned) {
    this.orphaned = orphaned;
  }

  public Integer getReserved() {
    return reserved;
  }

  public void setReserved(Integer reserved) {
    this.reserved = reserved;
  }

  public static TrainingPortalWorkshopBuilder builder() {
    return new TrainingPortalWorkshopBuilder();
  }

  public static class TrainingPortalWorkshopBuilder {
    Integer capacity;
    Map<String, String> env;
    String expires;
    Integer initial;
    String name;
    String orphaned;
    Integer reserved;

    TrainingPortalWorkshopBuilder() {
    }

    public TrainingPortalWorkshopBuilder capacity(Integer capacity) {
      this.capacity = capacity;
      return this;
    }

    public TrainingPortalWorkshopBuilder env(Map<String, String> env) {
      this.env = env;
      return this;
    }

    public TrainingPortalWorkshopBuilder expires(String expires) {
      this.expires = expires;
      return this;
    }

    public TrainingPortalWorkshopBuilder initial(Integer initial) {
      this.initial = initial;
      return this;
    }

    public TrainingPortalWorkshopBuilder name(String name) {
      this.name = name;
      return this;
    }

    public TrainingPortalWorkshopBuilder orphaned(String orphaned) {
      this.orphaned = orphaned;
      return this;
    }

    public TrainingPortalWorkshopBuilder reserved(Integer reserved) {
      this.reserved = reserved;
      return this;
    }

    public TrainingPortalWorkshop build() {
      return new TrainingPortalWorkshop(capacity, env, expires, initial, name,
          orphaned, reserved);
    }
  }
}