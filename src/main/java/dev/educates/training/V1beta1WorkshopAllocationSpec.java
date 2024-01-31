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

import dev.educates.training.V1beta1WorkshopAllocationSpecEnvironment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopAllocationSpec
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopAllocationSpec {
  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private V1beta1WorkshopAllocationSpecEnvironment environment;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private V1beta1WorkshopAllocationSpecEnvironment session;


  public V1beta1WorkshopAllocationSpec environment(V1beta1WorkshopAllocationSpecEnvironment environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1WorkshopAllocationSpecEnvironment getEnvironment() {
    return environment;
  }


  public void setEnvironment(V1beta1WorkshopAllocationSpecEnvironment environment) {
    this.environment = environment;
  }


  public V1beta1WorkshopAllocationSpec session(V1beta1WorkshopAllocationSpecEnvironment session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1WorkshopAllocationSpecEnvironment getSession() {
    return session;
  }


  public void setSession(V1beta1WorkshopAllocationSpecEnvironment session) {
    this.session = session;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopAllocationSpec v1beta1WorkshopAllocationSpec = (V1beta1WorkshopAllocationSpec) o;
    return Objects.equals(this.environment, v1beta1WorkshopAllocationSpec.environment) &&
        Objects.equals(this.session, v1beta1WorkshopAllocationSpec.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopAllocationSpec {\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

