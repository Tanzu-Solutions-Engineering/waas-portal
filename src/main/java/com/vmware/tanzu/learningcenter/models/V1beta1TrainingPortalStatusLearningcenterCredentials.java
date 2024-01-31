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
import com.vmware.tanzu.learningcenter.models.V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1TrainingPortalStatusLearningcenterCredentials
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-07T20:08:06.732Z[Etc/UTC]")
public class V1beta1TrainingPortalStatusLearningcenterCredentials {
  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin admin;

  public static final String SERIALIZED_NAME_ROBOT = "robot";
  @SerializedName(SERIALIZED_NAME_ROBOT)
  private V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin robot;


  public V1beta1TrainingPortalStatusLearningcenterCredentials admin(V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Get admin
   * @return admin
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin getAdmin() {
    return admin;
  }


  public void setAdmin(V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin admin) {
    this.admin = admin;
  }


  public V1beta1TrainingPortalStatusLearningcenterCredentials robot(V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin robot) {
    
    this.robot = robot;
    return this;
  }

   /**
   * Get robot
   * @return robot
  **/
  @ApiModelProperty(required = true, value = "")

  public V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin getRobot() {
    return robot;
  }


  public void setRobot(V1beta1TrainingPortalStatusLearningcenterCredentialsAdmin robot) {
    this.robot = robot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1TrainingPortalStatusLearningcenterCredentials v1beta1TrainingPortalStatusLearningcenterCredentials = (V1beta1TrainingPortalStatusLearningcenterCredentials) o;
    return Objects.equals(this.admin, v1beta1TrainingPortalStatusLearningcenterCredentials.admin) &&
        Objects.equals(this.robot, v1beta1TrainingPortalStatusLearningcenterCredentials.robot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, robot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TrainingPortalStatusLearningcenterCredentials {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    robot: ").append(toIndentedString(robot)).append("\n");
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

