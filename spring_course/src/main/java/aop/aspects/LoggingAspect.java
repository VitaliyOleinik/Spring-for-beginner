package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    //@Before("execution(public void aop.UniLibrary.getBook())")
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

//    @Before("execution(public void return*())")
//    @Before("execution(public * return*())")
    @Before("execution( * *())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу");
    }
}
