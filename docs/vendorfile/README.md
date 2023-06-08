# vendorFile

### Available Operations

* [vendorFileList](#vendorfilelist)

## vendorFileList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.VendorFileListRequest;
import PropertyMeld.MeldAPI.models.operations.VendorFileListResponse;
import PropertyMeld.MeldAPI.models.operations.VendorFileListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            VendorFileListRequest req = new VendorFileListRequest(544591L) {{
                limit = 251941L;
                offset = 32465L;
                ordering = "dolor";
            }};            

            VendorFileListResponse res = sdk.vendorFile.vendorFileList(req, new VendorFileListSecurity("occaecati") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedVendorMeldFileList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
