/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MeldListHasEstimates - has_estimates
 */
public enum MeldListHasEstimates {
    FALSE("false"),
    TRUE("true");

    @JsonValue
    public final String value;

    private MeldListHasEstimates(String value) {
        this.value = value;
    }
}
