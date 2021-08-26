/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. It supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file to the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.223
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.FeaturesSimilarity;
import org.openapitools.client.model.FeaturesTenant;

/**
 * FeaturesEnabled
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T18:38:39.898894Z[Etc/UTC]")
public class FeaturesEnabled {
  public static final String SERIALIZED_NAME_SIMILARITY = "similarity";
  @SerializedName(SERIALIZED_NAME_SIMILARITY)
  private FeaturesSimilarity similarity;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private FeaturesTenant tenant;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName;

  /**
   * Gets or Sets accessOptions
   */
  @JsonAdapter(AccessOptionsEnum.Adapter.class)
  public enum AccessOptionsEnum {
    NATIVE("Native"),
    
    CORE_API("CORE_API"),
    
    DRAFT_COACH("Draft Coach");

    private String value;

    AccessOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessOptionsEnum fromValue(String value) {
      for (AccessOptionsEnum b : AccessOptionsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccessOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessOptionsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccessOptionsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCESS_OPTIONS = "access_options";
  @SerializedName(SERIALIZED_NAME_ACCESS_OPTIONS)
  private List<AccessOptionsEnum> accessOptions = null;


  public FeaturesEnabled similarity(FeaturesSimilarity similarity) {
    
    this.similarity = similarity;
    return this;
  }

   /**
   * Get similarity
   * @return similarity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesSimilarity getSimilarity() {
    return similarity;
  }


  public void setSimilarity(FeaturesSimilarity similarity) {
    this.similarity = similarity;
  }


  public FeaturesEnabled tenant(FeaturesTenant tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesTenant getTenant() {
    return tenant;
  }


  public void setTenant(FeaturesTenant tenant) {
    this.tenant = tenant;
  }


  public FeaturesEnabled productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * Get productName
   * @return productName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public FeaturesEnabled accessOptions(List<AccessOptionsEnum> accessOptions) {
    
    this.accessOptions = accessOptions;
    return this;
  }

  public FeaturesEnabled addAccessOptionsItem(AccessOptionsEnum accessOptionsItem) {
    if (this.accessOptions == null) {
      this.accessOptions = new ArrayList<AccessOptionsEnum>();
    }
    this.accessOptions.add(accessOptionsItem);
    return this;
  }

   /**
   * Get accessOptions
   * @return accessOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AccessOptionsEnum> getAccessOptions() {
    return accessOptions;
  }


  public void setAccessOptions(List<AccessOptionsEnum> accessOptions) {
    this.accessOptions = accessOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesEnabled featuresEnabled = (FeaturesEnabled) o;
    return Objects.equals(this.similarity, featuresEnabled.similarity) &&
        Objects.equals(this.tenant, featuresEnabled.tenant) &&
        Objects.equals(this.productName, featuresEnabled.productName) &&
        Objects.equals(this.accessOptions, featuresEnabled.accessOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(similarity, tenant, productName, accessOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesEnabled {\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    accessOptions: ").append(toIndentedString(accessOptions)).append("\n");
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

