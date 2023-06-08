/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import PropertyMeld.MeldAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PropertyGroupRetrieveRequest {
    /**
     * The management ID (MID), found in the first number of your URL when logged in:  https://app.propertymeld.com/{MID}/m/123
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Pm-Org")
    public Long xPmOrg;

    public PropertyGroupRetrieveRequest withXPmOrg(Long xPmOrg) {
        this.xPmOrg = xPmOrg;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public PropertyGroupRetrieveRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public PropertyGroupRetrieveRequest(@JsonProperty("X-Pm-Org") Long xPmOrg, @JsonProperty("id") String id) {
        this.xPmOrg = xPmOrg;
        this.id = id;
  }
}
