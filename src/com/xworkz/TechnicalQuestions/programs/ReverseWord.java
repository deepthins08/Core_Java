package com.xworkz.TechnicalQuestions.programs;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        // Create a Scanner object to read input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter a sentence
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();

        String sentence = "Hi reversing word";

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
        System.out.println("-----------------------------------------------------");

        String sentence1 = "This is a sample sentence and this sentence is just a sample";

        // Convert the sentence to lower case to handle case insensitivity and split by spaces
        String[] words1 = sentence1.toLowerCase().trim().split("\\s+");

        // Use a HashMap to store word frequencies

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Loop through each word in the array
        for (String word : words1) {
            // If the word is already in the map, increment its count, otherwise add it with a count of 1
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Display the word counts
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
