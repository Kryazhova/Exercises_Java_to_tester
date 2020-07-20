package com.example.java_project.service;

import com.example.java_project.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WordsCounter {
    @Autowired
    private ToList toList;

    public List<Word> wordCounter(List<String> book) {
        Map<String, CounterLong> counterWord = new HashMap<>();
        for (String str:book){
            counterWord.compute(str, (k, v) -> v == null ? new CounterLong() : v)
                    .increment();
        }
        List<Word> wordList = toList.toList(counterWord);

        return wordList;
    }
}
