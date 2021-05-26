package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook(..))")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
            throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в бибилиотеку пытаются вернуть книгу");
//        long begin = System.currentTimeMillis();
//        long end = System.currentTimeMillis();

        Object targetMethodResult = null;
        try{

            targetMethodResult  = proceedingJoinPoint.proceed();

        } catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
            //targetMethodResult = "Неизвестное название книги";
            throw e;
        }
        //System.out.println(end - begin + " Время выполнения, миллисекунд");
        System.out.println("aroundReturnBookLoggingAdvice: в бибилиотеку успешно вернули книгу");
        return targetMethodResult;
    }
}
