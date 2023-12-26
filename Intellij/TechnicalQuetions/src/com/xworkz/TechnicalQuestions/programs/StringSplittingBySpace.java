package com.xworkz.TechnicalQuestions.programs;

public class StringSplittingBySpace {

    public static void main(String[] args) {
        String str="Welcome to the Party";
        String[] str1=str.split(" ");
        for(String str2:str1){
            System.out.println(str2);
        }

    }
}
