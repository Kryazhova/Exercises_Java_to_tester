package com.example.java_project.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Optional;


@Service
public class FileToString {
    Logger logger = LoggerFactory.getLogger(FileToString.class);

    public String fileToString(String path){
        String str;
        String newStr = "";
        try (BufferedReader readFile = new BufferedReader(new FileReader(path))){
            while ((str=readFile.readLine()) != null)
                newStr+=str;
        } catch (IOException e) {
            logger.error("Файл не был найден");
        }
        return newStr;
    }

}
