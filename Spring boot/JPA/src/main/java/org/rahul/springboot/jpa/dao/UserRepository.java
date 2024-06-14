package org.rahul.springboot.jpa.dao;

import org.rahul.springboot.jpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByName(String name);
    public List<User> findByNameAndCity(String name,String city);

    //JPQL(Java persistence query language)
    @Query(value = "Select * from User",nativeQuery = true)
    public List<User> getAllUsers();

    @Query("Select u from User u where u.name=:n")
    public List<User> getAllUserByName(@Param("n") String name);
    @Query(value = "select * from User",nativeQuery = true)
    public List<User> fetchAllUsers();
}
