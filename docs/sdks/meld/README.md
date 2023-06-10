# meld

### Available Operations

* [meldList](#meldlist)
* [meldManagerFilesList](#meldmanagerfileslist)
* [meldRetrieve](#meldretrieve)
* [meldTenantFilesList](#meldtenantfileslist)
* [meldVendorFilesList](#meldvendorfileslist)

## meldList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.MeldListAckApproval;
import PropertyMeld.MeldAPI.models.operations.MeldListCategories;
import PropertyMeld.MeldAPI.models.operations.MeldListDueDateChoice;
import PropertyMeld.MeldAPI.models.operations.MeldListEverBeenAssigned;
import PropertyMeld.MeldAPI.models.operations.MeldListExp;
import PropertyMeld.MeldAPI.models.operations.MeldListHasEstimates;
import PropertyMeld.MeldAPI.models.operations.MeldListMaintType;
import PropertyMeld.MeldAPI.models.operations.MeldListMeldinvoice;
import PropertyMeld.MeldAPI.models.operations.MeldListOrderBy;
import PropertyMeld.MeldAPI.models.operations.MeldListOwnerApproval;
import PropertyMeld.MeldAPI.models.operations.MeldListPriority;
import PropertyMeld.MeldAPI.models.operations.MeldListProjectAssigned;
import PropertyMeld.MeldAPI.models.operations.MeldListRating;
import PropertyMeld.MeldAPI.models.operations.MeldListRecurring;
import PropertyMeld.MeldAPI.models.operations.MeldListReminderChoice;
import PropertyMeld.MeldAPI.models.operations.MeldListRequest;
import PropertyMeld.MeldAPI.models.operations.MeldListResponse;
import PropertyMeld.MeldAPI.models.operations.MeldListSecurity;
import PropertyMeld.MeldAPI.models.operations.MeldListStatus;
import PropertyMeld.MeldAPI.models.operations.MeldListTpr;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            MeldListRequest req = new MeldListRequest(99280L) {{
                ackApproval = MeldListAckApproval.TRUE;
                assignedToMe = "reiciendis";
                categories = MeldListCategories.ROOFING;
                commentsGte = "mollitia";
                commentsLte = "laborum";
                completedGte = "dolores";
                completedInterval = "dolorem";
                completedLte = "corporis";
                createdGte = "explicabo";
                createdInterval = "nobis";
                createdLte = "enim";
                createdOffsetLte = "omnis";
                dueDateChoice = MeldListDueDateChoice.TODAY;
                dueDateGte = "minima";
                dueDateLte = "excepturi";
                everBeenAssigned = MeldListEverBeenAssigned.TRUE;
                exp = MeldListExp.TRUE;
                expS = "culpa";
                filesGte = "doloribus";
                filesLte = "sapiente";
                hasEstimates = MeldListHasEstimates.FALSE;
                invoiceS = "mollitia";
                limit = 208876L;
                maint = "culpa";
                maintType = MeldListMaintType.ONE;
                markedCompleteGte = "repellat";
                markedCompleteInterval = "mollitia";
                markedCompleteLte = "occaecati";
                meldinvoice = MeldListMeldinvoice.TRUE;
                offset = 414369L;
                orderBy = MeldListOrderBy.OWNER_APPROVAL_REQUEST_DATE;
                ownerApproval = MeldListOwnerApproval.OWNER_APPROVAL_APPROVED;
                pg = "velit";
                priority = MeldListPriority.MEDIUM;
                project = "quia";
                projectAssigned = MeldListProjectAssigned.TRUE;
                prop = "vitae";
                rating = MeldListRating.FOUR;
                recurring = MeldListRecurring.FALSE;
                recurringMeld = "enim";
                remindees = "odit";
                reminderChoice = MeldListReminderChoice.WEEK;
                reminderGte = "sequi";
                reminderLte = "tenetur";
                scheduledGte = "ipsam";
                scheduledInterval = "id";
                scheduledLte = "possimus";
                scheduling = "aut";
                status = MeldListStatus.MANAGER_CANCELED;
                tags = "error";
                tagsEx = "temporibus";
                tpr = MeldListTpr.TRUE;
                unit = "quasi";
                updatedGte = "reiciendis";
                updatedInterval = "voluptatibus";
                updatedLte = "vero";
                updatedOffsetLte = "nihil";
                vendorScheduledGte = "praesentium";
                vendorScheduledInterval = "voluptatibus";
                vendorScheduledLte = "ipsa";
                wlGte = "omnis";
                wlLte = "voluptate";
            }};            

            MeldListResponse res = sdk.meld.meldList(req, new MeldListSecurity("cum") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedMeldSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                              | Type                                                                                                   | Required                                                                                               | Description                                                                                            |
| ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------ |
| `request`                                                                                              | [PropertyMeld.MeldAPI.models.operations.MeldListRequest](../../models/operations/MeldListRequest.md)   | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [PropertyMeld.MeldAPI.models.operations.MeldListSecurity](../../models/operations/MeldListSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[PropertyMeld.MeldAPI.models.operations.MeldListResponse](../../models/operations/MeldListResponse.md)**


## meldManagerFilesList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListRequest;
import PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListResponse;
import PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            MeldManagerFilesListRequest req = new MeldManagerFilesListRequest(19987L, "doloremque") {{
                limit = 441711L;
                offset = 282807L;
                ordering = "maiores";
            }};            

            MeldManagerFilesListResponse res = sdk.meld.meldManagerFilesList(req, new MeldManagerFilesListSecurity("dicta") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedPMApiMeldfileList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                      | [PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListRequest](../../models/operations/MeldManagerFilesListRequest.md)   | :heavy_check_mark:                                                                                                             | The request object to use for the request.                                                                                     |
| `security`                                                                                                                     | [PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListSecurity](../../models/operations/MeldManagerFilesListSecurity.md) | :heavy_check_mark:                                                                                                             | The security requirements to use for the request.                                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.MeldManagerFilesListResponse](../../models/operations/MeldManagerFilesListResponse.md)**


## meldRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.MeldRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.MeldRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.MeldRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            MeldRetrieveRequest req = new MeldRetrieveRequest(359444L, "dolore");            

            MeldRetrieveResponse res = sdk.meld.meldRetrieve(req, new MeldRetrieveSecurity("iusto") {{
                pmoAuth2Authentication = "";
            }});

            if (res.meldSerializerDetail != null) {
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
| `request`                                                                                                      | [PropertyMeld.MeldAPI.models.operations.MeldRetrieveRequest](../../models/operations/MeldRetrieveRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [PropertyMeld.MeldAPI.models.operations.MeldRetrieveSecurity](../../models/operations/MeldRetrieveSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.MeldRetrieveResponse](../../models/operations/MeldRetrieveResponse.md)**


## meldTenantFilesList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListRequest;
import PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListResponse;
import PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            MeldTenantFilesListRequest req = new MeldTenantFilesListRequest(118727L, "harum") {{
                limit = 317983L;
                offset = 880476L;
                ordering = "commodi";
            }};            

            MeldTenantFilesListResponse res = sdk.meld.meldTenantFilesList(req, new MeldTenantFilesListSecurity("repudiandae") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedPmAPITenantMeldList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListRequest](../../models/operations/MeldTenantFilesListRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListSecurity](../../models/operations/MeldTenantFilesListSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.MeldTenantFilesListResponse](../../models/operations/MeldTenantFilesListResponse.md)**


## meldVendorFilesList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListRequest;
import PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListResponse;
import PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            MeldVendorFilesListRequest req = new MeldVendorFilesListRequest(64147L, "ipsum") {{
                limit = 692472L;
                offset = 565189L;
                ordering = "excepturi";
            }};            

            MeldVendorFilesListResponse res = sdk.meld.meldVendorFilesList(req, new MeldVendorFilesListSecurity("pariatur") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedPMApiVendorMeldFileList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                    | Type                                                                                                                         | Required                                                                                                                     | Description                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                    | [PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListRequest](../../models/operations/MeldVendorFilesListRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListSecurity](../../models/operations/MeldVendorFilesListSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.MeldVendorFilesListResponse](../../models/operations/MeldVendorFilesListResponse.md)**

