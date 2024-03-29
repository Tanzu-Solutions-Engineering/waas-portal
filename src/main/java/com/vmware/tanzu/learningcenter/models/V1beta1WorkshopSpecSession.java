/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.vmware.tanzu.learningcenter.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecEnv;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionApplications;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionDashboards;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionIngresses;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionNamespaces;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionResources;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionSecurity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSpecSession
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1WorkshopSpecSession {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private V1beta1WorkshopSpecSessionApplications applications;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private String budget;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private List<V1beta1WorkshopSpecSessionDashboards> dashboards = null;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1beta1TrainingPortalSpecEnv> env = null;

  public static final String SERIALIZED_NAME_INGRESSES = "ingresses";
  @SerializedName(SERIALIZED_NAME_INGRESSES)
  private List<V1beta1WorkshopSpecSessionIngresses> ingresses = null;

  public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private V1beta1WorkshopSpecSessionNamespaces namespaces;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<Object> objects = null;

  public static final String SERIALIZED_NAME_PATCHES = "patches";
  @SerializedName(SERIALIZED_NAME_PATCHES)
  private Object patches;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1beta1WorkshopSpecSessionResources resources;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private V1beta1WorkshopSpecSessionSecurity security;


  public V1beta1WorkshopSpecSession applications(V1beta1WorkshopSpecSessionApplications applications) {
    
    this.applications = applications;
    return this;
  }

   /**
   * Get applications
   * @return applications
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionApplications getApplications() {
    return applications;
  }


  public void setApplications(V1beta1WorkshopSpecSessionApplications applications) {
    this.applications = applications;
  }


  public V1beta1WorkshopSpecSession budget(String budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBudget() {
    return budget;
  }


  public void setBudget(String budget) {
    this.budget = budget;
  }


  public V1beta1WorkshopSpecSession dashboards(List<V1beta1WorkshopSpecSessionDashboards> dashboards) {
    
    this.dashboards = dashboards;
    return this;
  }

  public V1beta1WorkshopSpecSession addDashboardsItem(V1beta1WorkshopSpecSessionDashboards dashboardsItem) {
    if (this.dashboards == null) {
      this.dashboards = new ArrayList<>();
    }
    this.dashboards.add(dashboardsItem);
    return this;
  }

   /**
   * Get dashboards
   * @return dashboards
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecSessionDashboards> getDashboards() {
    return dashboards;
  }


  public void setDashboards(List<V1beta1WorkshopSpecSessionDashboards> dashboards) {
    this.dashboards = dashboards;
  }


  public V1beta1WorkshopSpecSession env(List<V1beta1TrainingPortalSpecEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1beta1WorkshopSpecSession addEnvItem(V1beta1TrainingPortalSpecEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1TrainingPortalSpecEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1beta1TrainingPortalSpecEnv> env) {
    this.env = env;
  }


  public V1beta1WorkshopSpecSession ingresses(List<V1beta1WorkshopSpecSessionIngresses> ingresses) {
    
    this.ingresses = ingresses;
    return this;
  }

  public V1beta1WorkshopSpecSession addIngressesItem(V1beta1WorkshopSpecSessionIngresses ingressesItem) {
    if (this.ingresses == null) {
      this.ingresses = new ArrayList<>();
    }
    this.ingresses.add(ingressesItem);
    return this;
  }

   /**
   * Get ingresses
   * @return ingresses
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecSessionIngresses> getIngresses() {
    return ingresses;
  }


  public void setIngresses(List<V1beta1WorkshopSpecSessionIngresses> ingresses) {
    this.ingresses = ingresses;
  }


  public V1beta1WorkshopSpecSession namespaces(V1beta1WorkshopSpecSessionNamespaces namespaces) {
    
    this.namespaces = namespaces;
    return this;
  }

   /**
   * Get namespaces
   * @return namespaces
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespaces getNamespaces() {
    return namespaces;
  }


  public void setNamespaces(V1beta1WorkshopSpecSessionNamespaces namespaces) {
    this.namespaces = namespaces;
  }


  public V1beta1WorkshopSpecSession objects(List<Object> objects) {
    
    this.objects = objects;
    return this;
  }

  public V1beta1WorkshopSpecSession addObjectsItem(Object objectsItem) {
    if (this.objects == null) {
      this.objects = new ArrayList<>();
    }
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getObjects() {
    return objects;
  }


  public void setObjects(List<Object> objects) {
    this.objects = objects;
  }


  public V1beta1WorkshopSpecSession patches(Object patches) {
    
    this.patches = patches;
    return this;
  }

   /**
   * Get patches
   * @return patches
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPatches() {
    return patches;
  }


  public void setPatches(Object patches) {
    this.patches = patches;
  }


  public V1beta1WorkshopSpecSession resources(V1beta1WorkshopSpecSessionResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionResources getResources() {
    return resources;
  }


  public void setResources(V1beta1WorkshopSpecSessionResources resources) {
    this.resources = resources;
  }


  public V1beta1WorkshopSpecSession role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public V1beta1WorkshopSpecSession security(V1beta1WorkshopSpecSessionSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionSecurity getSecurity() {
    return security;
  }


  public void setSecurity(V1beta1WorkshopSpecSessionSecurity security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSession v1beta1WorkshopSpecSession = (V1beta1WorkshopSpecSession) o;
    return Objects.equals(this.applications, v1beta1WorkshopSpecSession.applications) &&
        Objects.equals(this.budget, v1beta1WorkshopSpecSession.budget) &&
        Objects.equals(this.dashboards, v1beta1WorkshopSpecSession.dashboards) &&
        Objects.equals(this.env, v1beta1WorkshopSpecSession.env) &&
        Objects.equals(this.ingresses, v1beta1WorkshopSpecSession.ingresses) &&
        Objects.equals(this.namespaces, v1beta1WorkshopSpecSession.namespaces) &&
        Objects.equals(this.objects, v1beta1WorkshopSpecSession.objects) &&
        Objects.equals(this.patches, v1beta1WorkshopSpecSession.patches) &&
        Objects.equals(this.resources, v1beta1WorkshopSpecSession.resources) &&
        Objects.equals(this.role, v1beta1WorkshopSpecSession.role) &&
        Objects.equals(this.security, v1beta1WorkshopSpecSession.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, budget, dashboards, env, ingresses, namespaces, objects, patches, resources, role, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSession {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    ingresses: ").append(toIndentedString(ingresses)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    ***REMOVED*** ").append(toIndentedString(security)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

