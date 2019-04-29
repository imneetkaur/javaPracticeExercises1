package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatCharactersTest {

    RepeatCharacters object;
    @Before
    public void setUp() throws Exception {
        object=new RepeatCharacters();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void checkforCorrectInput(){
        String expectedValue="";
        String actualValue="";
        String result=object.repeatCharacters("abc");
        assertEquals(expectedValue,actualValue);
    }
}