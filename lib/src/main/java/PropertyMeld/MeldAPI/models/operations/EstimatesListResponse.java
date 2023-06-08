/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class EstimatesListResponse {
    
    public String contentType;

    public EstimatesListResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public PropertyMeld.MeldAPI.models.shared.PaginatedEstimateSerializerListList paginatedEstimateSerializerListList;

    public EstimatesListResponse withPaginatedEstimateSerializerListList(PropertyMeld.MeldAPI.models.shared.PaginatedEstimateSerializerListList paginatedEstimateSerializerListList) {
        this.paginatedEstimateSerializerListList = paginatedEstimateSerializerListList;
        return this;
    }
    
    
    public Integer statusCode;

    public EstimatesListResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public EstimatesListResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public EstimatesListResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
