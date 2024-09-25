package com.xworkz.TechnicalQuestions.programs;

public class StringSplittingBySpace {

    public static void main(String[] args) {
        String str="Welcome to the Party";
        String[] str1=str.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str1[i]);
        }

    }
}
