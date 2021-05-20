package spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
    }
}
