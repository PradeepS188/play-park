package com.playpark.person_register.controller;

import com.playpark.person_register.dto.PersonDto;
import com.playpark.person_register.service.PersonRegistartionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/person")
@Tag(
        name = "Person Register Controller",
        description = "Handles CRUD, currently it has only Get Mapping"
)
public class PersonRegistrationController {

    @Autowired
    PersonRegistartionService personRegistartionService;

    @Operation(
            summary = "Get person details",
            description = "We need to pass personal no"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Http response OK"
    )
    @GetMapping(value = "/{personalNo}")
    public ResponseEntity<PersonDto> getPerson(@PathVariable Long personalNo){
        System.out.println("Inside Fetch");
        return new ResponseEntity<>(personRegistartionService.getPerson(personalNo), HttpStatus.OK);
    }


}
