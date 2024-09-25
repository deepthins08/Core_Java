package com.xworkz.TechnicalQuestions.programs;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        // Create a Scanner object to read input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a sentence
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();

        String sentence="Hi reversing word";

        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Create an empty string to store the reversed sentence
        String reversedSentence = "";

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Add each word to the reversedSentence string
            reversedSentence += words[i];

            // Add a space between words, but not at the end
            if (i > 0) {
                reversedSentence += " ";
            }
        }

        // Display the reversed sentence
        System.out.println("Reversed sentence: " + reversedSentence);

        // Close the scanner
//        scanner.close();
    }
}
