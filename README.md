# openapi-java-client

Turnitin Core API
- API version: 1.0.223
  - Build date: 2021-08-27T14:06:39.372607Z[Etc/UTC]

Turnitin Core API (TCA) provides direct API access to the core functionality provided by Turnitin. TCA supports file submission, similarity report generation, group management, and visualization of report matches via Cloud Viewer or PDF download.
Below is the full flow to successfully set up an integration scope, an API Key, and make calls to TCA. Integration Scope and API Key management is done via the Admin Console UI by logging in as an admin user. For more details, go to our [developer portal documentation page](https://developers.turnitin.com/docs).
## Integration Scope and API Key Management
TCA API calls must provide an API Key for authentication, so you must first have at least one integration scope associated with at least one API Key to use TCA.
### Admin Console UI
First, login to Admin Console UI as an *Admin* user with permission to create Integration Scopes, under a tenant that is licensed to use the TCA product
Integration Scopes (you can create a new one, or add keys to existing)

  * Click `Integrations` in the side bar --> `+ Add Integration` at top the top of the page --> Enter a name --> `Add` Button
  API Keys
  * Click `Integrations` in the side bar --> `Create API Key` Button next to a given Integration Scope -->
  Enter a name --> click `Create and View button`
  * Copy/Save the key manually or click save to clipboard button to copy it (this is the only time it will show)

## TCA Flow

  *  Register a webhook
  *  Create a submission
  *  Upload a file for the submission
  *  Wait for the submission upload to process
     * If you registered a webhook, a callback will be sent to it when upload is complete
     * The status of the *submission* will also update to `COMPLETE`
  *  Request a Similarity Report
  *  Wait for similarity report to process
     * If you registered a webhook, a callback will be sent to it when report is complete
     * The status of the *report* will also be updated to `COMPLETE`
  *  Request a URL with parameters to view the Similarity Report



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0.223</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0.223"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.0.223.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EulaApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://app-us.turnitin.com/api/v1");
    
    // Configure API key authorization: api_key
    ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
    api_key.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //api_key.setApiKeyPrefix("Token");

    EulaApi apiInstance = new EulaApi(defaultClient);
    String xTurnitinIntegrationName = "myintegration"; // String | a human readable string representing the type of integration being used
    String xTurnitinIntegrationVersion = "v1.0.2"; // String | the version of the integration platform being used
    String versionId = "latest"; // String | The EULA version ID (or `latest`) 
    EulaAcceptRequest data = new EulaAcceptRequest(); // EulaAcceptRequest | 
    try {
      EulaAcceptListItem result = apiInstance.eulaVersionIdAcceptPost(xTurnitinIntegrationName, xTurnitinIntegrationVersion, versionId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EulaApi#eulaVersionIdAcceptPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://app-us.turnitin.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EulaApi* | [**eulaVersionIdAcceptPost**](docs/EulaApi.md#eulaVersionIdAcceptPost) | **POST** /eula/{version_id}/accept | Accepts a particular EULA version on behalf of an external user
*EulaApi* | [**eulaVersionIdAcceptUserIdGet**](docs/EulaApi.md#eulaVersionIdAcceptUserIdGet) | **GET** /eula/{version_id}/accept/{user_id} | Queries the acceptences of a particular EULA version on behalf of an external user
*EulaApi* | [**eulaVersionIdGet**](docs/EulaApi.md#eulaVersionIdGet) | **GET** /eula/{version_id} | Gets information about a particular EULA version
*EulaApi* | [**eulaVersionIdViewGet**](docs/EulaApi.md#eulaVersionIdViewGet) | **GET** /eula/{version_id}/view | Gets the text of a particular EULA version
*FeaturesApi* | [**featuresEnabledGet**](docs/FeaturesApi.md#featuresEnabledGet) | **GET** /features-enabled | Get information about what features are allowed by the current license
*GroupsApi* | [**addGroupAttachment**](docs/GroupsApi.md#addGroupAttachment) | **POST** /groups/{group_id}/attachments | Add attachment to a group. will create a group if it does not exist.
*GroupsApi* | [**deleteGroupAttachment**](docs/GroupsApi.md#deleteGroupAttachment) | **DELETE** /groups/{group_id}/attachments/{attach_id} | Hard delete group attachment
*GroupsApi* | [**getGroup**](docs/GroupsApi.md#getGroup) | **GET** /groups/{group_id} | Get group, group context and group context owners info
*GroupsApi* | [**getGroupAttachment**](docs/GroupsApi.md#getGroupAttachment) | **GET** /groups/{group_id}/attachments/{attach_id} | Get group attachment
*GroupsApi* | [**getGroupAttachments**](docs/GroupsApi.md#getGroupAttachments) | **GET** /groups/{group_id}/attachments | Get all attachments
*GroupsApi* | [**groupsGroupIdPut**](docs/GroupsApi.md#groupsGroupIdPut) | **PUT** /groups/{group_id} | upsert group, group context and group context owners info
*GroupsApi* | [**updateGroupAttachment**](docs/GroupsApi.md#updateGroupAttachment) | **PATCH** /groups/{group_id}/attachments/{attach_id} | Patch a group attachment
*GroupsApi* | [**uploadGroupAttachment**](docs/GroupsApi.md#uploadGroupAttachment) | **PUT** /groups/{group_id}/attachments/{attach_id}/original | Upload Submitted File
*IndexApi* | [**getIndexStatus**](docs/IndexApi.md#getIndexStatus) | **GET** /submissions/{id}/index | Return index state of submission
*IndexApi* | [**indexSubmission**](docs/IndexApi.md#indexSubmission) | **PUT** /submissions/{id}/index | Index and return index state of submission
*SimilarityApi* | [**downloadSimilarityReportPdf**](docs/SimilarityApi.md#downloadSimilarityReportPdf) | **GET** /submissions/{id}/similarity/pdf/{pdf_id} | GET download pdf
*SimilarityApi* | [**getSimilarityReportPdfStatus**](docs/SimilarityApi.md#getSimilarityReportPdfStatus) | **GET** /submissions/{id}/similarity/pdf/{pdf_id}/status | GET pdf download status
*SimilarityApi* | [**getSimilarityReportResults**](docs/SimilarityApi.md#getSimilarityReportResults) | **GET** /submissions/{id}/similarity | Get Similarity Report Results
*SimilarityApi* | [**getSimilarityReportUrl**](docs/SimilarityApi.md#getSimilarityReportUrl) | **POST** /submissions/{id}/viewer-url | Returns a URL to access Cloud Viewer
*SimilarityApi* | [**requestSimilarityReport**](docs/SimilarityApi.md#requestSimilarityReport) | **PUT** /submissions/{id}/similarity | Request Similarity Report generation
*SimilarityApi* | [**requestSimilarityReportPdf**](docs/SimilarityApi.md#requestSimilarityReportPdf) | **POST** /submissions/{id}/similarity/pdf | Request Pdf download and returns the Pdf Id
*SubmissionApi* | [**createSubmission**](docs/SubmissionApi.md#createSubmission) | **POST** /submissions | Create a new Submission
*SubmissionApi* | [**deleteSubmission**](docs/SubmissionApi.md#deleteSubmission) | **DELETE** /submissions/{id} | Deletes a submission and associated similarity report.
*SubmissionApi* | [**getSubmiddionDetails**](docs/SubmissionApi.md#getSubmiddionDetails) | **GET** /submissions/{id} | Get Submission Details
*SubmissionApi* | [**recoverSubmission**](docs/SubmissionApi.md#recoverSubmission) | **PUT** /submissions/{id}/recover | Recover a soft deleted submission
*SubmissionApi* | [**uploadSubmittedFile**](docs/SubmissionApi.md#uploadSubmittedFile) | **PUT** /submissions/{id}/original | Upload Submitted File
*WebhookApi* | [**deleteWebhook**](docs/WebhookApi.md#deleteWebhook) | **DELETE** /webhooks/{id} | Delete Webhook endpoint
*WebhookApi* | [**getWebhook**](docs/WebhookApi.md#getWebhook) | **GET** /webhooks/{id} | Get Webhook endpoint info
*WebhookApi* | [**updateWebhook**](docs/WebhookApi.md#updateWebhook) | **PATCH** /webhooks/{id} | Update Webhook endpoint info
*WebhookApi* | [**webhooksGet**](docs/WebhookApi.md#webhooksGet) | **GET** /webhooks | List registered Webhook endpoints
*WebhookApi* | [**webhooksPost**](docs/WebhookApi.md#webhooksPost) | **POST** /webhooks | Register a Webhook endpoint


## Documentation for Models

 - [AddGroupAttachmentRequest](docs/AddGroupAttachmentRequest.md)
 - [AddGroupAttachmentResponse](docs/AddGroupAttachmentResponse.md)
 - [AggregateGroup](docs/AggregateGroup.md)
 - [AuthorMetadataOverride](docs/AuthorMetadataOverride.md)
 - [Error](docs/Error.md)
 - [Eula](docs/Eula.md)
 - [EulaAcceptListItem](docs/EulaAcceptListItem.md)
 - [EulaAcceptRequest](docs/EulaAcceptRequest.md)
 - [EulaVersion](docs/EulaVersion.md)
 - [FeaturesEnabled](docs/FeaturesEnabled.md)
 - [FeaturesGenerationSettings](docs/FeaturesGenerationSettings.md)
 - [FeaturesSimilarity](docs/FeaturesSimilarity.md)
 - [FeaturesSimilarityViewSettings](docs/FeaturesSimilarityViewSettings.md)
 - [FeaturesTenant](docs/FeaturesTenant.md)
 - [FeaturesViewerModes](docs/FeaturesViewerModes.md)
 - [Group](docs/Group.md)
 - [GroupAttachmentResponse](docs/GroupAttachmentResponse.md)
 - [GroupContext](docs/GroupContext.md)
 - [IndexStateSettings](docs/IndexStateSettings.md)
 - [IndexingSettings](docs/IndexingSettings.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [PdfStatusResponse](docs/PdfStatusResponse.md)
 - [RateLimitError](docs/RateLimitError.md)
 - [RequestPdfResponse](docs/RequestPdfResponse.md)
 - [Sidebar](docs/Sidebar.md)
 - [SimilarityGenerationSettings](docs/SimilarityGenerationSettings.md)
 - [SimilarityMetadata](docs/SimilarityMetadata.md)
 - [SimilarityMetadataAllOf](docs/SimilarityMetadataAllOf.md)
 - [SimilarityMetadataAllOfTopMatches](docs/SimilarityMetadataAllOfTopMatches.md)
 - [SimilarityOverview](docs/SimilarityOverview.md)
 - [SimilarityOverviewMatchAggregate](docs/SimilarityOverviewMatchAggregate.md)
 - [SimilarityOverviewMatchGroup](docs/SimilarityOverviewMatchGroup.md)
 - [SimilarityOverviewMatchSource](docs/SimilarityOverviewMatchSource.md)
 - [SimilarityPutRequest](docs/SimilarityPutRequest.md)
 - [SimilarityScoreData](docs/SimilarityScoreData.md)
 - [SimilaritySettings](docs/SimilaritySettings.md)
 - [SimilaritySettingsModes](docs/SimilaritySettingsModes.md)
 - [SimilaritySettingsViewSettings](docs/SimilaritySettingsViewSettings.md)
 - [SimilarityViewSettings](docs/SimilarityViewSettings.md)
 - [SimilarityViewerUrlResponse](docs/SimilarityViewerUrlResponse.md)
 - [SimilarityViewerUrlSettings](docs/SimilarityViewerUrlSettings.md)
 - [SimpleSubmissionResponse](docs/SimpleSubmissionResponse.md)
 - [SimpleSubmissionResponseAllOf](docs/SimpleSubmissionResponseAllOf.md)
 - [Submission](docs/Submission.md)
 - [SubmissionAllOf](docs/SubmissionAllOf.md)
 - [SubmissionBase](docs/SubmissionBase.md)
 - [SubmissionBaseMetadata](docs/SubmissionBaseMetadata.md)
 - [SubmissionSizeError](docs/SubmissionSizeError.md)
 - [SuccessMessage](docs/SuccessMessage.md)
 - [Users](docs/Users.md)
 - [ViewerPermissions](docs/ViewerPermissions.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookAllOf](docs/WebhookAllOf.md)
 - [WebhookBase](docs/WebhookBase.md)
 - [WebhookPathRequest](docs/WebhookPathRequest.md)
 - [WebhookWithSecret](docs/WebhookWithSecret.md)
 - [WebhookWithSecretAllOf](docs/WebhookWithSecretAllOf.md)
 - [WebhooksMetadata](docs/WebhooksMetadata.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



