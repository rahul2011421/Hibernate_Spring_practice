package org.example.hibernatebasics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchLoadMain {
    public static void main(String []args){
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();

        Student student=session.get(Student.class,103);
        System.out.println(student);
        System.out.println(student.getCity());
        Address address=session.load(Address.class,2);
        System.out.println(address.getCity());
        session.close();
        sessionFactory.close();
    }
}
