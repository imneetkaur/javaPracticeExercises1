package com.stackroute.unittest.pe1;

public class CaseCheck {

    public static String caseCheck(String str){


        if(Character.isLowerCase(str.charAt(0))){
            str="Small Letter";
        }else if(Character.isUpperCase(str.charAt(0))){
            str="Capital Letter";
        }else if(Character.isDigit(str.charAt(0))){
            str="Digit";
        }else if(Character.isWhitespace(str.charAt(0))){
            str="Null Value";
        }
        else{
            str="Special Symbol";
        }
        return str;
    }

}