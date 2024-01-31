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

import dev.educates.training.V1beta1WorkshopSpecSessionConfigMapRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionEnvFrom
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionEnvFrom {
  public static final String SERIALIZED_NAME_CONFIG_MAP_REF = "configMapRef";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP_REF)
  private V1beta1WorkshopSpecSessionConfigMapRef configMapRef;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_SECRET_REF = "secretRef";
  @SerializedName(SERIALIZED_NAME_SECRET_REF)
  private V1beta1WorkshopSpecSessionConfigMapRef secretRef;


  public V1beta1WorkshopSpecSessionEnvFrom configMapRef(V1beta1WorkshopSpecSessionConfigMapRef configMapRef) {
    
    this.configMapRef = configMapRef;
    return this;
  }

   /**
   * Get configMapRef
   * @return configMapRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionConfigMapRef getConfigMapRef() {
    return configMapRef;
  }


  public void setConfigMapRef(V1beta1WorkshopSpecSessionConfigMapRef configMapRef) {
    this.configMapRef = configMapRef;
  }


  public V1beta1WorkshopSpecSessionEnvFrom prefix(String prefix) {
    
    this.prefix = prefix;
    return this;
  }

   /**
   * Get prefix
   * @return prefix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrefix() {
    return prefix;
  }


  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }


  public V1beta1WorkshopSpecSessionEnvFrom secretRef(V1beta1WorkshopSpecSessionConfigMapRef secretRef) {
    
    this.secretRef = secretRef;
    return this;
  }

   /**
   * Get secretRef
   * @return secretRef
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionConfigMapRef getSecretRef() {
    return secretRef;
  }


  public void setSecretRef(V1beta1WorkshopSpecSessionConfigMapRef secretRef) {
    this.secretRef = secretRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionEnvFrom v1beta1WorkshopSpecSessionEnvFrom = (V1beta1WorkshopSpecSessionEnvFrom) o;
    return Objects.equals(this.configMapRef, v1beta1WorkshopSpecSessionEnvFrom.configMapRef) &&
        Objects.equals(this.prefix, v1beta1WorkshopSpecSessionEnvFrom.prefix) &&
        Objects.equals(this.secretRef, v1beta1WorkshopSpecSessionEnvFrom.secretRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configMapRef, prefix, secretRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionEnvFrom {\n");
    sb.append("    configMapRef: ").append(toIndentedString(configMapRef)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    secretRef: ").append(toIndentedString(secretRef)).append("\n");
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

