package com.example.java_project.service;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

@Service
public class WordSeparator {
    Logger logger = LoggerFactory.getLogger(WordSeparator.class);

    //делить если пробел
    //делить если . / , / ;/ : / ? / ! (в принципе любой символ)
    // не учитывать как слово символы

    public List<String> wordSeparator(String book){
        if (book.isEmpty())
            logger.error("Пустой файл");
        StringTokenizer words = new StringTokenizer(book, " \t\n\r\f.,:;!?\"'*()[]-–1234567890");
        List<String> wordResult = new ArrayList<>();
        while (words.hasMoreTokens()){
            wordResult.add(words.nextToken().toLowerCase());
        }
        return wordResult;
    }
}
