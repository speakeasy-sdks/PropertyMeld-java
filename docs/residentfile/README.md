# residentFile

### Available Operations

* [residentFileList](#residentfilelist)

## residentFileList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentFileListRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentFileListResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentFileListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentFileListRequest req = new ResidentFileListRequest(796392L) {{
                limit = 308286L;
                offset = 959167L;
                ordering = "consectetur";
            }};            

            ResidentFileListResponse res = sdk.residentFile.residentFileList(req, new ResidentFileListSecurity("esse") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedTenantMeldFileList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
