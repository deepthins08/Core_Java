package com.xworkz.TechnicalQuestions.programs;

public class CountCapitalLetters {

    public static void main(String[] args) {
        String str="Now Its is In CApitaL Letters String";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println("The number of Capital Letters are present in the string are "+count);
    }
}
