package com.stackroute.unittest.pe1;

public class CheckPalindrome {
     int number;
     String result;
     int revnumber;
     int remainder;
     int sum;



    public int palindromeCheck(int number) {
        while (number != 0) {
            remainder = number % 10;  // Find the last digit
            revnumber = (revnumber * 10) + remainder; // To reverse the number
            number = number / 10;
            result="Number is a Palindrome";
        }

        return revnumber;
    }


    public int sumOfGivenPalindrome(int number) {
        while (number != 0) {
            remainder = number % 10;
            if (remainder % 2 == 0) {
                sum = sum + remainder;
            }
            number = number / 10;

        }
        return sum;
    }

}


