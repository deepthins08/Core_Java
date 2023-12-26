package com.xworkz.TechnicalQuestions.programs;

public class SpaceRemove {
    public static void main(String[] args) {

        String str="The Emphire";

            for(int i=0;i<str.length();i++){
                if(str.charAt(i)!=' ') {
                    System.out.print(str.charAt(i));
                }

        }
    }
}
