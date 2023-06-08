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

public class MeldExpendituresListLineItem {
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public MeldExpendituresListLineItem withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("description")
    public String description;

    public MeldExpendituresListLineItem withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expenditures")
    public Long expenditures;

    public MeldExpendituresListLineItem withExpenditures(Long expenditures) {
        this.expenditures = expenditures;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public MeldExpendituresListLineItem withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("quantity")
    public String quantity;

    public MeldExpendituresListLineItem withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit_cost")
    public String unitCost;

    public MeldExpendituresListLineItem withUnitCost(String unitCost) {
        this.unitCost = unitCost;
        return this;
    }
    
    @JsonProperty("unit_price")
    public String unitPrice;

    public MeldExpendituresListLineItem withUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public MeldExpendituresListLineItem withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    public MeldExpendituresListLineItem(@JsonProperty("created") OffsetDateTime created, @JsonProperty("description") String description, @JsonProperty("id") Long id, @JsonProperty("quantity") String quantity, @JsonProperty("unit_price") String unitPrice, @JsonProperty("updated") OffsetDateTime updated) {
        this.created = created;
        this.description = description;
        this.id = id;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.updated = updated;
  }
}
