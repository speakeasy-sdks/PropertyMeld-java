# resident

### Available Operations

* [residentCreateForm](#residentcreateform)
* [residentCreateJson](#residentcreatejson)
* [residentCreateMultipart](#residentcreatemultipart)
* [residentDestroy](#residentdestroy)
* [residentList](#residentlist)
* [residentPartialUpdateForm](#residentpartialupdateform)
* [residentPartialUpdateJson](#residentpartialupdatejson)
* [residentPartialUpdateMultipart](#residentpartialupdatemultipart)
* [residentRetrieve](#residentretrieve)
* [residentUpdateForm](#residentupdateform)
* [residentUpdateJson](#residentupdatejson)
* [residentUpdateMultipart](#residentupdatemultipart)

## residentCreateForm

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateFormResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateFormSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.ResidentInput1 req = new ResidentInput1("voluptas", "natus") {{
                address = "eos";
                contact = new Contact() {{
                    businessPhone = "atque";
                    businessPhoneExt = "sit";
                    cellPhone = "fugiat";
                    cellPhoneExt = "ab";
                    fax = "soluta";
                    homePhone = "dolorum";
                    homePhoneExt = "iusto";
                    primaryEmail = "Marianna_Leuschke@yahoo.com";
                    secondaryEmail = "Yessenia45@hotmail.com";
                    tertiaryEmail = "Suzanne2@yahoo.com";
                }};;
                invite = false;
                middleName = "amet";
                notes = "optio";
                notificationSettings = new NotificationSettingsInput() {{
                    incomingMeldFrequency = IncomingMeldFrequencyEnum.NEVER;
                    smsNotifications = false;
                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.IMMEDIATELY;
                    timezone = TimezoneEnum.PACIFIC_GALAPAGOS;
                }};;
                units = new Long[]{{
                    add(645785L),
                    add(588317L),
                }};
            }};            

            ResidentCreateFormResponse res = sdk.resident.residentCreateForm(req, new ResidentCreateFormSecurity("minima") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentCreateJson

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateJsonResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateJsonSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentAddress;
import PropertyMeld.MeldAPI.models.shared.ResidentInput;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.ResidentInput req = new ResidentInput("repellendus", "totam") {{
                address = new ResidentAddress("similique", "alias", "at", "quaerat") {{
                    country = "Ethiopia";
                    line2 = "vel";
                    line3 = "quod";
                }};;
                contact = new Contact() {{
                    businessPhone = "officiis";
                    businessPhoneExt = "qui";
                    cellPhone = "dolorum";
                    cellPhoneExt = "a";
                    fax = "esse";
                    homePhone = "harum";
                    homePhoneExt = "iusto";
                    primaryEmail = "Pat73@gmail.com";
                    secondaryEmail = "Deontae95@hotmail.com";
                    tertiaryEmail = "Jannie.Balistreri15@yahoo.com";
                }};;
                invite = false;
                middleName = "vel";
                notes = "libero";
                notificationSettings = new NotificationSettingsInput() {{
                    incomingMeldFrequency = IncomingMeldFrequencyEnum.DAILY;
                    smsNotifications = false;
                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.DAILY;
                    timezone = TimezoneEnum.ASIA_JERUSALEM;
                }};;
                units = new Long[]{{
                    add(277628L),
                }};
            }};            

            ResidentCreateJsonResponse res = sdk.resident.residentCreateJson(req, new ResidentCreateJsonSecurity("qui") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentCreateMultipart

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateMultipartResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentCreateMultipartSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            PropertyMeld.MeldAPI.models.shared.ResidentInput1 req = new ResidentInput1("cupiditate", "maxime") {{
                address = "pariatur";
                contact = new Contact() {{
                    businessPhone = "soluta";
                    businessPhoneExt = "dicta";
                    cellPhone = "laborum";
                    cellPhoneExt = "totam";
                    fax = "incidunt";
                    homePhone = "aspernatur";
                    homePhoneExt = "dolores";
                    primaryEmail = "Mckenzie_Hyatt@hotmail.com";
                    secondaryEmail = "Christa16@hotmail.com";
                    tertiaryEmail = "Brady_Hermiston3@yahoo.com";
                }};;
                invite = false;
                middleName = "cumque";
                notes = "soluta";
                notificationSettings = new NotificationSettingsInput() {{
                    incomingMeldFrequency = IncomingMeldFrequencyEnum.NEVER;
                    smsNotifications = false;
                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.IMMEDIATELY;
                    timezone = TimezoneEnum.PACIFIC_GALAPAGOS;
                }};;
                units = new Long[]{{
                    add(83422L),
                }};
            }};            

            ResidentCreateMultipartResponse res = sdk.resident.residentCreateMultipart(req, new ResidentCreateMultipartSecurity("nobis") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentDestroy

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentDestroyRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentDestroyResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentDestroySecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentDestroyRequest req = new ResidentDestroyRequest("quos");            

            ResidentDestroyResponse res = sdk.resident.residentDestroy(req, new ResidentDestroySecurity("tempore") {{
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

## residentList

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentListRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentListResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentListSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentListRequest req = new ResidentListRequest() {{
                limit = 584476L;
                offset = 45614L;
                ordering = "delectus";
            }};            

            ResidentListResponse res = sdk.resident.residentList(req, new ResidentListSecurity("dolorem") {{
                pmoAuth2Authentication = "";
            }});

            if (res.paginatedResidentList != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentPartialUpdateForm

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateFormRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateFormResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateFormSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.PatchedResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentPartialUpdateFormRequest req = new ResidentPartialUpdateFormRequest("dolore") {{
                patchedResidentInput1 = new PatchedResidentInput1() {{
                    address = "labore";
                    contact = new Contact() {{
                        businessPhone = "adipisci";
                        businessPhoneExt = "dolorum";
                        cellPhone = "architecto";
                        cellPhoneExt = "quae";
                        fax = "aut";
                        homePhone = "quas";
                        homePhoneExt = "itaque";
                        primaryEmail = "Marcia_Skiles28@gmail.com";
                        secondaryEmail = "Kyler51@hotmail.com";
                        tertiaryEmail = "Kris_Wolff60@yahoo.com";
                    }};;
                    firstName = "Eugenia";
                    invite = false;
                    lastName = "Erdman";
                    middleName = "delectus";
                    notes = "voluptate";
                    notificationSettings = new NotificationSettingsInput() {{
                        incomingMeldFrequency = IncomingMeldFrequencyEnum.IMMEDIATELY;
                        smsNotifications = false;
                        successfulMeldFrequency = SuccessfulMeldFrequencyEnum.NEVER;
                        timezone = TimezoneEnum.PACIFIC_TAHITI;
                    }};;
                    units = new Long[]{{
                        add(941378L),
                        add(715561L),
                    }};
                }};;
            }};            

            ResidentPartialUpdateFormResponse res = sdk.resident.residentPartialUpdateForm(req, new ResidentPartialUpdateFormSecurity("quod") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentPartialUpdateJson

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateJsonRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateJsonResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateJsonSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.PatchedResidentAddress;
import PropertyMeld.MeldAPI.models.shared.PatchedResidentInput;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentPartialUpdateJsonRequest req = new ResidentPartialUpdateJsonRequest("odio") {{
                patchedResidentInput = new PatchedResidentInput() {{
                    address = new PatchedResidentAddress("similique", "facilis", "vero", "ducimus") {{
                        country = "France";
                        line2 = "quibusdam";
                        line3 = "illum";
                    }};;
                    contact = new Contact() {{
                        businessPhone = "sequi";
                        businessPhoneExt = "natus";
                        cellPhone = "impedit";
                        cellPhoneExt = "aut";
                        fax = "voluptatibus";
                        homePhone = "exercitationem";
                        homePhoneExt = "nulla";
                        primaryEmail = "Osborne.Wunsch75@gmail.com";
                        secondaryEmail = "Abelardo36@yahoo.com";
                        tertiaryEmail = "Brielle.Keebler18@yahoo.com";
                    }};;
                    firstName = "Greta";
                    invite = false;
                    lastName = "Langosh";
                    middleName = "dicta";
                    notes = "dolor";
                    notificationSettings = new NotificationSettingsInput() {{
                        incomingMeldFrequency = IncomingMeldFrequencyEnum.NEVER;
                        smsNotifications = false;
                        successfulMeldFrequency = SuccessfulMeldFrequencyEnum.IMMEDIATELY;
                        timezone = TimezoneEnum.ASIA_ASHGABAT;
                    }};;
                    units = new Long[]{{
                        add(569211L),
                        add(972920L),
                        add(343605L),
                        add(960835L),
                    }};
                }};;
            }};            

            ResidentPartialUpdateJsonResponse res = sdk.resident.residentPartialUpdateJson(req, new ResidentPartialUpdateJsonSecurity("quisquam") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentPartialUpdateMultipart

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateMultipartRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateMultipartResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentPartialUpdateMultipartSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.PatchedResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentPartialUpdateMultipartRequest req = new ResidentPartialUpdateMultipartRequest("saepe") {{
                patchedResidentInput1 = new PatchedResidentInput1() {{
                    address = "ea";
                    contact = new Contact() {{
                        businessPhone = "impedit";
                        businessPhoneExt = "corporis";
                        cellPhone = "veniam";
                        cellPhoneExt = "aliquid";
                        fax = "inventore";
                        homePhone = "magnam";
                        homePhoneExt = "ea";
                        primaryEmail = "Darion32@hotmail.com";
                        secondaryEmail = "Veda1@gmail.com";
                        tertiaryEmail = "Olaf88@yahoo.com";
                    }};;
                    firstName = "Arjun";
                    invite = false;
                    lastName = "Friesen";
                    middleName = "et";
                    notes = "dolorum";
                    notificationSettings = new NotificationSettingsInput() {{
                        incomingMeldFrequency = IncomingMeldFrequencyEnum.NEVER;
                        smsNotifications = false;
                        successfulMeldFrequency = SuccessfulMeldFrequencyEnum.NEVER;
                        timezone = TimezoneEnum.AMERICA_LIMA;
                    }};;
                    units = new Long[]{{
                        add(420539L),
                        add(752135L),
                    }};
                }};;
            }};            

            ResidentPartialUpdateMultipartResponse res = sdk.resident.residentPartialUpdateMultipart(req, new ResidentPartialUpdateMultipartSecurity("quas") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentRetrieve

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentRetrieveRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentRetrieveResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentRetrieveSecurity;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentRetrieveRequest req = new ResidentRetrieveRequest("assumenda");            

            ResidentRetrieveResponse res = sdk.resident.residentRetrieve(req, new ResidentRetrieveSecurity("nulla") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentUpdateForm

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateFormRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateFormResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateFormSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentUpdateFormRequest req = new ResidentUpdateFormRequest(                new ResidentInput1("voluptas", "libero") {{
                                address = "quasi";
                                contact = new Contact() {{
                                    businessPhone = "tempora";
                                    businessPhoneExt = "numquam";
                                    cellPhone = "explicabo";
                                    cellPhoneExt = "provident";
                                    fax = "ipsa";
                                    homePhone = "molestiae";
                                    homePhoneExt = "magnam";
                                    primaryEmail = "Devyn_Koch@yahoo.com";
                                    secondaryEmail = "Ima.Predovic43@hotmail.com";
                                    tertiaryEmail = "Reyna_Davis@yahoo.com";
                                }};;
                                invite = false;
                                middleName = "veritatis";
                                notes = "ipsa";
                                notificationSettings = new NotificationSettingsInput() {{
                                    incomingMeldFrequency = IncomingMeldFrequencyEnum.DAILY;
                                    smsNotifications = false;
                                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.NEVER;
                                    timezone = TimezoneEnum.AMERICA_GUYANA;
                                }};;
                                units = new Long[]{{
                                    add(847276L),
                                    add(777408L),
                                    add(681359L),
                                    add(259422L),
                                }};
                            }};, "eos");            

            ResidentUpdateFormResponse res = sdk.resident.residentUpdateForm(req, new ResidentUpdateFormSecurity("voluptas") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentUpdateJson

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateJsonRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateJsonResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateJsonSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentAddress;
import PropertyMeld.MeldAPI.models.shared.ResidentInput;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentUpdateJsonRequest req = new ResidentUpdateJsonRequest(                new ResidentInput("ab", "cupiditate") {{
                                address = new ResidentAddress("consequatur", "tempora", "debitis", "ipsam") {{
                                    country = "Bulgaria";
                                    line2 = "sequi";
                                    line3 = "quo";
                                }};;
                                contact = new Contact() {{
                                    businessPhone = "esse";
                                    businessPhoneExt = "recusandae";
                                    cellPhone = "aperiam";
                                    cellPhoneExt = "distinctio";
                                    fax = "quod";
                                    homePhone = "dignissimos";
                                    homePhoneExt = "inventore";
                                    primaryEmail = "Josiah48@yahoo.com";
                                    secondaryEmail = "Harvey64@yahoo.com";
                                    tertiaryEmail = "Alfonzo_Sawayn@yahoo.com";
                                }};;
                                invite = false;
                                middleName = "praesentium";
                                notes = "consequuntur";
                                notificationSettings = new NotificationSettingsInput() {{
                                    incomingMeldFrequency = IncomingMeldFrequencyEnum.DAILY;
                                    smsNotifications = false;
                                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.IMMEDIATELY;
                                    timezone = TimezoneEnum.ETC_GMT_PLUS9;
                                }};;
                                units = new Long[]{{
                                    add(277596L),
                                    add(539224L),
                                    add(128860L),
                                }};
                            }};, "minima");            

            ResidentUpdateJsonResponse res = sdk.resident.residentUpdateJson(req, new ResidentUpdateJsonSecurity("nisi") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

## residentUpdateMultipart

### Example Usage

```java
package hello.world;

import PropertyMeld.MeldAPI.MeldAPI;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateMultipartRequest;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateMultipartResponse;
import PropertyMeld.MeldAPI.models.operations.ResidentUpdateMultipartSecurity;
import PropertyMeld.MeldAPI.models.shared.Contact;
import PropertyMeld.MeldAPI.models.shared.IncomingMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.NotificationSettingsInput;
import PropertyMeld.MeldAPI.models.shared.ResidentInput1;
import PropertyMeld.MeldAPI.models.shared.SuccessfulMeldFrequencyEnum;
import PropertyMeld.MeldAPI.models.shared.TimezoneEnum;

public class Application {
    public static void main(String[] args) {
        try {
            MeldAPI sdk = MeldAPI.builder()
                .build();

            ResidentUpdateMultipartRequest req = new ResidentUpdateMultipartRequest(                new ResidentInput1("fugit", "sapiente") {{
                                address = "consequuntur";
                                contact = new Contact() {{
                                    businessPhone = "ratione";
                                    businessPhoneExt = "explicabo";
                                    cellPhone = "saepe";
                                    cellPhoneExt = "occaecati";
                                    fax = "atque";
                                    homePhone = "et";
                                    homePhoneExt = "esse";
                                    primaryEmail = "Shanny_Boehm@hotmail.com";
                                    secondaryEmail = "Serena90@hotmail.com";
                                    tertiaryEmail = "Maryam_Kozey32@yahoo.com";
                                }};;
                                invite = false;
                                middleName = "distinctio";
                                notes = "eligendi";
                                notificationSettings = new NotificationSettingsInput() {{
                                    incomingMeldFrequency = IncomingMeldFrequencyEnum.IMMEDIATELY;
                                    smsNotifications = false;
                                    successfulMeldFrequency = SuccessfulMeldFrequencyEnum.DAILY;
                                    timezone = TimezoneEnum.EUROPE_BRUSSELS;
                                }};;
                                units = new Long[]{{
                                    add(766964L),
                                }};
                            }};, "consequuntur");            

            ResidentUpdateMultipartResponse res = sdk.resident.residentUpdateMultipart(req, new ResidentUpdateMultipartSecurity("consequatur") {{
                pmoAuth2Authentication = "";
            }});

            if (res.resident != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
