/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.238
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
import org.openapitools.client.model.WebhookAllOf;
import org.openapitools.client.model.WebhookBase;
import org.threeten.bp.OffsetDateTime;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-01-05T19:31:40.607164Z[Etc/UTC]")
public class Webhook {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";
  @SerializedName(SERIALIZED_NAME_CREATED_TIME)
  private OffsetDateTime createdTime;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_ALLOW_INSECURE = "allow_insecure";
  @SerializedName(SERIALIZED_NAME_ALLOW_INSECURE)
  private Boolean allowInsecure;

  /**
   * Gets or Sets eventTypes
   */
  @JsonAdapter(EventTypesEnum.Adapter.class)
  public enum EventTypesEnum {
    SUBMISSION_COMPLETE("SUBMISSION_COMPLETE"),
    
    SIMILARITY_COMPLETE("SIMILARITY_COMPLETE"),
    
    SIMILARITY_UPDATED("SIMILARITY_UPDATED"),
    
    PDF_STATUS("PDF_STATUS"),
    
    GROUP_ATTACHMENT_COMPLETE("GROUP_ATTACHMENT_COMPLETE");

    private String value;

    EventTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypesEnum fromValue(String value) {
      for (EventTypesEnum b : EventTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPES = "event_types";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private List<EventTypesEnum> eventTypes = new ArrayList<EventTypesEnum>();

  public Webhook() { 
  }

  public Webhook id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * unique id of webhook
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "unique id of webhook")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Webhook createdTime(OffsetDateTime createdTime) {
    
    this.createdTime = createdTime;
    return this;
  }

   /**
   * RFC3339  timestamp of when this Webhook was initially created. This is the time at which the POST to /webhooks was made. 
   * @return createdTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RFC3339  timestamp of when this Webhook was initially created. This is the time at which the POST to /webhooks was made. ")

  public OffsetDateTime getCreatedTime() {
    return createdTime;
  }


  public void setCreatedTime(OffsetDateTime createdTime) {
    this.createdTime = createdTime;
  }


  public Webhook description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * a human readable description of the webhook
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a human readable description of the webhook")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Webhook url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * the URL to callback with events, this must be https unless (allow_insecure is true)
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the URL to callback with events, this must be https unless (allow_insecure is true)")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public Webhook allowInsecure(Boolean allowInsecure) {
    
    this.allowInsecure = allowInsecure;
    return this;
  }

   /**
   * if using an non https url, this must be set to true
   * @return allowInsecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "if using an non https url, this must be set to true")

  public Boolean getAllowInsecure() {
    return allowInsecure;
  }


  public void setAllowInsecure(Boolean allowInsecure) {
    this.allowInsecure = allowInsecure;
  }


  public Webhook eventTypes(List<EventTypesEnum> eventTypes) {
    
    this.eventTypes = eventTypes;
    return this;
  }

  public Webhook addEventTypesItem(EventTypesEnum eventTypesItem) {
    this.eventTypes.add(eventTypesItem);
    return this;
  }

   /**
   * an array of the types of callbacks that will be sent to this webhook
   * @return eventTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "an array of the types of callbacks that will be sent to this webhook")

  public List<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }


  public void setEventTypes(List<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.createdTime, webhook.createdTime) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.url, webhook.url) &&
        Objects.equals(this.allowInsecure, webhook.allowInsecure) &&
        Objects.equals(this.eventTypes, webhook.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdTime, description, url, allowInsecure, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    allowInsecure: ").append(toIndentedString(allowInsecure)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

