/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.241
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
import org.openapitools.client.model.SimilaritySettingsModes;
import org.openapitools.client.model.SimilaritySettingsViewSettings;

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
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * SimilaritySettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T12:22:32.008226Z[Etc/UTC]")
public class SimilaritySettings {
  /**
   * default similarity mode when viewing a report; set to either match_overview or all_sources
   */
  @JsonAdapter(DefaultModeEnum.Adapter.class)
  public enum DefaultModeEnum {
    MATCH_OVERVIEW("match_overview"),
    
    ALL_SOURCES("all_sources");

    private String value;

    DefaultModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultModeEnum fromValue(String value) {
      for (DefaultModeEnum b : DefaultModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultModeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultModeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_MODE = "default_mode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private DefaultModeEnum defaultMode;

  public static final String SERIALIZED_NAME_MODES = "modes";
  @SerializedName(SERIALIZED_NAME_MODES)
  private SimilaritySettingsModes modes;

  public static final String SERIALIZED_NAME_VIEW_SETTINGS = "view_settings";
  @SerializedName(SERIALIZED_NAME_VIEW_SETTINGS)
  private SimilaritySettingsViewSettings viewSettings;

  public SimilaritySettings() { 
  }

  public SimilaritySettings defaultMode(DefaultModeEnum defaultMode) {
    
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * default similarity mode when viewing a report; set to either match_overview or all_sources
   * @return defaultMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "default similarity mode when viewing a report; set to either match_overview or all_sources")

  public DefaultModeEnum getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(DefaultModeEnum defaultMode) {
    this.defaultMode = defaultMode;
  }


  public SimilaritySettings modes(SimilaritySettingsModes modes) {
    
    this.modes = modes;
    return this;
  }

   /**
   * Get modes
   * @return modes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimilaritySettingsModes getModes() {
    return modes;
  }


  public void setModes(SimilaritySettingsModes modes) {
    this.modes = modes;
  }


  public SimilaritySettings viewSettings(SimilaritySettingsViewSettings viewSettings) {
    
    this.viewSettings = viewSettings;
    return this;
  }

   /**
   * Get viewSettings
   * @return viewSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SimilaritySettingsViewSettings getViewSettings() {
    return viewSettings;
  }


  public void setViewSettings(SimilaritySettingsViewSettings viewSettings) {
    this.viewSettings = viewSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilaritySettings similaritySettings = (SimilaritySettings) o;
    return Objects.equals(this.defaultMode, similaritySettings.defaultMode) &&
        Objects.equals(this.modes, similaritySettings.modes) &&
        Objects.equals(this.viewSettings, similaritySettings.viewSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, modes, viewSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilaritySettings {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    modes: ").append(toIndentedString(modes)).append("\n");
    sb.append("    viewSettings: ").append(toIndentedString(viewSettings)).append("\n");
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
    openapiFields.add("default_mode");
    openapiFields.add("modes");
    openapiFields.add("view_settings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimilaritySettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SimilaritySettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimilaritySettings is not found in the empty JSON string", SimilaritySettings.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimilaritySettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimilaritySettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `modes`
      if (jsonObj.getAsJsonObject("modes") != null) {
        SimilaritySettingsModes.validateJsonObject(jsonObj.getAsJsonObject("modes"));
      }
      // validate the optional field `view_settings`
      if (jsonObj.getAsJsonObject("view_settings") != null) {
        SimilaritySettingsViewSettings.validateJsonObject(jsonObj.getAsJsonObject("view_settings"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimilaritySettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimilaritySettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimilaritySettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimilaritySettings.class));

       return (TypeAdapter<T>) new TypeAdapter<SimilaritySettings>() {
           @Override
           public void write(JsonWriter out, SimilaritySettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimilaritySettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimilaritySettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimilaritySettings
  * @throws IOException if the JSON string is invalid with respect to SimilaritySettings
  */
  public static SimilaritySettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimilaritySettings.class);
  }

 /**
  * Convert an instance of SimilaritySettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

