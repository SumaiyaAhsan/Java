/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentgateway;

/**
 *
 * @author tamanna
 */
public class MobileWalletPayment implements Payment {
    
    private double wallet_amount;
    
    public MobileWalletPayment(double wallet_amount )
    {
          this.wallet_amount=wallet_amount;
    }
    
    @Override
    
    public void pay(double amount) throws IllegalException{
        
        if(amount<=0)
        {
            throw new  IllegalException("amount must be greater then zero!!");
        }
        else if(amount>wallet_amount)
        {
            throw new IllegalException("limit exceeded!!");
        }
        
        wallet_amount=wallet_amount-amount;
        
        System.out.println("payment successful:"+amount+"remaining amount"+wallet_amount);
        
        
    }
   
        
    
    
}
