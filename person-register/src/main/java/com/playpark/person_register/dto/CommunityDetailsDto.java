package com.playpark.person_register.dto;


import io.swagger.v3.oas.annotations.media.Schema;

@Schema(
        name = "Community Details",
        description = "It will hold community details"
)
public class CommunityDetailsDto {
    @Schema(
            name = "Address ID",
            description = "It will hold address id of community"
    )
    String addressId;
    @Schema(
            description = "It will hold house no of community"
    )
    String houseNo;
    @Schema(
            description = "It will hold street of community"
    )
    String street;
    @Schema(
            description = "It will hold city of community"
    )
    String city;
    @Schema(
            description = "It will hold country of community"
    )
    String country;
    @Schema(
            description = "It will hold postal code of community"
    )
    int postalCode;

    public CommunityDetailsDto(String addressId, String houseNo, String street, String city, String country, int postalCode) {
        this.addressId = addressId;
        this.houseNo = houseNo;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public CommunityDetailsDto() {

    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
