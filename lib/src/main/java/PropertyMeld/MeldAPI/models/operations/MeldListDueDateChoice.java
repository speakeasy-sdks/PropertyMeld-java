/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MeldListDueDateChoice - due_date_choice
 */
public enum MeldListDueDateChoice {
    OVERDUE("overdue"),
    TODAY("today"),
    TOMORROW("tomorrow"),
    WEEK("week");

    @JsonValue
    public final String value;

    private MeldListDueDateChoice(String value) {
        this.value = value;
    }
}
