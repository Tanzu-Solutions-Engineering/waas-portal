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
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionNamespacesLimitsDefault;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionNamespacesLimits
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionNamespacesLimits {
  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private V1beta1WorkshopSpecSessionNamespacesLimitsDefault _default;

  public static final String SERIALIZED_NAME_DEFAULT_REQUEST = "defaultRequest";
  @SerializedName(SERIALIZED_NAME_DEFAULT_REQUEST)
  private V1beta1WorkshopSpecSessionNamespacesLimitsDefault defaultRequest;

  public static final String SERIALIZED_NAME_MAX = "max";
  @SerializedName(SERIALIZED_NAME_MAX)
  private V1beta1WorkshopSpecSessionNamespacesLimitsDefault max;

  public static final String SERIALIZED_NAME_MIN = "min";
  @SerializedName(SERIALIZED_NAME_MIN)
  private V1beta1WorkshopSpecSessionNamespacesLimitsDefault min;


  public V1beta1WorkshopSpecSessionNamespacesLimits _default(V1beta1WorkshopSpecSessionNamespacesLimitsDefault _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesLimitsDefault getDefault() {
    return _default;
  }


  public void setDefault(V1beta1WorkshopSpecSessionNamespacesLimitsDefault _default) {
    this._default = _default;
  }


  public V1beta1WorkshopSpecSessionNamespacesLimits defaultRequest(V1beta1WorkshopSpecSessionNamespacesLimitsDefault defaultRequest) {
    
    this.defaultRequest = defaultRequest;
    return this;
  }

   /**
   * Get defaultRequest
   * @return defaultRequest
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesLimitsDefault getDefaultRequest() {
    return defaultRequest;
  }


  public void setDefaultRequest(V1beta1WorkshopSpecSessionNamespacesLimitsDefault defaultRequest) {
    this.defaultRequest = defaultRequest;
  }


  public V1beta1WorkshopSpecSessionNamespacesLimits max(V1beta1WorkshopSpecSessionNamespacesLimitsDefault max) {
    
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesLimitsDefault getMax() {
    return max;
  }


  public void setMax(V1beta1WorkshopSpecSessionNamespacesLimitsDefault max) {
    this.max = max;
  }


  public V1beta1WorkshopSpecSessionNamespacesLimits min(V1beta1WorkshopSpecSessionNamespacesLimitsDefault min) {
    
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesLimitsDefault getMin() {
    return min;
  }


  public void setMin(V1beta1WorkshopSpecSessionNamespacesLimitsDefault min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionNamespacesLimits v1beta1WorkshopSpecSessionNamespacesLimits = (V1beta1WorkshopSpecSessionNamespacesLimits) o;
    return Objects.equals(this._default, v1beta1WorkshopSpecSessionNamespacesLimits._default) &&
        Objects.equals(this.defaultRequest, v1beta1WorkshopSpecSessionNamespacesLimits.defaultRequest) &&
        Objects.equals(this.max, v1beta1WorkshopSpecSessionNamespacesLimits.max) &&
        Objects.equals(this.min, v1beta1WorkshopSpecSessionNamespacesLimits.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, defaultRequest, max, min);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionNamespacesLimits {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    defaultRequest: ").append(toIndentedString(defaultRequest)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

