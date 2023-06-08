/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PaginatedPropertyList {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    public Long count;

    public PaginatedPropertyList withCount(Long count) {
        this.count = count;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    public String next;

    public PaginatedPropertyList withNext(String next) {
        this.next = next;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    public String previous;

    public PaginatedPropertyList withPrevious(String previous) {
        this.previous = previous;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    public Property[] results;

    public PaginatedPropertyList withResults(Property[] results) {
        this.results = results;
        return this;
    }
    
    public PaginatedPropertyList(){}
}
