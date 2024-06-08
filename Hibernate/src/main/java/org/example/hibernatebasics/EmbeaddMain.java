package org.example.hibernatebasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmbeaddMain {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        Student student1=new Student();
        student1.setId(123);
        student1.setName("karthik kanti");
        student1.setCity("bengaluru");
        Certificate certificate1=new Certificate();
        certificate1.setCourse("android");
        certificate1.setDuration("3 month");
        student1.setCertificate(certificate1);

        System.out.println(student1);
        System.out.println(certificate1);

        Student student2=new Student();
        student2.setId(1234);
        student2.setName("ram kumar");
        student2.setCity("delhi");
        Certificate certificate2=new Certificate();
        certificate2.setCourse("java");
        certificate2.setDuration("3 week");
        student2.setCertificate(certificate2);

        System.out.println(student2);
        System.out.println(certificate2);

        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();

        session.save(student1);
        session.save(student2);

        transaction.commit();
        session.close();
        factory.close();
    }
}
