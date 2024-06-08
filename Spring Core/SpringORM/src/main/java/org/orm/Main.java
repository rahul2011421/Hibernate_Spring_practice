package org.orm;

import org.orm.dao.StudentDao;
import org.orm.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao=context.getBean("studentDao", StudentDao.class);
        Student student=new Student(23,"Rahul","bengaluru");
        int r=studentDao.insert(student);
        System.out.println("Done............."+ r);
    }
}