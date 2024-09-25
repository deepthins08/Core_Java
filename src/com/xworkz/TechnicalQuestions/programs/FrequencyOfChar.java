package com.xworkz.TechnicalQuestions.programs;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {

    static int show(char[] freq,char value){

        int count=0;
        for(int i=0;i<freq.length;i++)
            if(freq[i]==value)
                count++;
        return count;

    }

    public static void main(String[] args) {
        String str="This is String";
        char[] freq=str.toCharArray();
        char value='i';
        System.out.println("Frequency of "+value+ " is "+show(freq,value));

// using map
        String st="hello";
        char[] ch=st.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                }
            }
            map.put(ch[i],count);
        }
        System.out.println(map);
    }
}
