package com.stackroute.unittest.pe1;

public class StringReversal {

    public String reverseString(String str){
        String reverseString="";

        for (int i = str.length()-1; i >= 0; i-- ) {
            reverseString = reverseString + str.charAt(i);
        }
        System.out.println(reverseString);
        return reverseString;
    }
}
