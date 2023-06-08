/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package PropertyMeld.MeldAPI.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MeldInvoiceListDisplayAddress {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public MeldInvoiceListDisplayAddress withCity(String city) {
        this.city = city;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("county_province")
    public String countyProvince;

    public MeldInvoiceListDisplayAddress withCountyProvince(String countyProvince) {
        this.countyProvince = countyProvince;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public MeldInvoiceListDisplayAddress withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line_1")
    public String line1;

    public MeldInvoiceListDisplayAddress withLine1(String line1) {
        this.line1 = line1;
        return this;
    }
    
    @JsonProperty("postcode")
    public String postcode;

    public MeldInvoiceListDisplayAddress withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("property_name")
    public String propertyName;

    public MeldInvoiceListDisplayAddress withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }
    
    public MeldInvoiceListDisplayAddress(@JsonProperty("id") Long id, @JsonProperty("postcode") String postcode) {
        this.id = id;
        this.postcode = postcode;
  }
}
