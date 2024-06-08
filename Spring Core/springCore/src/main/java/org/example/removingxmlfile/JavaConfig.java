package org.example.removingxmlfile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class JavaConfig {

    public Samosa getSamosa(){
        return new Samosa();
    }
    @Bean
    public Student getStudent(){
        Student student=new Student(getSamosa());
        return student;
    }
}
