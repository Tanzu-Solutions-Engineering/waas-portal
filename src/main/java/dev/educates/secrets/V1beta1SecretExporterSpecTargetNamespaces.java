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


package dev.educates.secrets;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import dev.educates.secrets.V1beta1SecretExporterSpecTargetNamespacesOwnerSelector;
import dev.educates.secrets.V1beta1SecretInjectorSpecServiceAccountsLabelSelector;
import dev.educates.secrets.V1beta1SecretInjectorSpecServiceAccountsNameSelector;
import dev.educates.secrets.V1beta1SecretInjectorSpecTargetNamespacesUidSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1SecretExporterSpecTargetNamespaces
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T17:36:32.479Z[Etc/UTC]")
public class V1beta1SecretExporterSpecTargetNamespaces {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR = "labelSelector";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR)
  private V1beta1SecretInjectorSpecServiceAccountsLabelSelector labelSelector;

  public static final String SERIALIZED_NAME_NAME_SELECTOR = "nameSelector";
  @SerializedName(SERIALIZED_NAME_NAME_SELECTOR)
  private V1beta1SecretInjectorSpecServiceAccountsNameSelector nameSelector;

  public static final String SERIALIZED_NAME_OWNER_SELECTOR = "ownerSelector";
  @SerializedName(SERIALIZED_NAME_OWNER_SELECTOR)
  private V1beta1SecretExporterSpecTargetNamespacesOwnerSelector ownerSelector;

  public static final String SERIALIZED_NAME_UID_SELECTOR = "uidSelector";
  @SerializedName(SERIALIZED_NAME_UID_SELECTOR)
  private V1beta1SecretInjectorSpecTargetNamespacesUidSelector uidSelector;


  public V1beta1SecretExporterSpecTargetNamespaces labelSelector(V1beta1SecretInjectorSpecServiceAccountsLabelSelector labelSelector) {
    
    this.labelSelector = labelSelector;
    return this;
  }

   /**
   * Get labelSelector
   * @return labelSelector
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1SecretInjectorSpecServiceAccountsLabelSelector getLabelSelector() {
    return labelSelector;
  }


  public void setLabelSelector(V1beta1SecretInjectorSpecServiceAccountsLabelSelector labelSelector) {
    this.labelSelector = labelSelector;
  }


  public V1beta1SecretExporterSpecTargetNamespaces nameSelector(V1beta1SecretInjectorSpecServiceAccountsNameSelector nameSelector) {
    
    this.nameSelector = nameSelector;
    return this;
  }

   /**
   * Get nameSelector
   * @return nameSelector
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1SecretInjectorSpecServiceAccountsNameSelector getNameSelector() {
    return nameSelector;
  }


  public void setNameSelector(V1beta1SecretInjectorSpecServiceAccountsNameSelector nameSelector) {
    this.nameSelector = nameSelector;
  }


  public V1beta1SecretExporterSpecTargetNamespaces ownerSelector(V1beta1SecretExporterSpecTargetNamespacesOwnerSelector ownerSelector) {
    
    this.ownerSelector = ownerSelector;
    return this;
  }

   /**
   * Get ownerSelector
   * @return ownerSelector
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1SecretExporterSpecTargetNamespacesOwnerSelector getOwnerSelector() {
    return ownerSelector;
  }


  public void setOwnerSelector(V1beta1SecretExporterSpecTargetNamespacesOwnerSelector ownerSelector) {
    this.ownerSelector = ownerSelector;
  }


  public V1beta1SecretExporterSpecTargetNamespaces uidSelector(V1beta1SecretInjectorSpecTargetNamespacesUidSelector uidSelector) {
    
    this.uidSelector = uidSelector;
    return this;
  }

   /**
   * Get uidSelector
   * @return uidSelector
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1SecretInjectorSpecTargetNamespacesUidSelector getUidSelector() {
    return uidSelector;
  }


  public void setUidSelector(V1beta1SecretInjectorSpecTargetNamespacesUidSelector uidSelector) {
    this.uidSelector = uidSelector;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1SecretExporterSpecTargetNamespaces v1beta1SecretExporterSpecTargetNamespaces = (V1beta1SecretExporterSpecTargetNamespaces) o;
    return Objects.equals(this.labelSelector, v1beta1SecretExporterSpecTargetNamespaces.labelSelector) &&
        Objects.equals(this.nameSelector, v1beta1SecretExporterSpecTargetNamespaces.nameSelector) &&
        Objects.equals(this.ownerSelector, v1beta1SecretExporterSpecTargetNamespaces.ownerSelector) &&
        Objects.equals(this.uidSelector, v1beta1SecretExporterSpecTargetNamespaces.uidSelector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelector, nameSelector, ownerSelector, uidSelector);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1SecretExporterSpecTargetNamespaces {\n");
    sb.append("    labelSelector: ").append(toIndentedString(labelSelector)).append("\n");
    sb.append("    nameSelector: ").append(toIndentedString(nameSelector)).append("\n");
    sb.append("    ownerSelector: ").append(toIndentedString(ownerSelector)).append("\n");
    sb.append("    uidSelector: ").append(toIndentedString(uidSelector)).append("\n");
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
