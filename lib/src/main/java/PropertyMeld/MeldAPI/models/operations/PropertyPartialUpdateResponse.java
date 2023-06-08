/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class PropertyPartialUpdateResponse {
    
    public String contentType;

    public PropertyPartialUpdateResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public PropertyMeld.MeldAPI.models.shared.Property property;

    public PropertyPartialUpdateResponse withProperty(PropertyMeld.MeldAPI.models.shared.Property property) {
        this.property = property;
        return this;
    }
    
    
    public Integer statusCode;

    public PropertyPartialUpdateResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public PropertyPartialUpdateResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public PropertyPartialUpdateResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
