package com.roman;
import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, convertedAmount;
        String fromCurrency, toCurrency;

        System.out.print("Enter the amount: ");
        amount = input.nextDouble();

        System.out.print("Enter the currency you want to convert from (USD, EUR, GBP, JPY, AUD, CAD, CHF): ");
        fromCurrency = input.next();

        System.out.print("Enter the currency you want to convert to (USD, EUR, GBP, JPY, AUD, CAD, CHF): ");
        toCurrency = input.next();

        convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);

        System.out.printf("%.2f %s is equivalent to %.2f %s", amount, fromCurrency, convertedAmount, toCurrency);
    }

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double rate = 0;

        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            rate = 0.85;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("GBP")) {
            rate = 0.72;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("JPY")) {
            rate = 109.43;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("AUD")) {
            rate = 1.30;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("CAD")) {
            rate = 1.21;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("CHF")) {
            rate = 0.92;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            rate = 1.18;
        } else if (fromCurrency.equals("GBP") && toCurrency.equals("USD")) {
            rate = 1.39;
        } else if (fromCurrency.equals("JPY") && toCurrency.equals("USD")) {
            rate = 0.0091;
        } else if (fromCurrency.equals("AUD") && toCurrency.equals("USD")) {
            rate = 0.77;
        } else if (fromCurrency.equals("CAD") && toCurrency.equals("USD")) {
            rate = 0.83;
        } else if (fromCurrency.equals("CHF") && toCurrency.equals("USD")) {
            rate = 1.09;
        } else if (fromCurrency.equals(toCurrency)) {
            rate = 1;
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        return amount * rate;
    }
}
