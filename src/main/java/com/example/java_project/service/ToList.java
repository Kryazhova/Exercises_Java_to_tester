package com.example.java_project.service;

import com.example.java_project.model.Word;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ToList {
    public List<Word> toList(Map<String, CounterLong> counterWord) {
        List<Word> words = new ArrayList<>();
        for (Map.Entry<String, CounterLong> listWords : counterWord.entrySet()) {
            words.add(new Word(listWords.getKey(), listWords.getValue()));
        }
        return words;
    }
}
