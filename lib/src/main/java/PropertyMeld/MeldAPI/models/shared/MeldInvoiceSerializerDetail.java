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

public class MeldInvoiceSerializerDetail {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    public String amount;

    public MeldInvoiceSerializerDetail withAmount(String amount) {
        this.amount = amount;
        return this;
    }
    
    @JsonProperty("attachment_url")
    public String attachmentUrl;

    public MeldInvoiceSerializerDetail withAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("create_by")
    public java.util.Map<String, Object> createBy;

    public MeldInvoiceSerializerDetail withCreateBy(java.util.Map<String, Object> createBy) {
        this.createBy = createBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("created")
    public OffsetDateTime created;

    public MeldInvoiceSerializerDetail withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public MeldInvoiceSerializerDetail withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("management_agent")
    public Long managementAgent;

    public MeldInvoiceSerializerDetail withManagementAgent(Long managementAgent) {
        this.managementAgent = managementAgent;
        return this;
    }
    
    @JsonProperty("meld")
    public MeldInvoiceListMeld meld;

    public MeldInvoiceSerializerDetail withMeld(MeldInvoiceListMeld meld) {
        this.meld = meld;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    public String notes;

    public MeldInvoiceSerializerDetail withNotes(String notes) {
        this.notes = notes;
        return this;
    }
    
    @JsonProperty("payment")
    public BasePayment payment;

    public MeldInvoiceSerializerDetail withPayment(BasePayment payment) {
        this.payment = payment;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("payment_requested")
    public OffsetDateTime paymentRequested;

    public MeldInvoiceSerializerDetail withPaymentRequested(OffsetDateTime paymentRequested) {
        this.paymentRequested = paymentRequested;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    public Status09fEnum status;

    public MeldInvoiceSerializerDetail withStatus(Status09fEnum status) {
        this.status = status;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("update_by")
    public java.util.Map<String, Object> updateBy;

    public MeldInvoiceSerializerDetail withUpdateBy(java.util.Map<String, Object> updateBy) {
        this.updateBy = updateBy;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("updated")
    public OffsetDateTime updated;

    public MeldInvoiceSerializerDetail withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }
    
    @JsonProperty("vendor")
    public MeldInvoiceListVendor vendor;

    public MeldInvoiceSerializerDetail withVendor(MeldInvoiceListVendor vendor) {
        this.vendor = vendor;
        return this;
    }
    
    public MeldInvoiceSerializerDetail(@JsonProperty("attachment_url") String attachmentUrl, @JsonProperty("created") OffsetDateTime created, @JsonProperty("id") Long id, @JsonProperty("meld") MeldInvoiceListMeld meld, @JsonProperty("payment") BasePayment payment, @JsonProperty("updated") OffsetDateTime updated, @JsonProperty("vendor") MeldInvoiceListVendor vendor) {
        this.attachmentUrl = attachmentUrl;
        this.created = created;
        this.id = id;
        this.meld = meld;
        this.payment = payment;
        this.updated = updated;
        this.vendor = vendor;
  }
}
