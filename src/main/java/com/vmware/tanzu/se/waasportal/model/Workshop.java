package com.vmware.tanzu.se.waasportal.model;

public class Workshop {
  
  public static WorkshopBuilder builder() {
    return new WorkshopBuilder();
  }

  public static class WorkshopBuilder {
    private String name;
    private String title;
    private String description;
    private String url;

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

    public WorkshopBuilder url(String url) {
      this.url = url;
      return this;
    }

    public Workshop build() {
      return new Workshop(name, title, description, url);
    }
  }

  private String name;
  private String title;
  private String description;
  private String url;

  Workshop(String name, String title, String description, String url) {
    this.name = name;
    this.title = title;
    this.description = description;
    this.url = url;
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

}
