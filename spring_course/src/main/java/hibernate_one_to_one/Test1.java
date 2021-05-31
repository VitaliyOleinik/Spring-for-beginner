package hibernate_one_to_one;


import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try{
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Zaur", "Tregulov", "Department", 500);
//            Detail detail = new Detail("Baku", "1233456546", "Zaur@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();





//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Oleg", "Kot", "IT", 500);
//            Detail detail = new Detail("Moscow", "1233456546", "Kot@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();



            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            //System.out.println(employee.getEmpDetail());

            session.delete(employee);

            session.getTransaction().commit();

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
