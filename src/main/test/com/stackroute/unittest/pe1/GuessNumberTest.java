package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {

    GuessNumber object;
    @Before
    public void setUp() throws Exception {
        object=new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testcheckforcorrectGuess(){
        String expectedValue="Number guessed matches the original number";
        String  actualValue= object.guessNum(56);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testcheckforGuessMoreThanOriginal(){
        String expectedValue="Number guessed is more than original number";
        String actualValue=object.guessNum(99);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testCheckForGuessLessThanOriginal(){
        String expectedValue="Number guessed is less than original number";
        String actualValue=object.guessNum(23);
        assertEquals(expectedValue,actualValue);
    }
   /* @Test
    public void testCheckForNullValue(){
        String expectedValue="Enter Valid Input";
        String actualValue=object.guessNum((0));
        assertNotNull(expectedValue,actualValue);
    }*/

}


