package com.crud.service;

import com.crud.model.Person;

import java.util.List;

public interface PersonService {

     void addPerson(Person person);

     void updatePerson(int id, Person person);

     void removePerson(int id);

     Person getPersonById(int id);

    List<Person> getAllPeople();
}
