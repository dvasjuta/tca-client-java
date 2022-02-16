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
 * ViewerPermissions
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-16T12:22:32.008226Z[Etc/UTC]")
public class ViewerPermissions {
  public static final String SERIALIZED_NAME_MAY_VIEW_SUBMISSION_FULL_SOURCE = "may_view_submission_full_source";
  @SerializedName(SERIALIZED_NAME_MAY_VIEW_SUBMISSION_FULL_SOURCE)
  private Boolean mayViewSubmissionFullSource;

  public static final String SERIALIZED_NAME_MAY_VIEW_MATCH_SUBMISSION_INFO = "may_view_match_submission_info";
  @SerializedName(SERIALIZED_NAME_MAY_VIEW_MATCH_SUBMISSION_INFO)
  private Boolean mayViewMatchSubmissionInfo;

  public static final String SERIALIZED_NAME_MAY_VIEW_FLAGS_PANEL = "may_view_flags_panel";
  @SerializedName(SERIALIZED_NAME_MAY_VIEW_FLAGS_PANEL)
  private Boolean mayViewFlagsPanel;

  public static final String SERIALIZED_NAME_MAY_VIEW_DOCUMENT_DETAILS_PANEL = "may_view_document_details_panel";
  @SerializedName(SERIALIZED_NAME_MAY_VIEW_DOCUMENT_DETAILS_PANEL)
  private Boolean mayViewDocumentDetailsPanel;

  public static final String SERIALIZED_NAME_MAY_VIEW_SECTIONS_EXCLUSION_PANEL = "may_view_sections_exclusion_panel";
  @SerializedName(SERIALIZED_NAME_MAY_VIEW_SECTIONS_EXCLUSION_PANEL)
  private Boolean mayViewSectionsExclusionPanel;

  public ViewerPermissions() { 
  }

  public ViewerPermissions mayViewSubmissionFullSource(Boolean mayViewSubmissionFullSource) {
    
    this.mayViewSubmissionFullSource = mayViewSubmissionFullSource;
    return this;
  }

   /**
   * Optional individual permission which override the default permission set.
   * @return mayViewSubmissionFullSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional individual permission which override the default permission set.")

  public Boolean getMayViewSubmissionFullSource() {
    return mayViewSubmissionFullSource;
  }


  public void setMayViewSubmissionFullSource(Boolean mayViewSubmissionFullSource) {
    this.mayViewSubmissionFullSource = mayViewSubmissionFullSource;
  }


  public ViewerPermissions mayViewMatchSubmissionInfo(Boolean mayViewMatchSubmissionInfo) {
    
    this.mayViewMatchSubmissionInfo = mayViewMatchSubmissionInfo;
    return this;
  }

   /**
   * Optional individual permission which override the default permission set.
   * @return mayViewMatchSubmissionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional individual permission which override the default permission set.")

  public Boolean getMayViewMatchSubmissionInfo() {
    return mayViewMatchSubmissionInfo;
  }


  public void setMayViewMatchSubmissionInfo(Boolean mayViewMatchSubmissionInfo) {
    this.mayViewMatchSubmissionInfo = mayViewMatchSubmissionInfo;
  }


  public ViewerPermissions mayViewFlagsPanel(Boolean mayViewFlagsPanel) {
    
    this.mayViewFlagsPanel = mayViewFlagsPanel;
    return this;
  }

   /**
   * Optional individual permission which override the default permission set
   * @return mayViewFlagsPanel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional individual permission which override the default permission set")

  public Boolean getMayViewFlagsPanel() {
    return mayViewFlagsPanel;
  }


  public void setMayViewFlagsPanel(Boolean mayViewFlagsPanel) {
    this.mayViewFlagsPanel = mayViewFlagsPanel;
  }


  public ViewerPermissions mayViewDocumentDetailsPanel(Boolean mayViewDocumentDetailsPanel) {
    
    this.mayViewDocumentDetailsPanel = mayViewDocumentDetailsPanel;
    return this;
  }

   /**
   * Optional individual permission which override the default permission set
   * @return mayViewDocumentDetailsPanel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional individual permission which override the default permission set")

  public Boolean getMayViewDocumentDetailsPanel() {
    return mayViewDocumentDetailsPanel;
  }


  public void setMayViewDocumentDetailsPanel(Boolean mayViewDocumentDetailsPanel) {
    this.mayViewDocumentDetailsPanel = mayViewDocumentDetailsPanel;
  }


  public ViewerPermissions mayViewSectionsExclusionPanel(Boolean mayViewSectionsExclusionPanel) {
    
    this.mayViewSectionsExclusionPanel = mayViewSectionsExclusionPanel;
    return this;
  }

   /**
   * Optional individual permission which override the default permission set
   * @return mayViewSectionsExclusionPanel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional individual permission which override the default permission set")

  public Boolean getMayViewSectionsExclusionPanel() {
    return mayViewSectionsExclusionPanel;
  }


  public void setMayViewSectionsExclusionPanel(Boolean mayViewSectionsExclusionPanel) {
    this.mayViewSectionsExclusionPanel = mayViewSectionsExclusionPanel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewerPermissions viewerPermissions = (ViewerPermissions) o;
    return Objects.equals(this.mayViewSubmissionFullSource, viewerPermissions.mayViewSubmissionFullSource) &&
        Objects.equals(this.mayViewMatchSubmissionInfo, viewerPermissions.mayViewMatchSubmissionInfo) &&
        Objects.equals(this.mayViewFlagsPanel, viewerPermissions.mayViewFlagsPanel) &&
        Objects.equals(this.mayViewDocumentDetailsPanel, viewerPermissions.mayViewDocumentDetailsPanel) &&
        Objects.equals(this.mayViewSectionsExclusionPanel, viewerPermissions.mayViewSectionsExclusionPanel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mayViewSubmissionFullSource, mayViewMatchSubmissionInfo, mayViewFlagsPanel, mayViewDocumentDetailsPanel, mayViewSectionsExclusionPanel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewerPermissions {\n");
    sb.append("    mayViewSubmissionFullSource: ").append(toIndentedString(mayViewSubmissionFullSource)).append("\n");
    sb.append("    mayViewMatchSubmissionInfo: ").append(toIndentedString(mayViewMatchSubmissionInfo)).append("\n");
    sb.append("    mayViewFlagsPanel: ").append(toIndentedString(mayViewFlagsPanel)).append("\n");
    sb.append("    mayViewDocumentDetailsPanel: ").append(toIndentedString(mayViewDocumentDetailsPanel)).append("\n");
    sb.append("    mayViewSectionsExclusionPanel: ").append(toIndentedString(mayViewSectionsExclusionPanel)).append("\n");
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
    openapiFields.add("may_view_submission_full_source");
    openapiFields.add("may_view_match_submission_info");
    openapiFields.add("may_view_flags_panel");
    openapiFields.add("may_view_document_details_panel");
    openapiFields.add("may_view_sections_exclusion_panel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ViewerPermissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ViewerPermissions.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has reuqired fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ViewerPermissions is not found in the empty JSON string", ViewerPermissions.openapiRequiredFields.toString()));
        }
      }
      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ViewerPermissions.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ViewerPermissions` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ViewerPermissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ViewerPermissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ViewerPermissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ViewerPermissions.class));

       return (TypeAdapter<T>) new TypeAdapter<ViewerPermissions>() {
           @Override
           public void write(JsonWriter out, ViewerPermissions value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ViewerPermissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ViewerPermissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ViewerPermissions
  * @throws IOException if the JSON string is invalid with respect to ViewerPermissions
  */
  public static ViewerPermissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ViewerPermissions.class);
  }

 /**
  * Convert an instance of ViewerPermissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

