package Basic;

import java.util.Scanner;

/**
 * Fibonacci.java
 * 
 * This program computes Fibonacci sequence up to a specified number.
 * Fibonacci sequence starts with 1, 1, and each subsequent number is the sum
 * of the two preceding ones. For example, the sequence up to 10 numbers is:
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of Fibonacci numbers to generate
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        // Initial Fibonacci numbers
        int a = 1; // First Fibonacci number
        int b = 1; // Second Fibonacci number
        
        // Output initial numbers
        System.out.println("--------------------");
        System.out.println(a);
        System.out.println(b);

        // Generate Fibonacci sequence starting from the third number
        for (int i = 3; i <= number; i++) {
            int tmp = a + b; // Calculate next Fibonacci number
            System.out.println(tmp); // Output the next Fibonacci number
            a = b; // Update the first Fibonacci number to the second
            b = tmp; // Update the second Fibonacci number to the next
        }

        // Close the scanner
        input.close();
    }
}
