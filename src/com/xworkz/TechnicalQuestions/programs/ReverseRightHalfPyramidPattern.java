package com.xworkz.TechnicalQuestions.programs;

public class ReverseRightHalfPyramidPattern {

    public static void main(String[] args) {

        int m=6;

        for(int i=1;i<=m;i++){
            for(int j=i;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
