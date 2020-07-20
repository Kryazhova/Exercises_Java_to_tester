package com.example.java_project.service;

import org.springframework.stereotype.Service;

@Service
public class CounterLong{
    long counter = 0;
    public void increment(){
        this.counter++;
    }

    @Override
    public String toString() {
        return "Количество: " +
                 counter;
    }

    public long getCounter() {
        return counter;
    }
}
