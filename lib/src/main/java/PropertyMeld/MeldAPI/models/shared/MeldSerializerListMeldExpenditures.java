/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.shared;

import PropertyMeld.MeldAPI.utils.DateTimeDeserializer;
import PropertyMeld.MeldAPI.utils.DateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;

public class MeldSerializerListMeldExpenditures {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public String amount;

    public MeldSerializerListMeldExpenditures withAmount(String amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_by")
    public java.util.Map<String, Object> createBy;

    public MeldSerializerListMeldExpenditures withCreateBy(java.util.Map<String, Object> createBy) {
        this.createBy = createBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public MeldSerializerListMeldExpenditures withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public MeldSerializerListMeldExpenditures withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("meld")
    public Long meld;

    public MeldSerializerListMeldExpenditures withMeld(Long meld) {
        this.meld = meld;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    public String notes;

    public MeldSerializerListMeldExpenditures withNotes(String notes) {
        this.notes = notes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public StatusD0bEnum status;

    public MeldSerializerListMeldExpenditures withStatus(StatusD0bEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_by")
    public java.util.Map<String, Object> updateBy;

    public MeldSerializerListMeldExpenditures withUpdateBy(java.util.Map<String, Object> updateBy) {
        this.updateBy = updateBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public MeldSerializerListMeldExpenditures withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    public MeldSerializerListMeldExpenditures(@JsonProperty("created") OffsetDateTime created, @JsonProperty("id") Long id, @JsonProperty("meld") Long meld, @JsonProperty("updated") OffsetDateTime updated) {
        this.created = created;
        this.id = id;
        this.meld = meld;
        this.updated = updated;
  }
}
