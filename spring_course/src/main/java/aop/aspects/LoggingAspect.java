package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsWithoutReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsWithoutReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsWithoutReturnMagazineFromUniLibrary(){
//        System.out.println("allMethodsWithoutReturnMagazineFromUniLibrary: Log #4");
//    }


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







    //@Before("execution(public void aop.UniLibrary.getBook())")
    //@Before("execution(public void get*(*))")
    //@Before("execution(public void get*(..))") // ?????????? ???????????????????? ???????????????????? ???? 0 ???? n
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){

        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName(): " + methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object obj:arguments){
                if(obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println(myBook.getName() + "     " + myBook.getAuthor()
                            + "      " + myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("The book was added " + obj);
                }
            }
        }

        System.out.println("beforeGetLoggingAdvice: ?????????????????????? ?????????????? ???????????????? ?????????? ?????? ????????????");
        System.out.println("_____-______________-_______________-_____");
    }



//    @Before("execution(public void return*())")
//    @Before("execution(public * return*())")
//    @Before("execution( * *())")
//    @Before("execution( void getBook(String))")
//    public void beforeReturnBookAdvice(){
//        System.out.println("beforeReturnBookAdvice: ?????????????? ?????????????? ??????????");
//    }
}
