import Entity.Employee;
import org.hibernate.Session;



import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.setName("asdasd");
        employee.setRole("asdasdas");
        employee.setInsertTime(new Date());


        Session session= HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
        session.beginTransaction();
        session.save(employee);


        session.getTransaction().commit();

    }
}
