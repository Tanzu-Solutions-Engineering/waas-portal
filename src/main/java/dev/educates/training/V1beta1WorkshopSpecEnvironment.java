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

import dev.educates.training.V1beta1WorkshopSpecEnvironmentAssets;
import dev.educates.training.V1beta1WorkshopSpecEnvironmentImages;
import dev.educates.training.V1beta1WorkshopSpecEnvironmentSecrets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * V1beta1WorkshopSpecEnvironment
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecEnvironment {
  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private V1beta1WorkshopSpecEnvironmentAssets assets;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private V1beta1WorkshopSpecEnvironmentImages images;

  public static final String SERIALIZED_NAME_OBJECTS = "objects";
  @SerializedName(SERIALIZED_NAME_OBJECTS)
  private List<Object> objects = null;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<V1beta1WorkshopSpecEnvironmentSecrets> secrets = null;


  public V1beta1WorkshopSpecEnvironment assets(V1beta1WorkshopSpecEnvironmentAssets assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentAssets getAssets() {
    return assets;
  }


  public void setAssets(V1beta1WorkshopSpecEnvironmentAssets assets) {
    this.assets = assets;
  }


  public V1beta1WorkshopSpecEnvironment images(V1beta1WorkshopSpecEnvironmentImages images) {
    
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentImages getImages() {
    return images;
  }


  public void setImages(V1beta1WorkshopSpecEnvironmentImages images) {
    this.images = images;
  }


  public V1beta1WorkshopSpecEnvironment objects(List<Object> objects) {
    
    this.objects = objects;
    return this;
  }

  public V1beta1WorkshopSpecEnvironment addObjectsItem(Object objectsItem) {
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


  public V1beta1WorkshopSpecEnvironment secrets(List<V1beta1WorkshopSpecEnvironmentSecrets> secrets) {
    
    this.secrets = secrets;
    return this;
  }

  public V1beta1WorkshopSpecEnvironment addSecretsItem(V1beta1WorkshopSpecEnvironmentSecrets secretsItem) {
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

  public List<V1beta1WorkshopSpecEnvironmentSecrets> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<V1beta1WorkshopSpecEnvironmentSecrets> secrets) {
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
    V1beta1WorkshopSpecEnvironment v1beta1WorkshopSpecEnvironment = (V1beta1WorkshopSpecEnvironment) o;
    return Objects.equals(this.assets, v1beta1WorkshopSpecEnvironment.assets) &&
        Objects.equals(this.images, v1beta1WorkshopSpecEnvironment.images) &&
        Objects.equals(this.objects, v1beta1WorkshopSpecEnvironment.objects) &&
        Objects.equals(this.secrets, v1beta1WorkshopSpecEnvironment.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assets, images, objects, secrets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecEnvironment {\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

