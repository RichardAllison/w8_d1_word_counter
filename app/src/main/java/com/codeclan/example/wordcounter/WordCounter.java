package com.codeclan.example.wordcounter;

import java.util.HashMap;

public class WordCounter {

    String someText;
    String[] words;

    public WordCounter(String someText) {
        this.someText = someText;
        this.words = someText.split(" ");
    }

    public String wordCount() {
        return String.valueOf(this.words.length);
    }

//    public HashMap<String, Integer> wordOccurrences() {
//        HashMap<String, Integer> wordOccurrences = new HashMap<>();
//        return wordOccurrences;
//    }

}
