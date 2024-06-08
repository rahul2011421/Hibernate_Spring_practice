package org.example.mapping.onetomany;

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

//        Question q1= new Question();
//        q1.setQuestionId(101);
//        q1.setQuestion("what is java ?");
//        Answer answer1=new Answer();
//        answer1.setAnswerId(1);
//        answer1.setAnswer("java is programming language");
//        answer1.setQuestion(q1);
//
//        Answer answer2=new Answer();
//        answer2.setAnswerId(2);
//        answer2.setAnswer("java have many frameworks like Hibernate");
//        answer2.setQuestion(q1);
//
//        Answer answer3=new Answer();
//        answer3.setAnswerId(3);
//        answer3.setAnswer("with the help of java we can develop backend programs easily");
//        answer3.setQuestion(q1);
//
//        List<Answer> list=new ArrayList<>();
//        list.add(answer1);
//        list.add(answer2);
//        list.add(answer3);
//
//        q1.setAnswers(list);



        Session session=factory.openSession();
        Transaction txn=session.beginTransaction();

//        session.save(q1);
//        session.save(answer1);
//        session.save(answer2);
//        session.save(answer3);

        Question question=session.get(Question.class,101);
        System.out.println(question.getQuestionId());
        System.out.println(question.getQuestion());
        System.out.println(question.getAnswers().size());


        txn.commit();
        session.close();
        factory.close();
    }
}
