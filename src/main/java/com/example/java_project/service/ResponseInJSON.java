package com.example.java_project.service;

import com.example.java_project.model.Word;
import com.example.java_project.model.WordCountResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponseInJSON {
    private Logger logger = LoggerFactory.getLogger(ResponseInJSON.class);

    private ObjectMapper objectMapper;

    public ResponseInJSON(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public String printResponse(List<Word> words){
        WordCountResponse response = new WordCountResponse(words);
        String printedResult = "";
        try {
            printedResult = objectMapper.writerFor(WordCountResponse.class).writeValueAsString(response);
        } catch (JsonProcessingException e) {
            logger.error("Не получается записать JSON",e);
        }
        logger.debug("Результат с JSON: {}", printedResult);
        return printedResult;
    }

}
