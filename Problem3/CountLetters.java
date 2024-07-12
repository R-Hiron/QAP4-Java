package Problem3;

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // get word from user
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // convert to all upper case
        word = word.toUpperCase();

        // count frequency of each letter in string
        try {
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                counts[currentChar - 'A']++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Identify and print the non-letter character that caused the exception
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (currentChar < 'A' || currentChar > 'Z') {
                    System.out.println("Not a letter: (" + currentChar + ")");
                    break;
                }
            }
        }

        // print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
