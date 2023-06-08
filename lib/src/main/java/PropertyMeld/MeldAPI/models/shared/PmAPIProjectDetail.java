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

public class PmAPIProjectDetail {
    @JsonProperty("coordinators")
    public ManagementAgent[] coordinators;

    public PmAPIProjectDetail withCoordinators(ManagementAgent[] coordinators) {
        this.coordinators = coordinators;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public PmAPIProjectDetail withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public PmAPIProjectDetail withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("due_date")
    public OffsetDateTime dueDate;

    public PmAPIProjectDetail withDueDate(OffsetDateTime dueDate) {
        this.dueDate = dueDate;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public PmAPIProjectDetail withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("melds")
    public Long[] melds;

    public PmAPIProjectDetail withMelds(Long[] melds) {
        this.melds = melds;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public PmAPIProjectDetail withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("project_type")
    public ProjectTypeEnum projectType;

    public PmAPIProjectDetail withProjectType(ProjectTypeEnum projectType) {
        this.projectType = projectType;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("start_date")
    public OffsetDateTime startDate;

    public PmAPIProjectDetail withStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unit")
    public PmAPIUnit unit;

    public PmAPIProjectDetail withUnit(PmAPIUnit unit) {
        this.unit = unit;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public PmAPIProjectDetail withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    public PmAPIProjectDetail(@JsonProperty("coordinators") ManagementAgent[] coordinators, @JsonProperty("created") OffsetDateTime created, @JsonProperty("due_date") OffsetDateTime dueDate, @JsonProperty("id") Long id, @JsonProperty("melds") Long[] melds, @JsonProperty("name") String name, @JsonProperty("start_date") OffsetDateTime startDate, @JsonProperty("updated") OffsetDateTime updated) {
        this.coordinators = coordinators;
        this.created = created;
        this.dueDate = dueDate;
        this.id = id;
        this.melds = melds;
        this.name = name;
        this.startDate = startDate;
        this.updated = updated;
  }
}
