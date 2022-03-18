package com.vmware.tanzu.se.waasportal.model;

public class Workshop {
  
  public static WorkshopBuilder builder() {
    return new WorkshopBuilder();
  }

  public static class WorkshopBuilder {
    private String name;
    private String title;
    private String description;

    public WorkshopBuilder name(String name) {
      this.name = name;
      return this;
    }

    public WorkshopBuilder title(String title) {
      this.title = title;
      return this;
    }

    public WorkshopBuilder description(String description) {
      this.description = description;
      return this;
    }

    public Workshop build() {
      return new Workshop(name, title, description);
    }
  }

  private String name;
  private String title;
  private String description;

  Workshop(String name, String title, String description) {
    this.name = name;
    this.title = title;
    this.description = description;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
