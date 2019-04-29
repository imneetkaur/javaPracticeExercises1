package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckNumTest {

    CheckNum object1;
    @Before
    public void setUp() throws Exception {
        object1= new CheckNum();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkforOddNumber() throws Exception {
        String expectedValue = "Tom";
        String actualValue = object1.checkNum(23);
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void checkforEvenNumber() throws Exception {
        String expectedValue = "Jerry";
        String actualValue = object1.checkNum(28);
        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void checkRange(){
        String expectedValue= "Out of Range";
        String actualValue=object1.checkNum(56);
        assertEquals(expectedValue,actualValue);
    }
    /*public void checkforNullValue(){
        String expectedValue="Null Value";
        String actualValue=object1.checkNum(0);
        assertEquals(expectedValue,actualValue);
    }
*/

}
