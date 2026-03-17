package com.playpark.person_register.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "person")
public class Person {


    @Column(name = "personal_no", unique = true, nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personalNo;

    @Column(name = "person_name", nullable = false)
    private String personName;

    @Column(name = "age")
    private String age;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age_group")
    private String ageGroup;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private CommunityDetails communityDetails;

    // Constructors
    public Person() {
    }

    public Person(Long personalNo, String personName, String age, LocalDate dateOfBirth,
                  String gender, String ageGroup, CommunityDetails communityDetails) {
        this.personalNo = personalNo;
        this.personName = personName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.ageGroup = ageGroup;
        this.communityDetails = communityDetails;
    }

    // Getters and Setters


    public Long getPersonalNo() {
        return personalNo;
    }

    public void setPersonalNo(Long personalNo) {
        this.personalNo = personalNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String name) {
        this.personName = name;
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

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public CommunityDetails getCommunityDetails() {
        return communityDetails;
    }

    public void setCommunityDetails(CommunityDetails communityDetails) {
        this.communityDetails = communityDetails;
    }
}
