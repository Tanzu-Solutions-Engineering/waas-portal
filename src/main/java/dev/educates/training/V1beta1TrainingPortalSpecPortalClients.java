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

import dev.educates.training.V1beta1TrainingPortalSpecPortalClientsRobot;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1TrainingPortalSpecPortalClients
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1TrainingPortalSpecPortalClients {
  public static final String SERIALIZED_NAME_ROBOT = "robot";
  @SerializedName(SERIALIZED_NAME_ROBOT)
  private V1beta1TrainingPortalSpecPortalClientsRobot robot;


  public V1beta1TrainingPortalSpecPortalClients robot(V1beta1TrainingPortalSpecPortalClientsRobot robot) {
    
    this.robot = robot;
    return this;
  }

   /**
   * Get robot
   * @return robot
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TrainingPortalSpecPortalClientsRobot getRobot() {
    return robot;
  }


  public void setRobot(V1beta1TrainingPortalSpecPortalClientsRobot robot) {
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
    V1beta1TrainingPortalSpecPortalClients v1beta1TrainingPortalSpecPortalClients = (V1beta1TrainingPortalSpecPortalClients) o;
    return Objects.equals(this.robot, v1beta1TrainingPortalSpecPortalClients.robot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(robot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1TrainingPortalSpecPortalClients {\n");
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

