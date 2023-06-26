package com.crud.service;

import com.crud.dao.PersonDao;
import com.crud.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao;

    public PersonServiceImpl(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    @Transactional
    public void addPerson(Person person) {
        personDao.addPerson(person);
    }

    @Override
    @Transactional
    public void updatePerson(int id, Person person) {
        personDao.updatePerson(id, person);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        personDao.removePerson(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Person getPersonById(int id) {
        return personDao.getPersonById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> getAllPeople() {
        return personDao.getAllPeople();
    }
}
