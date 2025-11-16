import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List; // <-- DÙNG CÁI NÀY
import jakarta.persistence.Query; // <-- DÙNG CÁI NÀY

public class Main {
    public static void main(String [] args){
        //
        //        Student student = new Student(006, "NPC", 18);
        //
        //        SessionFactory sf = new Configuration()
        //                .addAnnotatedClasses(Student.class)
        //                .configure()
        //                .buildSessionFactory();
        //        Session session = sf.openSession();
        //        Transaction transaction = session.beginTransaction();
        //        Student bill = session.find(Student.class, 005);
        //        session.merge(student);
        //        session.remove(student);
        //        transaction.commit();
        //        System.out.println(student);
        SessionFactory sf = new Configuration()
                .addAnnotatedClasses(Dev.class, Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Query query = session.createQuery("from Laptop where brand='ASUS'",Laptop.class);
        List<Laptop> laptops = query.getResultList();
//        Transaction ts = session.beginTransaction();
//
//        ts.commit();
        System.out.println(laptops);
        sf.close();
    }
}
