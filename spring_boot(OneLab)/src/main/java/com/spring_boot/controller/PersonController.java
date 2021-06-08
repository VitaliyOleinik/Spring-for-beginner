package com.spring_boot.controller;

import com.spring_boot.dao.PersonDAO;
import com.spring_boot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    PersonDAO personDAO;

    @GetMapping("/persons")
    public List<Person> showAllPersons(){
        List<Person> allPersons = personDAO.getAllPersons();
        return allPersons;
    }

    @GetMapping("/employees/{id}")
    public Person getPerson(@PathVariable int id){
        Person person = personDAO.getPerson(id);

        return person;
    }

}
