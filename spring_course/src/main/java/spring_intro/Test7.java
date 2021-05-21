package spring_intro;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat = context.getBean("catBean", Pet.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurName());

        context.close();
    }
}
