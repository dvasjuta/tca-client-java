/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.230
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
import java.util.UUID;

/**
 * SimilarityGenerationSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-15T13:51:11.299429Z[Etc/UTC]")
public class SimilarityGenerationSettings {
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
  private List<SearchRepositoriesEnum> searchRepositories = new ArrayList<SearchRepositoriesEnum>();

  public static final String SERIALIZED_NAME_SUBMISSION_AUTO_EXCLUDES = "submission_auto_excludes";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_AUTO_EXCLUDES)
  private List<UUID> submissionAutoExcludes = null;

  /**
   * self matching submissions to exclude from report
   */
  @JsonAdapter(AutoExcludeSelfMatchingScopeEnum.Adapter.class)
  public enum AutoExcludeSelfMatchingScopeEnum {
    ALL("ALL"),
    
    GROUP("GROUP"),
    
    GROUP_CONTEXT("GROUP_CONTEXT"),
    
    NONE("NONE");

    private String value;

    AutoExcludeSelfMatchingScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutoExcludeSelfMatchingScopeEnum fromValue(String value) {
      for (AutoExcludeSelfMatchingScopeEnum b : AutoExcludeSelfMatchingScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AutoExcludeSelfMatchingScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutoExcludeSelfMatchingScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutoExcludeSelfMatchingScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AutoExcludeSelfMatchingScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTO_EXCLUDE_SELF_MATCHING_SCOPE = "auto_exclude_self_matching_scope";
  @SerializedName(SERIALIZED_NAME_AUTO_EXCLUDE_SELF_MATCHING_SCOPE)
  private AutoExcludeSelfMatchingScopeEnum autoExcludeSelfMatchingScope;

  /**
   * Priority level of report generation
   */
  @JsonAdapter(PriorityEnum.Adapter.class)
  public enum PriorityEnum {
    FALSE("false");

    private Boolean value;

    PriorityEnum(Boolean value) {
      this.value = value;
    }

    public Boolean getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PriorityEnum fromValue(Boolean value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PriorityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PriorityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PriorityEnum read(final JsonReader jsonReader) throws IOException {
        Boolean value =  jsonReader.nextBoolean();
        return PriorityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private PriorityEnum priority;

  public SimilarityGenerationSettings() { 
  }

  public SimilarityGenerationSettings searchRepositories(List<SearchRepositoriesEnum> searchRepositories) {
    
    this.searchRepositories = searchRepositories;
    return this;
  }

  public SimilarityGenerationSettings addSearchRepositoriesItem(SearchRepositoriesEnum searchRepositoriesItem) {
    this.searchRepositories.add(searchRepositoriesItem);
    return this;
  }

   /**
   * List of repositories to search
   * @return searchRepositories
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of repositories to search")

  public List<SearchRepositoriesEnum> getSearchRepositories() {
    return searchRepositories;
  }


  public void setSearchRepositories(List<SearchRepositoriesEnum> searchRepositories) {
    this.searchRepositories = searchRepositories;
  }


  public SimilarityGenerationSettings submissionAutoExcludes(List<UUID> submissionAutoExcludes) {
    
    this.submissionAutoExcludes = submissionAutoExcludes;
    return this;
  }

  public SimilarityGenerationSettings addSubmissionAutoExcludesItem(UUID submissionAutoExcludesItem) {
    if (this.submissionAutoExcludes == null) {
      this.submissionAutoExcludes = new ArrayList<UUID>();
    }
    this.submissionAutoExcludes.add(submissionAutoExcludesItem);
    return this;
  }

   /**
   * List of submission IDs to exclude from report
   * @return submissionAutoExcludes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of submission IDs to exclude from report")

  public List<UUID> getSubmissionAutoExcludes() {
    return submissionAutoExcludes;
  }


  public void setSubmissionAutoExcludes(List<UUID> submissionAutoExcludes) {
    this.submissionAutoExcludes = submissionAutoExcludes;
  }


  public SimilarityGenerationSettings autoExcludeSelfMatchingScope(AutoExcludeSelfMatchingScopeEnum autoExcludeSelfMatchingScope) {
    
    this.autoExcludeSelfMatchingScope = autoExcludeSelfMatchingScope;
    return this;
  }

   /**
   * self matching submissions to exclude from report
   * @return autoExcludeSelfMatchingScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "self matching submissions to exclude from report")

  public AutoExcludeSelfMatchingScopeEnum getAutoExcludeSelfMatchingScope() {
    return autoExcludeSelfMatchingScope;
  }


  public void setAutoExcludeSelfMatchingScope(AutoExcludeSelfMatchingScopeEnum autoExcludeSelfMatchingScope) {
    this.autoExcludeSelfMatchingScope = autoExcludeSelfMatchingScope;
  }


  public SimilarityGenerationSettings priority(PriorityEnum priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Priority level of report generation
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Priority level of report generation")

  public PriorityEnum getPriority() {
    return priority;
  }


  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimilarityGenerationSettings similarityGenerationSettings = (SimilarityGenerationSettings) o;
    return Objects.equals(this.searchRepositories, similarityGenerationSettings.searchRepositories) &&
        Objects.equals(this.submissionAutoExcludes, similarityGenerationSettings.submissionAutoExcludes) &&
        Objects.equals(this.autoExcludeSelfMatchingScope, similarityGenerationSettings.autoExcludeSelfMatchingScope) &&
        Objects.equals(this.priority, similarityGenerationSettings.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchRepositories, submissionAutoExcludes, autoExcludeSelfMatchingScope, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimilarityGenerationSettings {\n");
    sb.append("    searchRepositories: ").append(toIndentedString(searchRepositories)).append("\n");
    sb.append("    submissionAutoExcludes: ").append(toIndentedString(submissionAutoExcludes)).append("\n");
    sb.append("    autoExcludeSelfMatchingScope: ").append(toIndentedString(autoExcludeSelfMatchingScope)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

