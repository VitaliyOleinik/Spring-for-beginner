package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);

        //library.returnBook();
        //Book book = context.getBean("book", Book.class);

        library.getBook();
        library.getMagazine();

//        library.returnMagazine();
//        library.addBook();
//        library.returnMagazine();
//        SchoolLibrary library1 = context.getBean("schoolLibrary", SchoolLibrary.class);
//        library1.getBook();
    }
}
