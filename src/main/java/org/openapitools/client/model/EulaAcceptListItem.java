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
import java.time.OffsetDateTime;

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
 * EulaAcceptListItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-29T18:43:07.985965Z[Etc/UTC]")
public class EulaAcceptListItem {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_ACCEPTED_TIMESTAMP = "accepted_timestamp";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_TIMESTAMP)
  private OffsetDateTime acceptedTimestamp;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private String language;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public EulaAcceptListItem() { 
  }

  public EulaAcceptListItem userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * The unique id of the user in the external system 
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique id of the user in the external system ")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public EulaAcceptListItem acceptedTimestamp(OffsetDateTime acceptedTimestamp) {
    
    this.acceptedTimestamp = acceptedTimestamp;
    return this;
  }

   /**
   * The timestamp marking when the EULA was accepted 
   * @return acceptedTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp marking when the EULA was accepted ")

  public OffsetDateTime getAcceptedTimestamp() {
    return acceptedTimestamp;
  }


  public void setAcceptedTimestamp(OffsetDateTime acceptedTimestamp) {
    this.acceptedTimestamp = acceptedTimestamp;
  }


  public EulaAcceptListItem language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * The language code for which language instance of the EULA version was accepted 
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language code for which language instance of the EULA version was accepted ")

  public String getLanguage() {
    return language;
  }


  public void setLanguage(String language) {
    this.language = language;
  }


  public EulaAcceptListItem version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * The unique name of the EULA Version 
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique name of the EULA Version ")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EulaAcceptListItem eulaAcceptListItem = (EulaAcceptListItem) o;
    return Objects.equals(this.userId, eulaAcceptListItem.userId) &&
        Objects.equals(this.acceptedTimestamp, eulaAcceptListItem.acceptedTimestamp) &&
        Objects.equals(this.language, eulaAcceptListItem.language) &&
        Objects.equals(this.version, eulaAcceptListItem.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, acceptedTimestamp, language, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EulaAcceptListItem {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    acceptedTimestamp: ").append(toIndentedString(acceptedTimestamp)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("user_id");
    openapiFields.add("accepted_timestamp");
    openapiFields.add("language");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EulaAcceptListItem
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EulaAcceptListItem.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EulaAcceptListItem is not found in the empty JSON string", EulaAcceptListItem.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EulaAcceptListItem.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EulaAcceptListItem` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("user_id") != null && !jsonObj.get("user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_id").toString()));
      }
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      if (jsonObj.get("version") != null && !jsonObj.get("version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("version").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EulaAcceptListItem.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EulaAcceptListItem' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EulaAcceptListItem> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EulaAcceptListItem.class));

       return (TypeAdapter<T>) new TypeAdapter<EulaAcceptListItem>() {
           @Override
           public void write(JsonWriter out, EulaAcceptListItem value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EulaAcceptListItem read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EulaAcceptListItem given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EulaAcceptListItem
  * @throws IOException if the JSON string is invalid with respect to EulaAcceptListItem
  */
  public static EulaAcceptListItem fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EulaAcceptListItem.class);
  }

 /**
  * Convert an instance of EulaAcceptListItem to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

