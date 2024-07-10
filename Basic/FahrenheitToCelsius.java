package Basic;
// Importing Scanner class from java.util package
import java.util.Scanner;  

// Defining a public class named FahrenheitToCelsius
public class FahrenheitToCelsius {  
    // Main method, the entry point of the program
    public static void main(String[] args) {  
        
        // Creating a Scanner object named 'input' for taking user input
        Scanner input = new Scanner(System.in);  

        // Prompting the user to enter temperature in Fahrenheit
        System.out.println("Enter the temperature in Fahrenheit: ");  
        
        // Reading the user input and storing it in 'fahrenheit' variable (as a float)
        float fahrenheit = input.nextFloat();  
        
        // Converting Fahrenheit to Celsius using the formula: (5/9) * (Fahrenheit - 32)
        float celsius = (5 * (fahrenheit - 32)) / 9;

        // Displaying the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);  
        
        // Closing the Scanner object to release resources
        input.close();  
    }
}
