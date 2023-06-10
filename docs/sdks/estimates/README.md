# estimates

### Available Operations

* [estimatesList](#estimateslist)
* [estimatesRetrieve](#estimatesretrieve)

## estimatesList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.EstimatesListEstimateStatus;
import PropertyMeld.MeldAPI.models.operations.EstimatesListRequest;
import PropertyMeld.MeldAPI.models.operations.EstimatesListResponse;
import PropertyMeld.MeldAPI.models.operations.EstimatesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            EstimatesListRequest req = new EstimatesListRequest(891773L) {{
                estimateStatus = new PropertyMeld.MeldAPI.models.operations.EstimatesListEstimateStatus[]{{
                    add(EstimatesListEstimateStatus.ESTIMATE_VENDOR_REJECTED),
                }};
                limit = 272656L;
                offset = 383441L;
                ordering = "molestiae";
            }};            

            EstimatesListResponse res = sdk.estimates.estimatesList(req, new EstimatesListSecurity("minus") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedEstimateSerializerListList != null) {
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
| `request`                                                                                                        | [PropertyMeld.MeldAPI.models.operations.EstimatesListRequest](../../models/operations/EstimatesListRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [PropertyMeld.MeldAPI.models.operations.EstimatesListSecurity](../../models/operations/EstimatesListSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[PropertyMeld.MeldAPI.models.operations.EstimatesListResponse](../../models/operations/EstimatesListResponse.md)**


## estimatesRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            EstimatesRetrieveRequest req = new EstimatesRetrieveRequest(812169L, "voluptatum");            

            EstimatesRetrieveResponse res = sdk.estimates.estimatesRetrieve(req, new EstimatesRetrieveSecurity("iusto") {{
                pmoAuth2Authentication = "";
            }});

            if (res.estimateSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveRequest](../../models/operations/EstimatesRetrieveRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveSecurity](../../models/operations/EstimatesRetrieveSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[PropertyMeld.MeldAPI.models.operations.EstimatesRetrieveResponse](../../models/operations/EstimatesRetrieveResponse.md)**

