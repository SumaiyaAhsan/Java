/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentgate;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;


interface Payment {
    void pay(double amount) throws Exception;
}


//custom
class InvalidWalletException extends Exception {
    public InvalidWalletException(String msg) {
        super(msg);
    }
}


class WalletPayment implements Payment {
    private double walletBalance;

    public WalletPayment(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    @Override
    public void pay(double amount) throws InvalidWalletException {
        if (amount <= 0) {
            throw new InvalidWalletException("Amount must be greater than zero!");
        }
        if (amount > walletBalance) {
            throw new InvalidWalletException("Insufficient wallet balance!");
        }
        walletBalance -= amount;
        System.out.println("Mobile Wallet Payment Successful: " + amount +
                ". Remaining balance: " + walletBalance);
    }
}



class CreditCardPayment implements Payment {
    private double creditLimit;

    public CreditCardPayment(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void pay(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        }
        if (amount > creditLimit) {
            throw new IllegalArgumentException("Amount exceeds credit card limit!");
        }
        System.out.println("Credit Card Payment Successful: " + amount);
    }
}



public class PaymentGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Payment Gateway Simulation!");
        System.out.println("Choose a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Mobile Wallet");
        System.out.print("Enter 1 or 2: ");

        int choice = sc.nextInt();
        Payment payment;

        if (choice == 1) {
            payment = new CreditCardPayment(7000); 
        } else if (choice == 2) {
            payment = new WalletPayment(4000); 
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        System.out.print("Enter the amount to pay: ");
        double amount = sc.nextDouble();

        try {
            payment.pay(amount); 
        } catch (IllegalArgumentException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } catch (InvalidWalletException e) {
            System.out.println("Payment failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Payment failed due to an unexpected error: " + e.getMessage());
        }

        sc.close();
    }
}