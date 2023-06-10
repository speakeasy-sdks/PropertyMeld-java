# managerFile

### Available Operations

* [managerFileList](#managerfilelist)

## managerFileList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ManagerFileListRequest;
import PropertyMeld.MeldAPI.models.operations.ManagerFileListResponse;
import PropertyMeld.MeldAPI.models.operations.ManagerFileListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ManagerFileListRequest req = new ManagerFileListRequest(359508L) {{
                limit = 613064L;
                offset = 437032L;
                ordering = "saepe";
            }};            

            ManagerFileListResponse res = sdk.managerFile.managerFileList(req, new ManagerFileListSecurity("quidem") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedMeldFileList != null) {
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
| `request`                                                                                                            | [PropertyMeld.MeldAPI.models.operations.ManagerFileListRequest](../../models/operations/ManagerFileListRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [PropertyMeld.MeldAPI.models.operations.ManagerFileListSecurity](../../models/operations/ManagerFileListSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[PropertyMeld.MeldAPI.models.operations.ManagerFileListResponse](../../models/operations/ManagerFileListResponse.md)**

