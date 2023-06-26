package com.crud.dao;

import com.crud.model.Person;

import java.util.List;

public interface PersonDao {
    public void addPerson(Person person);

    public void updatePerson(int id, Person person);

    public void removePerson(int id);

    public Person getPersonById(int id);

    List<Person> getAllPeople();
}
