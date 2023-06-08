<!-- Start SDK Example Usage -->
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

            BuildingListRequest req = new BuildingListRequest(548814L) {{
                limit = 592845L;
                offset = 715190L;
                ordering = "quibusdam";
            }};            

            BuildingListResponse res = sdk.building.buildingList(req, new BuildingListSecurity("unde") {{
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
<!-- End SDK Example Usage -->