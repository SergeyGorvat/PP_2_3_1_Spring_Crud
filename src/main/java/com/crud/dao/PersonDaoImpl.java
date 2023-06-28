package com.crud.dao;

import com.crud.model.Person;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    public void updatePerson(int id, Person person) {
        Person person1 = entityManager.find(Person.class, id);
        person1.setName(person1.getName());
        person1.setSurname(person1.getSurname());
        person1.setAge(person1.getAge());
        entityManager.merge(person);
    }

    @Override
    public void removePerson(int id) {
        entityManager.remove(getPersonById(id));
    }

    @Override
    public Person getPersonById(int id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public List<Person> getAllPeople() {
        return entityManager.
                createQuery("select u from Person u", Person.class).getResultList();
    }
}
