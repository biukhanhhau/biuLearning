import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){

        //region Declare Student objects
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Cao");
        s1.setAge(18);

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Son");
        s2.setAge(19);

        Student s3 = new Student();
        s3.setId(3);
        s3.setName("Phat");
        s3.setAge(17);

        Student s4 = new Student();
        s4.setId(4);
        s4.setName("Binh");
        s4.setAge(17);
        //endregion

        //region Declare Teacher objects
        Teacher teacher1 = new Teacher();
        teacher1.setId(111);
        teacher1.setName("thay Tron");
        teacher1.setAge(44);
        teacher1.setSubject("Chemistry");
        teacher1.setStudents(Arrays.asList(s1,s2,s3,s4));

        Teacher teacher2 = new Teacher();
        teacher2.setId(112);
        teacher2.setName("co Nguyen");
        teacher2.setAge(35);
        teacher2.setSubject("Chemistry");
        teacher2.setStudents(Arrays.asList(s2,s3,s4));

        Teacher teacher3 = new Teacher();
        teacher3.setId(113);
        teacher3.setName("thay Xe");
        teacher3.setAge(53);
        teacher3.setSubject("Physic");
        teacher3.setStudents(Arrays.asList(s1,s2));
        //endregion

        //region add Teacher's objects into Student
        s1.setTeachers(Arrays.asList(teacher1, teacher3));
        s2.setTeachers(Arrays.asList(teacher1, teacher2, teacher3));
        s3.setTeachers(Arrays.asList(teacher1, teacher2));
        s4.setTeachers(Arrays.asList(teacher1, teacher2));
        //endregion

        SessionFactory sf = new Configuration()
                .addAnnotatedClasses(Student.class, Teacher.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session
        session

        tx.commit();
    }
}
