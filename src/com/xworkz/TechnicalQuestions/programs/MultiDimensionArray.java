package com.xworkz.TechnicalQuestions.programs;

public class MultiDimensionArray {
    public static void main(String[] args) {

        int num[][]=new int[3][4];  //MultiDimensionArray

        int arr[][]=new int[3][];  //JaggedArray
        arr[0]=new int[4];
        arr[1]=new int[5];
        arr[2]=new int[3];

        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

        System.out.println("------------------------------------\n");

        for(int i=0;i< num.length;i++){
            for(int j=0;j< num[i].length;j++){
                num[i][j]=(int)(Math.random()*100);
            }
        }

        for(int i=0;i< num.length;i++){
            for(int j=0;j< num[i].length;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }

    }


}
