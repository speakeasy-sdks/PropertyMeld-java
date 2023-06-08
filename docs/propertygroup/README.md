# propertyGroup

### Available Operations

* [propertyGroupList](#propertygrouplist)
* [propertyGroupRetrieve](#propertygroupretrieve)

## propertyGroupList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupListRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupListResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyGroupListRequest req = new PropertyGroupListRequest(58029L) {{
                limit = 56418L;
                offset = 434417L;
                ordering = "odio";
            }};            

            PropertyGroupListResponse res = sdk.propertyGroup.propertyGroupList(req, new PropertyGroupListSecurity("quaerat") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedPropertyGroupSerializerListList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## propertyGroupRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.PropertyGroupRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyGroupRetrieveRequest req = new PropertyGroupRetrieveRequest(881005L, "quidem");            

            PropertyGroupRetrieveResponse res = sdk.propertyGroup.propertyGroupRetrieve(req, new PropertyGroupRetrieveSecurity("voluptatibus") {{
                pmoAuth2Authentication = "";
            }});

            if (res.propertyGroupSerializerDetail != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
