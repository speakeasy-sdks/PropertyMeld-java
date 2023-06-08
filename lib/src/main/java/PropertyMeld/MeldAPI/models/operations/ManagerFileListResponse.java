/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class ManagerFileListResponse {
    
    public String contentType;

    public ManagerFileListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public PropertyMeld.MeldAPI.models.shared.PaginatedMeldFileList paginatedMeldFileList;

    public ManagerFileListResponse withPaginatedMeldFileList(PropertyMeld.MeldAPI.models.shared.PaginatedMeldFileList paginatedMeldFileList) {
        this.paginatedMeldFileList = paginatedMeldFileList;
        return this;
    }
    
    
    public Integer statusCode;

    public ManagerFileListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ManagerFileListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ManagerFileListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
