package com.wipro.employeedept.repository;

import com.wipro.employeedept.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
