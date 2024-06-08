package org.example.hibernatebasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Pragram started.................");
        //We can use anyone of two both are same only.................
        //SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        //creating object for student
        Student student=new Student();
        student.setId(102);
        student.setName("manoj");
        student.setCity("delhi");
        System.out.println(student);


        //creating object of Address class
        Address address=new Address();
        address.setStreet("street1");
        address.setCity("varanasi");
        address.setOpen(true);
        address.setAddedDate(new Date());


        //Reading image.........
        FileInputStream fileInputStream=new FileInputStream("src/main/resources/rah.jpg");
        byte [] data=new byte[fileInputStream.available()];
        fileInputStream.read(data);
        address.setImage(data);

        Session session=factory.openSession();
//        session.beginTransaction();
//        session.save(student);
//        session.save(address);
//        session.getTransaction().commit();
//        session.close();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(address);
        transaction.commit();
        session.close();
    }
}