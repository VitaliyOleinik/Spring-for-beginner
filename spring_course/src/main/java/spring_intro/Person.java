package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("dog") // for bean Dog.class
    private Pet pet;
    @Value("${person.surname}")
    private String surName;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Hello");
        pet.say();
    }
//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
