/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MeldListTpr - tpr
 */
public enum MeldListTpr {
    FALSE("false"),
    TRUE("true");

    @JsonValue
    public final String value;

    private MeldListTpr(String value) {
        this.value = value;
    }
}
