/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import PropertyMeld.MeldAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertyUpdateRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public PropertyMeld.MeldAPI.models.shared.PropertyInput propertyInput;

    public PropertyUpdateRequest withPropertyInput(PropertyMeld.MeldAPI.models.shared.PropertyInput propertyInput) {
        this.propertyInput = propertyInput;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PropertyUpdateRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PropertyUpdateRequest(@JsonProperty("PropertyInput") PropertyMeld.MeldAPI.models.shared.PropertyInput propertyInput, @JsonProperty("id") String id) {
        this.propertyInput = propertyInput;
        this.id = id;
  }
}
