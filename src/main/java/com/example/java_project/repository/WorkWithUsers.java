package com.example.java_project.repository;

import com.example.java_project.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkWithUsers {

    @Autowired
    private UserRepository testRepository;

    public WorkWithUsers(UserRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Users createUserFromString(String str){
        String[] mainStr = str.split("\\s");
        Users newUser = createUser(mainStr[0] + " " + mainStr[1], new Integer(mainStr[2]), mainStr[3]);
        return newUser;
    }

    public Users createUser(String name, int age, String email) {
        Users addUser = new Users();
        addUser.setName(name);
        addUser.setAge(age);
        addUser.setEmail(email);
        Users save = testRepository.save(addUser);
        return addUser;
    }

    public long countUser(){
       return testRepository.count();
    }

    public List<Users> findAll(){
        testRepository.findAll()
                .forEach(it->System.out.println("Таблица содержит пользователя: " + it));
        return testRepository.findAll();
    }

    public List<Users> findAllByAgeAfterAndAgeBefore(int min, int max){
        testRepository.findAllByAgeAfterAndAgeBefore(min,max)
                .forEach(it->System.out.println("Пользователь с подходящим возрастом: " + it));
        return testRepository.findAllByAgeAfterAndAgeBefore(min,max);
    }

    public List<Users> deleteUsersByName(String nameUser){
        return testRepository.deleteUsersByName(nameUser);
    }

}
