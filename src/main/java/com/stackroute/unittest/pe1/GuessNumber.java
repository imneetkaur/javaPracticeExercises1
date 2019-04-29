package com.stackroute.unittest.pe1;

public class GuessNumber {

    public String guessNum(int number){
        int originalnum=56;
        String str="";

        while (number != originalnum) {

            if (number < originalnum) {
                System.out.println("EntryPoint");
                str = "Number guessed is less than original number";
                System.out.println(str);
            } else {
                System.out.println("ElseEntryPoint");
                str = "Number guessed is more than original number";
                System.out.println(str);
            }
        }
        str = "Number guessed matches the original number";
        System.out.println(str);
        return str;
    }
}
