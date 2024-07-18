package Basic;

import java.util.Scanner;

/**
 * This program checks if a given number is a palindrome.
 * A palindrome number is a number that remains the same when its digits are reversed.
 */
public class Palindrome {
    /**
     * Main method, the entry point of the program.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter your Number: ");
        
        // Read the user input
        int num = input.nextInt(); 
        
        // Store the original number for comparison later
        int originalNum = num; 
        
        // Variable to store the reversed number
        int reverseNum = 0; 
        
        // Reversing the number
        while (num > 0) {
            // Extract the last digit
            int rem = num % 10; 
            
            // Build the reversed number
            reverseNum = reverseNum * 10 + rem; 
            
            // Remove the last digit from the original number
            num = num / 10; 
        }
        
        // Check if the original number is equal to its reverse
        if (originalNum == reverseNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        // Close the Scanner to release resources
        input.close(); 
    }
}
