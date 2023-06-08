# floor

### Available Operations

* [floorList](#floorlist)
* [floorRetrieve](#floorretrieve)

## floorList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.FloorListRequest;
import PropertyMeld.MeldAPI.models.operations.FloorListResponse;
import PropertyMeld.MeldAPI.models.operations.FloorListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            FloorListRequest req = new FloorListRequest(800911L) {{
                limit = 461479L;
                offset = 520478L;
                ordering = "porro";
            }};            

            FloorListResponse res = sdk.floor.floorList(req, new FloorListSecurity("dolorum") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedFloorSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## floorRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.FloorRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.FloorRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.FloorRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            FloorRetrieveRequest req = new FloorRetrieveRequest(118274L, "nam");            

            FloorRetrieveResponse res = sdk.floor.floorRetrieve(req, new FloorRetrieveSecurity("officia") {{
                pmoAuth2Authentication = "";
            }});

            if (res.floorSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
