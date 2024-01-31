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
 * V1beta1WorkshopSpecContent
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecContent {
  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private String files;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;


  public V1beta1WorkshopSpecContent files(String files) {
    
    this.files = files;
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFiles() {
    return files;
  }


  public void setFiles(String files) {
    this.files = files;
  }


  public V1beta1WorkshopSpecContent image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecContent v1beta1WorkshopSpecContent = (V1beta1WorkshopSpecContent) o;
    return Objects.equals(this.files, v1beta1WorkshopSpecContent.files) &&
        Objects.equals(this.image, v1beta1WorkshopSpecContent.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, image);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecContent {\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

