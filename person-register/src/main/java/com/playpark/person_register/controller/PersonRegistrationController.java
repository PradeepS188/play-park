package com.playpark.person_register.controller;

import com.playpark.person_register.dto.PersonDto;
import com.playpark.person_register.service.PersonRegistartionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
public class PersonRegistrationController {

    @Autowired
    PersonRegistartionService personRegistartionService;

    @GetMapping(value = "/{personalNo}")
    public ResponseEntity<PersonDto> getPerson(@PathVariable Long personalNo){
        System.out.println("Inside Fetch");
        return new ResponseEntity<>(personRegistartionService.getPerson(personalNo), HttpStatus.OK);
    }


}
