package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckConsonantVowelTest {
    CheckConsonantVowel object;

    @Before
    public void setUp() throws Exception {
        object=new CheckConsonantVowel();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }
    @Test
    public void testIfVowelReturnsVowel(){
        String expectedValue="Vowel";
        String actualValue=object.checkConsonantOrVowel("a");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testIfConsonantReturnsConsonant(){
        String expectedValue="Consonant";
        String actualValue=object.checkConsonantOrVowel("q");
        assertEquals(expectedValue,actualValue);
    }
}