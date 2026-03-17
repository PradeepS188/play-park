package com.playpark.person_register.dto;

import com.playpark.person_register.entity.Person;

import java.time.LocalDate;

public class PersonDto {
    Long personalNo;
    String name;
    String age;
    LocalDate dateOfBirth;
    String gender;
    String ageGroup;
    CommunityDetailsDto communityDetails;

    public PersonDto() {
    }

    public PersonDto(Long personalNo, String name, String age, LocalDate dateOfBirth, String gender, CommunityDetailsDto communityDetails, String ageGroup) {
        this.personalNo = personalNo;
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.communityDetails = communityDetails;
        this.ageGroup = ageGroup;
    }

    public Long getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(Long personalNo) {
        this.personalNo = personalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CommunityDetailsDto getCommunityDetails() {
        return communityDetails;
    }

    public void setCommunityDetails(CommunityDetailsDto communityDetails) {
        this.communityDetails = communityDetails;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public static PersonDto convertToDto(Person person){
        PersonDto personDto = new PersonDto();
        personDto.setPersonalNo(person.getPersonalNo());
        personDto.setAge(person.getAge());
        personDto.setDateOfBirth(person.getDateOfBirth());
        personDto.setGender(person.getGender());
        personDto.setAgeGroup(person.getAgeGroup());
        CommunityDetailsDto communityDetailsDto= new CommunityDetailsDto();
        communityDetailsDto.setAddressId(person.getCommunityDetails().getAddressId());
        communityDetailsDto.setStreet(person.getCommunityDetails().getStreet());
        communityDetailsDto.setHouseNo(person.getCommunityDetails().getHouseNo());
        communityDetailsDto.setCity(person.getCommunityDetails().getCity());
        communityDetailsDto.setCountry(person.getCommunityDetails().getCountry());
        communityDetailsDto.setPostalCode(person.getCommunityDetails().getPostalCode());

        personDto.setCommunityDetails(communityDetailsDto);
        return personDto;
    }
}
