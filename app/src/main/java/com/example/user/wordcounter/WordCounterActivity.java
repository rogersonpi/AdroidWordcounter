package com.example.user.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {


    EditText textBox;
    TextView answerText;
    Button countWords;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter2);

        textBox = findViewById(R.id.editText);
        answerText = findViewById(R.id.textView);
        countWords = findViewById(R.id.button);
    }

    public void onWordCountButtonClicked(View button) {

        WordCount wordcount = new WordCount();
        int answer = wordcount.countWords(textBox.getText().toString());

        String result = answer.toString();





        answerText.setText(answer);




    }
}