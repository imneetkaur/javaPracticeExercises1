package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReversalTest {
    StringReversal objReverse;

    @Before
    public void setUp() throws Exception {
        objReverse=new StringReversal();
    }

    @After
    public void tearDown() throws Exception {
        objReverse=null;
    }

    @Test
    public void testForValidInput(){
        String expectedValue="teenmi";
        String actualValue=objReverse.reverseString("imneet");
        assertEquals(expectedValue,actualValue);
    }
}