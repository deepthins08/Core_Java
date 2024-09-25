package com.xworkz.TechnicalQuestions.programs;

public class MirrorNumberPattern {

    public static void main(String[] args) {
        // Define the number of rows for the pattern
        int rows = 5;

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
