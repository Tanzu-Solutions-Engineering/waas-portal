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

import dev.educates.training.V1beta1TrainingPortalSpecPortalLabels;
import dev.educates.training.V1beta1WorkshopSessionSpecSessionConfig;
import dev.educates.training.V1beta1WorkshopSessionSpecSessionIngress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSessionSpecSession
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSessionSpecSession {
  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private V1beta1WorkshopSessionSpecSessionConfig config;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1beta1TrainingPortalSpecPortalLabels> env = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INGRESS = "ingress";
  @SerializedName(SERIALIZED_NAME_INGRESS)
  private V1beta1WorkshopSessionSpecSessionIngress ingress;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public V1beta1WorkshopSessionSpecSession config(V1beta1WorkshopSessionSpecSessionConfig config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSessionSpecSessionConfig getConfig() {
    return config;
  }


  public void setConfig(V1beta1WorkshopSessionSpecSessionConfig config) {
    this.config = config;
  }


  public V1beta1WorkshopSessionSpecSession env(List<V1beta1TrainingPortalSpecPortalLabels> env) {
    
    this.env = env;
    return this;
  }

  public V1beta1WorkshopSessionSpecSession addEnvItem(V1beta1TrainingPortalSpecPortalLabels envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * Get env
   * @return env
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1TrainingPortalSpecPortalLabels> getEnv() {
    return env;
  }


  public void setEnv(List<V1beta1TrainingPortalSpecPortalLabels> env) {
    this.env = env;
  }


  public V1beta1WorkshopSessionSpecSession id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V1beta1WorkshopSessionSpecSession ingress(V1beta1WorkshopSessionSpecSessionIngress ingress) {
    
    this.ingress = ingress;
    return this;
  }

   /**
   * Get ingress
   * @return ingress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSessionSpecSessionIngress getIngress() {
    return ingress;
  }


  public void setIngress(V1beta1WorkshopSessionSpecSessionIngress ingress) {
    this.ingress = ingress;
  }


  public V1beta1WorkshopSessionSpecSession password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public V1beta1WorkshopSessionSpecSession username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSessionSpecSession v1beta1WorkshopSessionSpecSession = (V1beta1WorkshopSessionSpecSession) o;
    return Objects.equals(this.config, v1beta1WorkshopSessionSpecSession.config) &&
        Objects.equals(this.env, v1beta1WorkshopSessionSpecSession.env) &&
        Objects.equals(this.id, v1beta1WorkshopSessionSpecSession.id) &&
        Objects.equals(this.ingress, v1beta1WorkshopSessionSpecSession.ingress) &&
        Objects.equals(this.password, v1beta1WorkshopSessionSpecSession.password) &&
        Objects.equals(this.username, v1beta1WorkshopSessionSpecSession.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, env, id, ingress, password, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSessionSpecSession {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

