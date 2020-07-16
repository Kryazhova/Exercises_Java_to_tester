package com.example.java_project;

import com.example.java_project.model.Users;
import com.example.java_project.repository.UserRepository;
import com.example.java_project.repository.WorkWithUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class JavaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaProjectApplication.class, args);
    }


}
