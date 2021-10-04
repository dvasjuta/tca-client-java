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
import org.openapitools.client.model.Group;
import org.openapitools.client.model.GroupContext;
import org.openapitools.client.model.Users;
import org.threeten.bp.OffsetDateTime;

/**
 * (optional) Submission metadata. If a group context is included, it must be associated to a group
 */
@ApiModel(description = "(optional) Submission metadata. If a group context is included, it must be associated to a group")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-04T12:13:23.459357Z[Etc/UTC]")
public class SubmissionBaseMetadata {
  public static final String SERIALIZED_NAME_SUBMITTER = "submitter";
  @SerializedName(SERIALIZED_NAME_SUBMITTER)
  private Users submitter;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Users> owners = null;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Group group;

  public static final String SERIALIZED_NAME_GROUP_CONTEXT = "group_context";
  @SerializedName(SERIALIZED_NAME_GROUP_CONTEXT)
  private GroupContext groupContext;

  public static final String SERIALIZED_NAME_ORIGINAL_SUBMITTED_TIME = "original_submitted_time";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_SUBMITTED_TIME)
  private OffsetDateTime originalSubmittedTime;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private String custom;


  public SubmissionBaseMetadata submitter(Users submitter) {
    
    this.submitter = submitter;
    return this;
  }

   /**
   * Get submitter
   * @return submitter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Users getSubmitter() {
    return submitter;
  }


  public void setSubmitter(Users submitter) {
    this.submitter = submitter;
  }


  public SubmissionBaseMetadata owners(List<Users> owners) {
    
    this.owners = owners;
    return this;
  }

  public SubmissionBaseMetadata addOwnersItem(Users ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<Users>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Users> getOwners() {
    return owners;
  }


  public void setOwners(List<Users> owners) {
    this.owners = owners;
  }


  public SubmissionBaseMetadata group(Group group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Group getGroup() {
    return group;
  }


  public void setGroup(Group group) {
    this.group = group;
  }


  public SubmissionBaseMetadata groupContext(GroupContext groupContext) {
    
    this.groupContext = groupContext;
    return this;
  }

   /**
   * Get groupContext
   * @return groupContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupContext getGroupContext() {
    return groupContext;
  }


  public void setGroupContext(GroupContext groupContext) {
    this.groupContext = groupContext;
  }


  public SubmissionBaseMetadata originalSubmittedTime(OffsetDateTime originalSubmittedTime) {
    
    this.originalSubmittedTime = originalSubmittedTime;
    return this;
  }

   /**
   * Optional original submision date
   * @return originalSubmittedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional original submision date")

  public OffsetDateTime getOriginalSubmittedTime() {
    return originalSubmittedTime;
  }


  public void setOriginalSubmittedTime(OffsetDateTime originalSubmittedTime) {
    this.originalSubmittedTime = originalSubmittedTime;
  }


  public SubmissionBaseMetadata custom(String custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * custom metadata
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Hello\": \"data\"}", value = "custom metadata")

  public String getCustom() {
    return custom;
  }


  public void setCustom(String custom) {
    this.custom = custom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionBaseMetadata submissionBaseMetadata = (SubmissionBaseMetadata) o;
    return Objects.equals(this.submitter, submissionBaseMetadata.submitter) &&
        Objects.equals(this.owners, submissionBaseMetadata.owners) &&
        Objects.equals(this.group, submissionBaseMetadata.group) &&
        Objects.equals(this.groupContext, submissionBaseMetadata.groupContext) &&
        Objects.equals(this.originalSubmittedTime, submissionBaseMetadata.originalSubmittedTime) &&
        Objects.equals(this.custom, submissionBaseMetadata.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submitter, owners, group, groupContext, originalSubmittedTime, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionBaseMetadata {\n");
    sb.append("    submitter: ").append(toIndentedString(submitter)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupContext: ").append(toIndentedString(groupContext)).append("\n");
    sb.append("    originalSubmittedTime: ").append(toIndentedString(originalSubmittedTime)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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

