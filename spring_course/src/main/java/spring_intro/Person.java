package spring_intro;

public class Person {
    private Pet pet;
    private String surName;
    private int age;

//    public Person(Pet pet){
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person bean is created");
    }

    public void callYourPet(){
        System.out.println("Hello");
        pet.say();
    }

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
