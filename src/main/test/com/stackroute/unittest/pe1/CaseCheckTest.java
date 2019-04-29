
package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaseCheckTest {

    CaseCheck object1;
    @Before
    public void setUp() throws Exception {
    object1=new CaseCheck();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkforlowerCase(){
        String expectedValue="Small Letter";
        String actualValue=object1.caseCheck("s");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkforUpperCase(){
        String expectedValue="Capital Letter";
        String actualValue=object1.caseCheck("T");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkforDigit(){
        String expectedValue="Digit";
        String actualValue=object1.caseCheck("3");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkforNullValue(){
        String expectedValue="Null Value";
        String actualValue=object1.caseCheck(" ");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void checkforSpecialCharacters(){
        String expectedValue="Special Symbol";
        String actualValue=object1.caseCheck("$");
        assertEquals(expectedValue,actualValue);
    }

}
