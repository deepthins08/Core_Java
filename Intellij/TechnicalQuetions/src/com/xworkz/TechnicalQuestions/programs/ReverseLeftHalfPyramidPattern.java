package com.xworkz.TechnicalQuestions.programs;

public class ReverseLeftHalfPyramidPattern {

    public static void main(String[] args) {

        int m=6;
        for (int i = m; i >= 1; i--) {


            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }


            for (int k = 1; k <= m - i + 1; k++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
