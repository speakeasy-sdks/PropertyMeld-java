# schema

### Available Operations

* [schemaRetrieve](#schemaretrieve) - OpenApi3 schema for this API. Format can be selected via content negotiation.

- YAML: application/vnd.oai.openapi
- JSON: application/vnd.oai.openapi+json

## schemaRetrieve

OpenApi3 schema for this API. Format can be selected via content negotiation.

- YAML: application/vnd.oai.openapi
- JSON: application/vnd.oai.openapi+json

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.SchemaRetrieveFormat;
import PropertyMeld.MeldAPI.models.operations.SchemaRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.SchemaRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.SchemaRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            SchemaRetrieveRequest req = new SchemaRetrieveRequest(503427L) {{
                format = SchemaRetrieveFormat.YAML;
            }};            

            SchemaRetrieveResponse res = sdk.schema.schemaRetrieve(req, new SchemaRetrieveSecurity() {{
                pmoAuth2Authentication = "";
            }});

            if (res.schemaRetrieve200ApplicationJSONObject != null) {
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
| `request`                                                                                                          | [PropertyMeld.MeldAPI.models.operations.SchemaRetrieveRequest](../../models/operations/SchemaRetrieveRequest.md)   | :heavy_check_mark:                                                                                                 | The request object to use for the request.                                                                         |
| `security`                                                                                                         | [PropertyMeld.MeldAPI.models.operations.SchemaRetrieveSecurity](../../models/operations/SchemaRetrieveSecurity.md) | :heavy_check_mark:                                                                                                 | The security requirements to use for the request.                                                                  |


### Response

**[PropertyMeld.MeldAPI.models.operations.SchemaRetrieveResponse](../../models/operations/SchemaRetrieveResponse.md)**

