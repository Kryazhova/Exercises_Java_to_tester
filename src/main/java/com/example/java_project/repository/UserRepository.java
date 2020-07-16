package com.example.java_project.repository;

import com.example.java_project.model.Users;
import org.apache.catalina.User;
import org.hibernate.sql.Insert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {

    List<Users> findAll();

    List<Users> findAllByAgeAfterAndAgeBefore(int min, int max);

    List<Users> deleteUsersByName(String name);

}
