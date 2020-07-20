package com.example.java_project.service;
import java.util.Comparator;
import com.example.java_project.model.Word;

public class WordComparator implements Comparator<Word> {
    @Override
    public int compare(Word o1, Word o2) {
        return (int) (o1.getCount() - o2.getCount());
    }
}
