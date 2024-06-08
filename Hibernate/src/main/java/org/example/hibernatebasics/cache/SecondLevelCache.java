package org.example.hibernatebasics.cache;



import org.example.hibernatebasics.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SecondLevelCache {
    public static void main(String[] args) {


        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();


        Session session1=factory.openSession();
        Student student=session1.get(Student.class,2335);
        System.out.println(student);
        session1.close();

        Session session2=factory.openSession();
        Student student2=session2.get(Student.class,2335);
        System.out.println(student2);

        session2.close();
        factory.close();
    }
}
