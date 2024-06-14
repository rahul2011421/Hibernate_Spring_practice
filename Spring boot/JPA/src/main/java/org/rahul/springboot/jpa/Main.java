package org.rahul.springboot.jpa;

import org.rahul.springboot.jpa.dao.UserRepository;
import org.rahul.springboot.jpa.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(Main.class,args);
        UserRepository userRepository=context.getBean(UserRepository.class);



        // Create Object of users
//        User user1=new User();
//        user1.setName("Rahul Yadav");
//        user1.setCity("bhadohi");
//        user1.setStatus("I'm java programmer");
//
//        User user2=new User();
//        user2.setName("Manogyan");
//        user2.setCity("Gynapur");
//        user2.setStatus("Bio Stuent");


        //Saving single user
//        User user=userRepository.save(user1);
//        System.out.println(user1);

        // Saving multiple user
//        List<User> users=new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        List<User>result=(List<User>) userRepository.saveAll(users);
//        result.forEach(user -> {
//            System.out.println(user);
//        });

        //Read the single data in optional containing
//        Optional<User> user=userRepository.findById(1);
//        System.out.println(user);
        //Read the all data in optional containing
//        Iterable<User> userIterable=userRepository.findAll();
//        userIterable.forEach(user->{
//            System.out.println(user);
//        });

        //update the value but for that we need to get the data first, update it and then save it
//        Optional<User> optional=userRepository.findById(1);
//        User user=optional.get();
//        System.out.println(user);
//        user.setName("Ajay k");
//        System.out.println(user);
//        userRepository.save(user);
//        System.out.println(user);


        //deleting the single item
//        userRepository.deleteById(1);
//        Optional<User> user=userRepository.findById(1);
//        System.out.println(user);

        //delete all item
//        userRepository.deleteAll();
//        Iterable<User> itr=userRepository.findAll();
//        itr.forEach(user1 -> {
//            System.out.println(user1);
//        });
        List<User> user=userRepository.findByName("Manogyan");
        System.out.println(user);
        List<User> users=userRepository.findByNameAndCity("kunal","bengaluru");
        System.out.println(users);
    }
}