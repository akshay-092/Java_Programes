package Basic;

import java.util.Scanner;

/**
 * This program checks if a given number is a prime number.
 */
public class PrimeNumber {
    /**
     * Main method, the entry point of the program.
     */
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        
        // Read the user input
        int num = input.nextInt();
        
        // Check if the number is prime
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        
        // Close the Scanner to release resources
        input.close();
    }
    
    /**
     * This method checks if a given number is a prime number.
     */
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check for factors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Found a factor, not a prime number
            }
        }
        
        // No factors found, the number is prime
        return true;
    }
}
