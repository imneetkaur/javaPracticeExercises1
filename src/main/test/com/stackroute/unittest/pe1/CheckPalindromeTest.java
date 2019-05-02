package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPalindromeTest {

    CheckPalindrome objCheckPalindrome;

    @Before
    public void setUp() throws Exception {
        objCheckPalindrome=new CheckPalindrome();
    }

    @After
    public void tearDown() throws Exception {
        objCheckPalindrome=null;
    }
    @Test
    public void testCheckIfNumberIsPalindrome(){
       int  expectedValue = 12321;
       int actualValue = objCheckPalindrome.palindromeCheck(12321);
       assertEquals(expectedValue,actualValue);
    }
   /* @Test
    public void testCheckIfNumberIsNotPalindrome(){
        int actualValue=objCheckPalindrome.palindromeCheck(12345);
        assertEquals(objCheckPalindrome.result,actualValue);
    }
*/
}
