package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary(){}

    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary(){}

    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
    private void allMethodsWithoutReturnMagazineFromUniLibrary(){}

    @Before("allMethodsWithoutReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsWithoutReturnMagazineFromUniLibrary(){
        System.out.println("allMethodsWithoutReturnMagazineFromUniLibrary: Log #4");
    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnMethodsFromUniLibrary(){
//        System.out.println("beforeGetAndReturnMethodsFromUniLibrary: writing Log #3");
//    }






//    @Pointcut("execution( * get*())")
//    private void allGetMethods(){}
//
//    //@Before("execution(public void aop.UniLibrary.getBook())")
//    //@Before("execution(public void get*(*))")
//    //@Before("execution(public void get*(..))") // любое количество параметров от 0 до n
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: попытка получить книгу или журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
//    }
//
////    @Before("execution(public void return*())")
////    @Before("execution(public * return*())")
////    @Before("execution( * *())")
////    @Before("execution( void getBook(String))")
////    public void beforeReturnBookAdvice(){
////        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
////    }
}
