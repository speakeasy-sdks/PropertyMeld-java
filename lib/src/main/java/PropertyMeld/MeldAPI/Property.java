/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI;

import PropertyMeld.MeldAPI.utils.HTTPClient;
import PropertyMeld.MeldAPI.utils.HTTPRequest;
import PropertyMeld.MeldAPI.utils.JSON;
import PropertyMeld.MeldAPI.utils.SerializedBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Property {
	
	private SDKConfiguration sdkConfiguration;

	public Property(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public PropertyMeld.MeldAPI.models.operations.PropertyCreateResponse propertyCreate(PropertyMeld.MeldAPI.models.shared.PropertyInput request, PropertyMeld.MeldAPI.models.operations.PropertyCreateSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(baseUrl, "/api/v0.0.1/property/");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = PropertyMeld.MeldAPI.utils.Utils.serializeRequestBody(request, "request", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyCreateResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyCreateResponse(contentType, httpRes.statusCode()) {{
            property = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 201) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.Property out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.Property.class);
                res.property = out;
            }
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.PropertyDestroyResponse propertyDestroy(PropertyMeld.MeldAPI.models.operations.PropertyDestroyRequest request, PropertyMeld.MeldAPI.models.operations.PropertyDestroySecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(PropertyMeld.MeldAPI.models.operations.PropertyDestroyRequest.class, baseUrl, "/api/v0.0.1/property/{id}/", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "*/*");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyDestroyResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyDestroyResponse(contentType, httpRes.statusCode()) {{
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.PropertyListResponse propertyList(PropertyMeld.MeldAPI.models.operations.PropertyListRequest request, PropertyMeld.MeldAPI.models.operations.PropertyListSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(baseUrl, "/api/v0.0.1/property/");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = PropertyMeld.MeldAPI.utils.Utils.getQueryParams(PropertyMeld.MeldAPI.models.operations.PropertyListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyListResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyListResponse(contentType, httpRes.statusCode()) {{
            paginatedPropertyList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.PaginatedPropertyList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.PaginatedPropertyList.class);
                res.paginatedPropertyList = out;
            }
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateResponse propertyPartialUpdate(PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateRequest request, PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateRequest.class, baseUrl, "/api/v0.0.1/property/{id}/", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = PropertyMeld.MeldAPI.utils.Utils.serializeRequestBody(request, "patchedPropertyInput", "json");
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateResponse(contentType, httpRes.statusCode()) {{
            property = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.Property out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.Property.class);
                res.property = out;
            }
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.PropertyRetrieveResponse propertyRetrieve(PropertyMeld.MeldAPI.models.operations.PropertyRetrieveRequest request, PropertyMeld.MeldAPI.models.operations.PropertyRetrieveSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(PropertyMeld.MeldAPI.models.operations.PropertyRetrieveRequest.class, baseUrl, "/api/v0.0.1/property/{id}/", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyRetrieveResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyRetrieveResponse(contentType, httpRes.statusCode()) {{
            property = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.Property out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.Property.class);
                res.property = out;
            }
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.PropertyUpdateResponse propertyUpdate(PropertyMeld.MeldAPI.models.operations.PropertyUpdateRequest request, PropertyMeld.MeldAPI.models.operations.PropertyUpdateSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(PropertyMeld.MeldAPI.models.operations.PropertyUpdateRequest.class, baseUrl, "/api/v0.0.1/property/{id}/", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = PropertyMeld.MeldAPI.utils.Utils.serializeRequestBody(request, "propertyInput", "json");
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.PropertyUpdateResponse res = new PropertyMeld.MeldAPI.models.operations.PropertyUpdateResponse(contentType, httpRes.statusCode()) {{
            property = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.Property out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.Property.class);
                res.property = out;
            }
        }

        return res;
    }
}