package Problem4;

import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text:");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Process each token in the input line
        while (scanLine.hasNext()) {
            String token = scanLine.next(); // Declare token outside try block
            try {
                val = Integer.parseInt(token);
                sum += val;
            } catch (NumberFormatException e) {
                // Print the non-integer token
                System.out.println("Not an integer: " + token);
            }
        }

        // Print the sum of the integers
        System.out.println("The sum of the integers on this line is " + sum);
    }
}