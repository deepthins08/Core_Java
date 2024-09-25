package com.xworkz.TechnicalQuestions.programs;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        // Define the number of rows for the top half of the diamond
        int rows = 5;

        // Upper part of the diamond (including the middle row)
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

            // Move to the next line
            System.out.println();
        }

        // Lower part of the diamond (excluding the middle row)
        for (int i = rows - 1; i >= 1; i--) {
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

            // Move to the next line
            System.out.println();
        }
        System.out.println("-------------------------------------");
// numbers not mirrored

        int n = 5;  // Number of rows for the top half (including middle row)

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(j);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
