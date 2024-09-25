package com.xworkz.TechnicalQuestions.programs;

public class FindNumberInString {
    public static void main(String[] args) {

        String str="1 and 38 and 54 are numbers  ";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                System.out.println("the number which is present in the string is "+str.charAt(i));
            }
        }
    }

}
