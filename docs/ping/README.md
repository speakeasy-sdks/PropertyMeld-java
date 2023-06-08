# ping

### Available Operations

* [pingRetrieve](#pingretrieve) - Used to double check that the api is up an running.

## pingRetrieve

Used to double check that the api is up an running.

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.PingRetrieveResponse;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PingRetrieveResponse res = sdk.ping.pingRetrieve();

            if (res.pingRetrieve200ApplicationJSONObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
