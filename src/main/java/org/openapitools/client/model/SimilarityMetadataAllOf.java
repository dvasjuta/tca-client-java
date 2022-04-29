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
import org.openapitools.client.model.SimilarityMetadataAllOfTopMatches;

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
 * SimilarityMetadataAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-04-29T18:43:07.985965Z[Etc/UTC]")
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
  private List<SimilarityMetadataAllOfTopMatches> topMatches = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOP_SOURCE_LARGEST_MATCHED_WORD_COUNT = "top_source_largest_matched_word_count";
  @SerializedName(SERIALIZED_NAME_TOP_SOURCE_LARGEST_MATCHED_WORD_COUNT)
  private Integer topSourceLargestMatchedWordCount;

  public SimilarityMetadataAllOf() { 
  }

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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("submission_id");
    openapiFields.add("status");
    openapiFields.add("time_generated");
    openapiFields.add("time_requested");
    openapiFields.add("top_matches");
    openapiFields.add("top_source_largest_matched_word_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("submission_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("time_generated");
    openapiRequiredFields.add("time_requested");
    openapiRequiredFields.add("top_matches");
    openapiRequiredFields.add("top_source_largest_matched_word_count");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimilarityMetadataAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SimilarityMetadataAllOf.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimilarityMetadataAllOf is not found in the empty JSON string", SimilarityMetadataAllOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimilarityMetadataAllOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimilarityMetadataAllOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimilarityMetadataAllOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("submission_id") != null && !jsonObj.get("submission_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submission_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submission_id").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("time_generated") != null && !jsonObj.get("time_generated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_generated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_generated").toString()));
      }
      if (jsonObj.get("time_requested") != null && !jsonObj.get("time_requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_requested").toString()));
      }
      JsonArray jsonArraytopMatches = jsonObj.getAsJsonArray("top_matches");
      if (jsonArraytopMatches != null) {
        // ensure the json data is an array
        if (!jsonObj.get("top_matches").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `top_matches` to be an array in the JSON string but got `%s`", jsonObj.get("top_matches").toString()));
        }

        // validate the optional field `top_matches` (array)
        for (int i = 0; i < jsonArraytopMatches.size(); i++) {
          SimilarityMetadataAllOfTopMatches.validateJsonObject(jsonArraytopMatches.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimilarityMetadataAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimilarityMetadataAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimilarityMetadataAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimilarityMetadataAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<SimilarityMetadataAllOf>() {
           @Override
           public void write(JsonWriter out, SimilarityMetadataAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimilarityMetadataAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimilarityMetadataAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimilarityMetadataAllOf
  * @throws IOException if the JSON string is invalid with respect to SimilarityMetadataAllOf
  */
  public static SimilarityMetadataAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimilarityMetadataAllOf.class);
  }

 /**
  * Convert an instance of SimilarityMetadataAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

