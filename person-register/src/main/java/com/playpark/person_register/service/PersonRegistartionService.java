package com.playpark.person_register.service;

import com.playpark.person_register.dto.PersonDto;
import com.playpark.person_register.repository.PersonRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonRegistartionService {
    @Autowired
    private PersonRegistrationRepo personRegistrationRepo;

    public PersonDto getPerson(Long personalNo){

        return PersonDto.convertToDto(
                personRegistrationRepo.findById(personalNo).isPresent() 
                            ? personRegistrationRepo.findById(personalNo).get():null);
    }
}
