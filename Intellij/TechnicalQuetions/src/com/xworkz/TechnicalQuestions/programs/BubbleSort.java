package com.xworkz.TechnicalQuestions.programs;

public class BubbleSort {
    public static void main(String[] args) {
        int[] sort={29,10,99,54,32,66,21,11};
        for(int i=0;i< sort.length-1;i++){
            for(int j=0;j< sort.length-i-1;j++){
                if(sort[j]>sort[j+1]){
                    int temp=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        for(int i=0;i< sort.length;i++){
            System.out.println(sort[i]);
        }
    }
}
