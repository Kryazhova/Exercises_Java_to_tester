package com.example.java_project.model;

import com.example.java_project.service.ListWord;
import com.example.java_project.service.ResponseInJSON;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
public class WordCounterTest {

    @Autowired
    private ListWord listWord;

    @Autowired
    private ResponseInJSON responseInJSON;


    @Test
    public void wordListTest() {
        List<Word> bookString = listWord.countWords("src/test/resources/Dune");
        Assertions.assertThat(bookString)
                .isNotNull();
    }

    @ParameterizedTest
    @MethodSource("words")
    public void wordResponseInJsonTest(String word) {
        List<Word> bookString = listWord.countWords("src/test/resources/Dune");
        String printedResult = responseInJSON.printResponse(bookString);
        Assertions.assertThat(printedResult)
                .isNotNull()
                .contains(word);
    }

    private static Stream<Arguments> words(){
        return Stream.of(
                Arguments.of("\"word\":\"desert\",\"count\":223"),
                Arguments.of("word\":\"said\",\"count\":2272"),
                Arguments.of("\"word\":\"amusing\",\"count\":1"),
                Arguments.of("\"word\":\"jessica\",\"count\":894")
        );
    }
}
