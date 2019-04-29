package com.stackroute.unittest.pe1;

public class RepeatCharacters {

    public String repeatCharacters(String string){
        String str="";
        int number=0;
        for(int i=string.length()-1;number!=0 && i>=0;i--)
        {
            str+=str.charAt(i);
            number--;
        }
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        while(number!=0){

            string+=str;
            number--;
        }
        return str;

    }
}
