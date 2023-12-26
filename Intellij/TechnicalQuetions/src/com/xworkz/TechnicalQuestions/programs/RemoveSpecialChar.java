package com.xworkz.TechnicalQuestions.programs;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str="Everyone celebrating @# Christmas*";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", " "));

    }
}
