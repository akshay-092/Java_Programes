package Basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                double ans = 0;
                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    // Check for division by zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                        continue; // Restart the loop
                    }
                    ans = num1 / num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                }
                // Output the result
                System.out.println("Answer is: " + ans);
            } else {
                System.out.println("Invalid Operator. Please enter a valid operator.");
            }

            System.out.println("----------------------------");
        }

        // Close the scanner to free up resources
        input.close();
    }
}
