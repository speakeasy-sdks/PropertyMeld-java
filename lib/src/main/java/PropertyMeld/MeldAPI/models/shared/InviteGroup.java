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

public class InviteGroup {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_by")
    public java.util.Map<String, Object> createBy;

    public InviteGroup withCreateBy(java.util.Map<String, Object> createBy) {
        this.createBy = createBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public InviteGroup withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public InviteGroup withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("invite")
    public String invite;

    public InviteGroup withInvite(String invite) {
        this.invite = invite;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_by")
    public java.util.Map<String, Object> updateBy;

    public InviteGroup withUpdateBy(java.util.Map<String, Object> updateBy) {
        this.updateBy = updateBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public InviteGroup withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    public InviteGroup(@JsonProperty("created") OffsetDateTime created, @JsonProperty("id") Long id, @JsonProperty("invite") String invite, @JsonProperty("updated") OffsetDateTime updated) {
        this.created = created;
        this.id = id;
        this.invite = invite;
        this.updated = updated;
  }
}
