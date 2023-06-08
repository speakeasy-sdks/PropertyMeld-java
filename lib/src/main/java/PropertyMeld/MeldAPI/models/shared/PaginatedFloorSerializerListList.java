/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedFloorSerializerListList {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    public Long count;

    public PaginatedFloorSerializerListList withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public PaginatedFloorSerializerListList withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public PaginatedFloorSerializerListList withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public FloorSerializerList[] results;

    public PaginatedFloorSerializerListList withResults(FloorSerializerList[] results) {
        this.results = results;
        return this;
    }
    
    public PaginatedFloorSerializerListList(){}
}
