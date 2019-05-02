package com.stackroute.unittest.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSumTest {
    IntegerSum object;

    @Before
    public void setUp() throws Exception {
        object=new IntegerSum();
    }


    @After
    public void tearDown() throws Exception {
        object=null;
    }

   /* public void testCheckForValidInput(){
        int arrayInt[] = {30,40,30,0};
        String str = object.findSumOfIntegers(arrayInt[10,20,30,40]);
        assertEquals(100,str);

        System.out.println("Return Sum : Check");
    }*/
}