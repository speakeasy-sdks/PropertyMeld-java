# vendorInvite

### Available Operations

* [vendorInviteCreate](#vendorinvitecreate)

## vendorInviteCreate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.VendorInviteCreateRequest;
import PropertyMeld.MeldAPI.models.operations.VendorInviteCreateResponse;
import PropertyMeld.MeldAPI.models.operations.VendorInviteCreateSecurity;
import PropertyMeld.MeldAPI.models.shared.VendorInvite;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            VendorInviteCreateRequest req = new VendorInviteCreateRequest(                new VendorInvite("Olen.Christiansen@gmail.com") {{
                                companyName = "dignissimos";
                                companyPhone = "dicta";
                                firstName = "William";
                                lastName = "Mosciski";
                                line1 = "velit";
                                postcode = "39043-1868";
                            }};, 490305L);            

            VendorInviteCreateResponse res = sdk.vendorInvite.vendorInviteCreate(req, new VendorInviteCreateSecurity("officia") {{
                pmoAuth2Authentication = "";
            }});

            if (res.vendorInvite != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [PropertyMeld.MeldAPI.models.operations.VendorInviteCreateRequest](../../models/operations/VendorInviteCreateRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [PropertyMeld.MeldAPI.models.operations.VendorInviteCreateSecurity](../../models/operations/VendorInviteCreateSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.VendorInviteCreateResponse](../../models/operations/VendorInviteCreateResponse.md)**

