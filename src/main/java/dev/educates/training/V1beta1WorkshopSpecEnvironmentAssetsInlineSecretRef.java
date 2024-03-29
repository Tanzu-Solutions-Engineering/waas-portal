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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef {
  public static final String SERIALIZED_NAME_DIRECTORY_PATH = "directoryPath";
  @SerializedName(SERIALIZED_NAME_DIRECTORY_PATH)
  private String directoryPath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef directoryPath(String directoryPath) {
    
    this.directoryPath = directoryPath;
    return this;
  }

   /**
   * Get directoryPath
   * @return directoryPath
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirectoryPath() {
    return directoryPath;
  }


  public void setDirectoryPath(String directoryPath) {
    this.directoryPath = directoryPath;
  }


  public V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef name(String name) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef v1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef = (V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef) o;
    return Objects.equals(this.directoryPath, v1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef.directoryPath) &&
        Objects.equals(this.name, v1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directoryPath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecEnvironmentAssetsInlineSecretRef {\n");
    sb.append("    directoryPath: ").append(toIndentedString(directoryPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

