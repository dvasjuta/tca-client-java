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
import org.openapitools.client.model.SimilarityMetadataAllOf;
import org.openapitools.client.model.SimilarityMetadataAllOfTopMatches;
import org.openapitools.client.model.SimilarityScoreData;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SimilarityMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-26T18:38:39.898894Z[Etc/UTC]")
public class SimilarityMetadata {
  public static final String SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE = "overall_match_percentage";
  @SerializedName(SERIALIZED_NAME_OVERALL_MATCH_PERCENTAGE)
  private Integer overallMatchPercentage;

  public static final String SERIALIZED_NAME_INTERNET_MATCH_PERCENTAGE = "internet_match_percentage";
  @SerializedName(SERIALIZED_NAME_INTERNET_MATCH_PERCENTAGE)
  private Integer internetMatchPercentage;

  public static final String SERIALIZED_NAME_PUBLICATION_MATCH_PERCENTAGE = "publication_match_percentage";
  @SerializedName(SERIALIZED_NAME_PUBLICATION_MATCH_PERCENTAGE)
  private Integer publicationMatchPercentage;

  public static final String SERIALIZED_NAME_SUBMITTED_WORKS_MATCH_PERCENTAGE = "submitted_works_match_percentage";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_WORKS_MATCH_PERCENTAGE)
  private Integer submittedWorksMatchPercentage;

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


  public SimilarityMetadata overallMatchPercentage(Integer overallMatchPercentage) {
    
    this.overallMatchPercentage = overallMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all sources
   * @return overallMatchPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the percentage match against all sources")

  public Integer getOverallMatchPercentage() {
    return overallMatchPercentage;
  }


  public void setOverallMatchPercentage(Integer overallMatchPercentage) {
    this.overallMatchPercentage = overallMatchPercentage;
  }


  public SimilarityMetadata internetMatchPercentage(Integer internetMatchPercentage) {
    
    this.internetMatchPercentage = internetMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against internet
   * @return internetMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against internet")

  public Integer getInternetMatchPercentage() {
    return internetMatchPercentage;
  }


  public void setInternetMatchPercentage(Integer internetMatchPercentage) {
    this.internetMatchPercentage = internetMatchPercentage;
  }


  public SimilarityMetadata publicationMatchPercentage(Integer publicationMatchPercentage) {
    
    this.publicationMatchPercentage = publicationMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all publications
   * @return publicationMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against all publications")

  public Integer getPublicationMatchPercentage() {
    return publicationMatchPercentage;
  }


  public void setPublicationMatchPercentage(Integer publicationMatchPercentage) {
    this.publicationMatchPercentage = publicationMatchPercentage;
  }


  public SimilarityMetadata submittedWorksMatchPercentage(Integer submittedWorksMatchPercentage) {
    
    this.submittedWorksMatchPercentage = submittedWorksMatchPercentage;
    return this;
  }

   /**
   * Represents the percentage match against all submitted works
   * @return submittedWorksMatchPercentage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Represents the percentage match against all submitted works")

  public Integer getSubmittedWorksMatchPercentage() {
    return submittedWorksMatchPercentage;
  }


  public void setSubmittedWorksMatchPercentage(Integer submittedWorksMatchPercentage) {
    this.submittedWorksMatchPercentage = submittedWorksMatchPercentage;
  }


  public SimilarityMetadata submissionId(String submissionId) {
    
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


  public SimilarityMetadata status(String status) {
    
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


  public SimilarityMetadata timeGenerated(String timeGenerated) {
    
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


  public SimilarityMetadata timeRequested(String timeRequested) {
    
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


  public SimilarityMetadata topMatches(List<SimilarityMetadataAllOfTopMatches> topMatches) {
    
    this.topMatches = topMatches;
    return this;
  }

  public SimilarityMetadata addTopMatchesItem(SimilarityMetadataAllOfTopMatches topMatchesItem) {
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


  public SimilarityMetadata topSourceLargestMatchedWordCount(Integer topSourceLargestMatchedWordCount) {
    
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
    SimilarityMetadata similarityMetadata = (SimilarityMetadata) o;
    return Objects.equals(this.overallMatchPercentage, similarityMetadata.overallMatchPercentage) &&
        Objects.equals(this.internetMatchPercentage, similarityMetadata.internetMatchPercentage) &&
        Objects.equals(this.publicationMatchPercentage, similarityMetadata.publicationMatchPercentage) &&
        Objects.equals(this.submittedWorksMatchPercentage, similarityMetadata.submittedWorksMatchPercentage) &&
        Objects.equals(this.submissionId, similarityMetadata.submissionId) &&
        Objects.equals(this.status, similarityMetadata.status) &&
        Objects.equals(this.timeGenerated, similarityMetadata.timeGenerated) &&
        Objects.equals(this.timeRequested, similarityMetadata.timeRequested) &&
        Objects.equals(this.topMatches, similarityMetadata.topMatches) &&
        Objects.equals(this.topSourceLargestMatchedWordCount, similarityMetadata.topSourceLargestMatchedWordCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && a.get().getClass().isArray() ? Arrays.equals((T[])a.get(), (T[])b.get()) : Objects.equals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallMatchPercentage, internetMatchPercentage, publicationMatchPercentage, submittedWorksMatchPercentage, submissionId, status, timeGenerated, timeRequested, topMatches, topSourceLargestMatchedWordCount);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent()
      ? (a.get().getClass().isArray() ? Arrays.hashCode((T[])a.get()) : Objects.hashCode(a.get()))
      : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityMetadata {\n");
    sb.append("    overallMatchPercentage: ").append(toIndentedString(overallMatchPercentage)).append("\n");
    sb.append("    internetMatchPercentage: ").append(toIndentedString(internetMatchPercentage)).append("\n");
    sb.append("    publicationMatchPercentage: ").append(toIndentedString(publicationMatchPercentage)).append("\n");
    sb.append("    submittedWorksMatchPercentage: ").append(toIndentedString(submittedWorksMatchPercentage)).append("\n");
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

