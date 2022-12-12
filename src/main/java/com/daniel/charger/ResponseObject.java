package com.daniel.charger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

// This class entirely written by ChatGPT!
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseObject{
    @JsonProperty("ChargeDevice")
    private List<ChargeDevice> chargeDevices;

    public List<ChargeDevice> getChargeDevices() {
        return chargeDevices;
    }


    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChargeDevice {
        @JsonProperty("ChargeDeviceName")
        private String chargeDeviceName;

        @JsonProperty("ChargeDeviceLocation")
        private ChargeDeviceLocation chargeDeviceLocation;

        public String getChargeDeviceName() {
            return chargeDeviceName;
        }

        public ChargeDeviceLocation getChargeDeviceLocation() {
            return chargeDeviceLocation;
        }

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ChargeDeviceLocation {
            @JsonProperty("Latitude")
            private String latitude;

            @JsonProperty("Longitude")
            private String longitude;

            @JsonProperty("Address")
            private Address address;

            public String getLatitude() {
                return latitude;
            }

            public String getLongitude() {
                return longitude;
            }

            public Address getAddress() {
                return address;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Address {
                @JsonProperty("PostCode")
                private String postCode;

                @JsonProperty("Street")
                private String street;

                public String getPostCode() {
                    return postCode;
                }

                public String getStreet() {
                    return street;
                }
            }

        }
    }
}
