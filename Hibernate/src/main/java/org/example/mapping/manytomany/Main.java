package org.example.mapping.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        Student s1=new Student();
        Student s2=new Student();
        s1.setStudentId(101);
        s1.setStudentName("Rahul Yadav");
        s2.setStudentId(102);
        s2.setStudentName("Karthik Kumar");


        Course c1=new Course();
        Course c2=new Course();
        c1.setCourseId(1);
        c1.setCourseName("Java");
        c2.setCourseId(2);
        c2.setCourseName("Spring boot");

        List<Student> list1=new ArrayList<>();
        List<Course> list2=new ArrayList<>();

        list1.add(s1);
        list1.add(s2);

        list2.add(c1);
        list2.add(c2);

        c1.setStudents(list1);
        s2.setCourses(list2);


        Session session=factory.openSession();
        Transaction txn=session.beginTransaction();

        session.save(s1);
        session.save(s2);
        session.save(c1);
        session.save(c2);

        txn.commit();
        session.close();
        factory.close();
    }
}
