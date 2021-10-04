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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SimilarityMetadataAllOfTopMatches;

/**
 * SimilarityMetadataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-04T12:13:23.459357Z[Etc/UTC]")
public class SimilarityMetadataAllOf {
  public static final String SERIALIZED_NAME_SUBMISSION_ID = "submission_id";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_ID)
  private String submissionId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TIME_GENERATED = "time_generated";
  @SerializedName(SERIALIZED_NAME_TIME_GENERATED)
  private String timeGenerated;

  public static final String SERIALIZED_NAME_TIME_REQUESTED = "time_requested";
  @SerializedName(SERIALIZED_NAME_TIME_REQUESTED)
  private String timeRequested;

  public static final String SERIALIZED_NAME_TOP_MATCHES = "top_matches";
  @SerializedName(SERIALIZED_NAME_TOP_MATCHES)
  private List<SimilarityMetadataAllOfTopMatches> topMatches = new ArrayList<SimilarityMetadataAllOfTopMatches>();

  public static final String SERIALIZED_NAME_TOP_SOURCE_LARGEST_MATCHED_WORD_COUNT = "top_source_largest_matched_word_count";
  @SerializedName(SERIALIZED_NAME_TOP_SOURCE_LARGEST_MATCHED_WORD_COUNT)
  private Integer topSourceLargestMatchedWordCount;


  public SimilarityMetadataAllOf submissionId(String submissionId) {
    
    this.submissionId = submissionId;
    return this;
  }

   /**
   * Get submissionId
   * @return submissionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubmissionId() {
    return submissionId;
  }


  public void setSubmissionId(String submissionId) {
    this.submissionId = submissionId;
  }


  public SimilarityMetadataAllOf status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * possible values PENDING, COMPLETE
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "possible values PENDING, COMPLETE")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public SimilarityMetadataAllOf timeGenerated(String timeGenerated) {
    
    this.timeGenerated = timeGenerated;
    return this;
  }

   /**
   * Time the report finished generating.  If not set the report has not finished generating
   * @return timeGenerated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time the report finished generating.  If not set the report has not finished generating")

  public String getTimeGenerated() {
    return timeGenerated;
  }


  public void setTimeGenerated(String timeGenerated) {
    this.timeGenerated = timeGenerated;
  }


  public SimilarityMetadataAllOf timeRequested(String timeRequested) {
    
    this.timeRequested = timeRequested;
    return this;
  }

   /**
   * Time the report was requested
   * @return timeRequested
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Time the report was requested")

  public String getTimeRequested() {
    return timeRequested;
  }


  public void setTimeRequested(String timeRequested) {
    this.timeRequested = timeRequested;
  }


  public SimilarityMetadataAllOf topMatches(List<SimilarityMetadataAllOfTopMatches> topMatches) {
    
    this.topMatches = topMatches;
    return this;
  }

  public SimilarityMetadataAllOf addTopMatchesItem(SimilarityMetadataAllOfTopMatches topMatchesItem) {
    this.topMatches.add(topMatchesItem);
    return this;
  }

   /**
   * Top matches
   * @return topMatches
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Top matches")

  public List<SimilarityMetadataAllOfTopMatches> getTopMatches() {
    return topMatches;
  }


  public void setTopMatches(List<SimilarityMetadataAllOfTopMatches> topMatches) {
    this.topMatches = topMatches;
  }


  public SimilarityMetadataAllOf topSourceLargestMatchedWordCount(Integer topSourceLargestMatchedWordCount) {
    
    this.topSourceLargestMatchedWordCount = topSourceLargestMatchedWordCount;
    return this;
  }

   /**
   * Largest individual matched word count, 0 if there isn&#39;t a match to this submission.
   * @return topSourceLargestMatchedWordCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Largest individual matched word count, 0 if there isn't a match to this submission.")

  public Integer getTopSourceLargestMatchedWordCount() {
    return topSourceLargestMatchedWordCount;
  }


  public void setTopSourceLargestMatchedWordCount(Integer topSourceLargestMatchedWordCount) {
    this.topSourceLargestMatchedWordCount = topSourceLargestMatchedWordCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityMetadataAllOf similarityMetadataAllOf = (SimilarityMetadataAllOf) o;
    return Objects.equals(this.submissionId, similarityMetadataAllOf.submissionId) &&
        Objects.equals(this.status, similarityMetadataAllOf.status) &&
        Objects.equals(this.timeGenerated, similarityMetadataAllOf.timeGenerated) &&
        Objects.equals(this.timeRequested, similarityMetadataAllOf.timeRequested) &&
        Objects.equals(this.topMatches, similarityMetadataAllOf.topMatches) &&
        Objects.equals(this.topSourceLargestMatchedWordCount, similarityMetadataAllOf.topSourceLargestMatchedWordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionId, status, timeGenerated, timeRequested, topMatches, topSourceLargestMatchedWordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityMetadataAllOf {\n");
    sb.append("    submissionId: ").append(toIndentedString(submissionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeGenerated: ").append(toIndentedString(timeGenerated)).append("\n");
    sb.append("    timeRequested: ").append(toIndentedString(timeRequested)).append("\n");
    sb.append("    topMatches: ").append(toIndentedString(topMatches)).append("\n");
    sb.append("    topSourceLargestMatchedWordCount: ").append(toIndentedString(topSourceLargestMatchedWordCount)).append("\n");
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

