package org.example;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // prompt user to choose currency conversion type
        System.out.println("Choose currency conversion type:");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR TO USD");
        System.out.println("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        double amount, convertedAmount;

        final double USD_TO_EUR_RATE = 0.85;
        final double EUR_TO_USD_RATE = 1.18;

        switch(choice){
            case 1:
            System.out.println("Enter amount in USD: ");
            amount = scanner.nextDouble();
            convertedAmount  = amount * USD_TO_EUR_RATE;
                System.out.println("Amount in EUR: " + convertedAmount);
                break;
            case 2:
                System.out.println("Enter amount in EUR: ");
                amount = scanner.nextDouble();
                convertedAmount  = amount * EUR_TO_USD_RATE;
                System.out.println("Amount in USD: " + convertedAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
