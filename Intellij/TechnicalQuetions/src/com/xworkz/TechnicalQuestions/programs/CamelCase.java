package com.xworkz.TechnicalQuestions.programs;

public class CamelCase {


    public static String toCamelCase(String str) {
        String[] words = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.toLowerCase();
            } else {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            builder.append(word);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "this is a string";
        System.out.println(toCamelCase(str));
    }
}
