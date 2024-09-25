package com.xworkz.TechnicalQuestions.programs;

import java.util.Scanner;

public class PrintFiveNextCharacters {

    void displayCharacters(char ch){
      for(int i=0;i<5;i++){
          ch++;
          if(ch>'z'){
              ch='A';
          }else if(ch > 'Z' && ch < 'a'){
              ch='a';
          }
          System.out.println(ch);
      }

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an Alphabet");
        char ch=scanner.next().charAt(0);

        PrintFiveNextCharacters printFiveNextCharacters=new PrintFiveNextCharacters();
        printFiveNextCharacters.displayCharacters(ch);
    }
}
