# property

### Available Operations

* [propertyCreate](#propertycreate)
* [propertyDestroy](#propertydestroy)
* [propertyList](#propertylist)
* [propertyPartialUpdate](#propertypartialupdate)
* [propertyRetrieve](#propertyretrieve)
* [propertyUpdate](#propertyupdate)

## propertyCreate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyCreateResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyCreateSecurity;
import PropertyMeld.MeldAPI.models.shared.PropertyInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.PropertyInput req = new PropertyInput("quidem", "ipsam", "voluptate", "autem") {{
                country = "Qatar";
                line2 = "eaque";
                line3 = "pariatur";
                maintenanceNotes = "nemo";
                otherAddressDetails = "voluptatibus";
                owners = new Long[]{{
                    add(855804L),
                }};
                propertyGroups = new Long[]{{
                    add(11714L),
                }};
                propertyName = "cumque";
                units = new Long[]{{
                    add(944124L),
                    add(729991L),
                }};
            }};            

            PropertyCreateResponse res = sdk.property.propertyCreate(req, new PropertyCreateSecurity("nobis") {{
                pmoAuth2Authentication = "";
            }});

            if (res.property != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [PropertyMeld.MeldAPI.models.shared.PropertyInput](../../models/shared/PropertyInput.md)                           | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [PropertyMeld.MeldAPI.models.operations.PropertyCreateSecurity](../../models/operations/PropertyCreateSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyCreateResponse](../../models/operations/PropertyCreateResponse.md)**


## propertyDestroy

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyDestroyRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyDestroyResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyDestroySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyDestroyRequest req = new PropertyDestroyRequest("dolores");            

            PropertyDestroyResponse res = sdk.property.propertyDestroy(req, new PropertyDestroySecurity("quis") {{
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [PropertyMeld.MeldAPI.models.operations.PropertyDestroyRequest](../../models/operations/PropertyDestroyRequest.md)   | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |
| `security`                                                                                                           | [PropertyMeld.MeldAPI.models.operations.PropertyDestroySecurity](../../models/operations/PropertyDestroySecurity.md) | :heavy_check_mark:                                                                                                   | The security requirements to use for the request.                                                                    |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyDestroyResponse](../../models/operations/PropertyDestroyResponse.md)**


## propertyList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyListRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyListResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyListRequest req = new PropertyListRequest() {{
                limit = 521037L;
                offset = 489549L;
                ordering = "eaque";
            }};            

            PropertyListResponse res = sdk.property.propertyList(req, new PropertyListSecurity("quis") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedPropertyList != null) {
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
| `request`                                                                                                      | [PropertyMeld.MeldAPI.models.operations.PropertyListRequest](../../models/operations/PropertyListRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [PropertyMeld.MeldAPI.models.operations.PropertyListSecurity](../../models/operations/PropertyListSecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyListResponse](../../models/operations/PropertyListResponse.md)**


## propertyPartialUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.PatchedPropertyInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyPartialUpdateRequest req = new PropertyPartialUpdateRequest("nesciunt") {{
                patchedPropertyInput = new PatchedPropertyInput() {{
                    city = "North Ceciliafield";
                    country = "Democratic People's Republic of Korea";
                    countyProvince = "dolor";
                    line1 = "vero";
                    line2 = "nostrum";
                    line3 = "hic";
                    maintenanceNotes = "recusandae";
                    otherAddressDetails = "omnis";
                    owners = new Long[]{{
                        add(596656L),
                        add(31838L),
                        add(783645L),
                    }};
                    postcode = "56056";
                    propertyGroups = new Long[]{{
                        add(992397L),
                    }};
                    propertyName = "earum";
                    units = new Long[]{{
                        add(613966L),
                        add(679091L),
                    }};
                }};;
            }};            

            PropertyPartialUpdateResponse res = sdk.property.propertyPartialUpdate(req, new PropertyPartialUpdateSecurity("deleniti") {{
                pmoAuth2Authentication = "";
            }});

            if (res.property != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                        | [PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateRequest](../../models/operations/PropertyPartialUpdateRequest.md)   | :heavy_check_mark:                                                                                                               | The request object to use for the request.                                                                                       |
| `security`                                                                                                                       | [PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateSecurity](../../models/operations/PropertyPartialUpdateSecurity.md) | :heavy_check_mark:                                                                                                               | The security requirements to use for the request.                                                                                |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyPartialUpdateResponse](../../models/operations/PropertyPartialUpdateResponse.md)**


## propertyRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyRetrieveRequest req = new PropertyRetrieveRequest("pariatur");            

            PropertyRetrieveResponse res = sdk.property.propertyRetrieve(req, new PropertyRetrieveSecurity("provident") {{
                pmoAuth2Authentication = "";
            }});

            if (res.property != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                              | Type                                                                                                                   | Required                                                                                                               | Description                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                              | [PropertyMeld.MeldAPI.models.operations.PropertyRetrieveRequest](../../models/operations/PropertyRetrieveRequest.md)   | :heavy_check_mark:                                                                                                     | The request object to use for the request.                                                                             |
| `security`                                                                                                             | [PropertyMeld.MeldAPI.models.operations.PropertyRetrieveSecurity](../../models/operations/PropertyRetrieveSecurity.md) | :heavy_check_mark:                                                                                                     | The security requirements to use for the request.                                                                      |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyRetrieveResponse](../../models/operations/PropertyRetrieveResponse.md)**


## propertyUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.PropertyInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyUpdateRequest req = new PropertyUpdateRequest(                new PropertyInput("nobis", "libero", "delectus", "quaerat") {{
                                country = "Martinique";
                                line2 = "aliquid";
                                line3 = "dolorem";
                                maintenanceNotes = "dolorem";
                                otherAddressDetails = "dolor";
                                owners = new Long[]{{
                                    add(218749L),
                                }};
                                propertyGroups = new Long[]{{
                                    add(569574L),
                                    add(739551L),
                                    add(452109L),
                                    add(490459L),
                                }};
                                propertyName = "reiciendis";
                                units = new Long[]{{
                                    add(680545L),
                                }};
                            }};, "numquam");            

            PropertyUpdateResponse res = sdk.property.propertyUpdate(req, new PropertyUpdateSecurity("veritatis") {{
                pmoAuth2Authentication = "";
            }});

            if (res.property != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `request`                                                                                                          | [PropertyMeld.MeldAPI.models.operations.PropertyUpdateRequest](../../models/operations/PropertyUpdateRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [PropertyMeld.MeldAPI.models.operations.PropertyUpdateSecurity](../../models/operations/PropertyUpdateSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[PropertyMeld.MeldAPI.models.operations.PropertyUpdateResponse](../../models/operations/PropertyUpdateResponse.md)**

