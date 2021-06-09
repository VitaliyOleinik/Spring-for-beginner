package com.spring_boot.dao;

import com.spring_boot.entity.Person;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PersonDAOImpl implements PersonDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Person> getAllPersons() {
        Query query = entityManager.createQuery("from Person");
        List<Person> allPersons = query.getResultList();
        return allPersons;
    }

    @Override
    public void savePerson(Person person) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(person);

        // does not work!!! why???
//        Person newPerson = entityManager.merge(person);
//        person.setId(newPerson.getId());
    }

    @Override
    public Person getPerson(int id) {
        Person person = entityManager.find(Person.class, id);
        return person;
    }

    @Override
    public void deletePerson(int id) {
        Query query = entityManager.createQuery("delete from Person where id =: personId");
        query.setParameter("personId", id);
        query.executeUpdate();
    }
}
