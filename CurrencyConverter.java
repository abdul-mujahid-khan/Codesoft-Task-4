import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Exchange rates (you can fetch real-time rates from an API)
        double usdToInr = 74.5; // Example: 1 USD = 74.5 INR
        double usdToEur = 0.85; // Example: 1 USD = 0.85 EUR

        System.out.println("Currency Converter");
        System.out.println("1. Convert from USD to INR");
        System.out.println("2. Convert from USD to EUR");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the amount in USD: $");
        double amountInUSD = scanner.nextDouble();

        double convertedAmount;
        String targetCurrencySymbol;
        scanner.close();
 
        if (choice == 1) {
            convertedAmount = amountInUSD * usdToInr;
            targetCurrencySymbol = "₹"; // Indian Rupee
        } else if (choice == 2) {
            convertedAmount = amountInUSD * usdToEur;
            targetCurrencySymbol = "€"; // Euro
        } else {
            System.out.println("Invalid choice. Please select 1 or 2.");
            return;
        }

        System.out.printf("Converted amount: %.2f %s%n", convertedAmount, targetCurrencySymbol);
    }
}

