package com.example.java_project.model;

import com.example.java_project.service.CounterLong;
import com.google.common.base.Functions;
import com.google.common.collect.Ordering;
import org.springframework.stereotype.Service;

public class Word {

    private String word;
    CounterLong count;

    public Word(String word, CounterLong count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public long getCount() {
        return count.getCounter();
    }

    @Override
    public String toString() {
        return "Слово: \"" + word + "\" " + count + "\n";
    }

}
