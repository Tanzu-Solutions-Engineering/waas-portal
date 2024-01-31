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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSessionSpecAnalyticsGoogle
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1WorkshopSessionSpecAnalyticsGoogle {
  public static final String SERIALIZED_NAME_TRACKING_ID = "trackingId";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;


  public V1beta1WorkshopSessionSpecAnalyticsGoogle trackingId(String trackingId) {
    
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrackingId() {
    return trackingId;
  }


  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSessionSpecAnalyticsGoogle v1beta1WorkshopSessionSpecAnalyticsGoogle = (V1beta1WorkshopSessionSpecAnalyticsGoogle) o;
    return Objects.equals(this.trackingId, v1beta1WorkshopSessionSpecAnalyticsGoogle.trackingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSessionSpecAnalyticsGoogle {\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

