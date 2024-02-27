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

import dev.educates.training.V1beta1WorkshopSpecEnvironmentImagesTags;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecEnvironmentImagesContent
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecEnvironmentImagesContent {
  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_PREFIX = "prefix";
  @SerializedName(SERIALIZED_NAME_PREFIX)
  private String prefix;

  public static final String SERIALIZED_NAME_STRIP_PREFIX = "stripPrefix";
  @SerializedName(SERIALIZED_NAME_STRIP_PREFIX)
  private Boolean stripPrefix;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private V1beta1WorkshopSpecEnvironmentImagesTags tags;


  public V1beta1WorkshopSpecEnvironmentImagesContent destination(String destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDestination() {
    return destination;
  }


  public void setDestination(String destination) {
    this.destination = destination;
  }


  public V1beta1WorkshopSpecEnvironmentImagesContent prefix(String prefix) {
    
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


  public V1beta1WorkshopSpecEnvironmentImagesContent stripPrefix(Boolean stripPrefix) {
    
    this.stripPrefix = stripPrefix;
    return this;
  }

   /**
   * Get stripPrefix
   * @return stripPrefix
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStripPrefix() {
    return stripPrefix;
  }


  public void setStripPrefix(Boolean stripPrefix) {
    this.stripPrefix = stripPrefix;
  }


  public V1beta1WorkshopSpecEnvironmentImagesContent tags(V1beta1WorkshopSpecEnvironmentImagesTags tags) {
    
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentImagesTags getTags() {
    return tags;
  }


  public void setTags(V1beta1WorkshopSpecEnvironmentImagesTags tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecEnvironmentImagesContent v1beta1WorkshopSpecEnvironmentImagesContent = (V1beta1WorkshopSpecEnvironmentImagesContent) o;
    return Objects.equals(this.destination, v1beta1WorkshopSpecEnvironmentImagesContent.destination) &&
        Objects.equals(this.prefix, v1beta1WorkshopSpecEnvironmentImagesContent.prefix) &&
        Objects.equals(this.stripPrefix, v1beta1WorkshopSpecEnvironmentImagesContent.stripPrefix) &&
        Objects.equals(this.tags, v1beta1WorkshopSpecEnvironmentImagesContent.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, prefix, stripPrefix, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecEnvironmentImagesContent {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    stripPrefix: ").append(toIndentedString(stripPrefix)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
