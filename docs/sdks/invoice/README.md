# invoice

### Available Operations

* [invoiceAttachmentRetrieve](#invoiceattachmentretrieve)
* [invoiceList](#invoicelist)
* [invoiceRetrieve](#invoiceretrieve)

## invoiceAttachmentRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            InvoiceAttachmentRetrieveRequest req = new InvoiceAttachmentRetrieveRequest("occaecati");            

            InvoiceAttachmentRetrieveResponse res = sdk.invoice.invoiceAttachmentRetrieve(req, new InvoiceAttachmentRetrieveSecurity("fugit") {{
                pmoAuth2Authentication = "";
            }});

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                | [PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveRequest](../../models/operations/InvoiceAttachmentRetrieveRequest.md)   | :heavy_check_mark:                                                                                                                       | The request object to use for the request.                                                                                               |
| `security`                                                                                                                               | [PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveSecurity](../../models/operations/InvoiceAttachmentRetrieveSecurity.md) | :heavy_check_mark:                                                                                                                       | The security requirements to use for the request.                                                                                        |


### Response

**[PropertyMeld.MeldAPI.models.operations.InvoiceAttachmentRetrieveResponse](../../models/operations/InvoiceAttachmentRetrieveResponse.md)**


## invoiceList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.InvoiceListDeclined;
import PropertyMeld.MeldAPI.models.operations.InvoiceListPaid;
import PropertyMeld.MeldAPI.models.operations.InvoiceListRequest;
import PropertyMeld.MeldAPI.models.operations.InvoiceListResponse;
import PropertyMeld.MeldAPI.models.operations.InvoiceListSecurity;
import PropertyMeld.MeldAPI.models.operations.InvoiceListStatus;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            InvoiceListRequest req = new InvoiceListRequest(537373L) {{
                createdGte = "hic";
                createdInterval = "optio";
                createdLte = "totam";
                declined = InvoiceListDeclined.TRUE;
                limit = 414662L;
                offset = 473600L;
                ordering = "modi";
                paid = InvoiceListPaid.FALSE;
                paymentRequestedGte = "impedit";
                paymentRequestedInterval = "cum";
                paymentRequestedLte = "esse";
                status = InvoiceListStatus.SUBMITTED;
                vendor = "excepturi";
                vendors = "aspernatur";
            }};            

            InvoiceListResponse res = sdk.invoice.invoiceList(req, new InvoiceListSecurity("perferendis") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedMeldInvoiceSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [PropertyMeld.MeldAPI.models.operations.InvoiceListRequest](../../models/operations/InvoiceListRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [PropertyMeld.MeldAPI.models.operations.InvoiceListSecurity](../../models/operations/InvoiceListSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.InvoiceListResponse](../../models/operations/InvoiceListResponse.md)**


## invoiceRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            InvoiceRetrieveRequest req = new InvoiceRetrieveRequest(324141L, "natus");            

            InvoiceRetrieveResponse res = sdk.invoice.invoiceRetrieve(req, new InvoiceRetrieveSecurity("sed") {{
                pmoAuth2Authentication = "";
            }});

            if (res.meldInvoiceSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveRequest](../../models/operations/InvoiceRetrieveRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveSecurity](../../models/operations/InvoiceRetrieveSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[PropertyMeld.MeldAPI.models.operations.InvoiceRetrieveResponse](../../models/operations/InvoiceRetrieveResponse.md)**

