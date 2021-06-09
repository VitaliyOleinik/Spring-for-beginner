package com.spring_boot.controller;

import com.spring_boot.dao.PersonDAO;
import com.spring_boot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "/employees")
    public Person addNewPerson(@RequestBody Person person){
        personDAO.savePerson(person);
        return person;
    }

    @PutMapping(value ="/employees")
    public Person updatePerson(@RequestBody Person person){
        personDAO.savePerson(person);
        return person;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        personDAO.deletePerson(id);
        return "Employee with ID = " + id + " was deleted";
    }

}
