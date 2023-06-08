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
import org.apache.http.NameValuePair;

public class ManagerFile {
	
	private SDKConfiguration sdkConfiguration;

	public ManagerFile(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    public PropertyMeld.MeldAPI.models.operations.ManagerFileListResponse managerFileList(PropertyMeld.MeldAPI.models.operations.ManagerFileListRequest request, PropertyMeld.MeldAPI.models.operations.ManagerFileListSecurity security) throws Exception {
        String baseUrl = this.sdkConfiguration.serverUrl;
        String url = PropertyMeld.MeldAPI.utils.Utils.generateURL(baseUrl, "/api/v0.0.1/manager_file/");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", String.format("speakeasy-sdk/%s %s %s %s", this.sdkConfiguration.language, this.sdkConfiguration.sdkVersion, this.sdkConfiguration.genVersion, this.sdkConfiguration.openapiDocVersion));
        java.util.List<NameValuePair> queryParams = PropertyMeld.MeldAPI.utils.Utils.getQueryParams(PropertyMeld.MeldAPI.models.operations.ManagerFileListRequest.class, request, null);
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

        PropertyMeld.MeldAPI.models.operations.ManagerFileListResponse res = new PropertyMeld.MeldAPI.models.operations.ManagerFileListResponse(contentType, httpRes.statusCode()) {{
            paginatedMeldFileList = null;
        }};
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (PropertyMeld.MeldAPI.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                PropertyMeld.MeldAPI.models.shared.PaginatedMeldFileList out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), PropertyMeld.MeldAPI.models.shared.PaginatedMeldFileList.class);
                res.paginatedMeldFileList = out;
            }
        }

        return res;
    }
}