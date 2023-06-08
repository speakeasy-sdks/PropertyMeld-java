/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI;

import PropertyMeld.MeldAPI.utils.HTTPClient;
import PropertyMeld.MeldAPI.utils.HTTPRequest;
import PropertyMeld.MeldAPI.utils.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Estimates {
	
	private SDKConfiguration sdkConfiguration;

	public Estimates(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public PropertyMeld.MeldAPI.models.operations.EstimatesListResponse estimatesList(PropertyMeld.MeldAPI.models.operations.EstimatesListRequest request, PropertyMeld.MeldAPI.models.operations.EstimatesListSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(baseUrl, "/api/v0.0.1/estimates/");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = PropertyMeld.MeldAPI.utils.Utils.getQueryParams(PropertyMeld.MeldAPI.models.operations.EstimatesListRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        java.util.Map<String, java.util.List<String>> headers = PropertyMeld.MeldAPI.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.EstimatesListResponse res = new PropertyMeld.MeldAPI.models.operations.EstimatesListResponse(contentType, httpRes.statusCode()) {{
            paginatedEstimateSerializerListList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.PaginatedEstimateSerializerListList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.PaginatedEstimateSerializerListList.class);
                res.paginatedEstimateSerializerListList = out;
            }
        }

        return res;
    }

    public PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveResponse estimatesRetrieve(PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveRequest request, PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveRequest.class, baseUrl, "/api/v0.0.1/estimates/{id}/", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.Map<String, java.util.List<String>> headers = PropertyMeld.MeldAPI.utils.Utils.getHeaders(request);
        if (headers != null) {
            for (java.util.Map.Entry<String, java.util.List<String>> header : headers.entrySet()) {
                for (String value : header.getValue()) {
                    req.addHeader(header.getKey(), value);
                }
            }
        }
        
        HTTPClient client = PropertyMeld.MeldAPI.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, security);
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveResponse res = new PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveResponse(contentType, httpRes.statusCode()) {{
            estimateSerializerDetail = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.EstimateSerializerDetailOutput out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.EstimateSerializerDetailOutput.class);
                res.estimateSerializerDetail = out;
            }
        }

        return res;
    }
}