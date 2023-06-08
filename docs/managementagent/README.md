# managementAgent

### Available Operations

* [managementAgentList](#managementagentlist)
* [managementAgentRetrieve](#managementagentretrieve)

## managementAgentList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentListRequest;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentListResponse;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ManagementAgentListRequest req = new ManagementAgentListRequest(612096L) {{
                limit = 222321L;
                offset = 616934L;
                ordering = "laboriosam";
            }};            

            ManagementAgentListResponse res = sdk.managementAgent.managementAgentList(req, new ManagementAgentListSecurity("hic") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedManagementAgentSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## managementAgentRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.ManagementAgentRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ManagementAgentRetrieveRequest req = new ManagementAgentRetrieveRequest(902599L, "fuga");            

            ManagementAgentRetrieveResponse res = sdk.managementAgent.managementAgentRetrieve(req, new ManagementAgentRetrieveSecurity("in") {{
                pmoAuth2Authentication = "";
            }});

            if (res.managementAgentSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
