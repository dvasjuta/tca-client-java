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
 * AuthorMetadataOverride
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-29T18:43:07.985965Z[Etc/UTC]")
public class AuthorMetadataOverride {
  public static final String SERIALIZED_NAME_GIVEN_NAME = "given_name";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "family_name";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public AuthorMetadataOverride() { 
  }

  public AuthorMetadataOverride givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Given or first name of submission author
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Given or first name of submission author")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public AuthorMetadataOverride familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Family or last name of submission author
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Family or last name of submission author")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorMetadataOverride authorMetadataOverride = (AuthorMetadataOverride) o;
    return Objects.equals(this.givenName, authorMetadataOverride.givenName) &&
        Objects.equals(this.familyName, authorMetadataOverride.familyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorMetadataOverride {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
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
    openapiFields.add("given_name");
    openapiFields.add("family_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthorMetadataOverride
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthorMetadataOverride.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthorMetadataOverride is not found in the empty JSON string", AuthorMetadataOverride.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthorMetadataOverride.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthorMetadataOverride` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("given_name") != null && !jsonObj.get("given_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `given_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("given_name").toString()));
      }
      if (jsonObj.get("family_name") != null && !jsonObj.get("family_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `family_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("family_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthorMetadataOverride.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthorMetadataOverride' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthorMetadataOverride> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthorMetadataOverride.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthorMetadataOverride>() {
           @Override
           public void write(JsonWriter out, AuthorMetadataOverride value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthorMetadataOverride read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthorMetadataOverride given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthorMetadataOverride
  * @throws IOException if the JSON string is invalid with respect to AuthorMetadataOverride
  */
  public static AuthorMetadataOverride fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthorMetadataOverride.class);
  }

 /**
  * Convert an instance of AuthorMetadataOverride to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

