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

import dev.educates.training.V1beta1WorkshopEnvironmentSpecEnvironmentSecrets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopEnvironmentSpecEnvironment
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopEnvironmentSpecEnvironment {
  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<Object> objects = null;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<V1beta1WorkshopEnvironmentSpecEnvironmentSecrets> secrets = null;


  public V1beta1WorkshopEnvironmentSpecEnvironment objects(List<Object> objects) {
    
    this.objects = objects;
    return this;
  }

  public V1beta1WorkshopEnvironmentSpecEnvironment addObjectsItem(Object objectsItem) {
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


  public V1beta1WorkshopEnvironmentSpecEnvironment secrets(List<V1beta1WorkshopEnvironmentSpecEnvironmentSecrets> secrets) {
    
    this.secrets = secrets;
    return this;
  }

  public V1beta1WorkshopEnvironmentSpecEnvironment addSecretsItem(V1beta1WorkshopEnvironmentSpecEnvironmentSecrets secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopEnvironmentSpecEnvironmentSecrets> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<V1beta1WorkshopEnvironmentSpecEnvironmentSecrets> secrets) {
    this.secrets = secrets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopEnvironmentSpecEnvironment v1beta1WorkshopEnvironmentSpecEnvironment = (V1beta1WorkshopEnvironmentSpecEnvironment) o;
    return Objects.equals(this.objects, v1beta1WorkshopEnvironmentSpecEnvironment.objects) &&
        Objects.equals(this.secrets, v1beta1WorkshopEnvironmentSpecEnvironment.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objects, secrets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopEnvironmentSpecEnvironment {\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

