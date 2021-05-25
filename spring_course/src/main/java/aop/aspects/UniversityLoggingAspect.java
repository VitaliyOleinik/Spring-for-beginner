package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: logging list of students, before getStudents");
    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//
//        System.out.println("afterReturningStudentsLoggingAdvice: logging list of students, after getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exception")
//    public void afterThrowingStudentsLoggingAdvice(Throwable exception){
//
//        System.out.println("afterThrowingStudentsLoggingAdvice: логируем выброс исключения " + exception );
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логирование afterGetStudentsLoggingAdvice");
    }

}
