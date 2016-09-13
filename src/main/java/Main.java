import domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by r.pogorelov on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure();

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee e1 = new Employee();

        e1.setFirstName("rmk");
        e1.setLastName("pogorelov");

        session.persist(e1);

        transaction.commit();
        session.close();

        System.out.println("Success!!");
    }
}
