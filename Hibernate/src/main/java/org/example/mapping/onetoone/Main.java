package org.example.mapping.onetoone;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.nio.channels.SeekableByteChannel;

public class Main {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();

        Question question=new Question();
        question.setQuestionId(123);
        question.setQuestion("who was sapurankha");
        Answer answer=new Answer();
        answer.setAnswerId(32);
        answer.setAnswer("sapurankha was ravan's sister");
        answer.setQuestion(question);
        question.setAnswer(answer);

        Question question1=new Question();
        question1.setQuestionId(124);
        question1.setQuestion("what is java");
        Answer answer1=new Answer();
        answer1.setAnswerId(33);
        answer1.setAnswer("Java is programming language");
        answer1.setQuestion(question1);
        question1.setAnswer(answer1);


        Session session=factory.openSession();
        Transaction txn=session.beginTransaction();

        session.save(question);
        session.save(answer);
        session.save(question1);
        session.save(answer1);

        txn.commit();

        session.get(Question.class,123);
        System.out.println(question.getQuestion());
        System.out.println(question.getAnswer().getAnswer());

        session.close();
        factory.close();
    }
}
