/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import PropertyMeld.MeldAPI.utils.SpeakeasyMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProjectListRequest {
    /**
     * The management ID (MID), found in the first number of your URL when logged in:  https://app.propertymeld.com/{MID}/m/123
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Pm-Org")
    public Long xPmOrg;

    public ProjectListRequest withXPmOrg(Long xPmOrg) {
        this.xPmOrg = xPmOrg;
        return this;
    }
    
    /**
     * Number of results to return per page.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=limit")
    public Long limit;

    public ProjectListRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The initial index from which to return the results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public Long offset;

    public ProjectListRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Which field to use when ordering the results.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=ordering")
    public String ordering;

    public ProjectListRequest withOrdering(String ordering) {
        this.ordering = ordering;
        return this;
    }
    
    public ProjectListRequest(@JsonProperty("X-Pm-Org") Long xPmOrg) {
        this.xPmOrg = xPmOrg;
  }
}
