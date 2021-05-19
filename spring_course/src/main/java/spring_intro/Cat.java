package spring_intro;

public class Cat implements Pet{
    Cat(){
        System.out.println("Cat bean is created");
    }
    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
