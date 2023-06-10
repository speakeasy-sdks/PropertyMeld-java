# vendor

### Available Operations

* [vendorDestroy](#vendordestroy)
* [vendorList](#vendorlist)
* [vendorRetrieve](#vendorretrieve)

## vendorDestroy

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.VendorDestroyRequest;
import PropertyMeld.MeldAPI.models.operations.VendorDestroyResponse;
import PropertyMeld.MeldAPI.models.operations.VendorDestroySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            VendorDestroyRequest req = new VendorDestroyRequest("iste");            

            VendorDestroyResponse res = sdk.vendor.vendorDestroy(req, new VendorDestroySecurity("temporibus") {{
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

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [PropertyMeld.MeldAPI.models.operations.VendorDestroyRequest](../../models/operations/VendorDestroyRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [PropertyMeld.MeldAPI.models.operations.VendorDestroySecurity](../../models/operations/VendorDestroySecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[PropertyMeld.MeldAPI.models.operations.VendorDestroyResponse](../../models/operations/VendorDestroyResponse.md)**


## vendorList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.VendorListRequest;
import PropertyMeld.MeldAPI.models.operations.VendorListResponse;
import PropertyMeld.MeldAPI.models.operations.VendorListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            VendorListRequest req = new VendorListRequest(33074L) {{
                limit = 522371L;
                offset = 15606L;
                ordering = "laudantium";
            }};            

            VendorListResponse res = sdk.vendor.vendorList(req, new VendorListSecurity("eum") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedVendorList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [PropertyMeld.MeldAPI.models.operations.VendorListRequest](../../models/operations/VendorListRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [PropertyMeld.MeldAPI.models.operations.VendorListSecurity](../../models/operations/VendorListSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.VendorListResponse](../../models/operations/VendorListResponse.md)**


## vendorRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.VendorRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.VendorRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.VendorRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            VendorRetrieveRequest req = new VendorRetrieveRequest("mollitia");            

            VendorRetrieveResponse res = sdk.vendor.vendorRetrieve(req, new VendorRetrieveSecurity("ab") {{
                pmoAuth2Authentication = "";
            }});

            if (res.vendor != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [PropertyMeld.MeldAPI.models.operations.VendorRetrieveRequest](../../models/operations/VendorRetrieveRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [PropertyMeld.MeldAPI.models.operations.VendorRetrieveSecurity](../../models/operations/VendorRetrieveSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[PropertyMeld.MeldAPI.models.operations.VendorRetrieveResponse](../../models/operations/VendorRetrieveResponse.md)**

