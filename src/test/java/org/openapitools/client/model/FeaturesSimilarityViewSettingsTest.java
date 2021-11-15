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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for FeaturesSimilarityViewSettings
 */
public class FeaturesSimilarityViewSettingsTest {
    private final FeaturesSimilarityViewSettings model = new FeaturesSimilarityViewSettings();

    /**
     * Model tests for FeaturesSimilarityViewSettings
     */
    @Test
    public void testFeaturesSimilarityViewSettings() {
        // TODO: test FeaturesSimilarityViewSettings
    }

    /**
     * Test the property 'excludeQuotes'
     */
    @Test
    public void excludeQuotesTest() {
        // TODO: test excludeQuotes
    }

    /**
     * Test the property 'excludeBibliography'
     */
    @Test
    public void excludeBibliographyTest() {
        // TODO: test excludeBibliography
    }

    /**
     * Test the property 'excludeCitations'
     */
    @Test
    public void excludeCitationsTest() {
        // TODO: test excludeCitations
    }

    /**
     * Test the property 'excludeAbstract'
     */
    @Test
    public void excludeAbstractTest() {
        // TODO: test excludeAbstract
    }

    /**
     * Test the property 'excludeMethods'
     */
    @Test
    public void excludeMethodsTest() {
        // TODO: test excludeMethods
    }

    /**
     * Test the property 'excludeSmallMatches'
     */
    @Test
    public void excludeSmallMatchesTest() {
        // TODO: test excludeSmallMatches
    }

    /**
     * Test the property 'excludeInternet'
     */
    @Test
    public void excludeInternetTest() {
        // TODO: test excludeInternet
    }

    /**
     * Test the property 'excludePublications'
     */
    @Test
    public void excludePublicationsTest() {
        // TODO: test excludePublications
    }

    /**
     * Test the property 'excludeCrossref'
     */
    @Test
    public void excludeCrossrefTest() {
        // TODO: test excludeCrossref
    }

    /**
     * Test the property 'excludeCrossrefPostedContent'
     */
    @Test
    public void excludeCrossrefPostedContentTest() {
        // TODO: test excludeCrossrefPostedContent
    }

    /**
     * Test the property 'excludeSubmittedWorks'
     */
    @Test
    public void excludeSubmittedWorksTest() {
        // TODO: test excludeSubmittedWorks
    }

    /**
     * Test the property 'excludeCustomSections'
     */
    @Test
    public void excludeCustomSectionsTest() {
        // TODO: test excludeCustomSections
    }

    /**
     * Test the property 'excludePreprints'
     */
    @Test
    public void excludePreprintsTest() {
        // TODO: test excludePreprints
    }

}
