package com.example.java_project;

import com.example.java_project.model.Users;
import com.example.java_project.repository.UserRepository;
import com.example.java_project.repository.WorkWithUsers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.event.EventListener;
import org.springframework.transaction.annotation.Transactional;
import sun.jvm.hotspot.utilities.Assert;

import java.util.List;

@SpringBootTest
class JavaProjectApplicationTests {

    @Autowired
    private WorkWithUsers workWithUsers;

    @Test
    @Transactional
    void contextLoads() {
        Users addUser = workWithUsers.createUser("Петров Петр", 25, "petr@petr.ru");
        Assertions.assertEquals("Петров Петр", addUser.getName());

        workWithUsers.createUserFromString("Иванов Иван 19 ivan@ivan.ru");

        workWithUsers.findAll();
        Assertions.assertEquals(3, workWithUsers.countUser());

        Assertions.assertNotNull(workWithUsers.findAllByAgeAfterAndAgeBefore(30,35));

        workWithUsers.deleteUsersByName("Петров Петр");
        workWithUsers.findAll();
        Assertions.assertEquals(2, workWithUsers.countUser());
    }


}
