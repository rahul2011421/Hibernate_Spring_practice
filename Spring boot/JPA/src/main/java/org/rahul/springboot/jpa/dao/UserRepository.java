package org.rahul.springboot.jpa.dao;

import org.rahul.springboot.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name,String city);
}
