package Basic;

import java.util.Scanner;

/**
 * This program calculates the factorial of a given number entered by the user.
 */
public class Factorial {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter the number: ");
        
        // Read the number entered by the user
        long num = input.nextLong();
        
        // Variable to store the factorial, initialized to 1
        long factorial = 1L;
        
        // Calculate the factorial of the number using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        // Output the factorial of the number
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        // Close the scanner to release resources
        input.close();
    }
}
