/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import PropertyMeld.MeldAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildingListSecurity {
    @SpeakeasyMetadata("security:scheme=true,type=http,subtype=bearer,name=Authorization")
    public String pmoAuth2Authentication;

    public BuildingListSecurity withPMOAuth2Authentication(String pmoAuth2Authentication) {
        this.pmoAuth2Authentication = pmoAuth2Authentication;
        return this;
    }
    
    public BuildingListSecurity(@JsonProperty("PMOAuth2Authentication") String pmoAuth2Authentication) {
        this.pmoAuth2Authentication = pmoAuth2Authentication;
  }
}
