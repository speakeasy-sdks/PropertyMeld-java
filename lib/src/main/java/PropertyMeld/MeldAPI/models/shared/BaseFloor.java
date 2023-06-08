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

public class BaseFloor {
    @JsonProperty("building")
    public Long building;

    public BaseFloor withBuilding(Long building) {
        this.building = building;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_by")
    public java.util.Map<String, Object> createBy;

    public BaseFloor withCreateBy(java.util.Map<String, Object> createBy) {
        this.createBy = createBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public BaseFloor withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public BaseFloor withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("number")
    public String number;

    public BaseFloor withNumber(String number) {
        this.number = number;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_by")
    public java.util.Map<String, Object> updateBy;

    public BaseFloor withUpdateBy(java.util.Map<String, Object> updateBy) {
        this.updateBy = updateBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public BaseFloor withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    public BaseFloor(@JsonProperty("building") Long building, @JsonProperty("created") OffsetDateTime created, @JsonProperty("id") Long id, @JsonProperty("number") String number, @JsonProperty("updated") OffsetDateTime updated) {
        this.building = building;
        this.created = created;
        this.id = id;
        this.number = number;
        this.updated = updated;
  }
}
