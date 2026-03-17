package com.playpark.person_register.repository;

import com.playpark.person_register.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRegistrationRepo extends CrudRepository<Person,Long> {
}
