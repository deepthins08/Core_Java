package com.xworkz.TechnicalQuestions.programs;

public class AlternativeLetterToLowerCase {

    public static void main(String[] args) {
        String str="Alternative String";

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){

                str.toLowerCase();
            }
        }
        System.out.println(str.toLowerCase());
    }

}
