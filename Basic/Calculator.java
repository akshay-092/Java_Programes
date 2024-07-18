package Basic;

import java.util.Scanner;

/**
 * A simple calculator that performs basic arithmetic operations.
 * It continuously takes input from the user for two numbers and an operator
 * to perform the calculation until the user decides to exit.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Main loop to keep the calculator running until user decides to exit
        while (true) {
            // Input for the first number
            System.out.println("Input Your First Number: ");
            double num1;
            while (true) {
                if (input.hasNextDouble()) {
                    num1 = input.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input for number. Please enter a valid number.");
                    input.next(); // Clear invalid input from the scanner
                }
            }
            input.nextLine(); // Consume newline character

            // Input for the second number
            System.out.println("Input Your Second Number: ");
            double num2;
            while (true) {
                if (input.hasNextDouble()) {
                    num2 = input.nextDouble();
                    break;
                } else {
                    System.out.println("Invalid input for number. Please enter a valid number.");
                    input.next(); // Clear invalid input from the scanner
                }
            }
            input.nextLine(); // Consume newline character

            // Input for the operator or 'X' to exit
            System.out.println("Input Your Operator (+, *, /, %, -) or 'X' to exit: ");
            char op = input.next().charAt(0);
            input.nextLine(); // Consume newline character

            // Handle 'X' to exit the program
            if (op == 'X' || op == 'x') {
                break; // Exit the while loop when 'X' or 'x' is entered
            } else if (op == '+' || op == '-' || op == '%' || op == '*' || op == '/') {
                // Perform the calculation based on the operator
                double result = 0;
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        // Check for division by zero
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero.");
                            continue; // Restart the loop
                        }
                        result = num1 / num2;
                        break;
                    case '%':
                        result = num1 % num2;
                        break;
                    default:
                        // Should not reach here
                        break;
                }
                // Output the result
                System.out.println("Answer is: " + result);
            } else {
                System.out.println("Invalid Operator. Please enter a valid operator.");
            }

            System.out.println("----------------------------");
        }

        // Close the scanner to free up resources
        input.close();
    }
}
