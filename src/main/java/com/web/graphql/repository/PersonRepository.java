package com.web.graphql.repository;

import com.web.graphql.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    Person findByEmail(String email);

}
