package com.stackroute.unittest.pe1;

public class CaseCheck {

    public static String caseCheck(String str){
        String s="";

        if(Character.isLowerCase(str.charAt(0))){
            System.out.printf("Entry");
            s="Small Letter";
            System.out.println(s);
        }else if(Character.isUpperCase(str.charAt(0))){
            s="Capital Letter";
        }else if(Character.isDigit(str.charAt(0))){
            s="Digit";
        }else if(Character.isWhitespace(str.charAt(0))){
            System.out.println("Null");
            s="Null Value";
        }
        else{
            s="Special Symbol";
        }
        return s;
    }

}