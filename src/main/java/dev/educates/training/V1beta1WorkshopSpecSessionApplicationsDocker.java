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

import dev.educates.training.V1beta1WorkshopSpecEnvironmentAssetsIngress;
import dev.educates.training.V1beta1WorkshopSpecSessionApplicationsDockerCompose;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionApplicationsDocker
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionApplicationsDocker {
  public static final String SERIALIZED_NAME_COMPOSE = "compose";
  @SerializedName(SERIALIZED_NAME_COMPOSE)
  private V1beta1WorkshopSpecSessionApplicationsDockerCompose compose;

  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private String memory;

  public static final String SERIALIZED_NAME_SOCKET = "socket";
  @SerializedName(SERIALIZED_NAME_SOCKET)
  private V1beta1WorkshopSpecEnvironmentAssetsIngress socket;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private String storage;


  public V1beta1WorkshopSpecSessionApplicationsDocker compose(V1beta1WorkshopSpecSessionApplicationsDockerCompose compose) {
    
    this.compose = compose;
    return this;
  }

   /**
   * Get compose
   * @return compose
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionApplicationsDockerCompose getCompose() {
    return compose;
  }


  public void setCompose(V1beta1WorkshopSpecSessionApplicationsDockerCompose compose) {
    this.compose = compose;
  }


  public V1beta1WorkshopSpecSessionApplicationsDocker enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public V1beta1WorkshopSpecSessionApplicationsDocker memory(String memory) {
    
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemory() {
    return memory;
  }


  public void setMemory(String memory) {
    this.memory = memory;
  }


  public V1beta1WorkshopSpecSessionApplicationsDocker socket(V1beta1WorkshopSpecEnvironmentAssetsIngress socket) {
    
    this.socket = socket;
    return this;
  }

   /**
   * Get socket
   * @return socket
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentAssetsIngress getSocket() {
    return socket;
  }


  public void setSocket(V1beta1WorkshopSpecEnvironmentAssetsIngress socket) {
    this.socket = socket;
  }


  public V1beta1WorkshopSpecSessionApplicationsDocker storage(String storage) {
    
    this.storage = storage;
    return this;
  }

   /**
   * Get storage
   * @return storage
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorage() {
    return storage;
  }


  public void setStorage(String storage) {
    this.storage = storage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionApplicationsDocker v1beta1WorkshopSpecSessionApplicationsDocker = (V1beta1WorkshopSpecSessionApplicationsDocker) o;
    return Objects.equals(this.compose, v1beta1WorkshopSpecSessionApplicationsDocker.compose) &&
        Objects.equals(this.enabled, v1beta1WorkshopSpecSessionApplicationsDocker.enabled) &&
        Objects.equals(this.memory, v1beta1WorkshopSpecSessionApplicationsDocker.memory) &&
        Objects.equals(this.socket, v1beta1WorkshopSpecSessionApplicationsDocker.socket) &&
        Objects.equals(this.storage, v1beta1WorkshopSpecSessionApplicationsDocker.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(compose, enabled, memory, socket, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionApplicationsDocker {\n");
    sb.append("    compose: ").append(toIndentedString(compose)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
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

