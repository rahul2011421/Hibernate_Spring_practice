package org.example.mapping.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class CascadingMain {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Question q1=new Question();
        q1.setQuestionId(000);
        q1.setQuestion("what is cascading ?........");
        Answer a1=new Answer(324,"cascading make saving things and deleting easier in one call");
        Answer a2=new Answer(3465,"cascading done works easier for programmers");
        Answer a3=new Answer(546,"cascading loved by programmer");
        List<Answer> list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        q1.setAnswers(list);

        Session session=factory.openSession();
        Transaction txn=session.beginTransaction();

        session.save(q1);
//        session.save(a1);
//        session.save(a2);
//        session.save(a3);


        txn.commit();
        session.close();
        factory.close();
    }
}
