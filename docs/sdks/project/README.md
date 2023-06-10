# project

### Available Operations

* [projectList](#projectlist)
* [projectRetrieve](#projectretrieve)

## projectList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ProjectListRequest;
import PropertyMeld.MeldAPI.models.operations.ProjectListResponse;
import PropertyMeld.MeldAPI.models.operations.ProjectListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ProjectListRequest req = new ProjectListRequest(807319L) {{
                limit = 411397L;
                offset = 569101L;
                ordering = "odit";
            }};            

            ProjectListResponse res = sdk.project.projectList(req, new ProjectListSecurity("ea") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedProjectListViewList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                    | Type                                                                                                         | Required                                                                                                     | Description                                                                                                  |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                    | [PropertyMeld.MeldAPI.models.operations.ProjectListRequest](../../models/operations/ProjectListRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [PropertyMeld.MeldAPI.models.operations.ProjectListSecurity](../../models/operations/ProjectListSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.ProjectListResponse](../../models/operations/ProjectListResponse.md)**


## projectRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ProjectRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.ProjectRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.ProjectRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ProjectRetrieveRequest req = new ProjectRetrieveRequest(33222L, "ab");            

            ProjectRetrieveResponse res = sdk.project.projectRetrieve(req, new ProjectRetrieveSecurity("maiores") {{
                pmoAuth2Authentication = "";
            }});

            if (res.pmAPIProjectDetail != null) {
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
| `request`                                                                                                            | [PropertyMeld.MeldAPI.models.operations.ProjectRetrieveRequest](../../models/operations/ProjectRetrieveRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [PropertyMeld.MeldAPI.models.operations.ProjectRetrieveSecurity](../../models/operations/ProjectRetrieveSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[PropertyMeld.MeldAPI.models.operations.ProjectRetrieveResponse](../../models/operations/ProjectRetrieveResponse.md)**

