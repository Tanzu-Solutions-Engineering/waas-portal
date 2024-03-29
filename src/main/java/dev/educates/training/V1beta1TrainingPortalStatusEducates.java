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

import dev.educates.training.V1beta1TrainingPortalStatusEducatesClients;
import dev.educates.training.V1beta1TrainingPortalStatusEducatesCredentials;
import dev.educates.training.V1beta1TrainingPortalStatusEducatesSecrets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1TrainingPortalStatusEducates
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1TrainingPortalStatusEducates {
  public static final String SERIALIZED_NAME_CLIENTS = "clients";
  @SerializedName(SERIALIZED_NAME_CLIENTS)
  private V1beta1TrainingPortalStatusEducatesClients clients;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private V1beta1TrainingPortalStatusEducatesCredentials credentials;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private V1beta1TrainingPortalStatusEducatesSecrets secrets;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1beta1TrainingPortalStatusEducates clients(V1beta1TrainingPortalStatusEducatesClients clients) {
    
    this.clients = clients;
    return this;
  }

   /**
   * Get clients
   * @return clients
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TrainingPortalStatusEducatesClients getClients() {
    return clients;
  }


  public void setClients(V1beta1TrainingPortalStatusEducatesClients clients) {
    this.clients = clients;
  }


  public V1beta1TrainingPortalStatusEducates credentials(V1beta1TrainingPortalStatusEducatesCredentials credentials) {
    
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TrainingPortalStatusEducatesCredentials getCredentials() {
    return credentials;
  }


  public void setCredentials(V1beta1TrainingPortalStatusEducatesCredentials credentials) {
    this.credentials = credentials;
  }


  public V1beta1TrainingPortalStatusEducates message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1beta1TrainingPortalStatusEducates namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1beta1TrainingPortalStatusEducates phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1beta1TrainingPortalStatusEducates secrets(V1beta1TrainingPortalStatusEducatesSecrets secrets) {
    
    this.secrets = secrets;
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TrainingPortalStatusEducatesSecrets getSecrets() {
    return secrets;
  }


  public void setSecrets(V1beta1TrainingPortalStatusEducatesSecrets secrets) {
    this.secrets = secrets;
  }


  public V1beta1TrainingPortalStatusEducates url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TrainingPortalStatusEducates v1beta1TrainingPortalStatusEducates = (V1beta1TrainingPortalStatusEducates) o;
    return Objects.equals(this.clients, v1beta1TrainingPortalStatusEducates.clients) &&
        Objects.equals(this.credentials, v1beta1TrainingPortalStatusEducates.credentials) &&
        Objects.equals(this.message, v1beta1TrainingPortalStatusEducates.message) &&
        Objects.equals(this.namespace, v1beta1TrainingPortalStatusEducates.namespace) &&
        Objects.equals(this.phase, v1beta1TrainingPortalStatusEducates.phase) &&
        Objects.equals(this.secrets, v1beta1TrainingPortalStatusEducates.secrets) &&
        Objects.equals(this.url, v1beta1TrainingPortalStatusEducates.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, credentials, message, namespace, phase, secrets, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TrainingPortalStatusEducates {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

