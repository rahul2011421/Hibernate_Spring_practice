package org.example.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireannotationconfig.xml");
        Employee employee=(Employee) context.getBean("emp");
        System.out.println(employee);
    }
}
