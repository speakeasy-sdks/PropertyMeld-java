# building

### Available Operations

* [buildingList](#buildinglist)
* [buildingRetrieve](#buildingretrieve)

## buildingList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.BuildingListRequest;
import PropertyMeld.MeldAPI.models.operations.BuildingListResponse;
import PropertyMeld.MeldAPI.models.operations.BuildingListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            BuildingListRequest req = new BuildingListRequest(857946L) {{
                limit = 544883L;
                offset = 847252L;
                ordering = "vel";
            }};            

            BuildingListResponse res = sdk.building.buildingList(req, new BuildingListSecurity("error") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedBuildingSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [PropertyMeld.MeldAPI.models.operations.BuildingListRequest](../../models/operations/BuildingListRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [PropertyMeld.MeldAPI.models.operations.BuildingListSecurity](../../models/operations/BuildingListSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.BuildingListResponse](../../models/operations/BuildingListResponse.md)**


## buildingRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.BuildingRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.BuildingRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.BuildingRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            BuildingRetrieveRequest req = new BuildingRetrieveRequest(645894L, "suscipit");            

            BuildingRetrieveResponse res = sdk.building.buildingRetrieve(req, new BuildingRetrieveSecurity("iure") {{
                pmoAuth2Authentication = "";
            }});

            if (res.buildingSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [PropertyMeld.MeldAPI.models.operations.BuildingRetrieveRequest](../../models/operations/BuildingRetrieveRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [PropertyMeld.MeldAPI.models.operations.BuildingRetrieveSecurity](../../models/operations/BuildingRetrieveSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[PropertyMeld.MeldAPI.models.operations.BuildingRetrieveResponse](../../models/operations/BuildingRetrieveResponse.md)**

