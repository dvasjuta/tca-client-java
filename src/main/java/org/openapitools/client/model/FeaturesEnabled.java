/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.246
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * FeaturesEnabled
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-29T18:43:07.985965Z[Etc/UTC]")
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
    NATIVE("NATIVE"),
    
    CORE_API("CORE_API"),
    
    DRAFT_COACH("DRAFT_COACH");

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

  public FeaturesEnabled() { 
  }

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
      this.accessOptions = new ArrayList<>();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("similarity");
    openapiFields.add("tenant");
    openapiFields.add("product_name");
    openapiFields.add("access_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeaturesEnabled
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeaturesEnabled.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeaturesEnabled is not found in the empty JSON string", FeaturesEnabled.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeaturesEnabled.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeaturesEnabled` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `similarity`
      if (jsonObj.getAsJsonObject("similarity") != null) {
        FeaturesSimilarity.validateJsonObject(jsonObj.getAsJsonObject("similarity"));
      }
      // validate the optional field `tenant`
      if (jsonObj.getAsJsonObject("tenant") != null) {
        FeaturesTenant.validateJsonObject(jsonObj.getAsJsonObject("tenant"));
      }
      if (jsonObj.get("product_name") != null && !jsonObj.get("product_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_name").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("access_options") != null && !jsonObj.get("access_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_options` to be an array in the JSON string but got `%s`", jsonObj.get("access_options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeaturesEnabled.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturesEnabled' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturesEnabled> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturesEnabled.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturesEnabled>() {
           @Override
           public void write(JsonWriter out, FeaturesEnabled value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturesEnabled read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeaturesEnabled given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeaturesEnabled
  * @throws IOException if the JSON string is invalid with respect to FeaturesEnabled
  */
  public static FeaturesEnabled fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturesEnabled.class);
  }

 /**
  * Convert an instance of FeaturesEnabled to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

