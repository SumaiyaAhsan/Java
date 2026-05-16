/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentgateway;

/**
 *
 * @author tamanna
 */
public class CreditCardPayment implements Payment{
    
    private double card_amount;
    
    public CreditCardPayment(double card_amount)
    {
        this.card_amount=card_amount;
    }
    
    @Override
    
   public void pay(double amount) throws IllegalArgumentException{
       
       if(amount<=100)
       {
           throw new IllegalArgumentException("amount must be greater then 100");
       }
       else if(amount>card_amount)
       {
          throw new IllegalArgumentException("limit exceeded!!"); 
       }
       
       
       System.out.println("Payment successful. Payment amount:"+ amount);
   }
    
}
