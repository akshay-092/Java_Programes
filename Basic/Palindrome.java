package Basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Number: ");
        // Read user input
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
        
        // Checking if the original number is equal to its reverse
        if (originalNum == reverseNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
        // Close the Scanner to prevent resource leak
        input.close(); 
    }
}
