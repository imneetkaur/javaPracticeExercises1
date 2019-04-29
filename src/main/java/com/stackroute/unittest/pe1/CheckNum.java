package com.stackroute.unittest.pe1;

public class CheckNum {
    public String checkNum(int number) {

        String str = "";
        if(number>20&& number<30){
            if(number%2==0){
                str="Jerry";
                System.out.println(str);
            }else if (number%2==1){
                str="Tom";
                System.out.println(str);
            }
        }
        else{
            str="Out of Range";
            System.out.println(str);
        }
        return str;
    }

}
