# owner

### Available Operations

* [ownerCreate](#ownercreate)
* [ownerDestroy](#ownerdestroy)
* [ownerList](#ownerlist)
* [ownerPartialUpdate](#ownerpartialupdate)
* [ownerRetrieve](#ownerretrieve)
* [ownerUpdate](#ownerupdate)

## ownerCreate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerCreateResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerCreateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.HubAccessLevelEnum;
import PropertyMeld.MeldAPI.models.shared.OwnerInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.OwnerInput req = new OwnerInput("Johanna.Ledner92@gmail.com", "sint", "veritatis") {{
                address = new Address("itaque", "incidunt", "enim", "consequatur") {{
                    country = "Norway";
                    line2 = "quibusdam";
                    line3 = "explicabo";
                }};;
                contact = new Contact() {{
                    businessPhone = "deserunt";
                    businessPhoneExt = "distinctio";
                    cellPhone = "quibusdam";
                    cellPhoneExt = "labore";
                    fax = "modi";
                    homePhone = "qui";
                    homePhoneExt = "aliquid";
                    primaryEmail = "Kavon82@yahoo.com";
                    secondaryEmail = "Abigale_Corkery27@yahoo.com";
                    tertiaryEmail = "Mustafa.Green24@hotmail.com";
                }};;
                hubAccessLevel = HubAccessLevelEnum.HUB_ACCESS;
                invitedToHub = false;
                properties = new Long[]{{
                    add(396098L),
                    add(592042L),
                    add(896039L),
                }};
            }};            

            OwnerCreateResponse res = sdk.owner.ownerCreate(req, new OwnerCreateSecurity("sint") {{
                pmoAuth2Authentication = "";
            }});

            if (res.owner != null) {
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
| `request`                                                                                                    | [PropertyMeld.MeldAPI.models.shared.OwnerInput](../../models/shared/OwnerInput.md)                           | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [PropertyMeld.MeldAPI.models.operations.OwnerCreateSecurity](../../models/operations/OwnerCreateSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerCreateResponse](../../models/operations/OwnerCreateResponse.md)**


## ownerDestroy

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerDestroyRequest;
import PropertyMeld.MeldAPI.models.operations.OwnerDestroyResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerDestroySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            OwnerDestroyRequest req = new OwnerDestroyRequest("officia");            

            OwnerDestroyResponse res = sdk.owner.ownerDestroy(req, new OwnerDestroySecurity("dolor") {{
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

| Parameter                                                                                                      | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                      | [PropertyMeld.MeldAPI.models.operations.OwnerDestroyRequest](../../models/operations/OwnerDestroyRequest.md)   | :heavy_check_mark:                                                                                             | The request object to use for the request.                                                                     |
| `security`                                                                                                     | [PropertyMeld.MeldAPI.models.operations.OwnerDestroySecurity](../../models/operations/OwnerDestroySecurity.md) | :heavy_check_mark:                                                                                             | The security requirements to use for the request.                                                              |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerDestroyResponse](../../models/operations/OwnerDestroyResponse.md)**


## ownerList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerListRequest;
import PropertyMeld.MeldAPI.models.operations.OwnerListResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            OwnerListRequest req = new OwnerListRequest() {{
                limit = 891555L;
                offset = 952749L;
                ordering = "dolorum";
            }};            

            OwnerListResponse res = sdk.owner.ownerList(req, new OwnerListSecurity("in") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedOwnerList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                | [PropertyMeld.MeldAPI.models.operations.OwnerListRequest](../../models/operations/OwnerListRequest.md)   | :heavy_check_mark:                                                                                       | The request object to use for the request.                                                               |
| `security`                                                                                               | [PropertyMeld.MeldAPI.models.operations.OwnerListSecurity](../../models/operations/OwnerListSecurity.md) | :heavy_check_mark:                                                                                       | The security requirements to use for the request.                                                        |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerListResponse](../../models/operations/OwnerListResponse.md)**


## ownerPartialUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.HubAccessLevelEnum;
import PropertyMeld.MeldAPI.models.shared.PatchedOwnerInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            OwnerPartialUpdateRequest req = new OwnerPartialUpdateRequest("in") {{
                patchedOwnerInput = new PatchedOwnerInput() {{
                    address = new Address("illum", "maiores", "rerum", "dicta") {{
                        country = "French Guiana";
                        line2 = "cumque";
                        line3 = "facere";
                    }};;
                    contact = new Contact() {{
                        businessPhone = "ea";
                        businessPhoneExt = "aliquid";
                        cellPhone = "laborum";
                        cellPhoneExt = "accusamus";
                        fax = "non";
                        homePhone = "occaecati";
                        homePhoneExt = "enim";
                        primaryEmail = "Virgil_Pouros@hotmail.com";
                        secondaryEmail = "Jewell.Lesch64@yahoo.com";
                        tertiaryEmail = "Henry.Mosciski@yahoo.com";
                    }};;
                    email = "Janice_Gutkowski28@gmail.com";
                    firstName = "Effie";
                    hubAccessLevel = HubAccessLevelEnum.ALL_NOTIFICATIONS;
                    invitedToHub = false;
                    lastName = "Mosciski";
                    properties = new Long[]{{
                        add(428769L),
                        add(878453L),
                        add(135474L),
                    }};
                }};;
            }};            

            OwnerPartialUpdateResponse res = sdk.owner.ownerPartialUpdate(req, new OwnerPartialUpdateSecurity("architecto") {{
                pmoAuth2Authentication = "";
            }});

            if (res.owner != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateRequest](../../models/operations/OwnerPartialUpdateRequest.md)   | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |
| `security`                                                                                                                 | [PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateSecurity](../../models/operations/OwnerPartialUpdateSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerPartialUpdateResponse](../../models/operations/OwnerPartialUpdateResponse.md)**


## ownerRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.OwnerRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            OwnerRetrieveRequest req = new OwnerRetrieveRequest("magnam");            

            OwnerRetrieveResponse res = sdk.owner.ownerRetrieve(req, new OwnerRetrieveSecurity("et") {{
                pmoAuth2Authentication = "";
            }});

            if (res.owner != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                        | Type                                                                                                             | Required                                                                                                         | Description                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                        | [PropertyMeld.MeldAPI.models.operations.OwnerRetrieveRequest](../../models/operations/OwnerRetrieveRequest.md)   | :heavy_check_mark:                                                                                               | The request object to use for the request.                                                                       |
| `security`                                                                                                       | [PropertyMeld.MeldAPI.models.operations.OwnerRetrieveSecurity](../../models/operations/OwnerRetrieveSecurity.md) | :heavy_check_mark:                                                                                               | The security requirements to use for the request.                                                                |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerRetrieveResponse](../../models/operations/OwnerRetrieveResponse.md)**


## ownerUpdate

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.OwnerUpdateRequest;
import PropertyMeld.MeldAPI.models.operations.OwnerUpdateResponse;
import PropertyMeld.MeldAPI.models.operations.OwnerUpdateSecurity;
import PropertyMeld.MeldAPI.models.shared.Address;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.HubAccessLevelEnum;
import PropertyMeld.MeldAPI.models.shared.OwnerInput;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            OwnerUpdateRequest req = new OwnerUpdateRequest(                new OwnerInput("Ferne_McLaughlin@yahoo.com", "accusantium", "mollitia") {{
                                address = new Address("reiciendis", "mollitia", "ad", "eum") {{
                                    country = "Cuba";
                                    line2 = "necessitatibus";
                                    line3 = "odit";
                                }};;
                                contact = new Contact() {{
                                    businessPhone = "nemo";
                                    businessPhoneExt = "quasi";
                                    cellPhone = "iure";
                                    cellPhoneExt = "doloribus";
                                    fax = "debitis";
                                    homePhone = "eius";
                                    homePhoneExt = "maxime";
                                    primaryEmail = "Mckenna9@yahoo.com";
                                    secondaryEmail = "Felix_Ratke@hotmail.com";
                                    tertiaryEmail = "Camden.Turner16@hotmail.com";
                                }};;
                                hubAccessLevel = HubAccessLevelEnum.INVITED_TO_HUB;
                                invitedToHub = false;
                                properties = new Long[]{{
                                    add(166847L),
                                    add(123820L),
                                    add(779051L),
                                }};
                            }};, "illum");            

            OwnerUpdateResponse res = sdk.owner.ownerUpdate(req, new OwnerUpdateSecurity("pariatur") {{
                pmoAuth2Authentication = "";
            }});

            if (res.owner != null) {
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
| `request`                                                                                                    | [PropertyMeld.MeldAPI.models.operations.OwnerUpdateRequest](../../models/operations/OwnerUpdateRequest.md)   | :heavy_check_mark:                                                                                           | The request object to use for the request.                                                                   |
| `security`                                                                                                   | [PropertyMeld.MeldAPI.models.operations.OwnerUpdateSecurity](../../models/operations/OwnerUpdateSecurity.md) | :heavy_check_mark:                                                                                           | The security requirements to use for the request.                                                            |


### Response

**[PropertyMeld.MeldAPI.models.operations.OwnerUpdateResponse](../../models/operations/OwnerUpdateResponse.md)**

