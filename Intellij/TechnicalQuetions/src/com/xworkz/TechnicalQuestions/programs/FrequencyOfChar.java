package com.xworkz.TechnicalQuestions.programs;

public class FrequencyOfChar {

    static int show(int freq[],int value){

        int count=0;
        for(int i=0;i<freq.length;i++)
            if(freq[i]==value)
                count++;
        return count;

    }
    public static void main(String[] args) {
        int freq[]={2,3,2,6,3,5};
        int value=2;


        System.out.println("Frequency of "+value+ " is "+show(freq,value));

        value=6;
        System.out.println("Frequency of "+value+ " is "+show(freq,value));
    }
}
