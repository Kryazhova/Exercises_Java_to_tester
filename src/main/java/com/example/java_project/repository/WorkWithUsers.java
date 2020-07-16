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

    public void createUser(Users user){
        Users save = testRepository.save(user);
    }


    public Users createUserFromString(String str){
        String[] mainStr = str.split("\\s");
        Users addUser = new Users();
        addUser.setName(mainStr[0] + " " + mainStr[1]);
        addUser.setAge(new Integer(mainStr[2]));
        addUser.setEmail(mainStr[3]);
        createUser(addUser);
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
