import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu for the user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Please choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        // Validate the choice
        if (choice == 1) {
            // Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", celsius, fahrenheit);
        } else if (choice == 2) {
            // Convert Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", fahrenheit, celsius);
        } else {
            System.out.println("Invalid option. Please choose 1 or 2.");
        }

        scanner.close();
    }
}