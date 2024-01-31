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
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalSpecEnv;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1TrainingPortalSpecWorkshops
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1TrainingPortalSpecWorkshops {
  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1beta1TrainingPortalSpecEnv> env = null;

  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public static final String SERIALIZED_NAME_INITIAL = "initial";
  @SerializedName(SERIALIZED_NAME_INITIAL)
  private Integer initial;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORPHANED = "orphaned";
  @SerializedName(SERIALIZED_NAME_ORPHANED)
  private String orphaned;

  public static final String SERIALIZED_NAME_RESERVED = "reserved";
  @SerializedName(SERIALIZED_NAME_RESERVED)
  private Integer reserved;


  public V1beta1TrainingPortalSpecWorkshops capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * @return capacity
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public V1beta1TrainingPortalSpecWorkshops env(List<V1beta1TrainingPortalSpecEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1beta1TrainingPortalSpecWorkshops addEnvItem(V1beta1TrainingPortalSpecEnv envItem) {
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

  public List<V1beta1TrainingPortalSpecEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1beta1TrainingPortalSpecEnv> env) {
    this.env = env;
  }


  public V1beta1TrainingPortalSpecWorkshops expires(String expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    this.expires = expires;
  }


  public V1beta1TrainingPortalSpecWorkshops initial(Integer initial) {
    
    this.initial = initial;
    return this;
  }

   /**
   * Get initial
   * @return initial
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInitial() {
    return initial;
  }


  public void setInitial(Integer initial) {
    this.initial = initial;
  }


  public V1beta1TrainingPortalSpecWorkshops name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1TrainingPortalSpecWorkshops orphaned(String orphaned) {
    
    this.orphaned = orphaned;
    return this;
  }

   /**
   * Get orphaned
   * @return orphaned
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrphaned() {
    return orphaned;
  }


  public void setOrphaned(String orphaned) {
    this.orphaned = orphaned;
  }


  public V1beta1TrainingPortalSpecWorkshops reserved(Integer reserved) {
    
    this.reserved = reserved;
    return this;
  }

   /**
   * Get reserved
   * @return reserved
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getReserved() {
    return reserved;
  }


  public void setReserved(Integer reserved) {
    this.reserved = reserved;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TrainingPortalSpecWorkshops v1beta1TrainingPortalSpecWorkshops = (V1beta1TrainingPortalSpecWorkshops) o;
    return Objects.equals(this.capacity, v1beta1TrainingPortalSpecWorkshops.capacity) &&
        Objects.equals(this.env, v1beta1TrainingPortalSpecWorkshops.env) &&
        Objects.equals(this.expires, v1beta1TrainingPortalSpecWorkshops.expires) &&
        Objects.equals(this.initial, v1beta1TrainingPortalSpecWorkshops.initial) &&
        Objects.equals(this.name, v1beta1TrainingPortalSpecWorkshops.name) &&
        Objects.equals(this.orphaned, v1beta1TrainingPortalSpecWorkshops.orphaned) &&
        Objects.equals(this.reserved, v1beta1TrainingPortalSpecWorkshops.reserved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, env, expires, initial, name, orphaned, reserved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TrainingPortalSpecWorkshops {\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orphaned: ").append(toIndentedString(orphaned)).append("\n");
    sb.append("    reserved: ").append(toIndentedString(reserved)).append("\n");
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

