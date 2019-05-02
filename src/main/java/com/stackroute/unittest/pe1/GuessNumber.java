package com.stackroute.unittest.pe1;

public class GuessNumber {

    public String guessNum(int number){
        int originalnum=56;
        String str="";

        while (true) {

            if(number==originalnum){
                str = "Number guessed matches the original number";
                break;
            }else if (number < originalnum) {
                str = "Number guessed is less than original number";
                break;
            } else if(number > originalnum){
                str = "Number guessed is more than original number";
            }
            else  {
                str = "Enter Valid Input";
                break;

            }
        }
        return str;

    }

}
