import Entity.Employee;
import org.hibernate.Session;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Employee employee=new Employee();

        employee.setId(4);
        employee.setName("asdasd");
        employee.setRole("AHMET");
        employee.setInsertTime(new Date());


        Session session= HibernateUtil.getSessionAnnotationFactory().getCurrentSession();
        session.beginTransaction();
        List labels = session.createQuery("from employee").list();
        //session.save(employee);
        //Employee temp= (Employee) session.get(Employee.class,22);
        //System.out.println(temp.getName()+"  "+temp.getRole());
        //session.saveOrUpdate(employee);
        System.out.println(labels);



        session.getTransaction().commit();

    }
}
