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

import dev.educates.training.V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef;
import dev.educates.training.V1beta1WorkshopSpecSessionValueFromFieldRef;
import dev.educates.training.V1beta1WorkshopSpecSessionValueFromResourceFieldRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionValueFrom
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionValueFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_KEY_REF = "configMapKeyRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_KEY_REF)
  private V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef configMapKeyRef;

  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1beta1WorkshopSpecSessionValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private V1beta1WorkshopSpecSessionValueFromResourceFieldRef resourceFieldRef;

  public static final String SERIALIZED_NAME_SECRET_KEY_REF = "secretKeyRef";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_REF)
  private V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef secretKeyRef;


  public V1beta1WorkshopSpecSessionValueFrom configMapKeyRef(V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef configMapKeyRef) {
    
    this.configMapKeyRef = configMapKeyRef;
    return this;
  }

   /**
   * Get configMapKeyRef
   * @return configMapKeyRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef getConfigMapKeyRef() {
    return configMapKeyRef;
  }


  public void setConfigMapKeyRef(V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef configMapKeyRef) {
    this.configMapKeyRef = configMapKeyRef;
  }


  public V1beta1WorkshopSpecSessionValueFrom fieldRef(V1beta1WorkshopSpecSessionValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1beta1WorkshopSpecSessionValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1beta1WorkshopSpecSessionValueFrom resourceFieldRef(V1beta1WorkshopSpecSessionValueFromResourceFieldRef resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionValueFromResourceFieldRef getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(V1beta1WorkshopSpecSessionValueFromResourceFieldRef resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  public V1beta1WorkshopSpecSessionValueFrom secretKeyRef(V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef secretKeyRef) {
    
    this.secretKeyRef = secretKeyRef;
    return this;
  }

   /**
   * Get secretKeyRef
   * @return secretKeyRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef getSecretKeyRef() {
    return secretKeyRef;
  }


  public void setSecretKeyRef(V1beta1WorkshopSpecSessionValueFromConfigMapKeyRef secretKeyRef) {
    this.secretKeyRef = secretKeyRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionValueFrom v1beta1WorkshopSpecSessionValueFrom = (V1beta1WorkshopSpecSessionValueFrom) o;
    return Objects.equals(this.configMapKeyRef, v1beta1WorkshopSpecSessionValueFrom.configMapKeyRef) &&
        Objects.equals(this.fieldRef, v1beta1WorkshopSpecSessionValueFrom.fieldRef) &&
        Objects.equals(this.resourceFieldRef, v1beta1WorkshopSpecSessionValueFrom.resourceFieldRef) &&
        Objects.equals(this.secretKeyRef, v1beta1WorkshopSpecSessionValueFrom.secretKeyRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapKeyRef, fieldRef, resourceFieldRef, secretKeyRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionValueFrom {\n");
    sb.append("    configMapKeyRef: ").append(toIndentedString(configMapKeyRef)).append("\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
    sb.append("    secretKeyRef: ").append(toIndentedString(secretKeyRef)).append("\n");
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
