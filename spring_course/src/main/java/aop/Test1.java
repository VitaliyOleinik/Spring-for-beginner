package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        library.getBook();
        library.returnBook();
        library.getMagazine();
        library.returnMagazine();
        SchoolLibrary library1 = context.getBean("schoolLibrary", SchoolLibrary.class);
        library1.getBook();
    }
}
