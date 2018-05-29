package com.example.user.wordcounter;



import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class wordCountTest {

   public WordCount wordcount;


    @Before
    public void before(){

       this.wordcount = new WordCount();


    }

    @Test

    public void testWordCounter(){

        wordcount.countWords("One two three four five");
        assertEquals(5, wordcount.numberOfWords());


    }



}
