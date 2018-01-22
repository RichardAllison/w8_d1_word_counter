package com.codeclan.example.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter("Java is awesome!");
    }

    @Test
    public void countsWords() {
        assertEquals("3", wordCounter.wordCount());
    }

}
