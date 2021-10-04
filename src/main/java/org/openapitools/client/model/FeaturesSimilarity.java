/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.226
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
import org.openapitools.client.model.FeaturesGenerationSettings;
import org.openapitools.client.model.FeaturesSimilarityViewSettings;
import org.openapitools.client.model.FeaturesViewerModes;

/**
 * FeaturesSimilarity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-04T12:13:23.459357Z[Etc/UTC]")
public class FeaturesSimilarity {
  public static final String SERIALIZED_NAME_VIEWER_MODES = "viewer_modes";
  @SerializedName(SERIALIZED_NAME_VIEWER_MODES)
  private FeaturesViewerModes viewerModes;

  public static final String SERIALIZED_NAME_GENERATION_SETTINGS = "generation_settings";
  @SerializedName(SERIALIZED_NAME_GENERATION_SETTINGS)
  private FeaturesGenerationSettings generationSettings;

  public static final String SERIALIZED_NAME_VIEW_SETTINGS = "view_settings";
  @SerializedName(SERIALIZED_NAME_VIEW_SETTINGS)
  private FeaturesSimilarityViewSettings viewSettings;


  public FeaturesSimilarity viewerModes(FeaturesViewerModes viewerModes) {
    
    this.viewerModes = viewerModes;
    return this;
  }

   /**
   * Get viewerModes
   * @return viewerModes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesViewerModes getViewerModes() {
    return viewerModes;
  }


  public void setViewerModes(FeaturesViewerModes viewerModes) {
    this.viewerModes = viewerModes;
  }


  public FeaturesSimilarity generationSettings(FeaturesGenerationSettings generationSettings) {
    
    this.generationSettings = generationSettings;
    return this;
  }

   /**
   * Get generationSettings
   * @return generationSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesGenerationSettings getGenerationSettings() {
    return generationSettings;
  }


  public void setGenerationSettings(FeaturesGenerationSettings generationSettings) {
    this.generationSettings = generationSettings;
  }


  public FeaturesSimilarity viewSettings(FeaturesSimilarityViewSettings viewSettings) {
    
    this.viewSettings = viewSettings;
    return this;
  }

   /**
   * Get viewSettings
   * @return viewSettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FeaturesSimilarityViewSettings getViewSettings() {
    return viewSettings;
  }


  public void setViewSettings(FeaturesSimilarityViewSettings viewSettings) {
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
    FeaturesSimilarity featuresSimilarity = (FeaturesSimilarity) o;
    return Objects.equals(this.viewerModes, featuresSimilarity.viewerModes) &&
        Objects.equals(this.generationSettings, featuresSimilarity.generationSettings) &&
        Objects.equals(this.viewSettings, featuresSimilarity.viewSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewerModes, generationSettings, viewSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturesSimilarity {\n");
    sb.append("    viewerModes: ").append(toIndentedString(viewerModes)).append("\n");
    sb.append("    generationSettings: ").append(toIndentedString(generationSettings)).append("\n");
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

}

