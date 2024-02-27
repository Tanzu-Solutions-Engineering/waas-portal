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

import dev.educates.training.V1beta1TrainingPortalStatusEducates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1TrainingPortalStatus
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1TrainingPortalStatus {
  public static final String SERIALIZED_NAME_EDUCATES = "educates";
  @SerializedName(SERIALIZED_NAME_EDUCATES)
  private V1beta1TrainingPortalStatusEducates educates;

  public static final String SERIALIZED_NAME_KOPF = "kopf";
  @SerializedName(SERIALIZED_NAME_KOPF)
  private Object kopf;


  public V1beta1TrainingPortalStatus educates(V1beta1TrainingPortalStatusEducates educates) {
    
    this.educates = educates;
    return this;
  }

   /**
   * Get educates
   * @return educates
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TrainingPortalStatusEducates getEducates() {
    return educates;
  }


  public void setEducates(V1beta1TrainingPortalStatusEducates educates) {
    this.educates = educates;
  }


  public V1beta1TrainingPortalStatus kopf(Object kopf) {
    
    this.kopf = kopf;
    return this;
  }

   /**
   * Get kopf
   * @return kopf
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getKopf() {
    return kopf;
  }


  public void setKopf(Object kopf) {
    this.kopf = kopf;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TrainingPortalStatus v1beta1TrainingPortalStatus = (V1beta1TrainingPortalStatus) o;
    return Objects.equals(this.educates, v1beta1TrainingPortalStatus.educates) &&
        Objects.equals(this.kopf, v1beta1TrainingPortalStatus.kopf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(educates, kopf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TrainingPortalStatus {\n");
    sb.append("    educates: ").append(toIndentedString(educates)).append("\n");
    sb.append("    kopf: ").append(toIndentedString(kopf)).append("\n");
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
