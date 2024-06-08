package org.blockchainJava.standardway;

import org.blockchainJava.standardway.entities.Student;
import org.blockchainJava.standardway.studentdao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("My program started");
        // spring jdbc ----> JdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);


        // Inserting

//        Student student=new Student();
//        student.setId(345);
//        student.setName("mayank");
//        student.setCity("kanput");
//
//        int result=studentDao.insert(student);

        //updating

//        Student student=new Student();
//        student.setId(345);
//        student.setName("ajay");
//        student.setCity("bengaluru");
//        int result=studentDao.change(student);


//        //deleting
//        int result=studentDao.delete(345);
//        System.out.println("number of record inserted :"+ result );

//        Student student=studentDao.getStudent(34);
//        System.out.println(student);
        List<Student> studentList = studentDao.getAllStudents();
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}