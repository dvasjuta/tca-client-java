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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddGroupAttachmentRequest;
import org.openapitools.client.model.AddGroupAttachmentResponse;
import org.openapitools.client.model.AggregateGroup;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.GroupAttachmentResponse;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.RateLimitError;
import org.openapitools.client.model.SubmissionSizeError;
import org.openapitools.client.model.SuccessMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Ignore
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    
    /**
     * Add attachment to a group. will create a group if it does not exist.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addGroupAttachmentTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        AddGroupAttachmentRequest data = null;
                AddGroupAttachmentResponse response = api.addGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data);
        // TODO: test validations
    }
    
    /**
     * Hard delete group attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupAttachmentTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        String attachId = null;
                api.deleteGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId);
        // TODO: test validations
    }
    
    /**
     * Get group, group context and group context owners info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
                AggregateGroup response = api.getGroup(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId);
        // TODO: test validations
    }
    
    /**
     * Get group attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupAttachmentTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        String attachId = null;
                GroupAttachmentResponse response = api.getGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId);
        // TODO: test validations
    }
    
    /**
     * Get all attachments
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupAttachmentsTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
                InlineResponse200 response = api.getGroupAttachments(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId);
        // TODO: test validations
    }
    
    /**
     * upsert group, group context and group context owners info
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void groupsGroupIdPutTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        AggregateGroup data = null;
                AggregateGroup response = api.groupsGroupIdPut(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, data);
        // TODO: test validations
    }
    
    /**
     * Patch a group attachment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateGroupAttachmentTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        String attachId = null;
        AddGroupAttachmentRequest data = null;
                GroupAttachmentResponse response = api.updateGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, data);
        // TODO: test validations
    }
    
    /**
     * Upload Submitted File
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadGroupAttachmentTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String groupId = null;
        String attachId = null;
        String contentDisposition = null;
        Object file = null;
                SuccessMessage response = api.uploadGroupAttachment(xTurnitinIntegrationName, xTurnitinIntegrationVersion, groupId, attachId, contentDisposition, file);
        // TODO: test validations
    }
    
}
