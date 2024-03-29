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
import dev.educates.training.V1beta1WorkshopSpecEnvironmentImagesRegistries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSpecEnvironmentImages
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecEnvironmentImages {
  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private V1beta1WorkshopSpecEnvironmentAssetsIngress ingress;

  public static final String SERIALIZED_NAME_MEMORY = "memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private String memory;

  public static final String SERIALIZED_NAME_REGISTRIES = "registries";
  @SerializedName(SERIALIZED_NAME_REGISTRIES)
  private List<V1beta1WorkshopSpecEnvironmentImagesRegistries> registries = null;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private String storage;


  public V1beta1WorkshopSpecEnvironmentImages ingress(V1beta1WorkshopSpecEnvironmentAssetsIngress ingress) {
    
    this.ingress = ingress;
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentAssetsIngress getIngress() {
    return ingress;
  }


  public void setIngress(V1beta1WorkshopSpecEnvironmentAssetsIngress ingress) {
    this.ingress = ingress;
  }


  public V1beta1WorkshopSpecEnvironmentImages memory(String memory) {
    
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


  public V1beta1WorkshopSpecEnvironmentImages registries(List<V1beta1WorkshopSpecEnvironmentImagesRegistries> registries) {
    
    this.registries = registries;
    return this;
  }

  public V1beta1WorkshopSpecEnvironmentImages addRegistriesItem(V1beta1WorkshopSpecEnvironmentImagesRegistries registriesItem) {
    if (this.registries == null) {
      this.registries = new ArrayList<>();
    }
    this.registries.add(registriesItem);
    return this;
  }

   /**
   * Get registries
   * @return registries
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecEnvironmentImagesRegistries> getRegistries() {
    return registries;
  }


  public void setRegistries(List<V1beta1WorkshopSpecEnvironmentImagesRegistries> registries) {
    this.registries = registries;
  }


  public V1beta1WorkshopSpecEnvironmentImages storage(String storage) {
    
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
    V1beta1WorkshopSpecEnvironmentImages v1beta1WorkshopSpecEnvironmentImages = (V1beta1WorkshopSpecEnvironmentImages) o;
    return Objects.equals(this.ingress, v1beta1WorkshopSpecEnvironmentImages.ingress) &&
        Objects.equals(this.memory, v1beta1WorkshopSpecEnvironmentImages.memory) &&
        Objects.equals(this.registries, v1beta1WorkshopSpecEnvironmentImages.registries) &&
        Objects.equals(this.storage, v1beta1WorkshopSpecEnvironmentImages.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ingress, memory, registries, storage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecEnvironmentImages {\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    registries: ").append(toIndentedString(registries)).append("\n");
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

