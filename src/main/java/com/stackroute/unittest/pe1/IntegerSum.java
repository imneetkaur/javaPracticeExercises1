package com.stackroute.unittest.pe1;

public class IntegerSum {
    int sum;
    boolean flag;

    public int findSumOfIntegers(int[] arrayInt) {
        for( int i = 0; arrayInt[i] != 0;i++) {
            sum = sum + arrayInt[i];
        }
        return sum;

    }
    public boolean findFloat(float[] arrayDouble) {
        for( int i = 0; arrayDouble[i] != 0;i++) {
            if ((int) arrayDouble[i] != arrayDouble[i]) {
                flag = false;
                break;
            }
            flag = true;
        }
        return flag;
    }

    public String checkInputString(String str) {
        if(false) {
            throw new IllegalArgumentException();
        }
        return "Exception thrown";
    }
}

