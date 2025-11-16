package org.biukhanhhau.jdbcex;

import org.biukhanhhau.jdbcex.model.Student;
import org.biukhanhhau.jdbcex.repository.StudentRepo;
import org.biukhanhhau.jdbcex.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;
import java.util.List;

@SpringBootApplication
public class JdbCexApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JdbCexApplication.class, args);

        //Student s = context.getBean(Student.class);
        //s.setRollNo(115);
        //s.setName("Bill");
        //s.setGrade(7);
        //sService.addStudent(s);
        StudentService sService = context.getBean(StudentService.class);

        List<Student> students = sService.getStudents();
        System.out.println(students);

        sService.getName();
        //second way:  System.out.print(sService.getName());

        //sService.deleteStudent(115);
    }

}
