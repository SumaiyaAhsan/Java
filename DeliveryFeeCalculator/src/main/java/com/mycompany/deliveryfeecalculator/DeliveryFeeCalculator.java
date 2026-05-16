/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliveryfeecalculator;

/**
 *
 * @author tamanna
 */

import java.util.Scanner;

// ================= Interface =================
interface Delivery {
    double calculateFee(double distance) throws Exception;
}

// ================= Custom Exception =================
class ExpressDeliveryException extends Exception {
    public ExpressDeliveryException(String message) {
        super(message);
    }
}

// ================= Standard Delivery =================
// Uses predefined exception: IllegalArgumentException
class StandardDelivery implements Delivery {
    private double fee;
    
    public StandardDelivery(double fee)
    {
        this.fee=fee;
    }

    @Override
    public double calculateFee(double distance) throws Exception {

        if (distance < 0) {
            throw new IllegalArgumentException("Distance cannot be negative.");
        }

        fee=distance*10;
         System.out.println("Delivery Fee: " + fee);
        return fee;
    }
}

// ================= Express Delivery =================
// Uses custom exception: ExpressDeliveryException
class ExpressDelivery implements Delivery {
    
    private double fee;
    public ExpressDelivery(double fee)
    {
        this.fee=fee;
    }

    @Override
    public double calculateFee(double distance) throws Exception {

        if (distance > 50) {
            throw new ExpressDeliveryException("Express delivery not allowed above 50 km.");
        }
        
        fee=distance*20;
        
       System.out.println("Delivery Fee: " + fee);
        return fee;
    }
}

// ================= Main Class =================
public class DeliveryFeeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Delivery Type:");
        System.out.println("1. Standard Delivery");
        System.out.println("2. Express Delivery");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

         Delivery d;

        if (choice == 1) {
            d = new StandardDelivery(0.0);
        } else if (choice == 2) {
            d= new ExpressDelivery(0.0);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        


        try {
            d.calculateFee(distance);
           

        } catch (IllegalArgumentException e) {
            System.out.println("Error (Predefined Exception): " + e.getMessage());

        } catch (ExpressDeliveryException e) {
            System.out.println("Error (Custom Exception): " + e.getMessage());

        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        sc.close();
    }
}

