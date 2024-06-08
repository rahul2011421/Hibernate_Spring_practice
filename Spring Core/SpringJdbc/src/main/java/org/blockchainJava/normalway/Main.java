package org.blockchainJava.normalway;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("My program started");
        // spring jdbc ----> JdbcTemplate
        ApplicationContext context=new ClassPathXmlApplicationContext("normalwayconfig.xml");
         JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);

         //insert query
         String query="insert into student(id,name,city) values(?,?,?)";

         //fire query
        int result=template.update(query,34,"karthik","ap");
        System.out.println("number of record inserted :"+ result );

    }
}