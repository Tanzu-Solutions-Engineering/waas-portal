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


package dev.educates.training;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import dev.educates.training.V1beta1WorkshopSpecSessionApplications;
import dev.educates.training.V1beta1WorkshopSpecSessionDashboards;
import dev.educates.training.V1beta1WorkshopSpecSessionEnv;
import dev.educates.training.V1beta1WorkshopSpecSessionEnvFrom;
import dev.educates.training.V1beta1WorkshopSpecSessionIngresses;
import dev.educates.training.V1beta1WorkshopSpecSessionNamespaces;
import dev.educates.training.V1beta1WorkshopSpecSessionResources;
import dev.educates.training.V1beta1WorkshopSpecSessionVolumeMounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSpecSession
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSession {
  public static final String SERIALIZED_NAME_APPLICATIONS = "applications";
  @SerializedName(SERIALIZED_NAME_APPLICATIONS)
  private V1beta1WorkshopSpecSessionApplications applications;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private List<V1beta1WorkshopSpecSessionDashboards> dashboards = null;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1beta1WorkshopSpecSessionEnv> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";
  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1beta1WorkshopSpecSessionEnvFrom> envFrom = null;

  public static final String SERIALIZED_NAME_INGRESSES = "ingresses";
  @SerializedName(SERIALIZED_NAME_INGRESSES)
  private List<V1beta1WorkshopSpecSessionIngresses> ingresses = null;

  public static final String SERIALIZED_NAME_INIT_CONTAINERS = "initContainers";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINERS)
  private List<Object> initContainers = null;

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

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1beta1WorkshopSpecSessionVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<Object> volumes = null;


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


  public V1beta1WorkshopSpecSession env(List<V1beta1WorkshopSpecSessionEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1beta1WorkshopSpecSession addEnvItem(V1beta1WorkshopSpecSessionEnv envItem) {
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

  public List<V1beta1WorkshopSpecSessionEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1beta1WorkshopSpecSessionEnv> env) {
    this.env = env;
  }


  public V1beta1WorkshopSpecSession envFrom(List<V1beta1WorkshopSpecSessionEnvFrom> envFrom) {
    
    this.envFrom = envFrom;
    return this;
  }

  public V1beta1WorkshopSpecSession addEnvFromItem(V1beta1WorkshopSpecSessionEnvFrom envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

   /**
   * Get envFrom
   * @return envFrom
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecSessionEnvFrom> getEnvFrom() {
    return envFrom;
  }


  public void setEnvFrom(List<V1beta1WorkshopSpecSessionEnvFrom> envFrom) {
    this.envFrom = envFrom;
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


  public V1beta1WorkshopSpecSession initContainers(List<Object> initContainers) {
    
    this.initContainers = initContainers;
    return this;
  }

  public V1beta1WorkshopSpecSession addInitContainersItem(Object initContainersItem) {
    if (this.initContainers == null) {
      this.initContainers = new ArrayList<>();
    }
    this.initContainers.add(initContainersItem);
    return this;
  }

   /**
   * Get initContainers
   * @return initContainers
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getInitContainers() {
    return initContainers;
  }


  public void setInitContainers(List<Object> initContainers) {
    this.initContainers = initContainers;
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


  public V1beta1WorkshopSpecSession volumeMounts(List<V1beta1WorkshopSpecSessionVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1beta1WorkshopSpecSession addVolumeMountsItem(V1beta1WorkshopSpecSessionVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Get volumeMounts
   * @return volumeMounts
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecSessionVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1beta1WorkshopSpecSessionVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1beta1WorkshopSpecSession volumes(List<Object> volumes) {
    
    this.volumes = volumes;
    return this;
  }

  public V1beta1WorkshopSpecSession addVolumesItem(Object volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

   /**
   * Get volumes
   * @return volumes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getVolumes() {
    return volumes;
  }


  public void setVolumes(List<Object> volumes) {
    this.volumes = volumes;
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
        Objects.equals(this.dashboards, v1beta1WorkshopSpecSession.dashboards) &&
        Objects.equals(this.env, v1beta1WorkshopSpecSession.env) &&
        Objects.equals(this.envFrom, v1beta1WorkshopSpecSession.envFrom) &&
        Objects.equals(this.ingresses, v1beta1WorkshopSpecSession.ingresses) &&
        Objects.equals(this.initContainers, v1beta1WorkshopSpecSession.initContainers) &&
        Objects.equals(this.namespaces, v1beta1WorkshopSpecSession.namespaces) &&
        Objects.equals(this.objects, v1beta1WorkshopSpecSession.objects) &&
        Objects.equals(this.patches, v1beta1WorkshopSpecSession.patches) &&
        Objects.equals(this.resources, v1beta1WorkshopSpecSession.resources) &&
        Objects.equals(this.volumeMounts, v1beta1WorkshopSpecSession.volumeMounts) &&
        Objects.equals(this.volumes, v1beta1WorkshopSpecSession.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications, dashboards, env, envFrom, ingresses, initContainers, namespaces, objects, patches, resources, volumeMounts, volumes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSession {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    ingresses: ").append(toIndentedString(ingresses)).append("\n");
    sb.append("    initContainers: ").append(toIndentedString(initContainers)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    patches: ").append(toIndentedString(patches)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

