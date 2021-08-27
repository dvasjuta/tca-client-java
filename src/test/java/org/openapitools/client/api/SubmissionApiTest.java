/*
 * Turnitin Core API
 * Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download. Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs). ## Integration Scope and API Key Management TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA. ### Admin Console UI First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product Integration Scopes (you can create a new one, or add keys to existing)    * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button   API Keys   * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->   Enter a name --> click `Create and View button`   * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)  ## TCA Flow    *  Register a webhook   *  Create a submission   *  Upload a file for the submission   *  Wait for the submission upload to process      * If you registered a webhook, a callback will be sent to it when upload is complete      * The status of the *submission* will also update to `COMPLETE`   *  Request a Similarity Report   *  Wait for similarity report to process      * If you registered a webhook, a callback will be sent to it when report is complete      * The status of the *report* will also be updated to `COMPLETE`   *  Request a URL with parameters to view the Similarity Report 
 *
 * The version of the OpenAPI document: 1.0.223
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.RateLimitError;
import org.openapitools.client.model.SimpleSubmissionResponse;
import org.openapitools.client.model.Submission;
import org.openapitools.client.model.SubmissionBase;
import org.openapitools.client.model.SubmissionSizeError;
import org.openapitools.client.model.SuccessMessage;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubmissionApi
 */
@Ignore
public class SubmissionApiTest {

    private final SubmissionApi api = new SubmissionApi();

    
    /**
     * Create a new Submission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSubmissionTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        SubmissionBase data = null;
        SimpleSubmissionResponse response = api.createSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, data);

        // TODO: test validations
    }
    
    /**
     * Deletes a submission and associated similarity report.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSubmissionTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        String hard = null;
        SuccessMessage response = api.deleteSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, hard);

        // TODO: test validations
    }
    
    /**
     * Get Submission Details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSubmiddionDetailsTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        Submission response = api.getSubmiddionDetails(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);

        // TODO: test validations
    }
    
    /**
     * Recover a soft deleted submission
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void recoverSubmissionTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        SimpleSubmissionResponse response = api.recoverSubmission(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id);

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
    public void uploadSubmittedFileTest() throws ApiException {
        String xTurnitinIntegrationName = null;
        String xTurnitinIntegrationVersion = null;
        String id = null;
        String contentType = null;
        String contentDisposition = null;
        Object file = null;
        SuccessMessage response = api.uploadSubmittedFile(xTurnitinIntegrationName, xTurnitinIntegrationVersion, id, contentType, contentDisposition, file);

        // TODO: test validations
    }
    
}
