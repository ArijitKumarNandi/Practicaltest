package arijit;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1/2/3/4/5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            switch (choice) {
                case 1:
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;
                case 2:
                    int difference = num1 - num2;
                    System.out.println("Result: " + difference);
                    break;
                case 3:
                    int product = num1 * num2;
                    System.out.println("Result: " + product);
                    break;
                case 4:
                    if (num2 != 0) {
                        double quotient = (double) num1 / num2;
                        System.out.println("Result: " + quotient);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}

