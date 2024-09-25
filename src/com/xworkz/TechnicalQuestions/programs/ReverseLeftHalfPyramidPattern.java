package com.xworkz.TechnicalQuestions.programs;

public class ReverseLeftHalfPyramidPattern {

    public static void main(String[] args) {

        int rows=6;
        for (int i = 1; i <=rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = i; k < rows; k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
