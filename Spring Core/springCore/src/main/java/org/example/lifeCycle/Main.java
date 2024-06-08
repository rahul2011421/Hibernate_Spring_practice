package org.example.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String []args){
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Samosa samosa=(Samosa)context.getBean("saus");
//        System.out.println(samosa);
//        context.registerShutdownHook();
//        System.out.println("+++++++++++++++++");
//        PepsiSpringInterface pepsi=(PepsiSpringInterface) context.getBean("p1");
//        System.out.println(pepsi);
        ExampleAnnotation e=(ExampleAnnotation) context.getBean("s1");
        System.out.println(e);
    }
}
