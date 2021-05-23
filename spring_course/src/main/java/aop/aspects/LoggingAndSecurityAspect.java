package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution( * get*())")
    private void allGetMethods(){}

    //@Before("execution(public void aop.UniLibrary.getBook())")
    //@Before("execution(public void get*(*))")
    //@Before("execution(public void get*(..))") // любое количество параметров от 0 до n
    @Before("allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetLoggingAdvice: попытка получить книгу или журнал");
    }

    @Before("allGetMethods()")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги или журнала");
    }

//    @Before("execution(public void return*())")
//    @Before("execution(public * return*())")
//    @Before("execution( * *())")
//    @Before("execution( void getBook(String))")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
//    }
}
