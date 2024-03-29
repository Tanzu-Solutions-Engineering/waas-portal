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

import dev.educates.training.V1beta1WorkshopSpecEnvironmentAssetsIngress;
import dev.educates.training.V1beta1WorkshopSpecSessionNamespacesSecurity1Rules;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * V1beta1WorkshopSpecSessionNamespacesSecurity1
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-30T19:16:04.060Z[Etc/UTC]")
public class V1beta1WorkshopSpecSessionNamespacesSecurity1 {
  /**
   * Gets or Sets policy
   */
  @JsonAdapter(PolicyEnum.Adapter.class)
  public enum PolicyEnum {
    RESTRICTED("restricted"),
    
    BASELINE("baseline"),
    
    PRIVILEGED("privileged"),
    
    NONROOT("nonroot"),
    
    ANYUID("anyuid"),
    
    CUSTOM("custom");

    private String value;

    PolicyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PolicyEnum fromValue(String value) {
      for (PolicyEnum b : PolicyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PolicyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PolicyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PolicyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private PolicyEnum policy;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private V1beta1WorkshopSpecSessionNamespacesSecurity1Rules rules;

  public static final String SERIALIZED_NAME_TOKEN = "token";
  @SerializedName(SERIALIZED_NAME_TOKEN)
  private V1beta1WorkshopSpecEnvironmentAssetsIngress token;


  public V1beta1WorkshopSpecSessionNamespacesSecurity1 policy(PolicyEnum policy) {
    
    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public PolicyEnum getPolicy() {
    return policy;
  }


  public void setPolicy(PolicyEnum policy) {
    this.policy = policy;
  }


  public V1beta1WorkshopSpecSessionNamespacesSecurity1 rules(V1beta1WorkshopSpecSessionNamespacesSecurity1Rules rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecSessionNamespacesSecurity1Rules getRules() {
    return rules;
  }


  public void setRules(V1beta1WorkshopSpecSessionNamespacesSecurity1Rules rules) {
    this.rules = rules;
  }


  public V1beta1WorkshopSpecSessionNamespacesSecurity1 token(V1beta1WorkshopSpecEnvironmentAssetsIngress token) {
    
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkshopSpecEnvironmentAssetsIngress getToken() {
    return token;
  }


  public void setToken(V1beta1WorkshopSpecEnvironmentAssetsIngress token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkshopSpecSessionNamespacesSecurity1 v1beta1WorkshopSpecSessionNamespacesSecurity1 = (V1beta1WorkshopSpecSessionNamespacesSecurity1) o;
    return Objects.equals(this.policy, v1beta1WorkshopSpecSessionNamespacesSecurity1.policy) &&
        Objects.equals(this.rules, v1beta1WorkshopSpecSessionNamespacesSecurity1.rules) &&
        Objects.equals(this.token, v1beta1WorkshopSpecSessionNamespacesSecurity1.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, rules, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkshopSpecSessionNamespacesSecurity1 {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

