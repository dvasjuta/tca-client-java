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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * SimilarityOverviewMatchGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T18:38:39.898894Z[Etc/UTC]")
public class SimilarityOverviewMatchGroup {
  public static final String SERIALIZED_NAME_GLIMPSE_ID = "glimpse_id";
  @SerializedName(SERIALIZED_NAME_GLIMPSE_ID)
  private String glimpseId;

  public static final String SERIALIZED_NAME_MATCH_SEGMENTS = "match_segments";
  @SerializedName(SERIALIZED_NAME_MATCH_SEGMENTS)
  private List<List<BigDecimal>> matchSegments = null;


  public SimilarityOverviewMatchGroup glimpseId(String glimpseId) {
    
    this.glimpseId = glimpseId;
    return this;
  }

   /**
   * Get glimpseId
   * @return glimpseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGlimpseId() {
    return glimpseId;
  }


  public void setGlimpseId(String glimpseId) {
    this.glimpseId = glimpseId;
  }


  public SimilarityOverviewMatchGroup matchSegments(List<List<BigDecimal>> matchSegments) {
    
    this.matchSegments = matchSegments;
    return this;
  }

  public SimilarityOverviewMatchGroup addMatchSegmentsItem(List<BigDecimal> matchSegmentsItem) {
    if (this.matchSegments == null) {
      this.matchSegments = new ArrayList<List<BigDecimal>>();
    }
    this.matchSegments.add(matchSegmentsItem);
    return this;
  }

   /**
   * Get matchSegments
   * @return matchSegments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<List<BigDecimal>> getMatchSegments() {
    return matchSegments;
  }


  public void setMatchSegments(List<List<BigDecimal>> matchSegments) {
    this.matchSegments = matchSegments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityOverviewMatchGroup similarityOverviewMatchGroup = (SimilarityOverviewMatchGroup) o;
    return Objects.equals(this.glimpseId, similarityOverviewMatchGroup.glimpseId) &&
        Objects.equals(this.matchSegments, similarityOverviewMatchGroup.matchSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(glimpseId, matchSegments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityOverviewMatchGroup {\n");
    sb.append("    glimpseId: ").append(toIndentedString(glimpseId)).append("\n");
    sb.append("    matchSegments: ").append(toIndentedString(matchSegments)).append("\n");
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

