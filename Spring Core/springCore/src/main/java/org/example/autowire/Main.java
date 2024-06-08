package org.example.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireconfig.xml");
        Employee employee=(Employee) context.getBean("emp");
        System.out.println(employee);
    }
}
