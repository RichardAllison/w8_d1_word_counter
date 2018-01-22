package com.codeclan.example.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText wordCountEditText;
    Button wordCountButton;
    TextView wordCountDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        wordCountEditText = findViewById(R.id.wordCountText);
        wordCountButton = findViewById(R.id.wordCountButton);
        wordCountDisplayText = findViewById(R.id.wordCountDisplay);
    }

    public void onWordCountButtonClicked(View button) {
        String wordCountText = wordCountEditText.getText().toString();
        WordCounter wordCounter = new WordCounter(wordCountText);
        wordCountDisplayText.setText(wordCounter.wordCount());
    }

    public void onWordOccurrenceButtonClicked(View button) {
        String wordCountText = wordCountEditText.getText().toString();
        WordCounter wordCounter = new WordCounter(wordCountText);
        wordCountDisplayText.setText(wordCounter.wordOccurrences());
    }

}
