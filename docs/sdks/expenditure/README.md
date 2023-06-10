# expenditure

### Available Operations

* [expenditureList](#expenditurelist)
* [expenditureRetrieve](#expenditureretrieve)

## expenditureList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ExpenditureListRequest;
import PropertyMeld.MeldAPI.models.operations.ExpenditureListResponse;
import PropertyMeld.MeldAPI.models.operations.ExpenditureListSecurity;
import PropertyMeld.MeldAPI.models.operations.ExpenditureListStatus;
import java.time.OffsetDateTime;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ExpenditureListRequest req = new ExpenditureListRequest(568045L) {{
                createdGte = OffsetDateTime.parse("2022-01-28T03:46:24.500Z");
                createdInterval = OffsetDateTime.parse("2022-10-15T05:10:19.629Z");
                createdLte = OffsetDateTime.parse("2022-11-30T04:44:49.578Z");
                limit = 648172L;
                offset = 20218L;
                ordering = "ipsam";
                status = new PropertyMeld.MeldAPI.models.operations.ExpenditureListStatus[]{{
                    add(ExpenditureListStatus.IN_REVIEW),
                    add(ExpenditureListStatus.HOLD),
                    add(ExpenditureListStatus.APPROVED),
                    add(ExpenditureListStatus.IN_REVIEW),
                }};
            }};            

            ExpenditureListResponse res = sdk.expenditure.expenditureList(req, new ExpenditureListSecurity("at") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedMeldExpendituresListViewSerializerListList != null) {
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
| `request`                                                                                                            | [PropertyMeld.MeldAPI.models.operations.ExpenditureListRequest](../../models/operations/ExpenditureListRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [PropertyMeld.MeldAPI.models.operations.ExpenditureListSecurity](../../models/operations/ExpenditureListSecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[PropertyMeld.MeldAPI.models.operations.ExpenditureListResponse](../../models/operations/ExpenditureListResponse.md)**


## expenditureRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ExpenditureRetrieveRequest req = new ExpenditureRetrieveRequest(978619L, "molestiae");            

            ExpenditureRetrieveResponse res = sdk.expenditure.expenditureRetrieve(req, new ExpenditureRetrieveSecurity("quod") {{
                pmoAuth2Authentication = "";
            }});

            if (res.meldExpendituresListViewSerializerDetail != null) {
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
| `request`                                                                                                                    | [PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveRequest](../../models/operations/ExpenditureRetrieveRequest.md)   | :heavy_check_mark:                                                                                                           | The request object to use for the request.                                                                                   |
| `security`                                                                                                                   | [PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveSecurity](../../models/operations/ExpenditureRetrieveSecurity.md) | :heavy_check_mark:                                                                                                           | The security requirements to use for the request.                                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.ExpenditureRetrieveResponse](../../models/operations/ExpenditureRetrieveResponse.md)**

