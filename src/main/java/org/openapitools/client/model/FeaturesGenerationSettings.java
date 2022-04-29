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
 * FeaturesGenerationSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-29T18:43:07.985965Z[Etc/UTC]")
public class FeaturesGenerationSettings {
  /**
   * Gets or Sets searchRepositories
   */
  @JsonAdapter(SearchRepositoriesEnum.Adapter.class)
  public enum SearchRepositoriesEnum {
    INTERNET("INTERNET"),
    
    PUBLICATION("PUBLICATION"),
    
    SUBMITTED_WORK("SUBMITTED_WORK"),
    
    PRIVATE("PRIVATE"),
    
    CROSSREF("CROSSREF"),
    
    CROSSREF_POSTED_CONTENT("CROSSREF_POSTED_CONTENT");

    private String value;

    SearchRepositoriesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SearchRepositoriesEnum fromValue(String value) {
      for (SearchRepositoriesEnum b : SearchRepositoriesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SearchRepositoriesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearchRepositoriesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SearchRepositoriesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SearchRepositoriesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEARCH_REPOSITORIES = "search_repositories";
  @SerializedName(SERIALIZED_NAME_SEARCH_REPOSITORIES)
  private List<SearchRepositoriesEnum> searchRepositories = null;

  public static final String SERIALIZED_NAME_SUBMISSION_AUTO_EXCLUDES = "submission_auto_excludes";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_AUTO_EXCLUDES)
  private Boolean submissionAutoExcludes;

  public FeaturesGenerationSettings() { 
  }

  public FeaturesGenerationSettings searchRepositories(List<SearchRepositoriesEnum> searchRepositories) {
    
    this.searchRepositories = searchRepositories;
    return this;
  }

  public FeaturesGenerationSettings addSearchRepositoriesItem(SearchRepositoriesEnum searchRepositoriesItem) {
    if (this.searchRepositories == null) {
      this.searchRepositories = new ArrayList<>();
    }
    this.searchRepositories.add(searchRepositoriesItem);
    return this;
  }

   /**
   * List of repositories to search
   * @return searchRepositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of repositories to search")

  public List<SearchRepositoriesEnum> getSearchRepositories() {
    return searchRepositories;
  }


  public void setSearchRepositories(List<SearchRepositoriesEnum> searchRepositories) {
    this.searchRepositories = searchRepositories;
  }


  public FeaturesGenerationSettings submissionAutoExcludes(Boolean submissionAutoExcludes) {
    
    this.submissionAutoExcludes = submissionAutoExcludes;
    return this;
  }

   /**
   * Get submissionAutoExcludes
   * @return submissionAutoExcludes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSubmissionAutoExcludes() {
    return submissionAutoExcludes;
  }


  public void setSubmissionAutoExcludes(Boolean submissionAutoExcludes) {
    this.submissionAutoExcludes = submissionAutoExcludes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeaturesGenerationSettings featuresGenerationSettings = (FeaturesGenerationSettings) o;
    return Objects.equals(this.searchRepositories, featuresGenerationSettings.searchRepositories) &&
        Objects.equals(this.submissionAutoExcludes, featuresGenerationSettings.submissionAutoExcludes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchRepositories, submissionAutoExcludes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesGenerationSettings {\n");
    sb.append("    searchRepositories: ").append(toIndentedString(searchRepositories)).append("\n");
    sb.append("    submissionAutoExcludes: ").append(toIndentedString(submissionAutoExcludes)).append("\n");
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
    openapiFields.add("search_repositories");
    openapiFields.add("submission_auto_excludes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FeaturesGenerationSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FeaturesGenerationSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FeaturesGenerationSettings is not found in the empty JSON string", FeaturesGenerationSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FeaturesGenerationSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FeaturesGenerationSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("search_repositories") != null && !jsonObj.get("search_repositories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_repositories` to be an array in the JSON string but got `%s`", jsonObj.get("search_repositories").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FeaturesGenerationSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FeaturesGenerationSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FeaturesGenerationSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FeaturesGenerationSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<FeaturesGenerationSettings>() {
           @Override
           public void write(JsonWriter out, FeaturesGenerationSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FeaturesGenerationSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FeaturesGenerationSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FeaturesGenerationSettings
  * @throws IOException if the JSON string is invalid with respect to FeaturesGenerationSettings
  */
  public static FeaturesGenerationSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FeaturesGenerationSettings.class);
  }

 /**
  * Convert an instance of FeaturesGenerationSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

