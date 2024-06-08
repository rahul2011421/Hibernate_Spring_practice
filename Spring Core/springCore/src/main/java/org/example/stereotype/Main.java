package org.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student=context.getBean("student",Student.class);
//        System.out.println(student);
//        System.out.println(student.getPhone());
        System.out.println(student.hashCode());
        Student student1=context.getBean("student",Student.class);
        System.out.println(student1.hashCode());
    }
}
