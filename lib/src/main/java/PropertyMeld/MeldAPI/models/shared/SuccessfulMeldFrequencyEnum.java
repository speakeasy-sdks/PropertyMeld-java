/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SuccessfulMeldFrequencyEnum {
    IMMEDIATELY("IMMEDIATELY"),
    DAILY("DAILY"),
    NEVER("NEVER");

    @JsonValue
    public final String value;

    private SuccessfulMeldFrequencyEnum(String value) {
        this.value = value;
    }
}
