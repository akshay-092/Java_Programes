package Basic;

// Importing Scanner class from java.util package
import java.util.Scanner;  

/**
 * This program converts a temperature given in Fahrenheit to Celsius.
 */
public class FahrenheitToCelsius {  
    /**
     * Main method, the entry point of the program.
     */
    public static void main(String[] args) {  
        
        // Creating a Scanner object named 'input' for taking user input
        Scanner input = new Scanner(System.in);  

        // Prompting the user to enter temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");  
        
        // Reading the user input and storing it in 'fahrenheit' variable (as a float)
        float fahrenheit = input.nextFloat();  
        
        // Converting Fahrenheit to Celsius using the formula: (5/9) * (Fahrenheit - 32)
        float celsius = (5.0f / 9.0f) * (fahrenheit - 32); // Added 5.0f and 9.0f to ensure floating-point division

        // Displaying the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);  
        
        // Closing the Scanner object to release resources
        input.close();  
    }
}
