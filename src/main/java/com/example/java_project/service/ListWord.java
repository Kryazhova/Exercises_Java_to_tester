package com.example.java_project.service;

import com.example.java_project.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListWord {
    @Autowired
    private FileToString fileToString;
    @Autowired
    private WordSeparator wordSeparator;
    @Autowired
    private WordsCounter wordsCounter;

    public ListWord(WordSeparator wordSeparator, WordsCounter wordsCounter, FileToString fileToString) {
        this.wordSeparator = wordSeparator;
        this.wordsCounter = wordsCounter;
        this.fileToString = fileToString;
    }

    public List<Word> countWords(String pathBook) {
        String bookString = fileToString.fileToString(pathBook);
        List<String> testList = wordSeparator.wordSeparator(bookString);
        List<Word> wordsList = wordsCounter.wordCounter(testList);
        wordsList.sort(new WordComparator().reversed());

        return wordsList;
    }
}
