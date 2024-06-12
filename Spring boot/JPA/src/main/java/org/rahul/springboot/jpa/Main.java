package org.rahul.springboot.jpa;

import org.rahul.springboot.jpa.dao.UserRepository;
import org.rahul.springboot.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(Main.class,args);
        UserRepository userRepository=context.getBean(UserRepository.class);



        // Create Object of users
        User user1=new User();
        user1.setName("Rahul Yadav");
        user1.setCity("bhadohi");
        user1.setStatus("I'm java programmer");

        User user2=new User();
        user2.setName("Manogyan");
        user2.setCity("Gynapur");
        user2.setStatus("Bio Stuent");


        //Saving single user
//        User user=userRepository.save(user1);
//        System.out.println(user1);

        // Saving multiple user
        List<User> users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        List<User>result=(List<User>) userRepository.saveAll(users);
        result.forEach(user -> {
            System.out.println(user);
        });
    }
}