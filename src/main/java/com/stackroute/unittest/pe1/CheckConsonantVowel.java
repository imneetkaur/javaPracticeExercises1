package com.stackroute.unittest.pe1;

public class CheckConsonantVowel {

    public String checkConsonantOrVowel(String str) {

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

          //  if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z')) {

                if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {

                   // System.out.println(ch + " : is a vowel");
                    str="Vowel";

                } else {
                 //   System.out.println(ch + " : is a Consonant");
                    str="Consonant";
                }
            } /*else {

              //  System.out.println("Error !!! " + ch + " is not an alphabet");
                str="Neither Vowel nor Consonant";
            }*/
        //}

        return str;
    }


}
