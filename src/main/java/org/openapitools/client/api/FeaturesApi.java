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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.Error;
import org.openapitools.client.model.FeaturesEnabled;
import org.openapitools.client.model.RateLimitError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class FeaturesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FeaturesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FeaturesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for featuresEnabledGet
     * @param xTurnitinIntegrationName a human readable string representing the type of integration being used (required)
     * @param xTurnitinIntegrationVersion the version of the integration platform being used (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of available features </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not properly authenticated </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests have been made in a short amount of time, please wait for a bit a try again.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An Error Occurred </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call featuresEnabledGetCall(String xTurnitinIntegrationName, String xTurnitinIntegrationVersion, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/features-enabled";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xTurnitinIntegrationName != null) {
            localVarHeaderParams.put("X-Turnitin-Integration-Name", localVarApiClient.parameterToString(xTurnitinIntegrationName));
        }

        if (xTurnitinIntegrationVersion != null) {
            localVarHeaderParams.put("X-Turnitin-Integration-Version", localVarApiClient.parameterToString(xTurnitinIntegrationVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "api_key" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call featuresEnabledGetValidateBeforeCall(String xTurnitinIntegrationName, String xTurnitinIntegrationVersion, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'xTurnitinIntegrationName' is set
        if (xTurnitinIntegrationName == null) {
            throw new ApiException("Missing the required parameter 'xTurnitinIntegrationName' when calling featuresEnabledGet(Async)");
        }
        
        // verify the required parameter 'xTurnitinIntegrationVersion' is set
        if (xTurnitinIntegrationVersion == null) {
            throw new ApiException("Missing the required parameter 'xTurnitinIntegrationVersion' when calling featuresEnabledGet(Async)");
        }
        

        okhttp3.Call localVarCall = featuresEnabledGetCall(xTurnitinIntegrationName, xTurnitinIntegrationVersion, _callback);
        return localVarCall;

    }

    /**
     * Get information about what features are allowed by the current license
     * 
     * @param xTurnitinIntegrationName a human readable string representing the type of integration being used (required)
     * @param xTurnitinIntegrationVersion the version of the integration platform being used (required)
     * @return FeaturesEnabled
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of available features </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not properly authenticated </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests have been made in a short amount of time, please wait for a bit a try again.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An Error Occurred </td><td>  -  </td></tr>
     </table>
     */
    public FeaturesEnabled featuresEnabledGet(String xTurnitinIntegrationName, String xTurnitinIntegrationVersion) throws ApiException {
        ApiResponse<FeaturesEnabled> localVarResp = featuresEnabledGetWithHttpInfo(xTurnitinIntegrationName, xTurnitinIntegrationVersion);
        return localVarResp.getData();
    }

    /**
     * Get information about what features are allowed by the current license
     * 
     * @param xTurnitinIntegrationName a human readable string representing the type of integration being used (required)
     * @param xTurnitinIntegrationVersion the version of the integration platform being used (required)
     * @return ApiResponse&lt;FeaturesEnabled&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of available features </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not properly authenticated </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests have been made in a short amount of time, please wait for a bit a try again.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An Error Occurred </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FeaturesEnabled> featuresEnabledGetWithHttpInfo(String xTurnitinIntegrationName, String xTurnitinIntegrationVersion) throws ApiException {
        okhttp3.Call localVarCall = featuresEnabledGetValidateBeforeCall(xTurnitinIntegrationName, xTurnitinIntegrationVersion, null);
        Type localVarReturnType = new TypeToken<FeaturesEnabled>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get information about what features are allowed by the current license (asynchronously)
     * 
     * @param xTurnitinIntegrationName a human readable string representing the type of integration being used (required)
     * @param xTurnitinIntegrationVersion the version of the integration platform being used (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List of available features </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Not properly authenticated </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too many requests have been made in a short amount of time, please wait for a bit a try again.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An Error Occurred </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call featuresEnabledGetAsync(String xTurnitinIntegrationName, String xTurnitinIntegrationVersion, final ApiCallback<FeaturesEnabled> _callback) throws ApiException {

        okhttp3.Call localVarCall = featuresEnabledGetValidateBeforeCall(xTurnitinIntegrationName, xTurnitinIntegrationVersion, _callback);
        Type localVarReturnType = new TypeToken<FeaturesEnabled>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
