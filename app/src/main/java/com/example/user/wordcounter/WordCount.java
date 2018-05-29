package com.example.user.wordcounter;

public class WordCount {

    int words;



    public int countWords(String words) {

        this.words = words.split("\\s").length;

        return this.words;

    }



    public int numberOfWords() {

        return this.words;
    }
}
