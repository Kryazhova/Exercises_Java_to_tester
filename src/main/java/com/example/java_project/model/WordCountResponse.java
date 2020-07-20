package com.example.java_project.model;

import java.io.Serializable;
import java.util.List;

public class WordCountResponse implements Serializable {
    private List<Word> words;

    public List<Word> getWords() {
        return words;
    }

    public WordCountResponse(List<Word> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "WordCountResponse{" +
                "words=" + words +
                '}';
    }
}
