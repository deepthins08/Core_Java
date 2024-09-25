package com.xworkz.TechnicalQuestions.programs;

public class NumberPattern {

    public static void main(String[] args) {
        int n=5;
        //ascending pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        //descending pattern
        for (int i = 1; i < n; i++) {  // Keep i the same
            for (int j = 1; j <= n - i; j++) {  // Adjust j loop for descending
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
