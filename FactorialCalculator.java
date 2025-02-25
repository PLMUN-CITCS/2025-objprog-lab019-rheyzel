import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer input from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;

        // Continuously prompt until a valid non-negative integer is entered
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            
            // Check if the input is a valid integer
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                // Ensure the number is non-negative
                if (number >= 0) {
                    break;  // Exit the loop if input is valid
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid non-negative integer.");
                scanner.next(); // Discard the invalid input
            }
        }

        return number;  // Return the valid input
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;

        // Handle the base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        // Loop to calculate factorial for n > 0
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        // Get a valid non-negative integer from the user
        int number = getNonNegativeInteger();
        
        // Calculate the factorial of the number
        long factorial = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}

