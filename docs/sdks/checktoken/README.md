# checkToken

### Available Operations

* [checkTokenRetrieve](#checktokenretrieve) - Used to check the validity of an oauth2 token

## checkTokenRetrieve

Used to check the validity of an oauth2 token

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.CheckTokenRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.CheckTokenRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            CheckTokenRetrieveResponse res = sdk.checkToken.checkTokenRetrieve(new CheckTokenRetrieveSecurity("magnam") {{
                pmoAuth2Authentication = "";
            }});

            if (res.checkTokenRetrieve200ApplicationJSONObject != null) {
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
| `security`                                                                                                                 | [PropertyMeld.MeldAPI.models.operations.CheckTokenRetrieveSecurity](../../models/operations/CheckTokenRetrieveSecurity.md) | :heavy_check_mark:                                                                                                         | The security requirements to use for the request.                                                                          |


### Response

**[PropertyMeld.MeldAPI.models.operations.CheckTokenRetrieveResponse](../../models/operations/CheckTokenRetrieveResponse.md)**

