# workLog

### Available Operations

* [workLogList](#workloglist)
* [workLogRetrieve](#worklogretrieve)

## workLogList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.WorkLogListRequest;
import PropertyMeld.MeldAPI.models.operations.WorkLogListResponse;
import PropertyMeld.MeldAPI.models.operations.WorkLogListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            WorkLogListRequest req = new WorkLogListRequest(989410L) {{
                limit = 368102L;
                offset = 65304L;
                ordering = "quaerat";
            }};            

            WorkLogListResponse res = sdk.workLog.workLogList(req, new WorkLogListSecurity("porro") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedWorkEntrySerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## workLogRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.WorkLogRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.WorkLogRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.WorkLogRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            WorkLogRetrieveRequest req = new WorkLogRetrieveRequest(801836L, "labore");            

            WorkLogRetrieveResponse res = sdk.workLog.workLogRetrieve(req, new WorkLogRetrieveSecurity("ab") {{
                pmoAuth2Authentication = "";
            }});

            if (res.workEntrySerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
