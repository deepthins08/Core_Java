package com.xworkz.TechnicalQuestions.programs;

public class FindCapitalLetter {
    public static void main(String[] args) {

        String str="This STRING Has Capital leTTers";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println("Characters is in Capital letter "+str.charAt(i));
            }
        }
    }
}
