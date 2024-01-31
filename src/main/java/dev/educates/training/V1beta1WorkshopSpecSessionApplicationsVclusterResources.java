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

import dev.educates.training.V1beta1WorkshopSpecSessionApplicationsVclusterResourcesK3s;
import dev.educates.training.V1beta1WorkshopSpecSessionApplicationsVclusterResourcesSyncer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionApplicationsVclusterResources
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionApplicationsVclusterResources {
  public static final String SERIALIZED_NAME_K3S = "k3s";
  @SerializedName(SERIALIZED_NAME_K3S)
  private V1beta1WorkshopSpecSessionApplicationsVclusterResourcesK3s k3s;

  public static final String SERIALIZED_NAME_SYNCER = "syncer";
  @SerializedName(SERIALIZED_NAME_SYNCER)
  private V1beta1WorkshopSpecSessionApplicationsVclusterResourcesSyncer syncer;


  public V1beta1WorkshopSpecSessionApplicationsVclusterResources k3s(V1beta1WorkshopSpecSessionApplicationsVclusterResourcesK3s k3s) {
    
    this.k3s = k3s;
    return this;
  }

   /**
   * Get k3s
   * @return k3s
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionApplicationsVclusterResourcesK3s getK3s() {
    return k3s;
  }


  public void setK3s(V1beta1WorkshopSpecSessionApplicationsVclusterResourcesK3s k3s) {
    this.k3s = k3s;
  }


  public V1beta1WorkshopSpecSessionApplicationsVclusterResources syncer(V1beta1WorkshopSpecSessionApplicationsVclusterResourcesSyncer syncer) {
    
    this.syncer = syncer;
    return this;
  }

   /**
   * Get syncer
   * @return syncer
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionApplicationsVclusterResourcesSyncer getSyncer() {
    return syncer;
  }


  public void setSyncer(V1beta1WorkshopSpecSessionApplicationsVclusterResourcesSyncer syncer) {
    this.syncer = syncer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionApplicationsVclusterResources v1beta1WorkshopSpecSessionApplicationsVclusterResources = (V1beta1WorkshopSpecSessionApplicationsVclusterResources) o;
    return Objects.equals(this.k3s, v1beta1WorkshopSpecSessionApplicationsVclusterResources.k3s) &&
        Objects.equals(this.syncer, v1beta1WorkshopSpecSessionApplicationsVclusterResources.syncer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k3s, syncer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionApplicationsVclusterResources {\n");
    sb.append("    k3s: ").append(toIndentedString(k3s)).append("\n");
    sb.append("    syncer: ").append(toIndentedString(syncer)).append("\n");
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

