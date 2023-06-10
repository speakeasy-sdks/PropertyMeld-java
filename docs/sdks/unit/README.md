# unit

### Available Operations

* [unitCreate](#unitcreate)
* [unitDestroy](#unitdestroy)
* [unitList](#unitlist)
* [unitPartialUpdate](#unitpartialupdate)
* [unitRetrieve](#unitretrieve)
* [unitUpdate](#unitupdate)

## unitCreate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitCreateResponse;
import PropertyMeld.MeldAPI.models.operations.UnitCreateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.UnitInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.UnitInput req = new UnitInput(953722L) {{
                approvalCurrencyLimit = "nulla";
                currentResidents = new Long[]{{
                    add(457223L),
                    add(97468L),
                    add(951875L),
                }};
                maintenanceNotes = "error";
                unit = "sint";
                unitAddress = new Address("pariatur", "possimus", "quia", "eveniet") {{
                    country = "Zambia";
                    line2 = "facere";
                    line3 = "veritatis";
                }};;
            }};            

            UnitCreateResponse res = sdk.unit.unitCreate(req, new UnitCreateSecurity("consequuntur") {{
                pmoAuth2Authentication = "";
            }});

            if (res.unit != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [PropertyMeld.MeldAPI.models.shared.UnitInput](../../models/shared/UnitInput.md)                           | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [PropertyMeld.MeldAPI.models.operations.UnitCreateSecurity](../../models/operations/UnitCreateSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitCreateResponse](../../models/operations/UnitCreateResponse.md)**


## unitDestroy

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitDestroyRequest;
import PropertyMeld.MeldAPI.models.operations.UnitDestroyResponse;
import PropertyMeld.MeldAPI.models.operations.UnitDestroySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            UnitDestroyRequest req = new UnitDestroyRequest("quasi");            

            UnitDestroyResponse res = sdk.unit.unitDestroy(req, new UnitDestroySecurity("similique") {{
                pmoAuth2Authentication = "";
            }});

            if (res.statusCode == 200) {
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
| `request`                                                                                                    | [PropertyMeld.MeldAPI.models.operations.UnitDestroyRequest](../../models/operations/UnitDestroyRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [PropertyMeld.MeldAPI.models.operations.UnitDestroySecurity](../../models/operations/UnitDestroySecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitDestroyResponse](../../models/operations/UnitDestroyResponse.md)**


## unitList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitListRequest;
import PropertyMeld.MeldAPI.models.operations.UnitListResponse;
import PropertyMeld.MeldAPI.models.operations.UnitListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            UnitListRequest req = new UnitListRequest() {{
                limit = 633608L;
                offset = 398434L;
                ordering = "tenetur";
            }};            

            UnitListResponse res = sdk.unit.unitList(req, new UnitListSecurity("quae") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedUnitList != null) {
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
| `request`                                                                                              | [PropertyMeld.MeldAPI.models.operations.UnitListRequest](../../models/operations/UnitListRequest.md)   | :heavy_check_mark:                                                                                     | The request object to use for the request.                                                             |
| `security`                                                                                             | [PropertyMeld.MeldAPI.models.operations.UnitListSecurity](../../models/operations/UnitListSecurity.md) | :heavy_check_mark:                                                                                     | The security requirements to use for the request.                                                      |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitListResponse](../../models/operations/UnitListResponse.md)**


## unitPartialUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.PatchedUnitInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            UnitPartialUpdateRequest req = new UnitPartialUpdateRequest("earum") {{
                patchedUnitInput = new PatchedUnitInput() {{
                    approvalCurrencyLimit = "vel";
                    currentResidents = new Long[]{{
                        add(258684L),
                        add(727697L),
                    }};
                    maintenanceNotes = "illum";
                    propertyId = 742238L;
                    unit = "accusantium";
                    unitAddress = new Address("aliquam", "sapiente", "dicta", "ullam") {{
                        country = "Jersey";
                        line2 = "ullam";
                        line3 = "nisi";
                    }};;
                }};;
            }};            

            UnitPartialUpdateResponse res = sdk.unit.unitPartialUpdate(req, new UnitPartialUpdateSecurity("aut") {{
                pmoAuth2Authentication = "";
            }});

            if (res.unit != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                                | [PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateRequest](../../models/operations/UnitPartialUpdateRequest.md)   | :heavy_check_mark:                                                                                                       | The request object to use for the request.                                                                               |
| `security`                                                                                                               | [PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateSecurity](../../models/operations/UnitPartialUpdateSecurity.md) | :heavy_check_mark:                                                                                                       | The security requirements to use for the request.                                                                        |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitPartialUpdateResponse](../../models/operations/UnitPartialUpdateResponse.md)**


## unitRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.UnitRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.UnitRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            UnitRetrieveRequest req = new UnitRetrieveRequest("voluptatum");            

            UnitRetrieveResponse res = sdk.unit.unitRetrieve(req, new UnitRetrieveSecurity("qui") {{
                pmoAuth2Authentication = "";
            }});

            if (res.unit != null) {
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
| `request`                                                                                                      | [PropertyMeld.MeldAPI.models.operations.UnitRetrieveRequest](../../models/operations/UnitRetrieveRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [PropertyMeld.MeldAPI.models.operations.UnitRetrieveSecurity](../../models/operations/UnitRetrieveSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitRetrieveResponse](../../models/operations/UnitRetrieveResponse.md)**


## unitUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.UnitUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.UnitUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.UnitUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.UnitInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            UnitUpdateRequest req = new UnitUpdateRequest(                new UnitInput(845358L) {{
                                approvalCurrencyLimit = "ex";
                                currentResidents = new Long[]{{
                                    add(929292L),
                                    add(680270L),
                                    add(99615L),
                                }};
                                maintenanceNotes = "omnis";
                                unit = "tenetur";
                                unitAddress = new Address("quasi", "at", "et", "voluptate") {{
                                    country = "Austria";
                                    line2 = "minima";
                                    line3 = "veritatis";
                                }};;
                            }};, "consectetur");            

            UnitUpdateResponse res = sdk.unit.unitUpdate(req, new UnitUpdateSecurity("adipisci") {{
                pmoAuth2Authentication = "";
            }});

            if (res.unit != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [PropertyMeld.MeldAPI.models.operations.UnitUpdateRequest](../../models/operations/UnitUpdateRequest.md)   | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [PropertyMeld.MeldAPI.models.operations.UnitUpdateSecurity](../../models/operations/UnitUpdateSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.UnitUpdateResponse](../../models/operations/UnitUpdateResponse.md)**

