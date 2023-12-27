package com.xworkz.TechnicalQuestions.programs;

public class FindSpecialCharacter {


    public static void main(String[] args) {

        String str="This String$% conatins #@ ? special*Characters";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
                count++;

            }
        }

        System.out.println("no of special characters are :"+count);
    }
}
