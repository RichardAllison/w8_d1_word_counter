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

    public String wordOccurrences() {
        HashMap<String, Integer> wordOccurrences = new HashMap<>();
        for(String word : this.words){
            Integer count = wordOccurrences.get(word);
            if (count == null){
                count = 0;
            }
            count += 1;
            wordOccurrences.put(word, count);
        }
        String wordsByOccurrence = "";
        for (String key : wordOccurrences.keySet()) {
            Integer value = wordOccurrences.get(key);
            wordsByOccurrence += "\"" + key + "\"" + " : " + value + ", ";
        }

        return wordsByOccurrence.substring(0, wordsByOccurrence.length() - 2);
    }

}
