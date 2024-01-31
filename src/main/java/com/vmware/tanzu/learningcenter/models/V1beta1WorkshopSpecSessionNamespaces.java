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
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionNamespacesLimits;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionNamespacesSecondary;
import com.vmware.tanzu.learningcenter.models.V1beta1WorkshopSpecSessionNamespacesSecurity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSpecSessionNamespaces
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionNamespaces {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private String budget;

  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private V1beta1WorkshopSpecSessionNamespacesLimits limits;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_SECONDARY = "secondary";
  @SerializedName(SERIALIZED_NAME_SECONDARY)
  private List<V1beta1WorkshopSpecSessionNamespacesSecondary> secondary = null;

  public static final String SERIALIZED_NAME_SECURITY = "security";
  @SerializedName(SERIALIZED_NAME_SECURITY)
  private V1beta1WorkshopSpecSessionNamespacesSecurity security;


  public V1beta1WorkshopSpecSessionNamespaces budget(String budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * Get budget
   * @return budget
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBudget() {
    return budget;
  }


  public void setBudget(String budget) {
    this.budget = budget;
  }


  public V1beta1WorkshopSpecSessionNamespaces limits(V1beta1WorkshopSpecSessionNamespacesLimits limits) {
    
    this.limits = limits;
    return this;
  }

   /**
   * Get limits
   * @return limits
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesLimits getLimits() {
    return limits;
  }


  public void setLimits(V1beta1WorkshopSpecSessionNamespacesLimits limits) {
    this.limits = limits;
  }


  public V1beta1WorkshopSpecSessionNamespaces role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public V1beta1WorkshopSpecSessionNamespaces secondary(List<V1beta1WorkshopSpecSessionNamespacesSecondary> secondary) {
    
    this.secondary = secondary;
    return this;
  }

  public V1beta1WorkshopSpecSessionNamespaces addSecondaryItem(V1beta1WorkshopSpecSessionNamespacesSecondary secondaryItem) {
    if (this.secondary == null) {
      this.secondary = new ArrayList<>();
    }
    this.secondary.add(secondaryItem);
    return this;
  }

   /**
   * Get secondary
   * @return secondary
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1beta1WorkshopSpecSessionNamespacesSecondary> getSecondary() {
    return secondary;
  }


  public void setSecondary(List<V1beta1WorkshopSpecSessionNamespacesSecondary> secondary) {
    this.secondary = secondary;
  }


  public V1beta1WorkshopSpecSessionNamespaces security(V1beta1WorkshopSpecSessionNamespacesSecurity security) {
    
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesSecurity getSecurity() {
    return security;
  }


  public void setSecurity(V1beta1WorkshopSpecSessionNamespacesSecurity security) {
    this.security = security;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionNamespaces v1beta1WorkshopSpecSessionNamespaces = (V1beta1WorkshopSpecSessionNamespaces) o;
    return Objects.equals(this.budget, v1beta1WorkshopSpecSessionNamespaces.budget) &&
        Objects.equals(this.limits, v1beta1WorkshopSpecSessionNamespaces.limits) &&
        Objects.equals(this.role, v1beta1WorkshopSpecSessionNamespaces.role) &&
        Objects.equals(this.secondary, v1beta1WorkshopSpecSessionNamespaces.secondary) &&
        Objects.equals(this.security, v1beta1WorkshopSpecSessionNamespaces.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, limits, role, secondary, security);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionNamespaces {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
    sb.append("    ***REMOVED*** ").append(toIndentedString(security)).append("\n");
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

