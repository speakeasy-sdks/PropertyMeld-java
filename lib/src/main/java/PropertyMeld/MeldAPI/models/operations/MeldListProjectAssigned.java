/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MeldListProjectAssigned - project_assigned
 */
public enum MeldListProjectAssigned {
    TRUE("true"),
    FALSE("false");

    @JsonValue
    public final String value;

    private MeldListProjectAssigned(String value) {
        this.value = value;
    }
}
