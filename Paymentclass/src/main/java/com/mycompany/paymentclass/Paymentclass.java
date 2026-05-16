/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentclass;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;
interface Payment{
    void pay(double amount) throws Exception;
}
class Invalidwalletexception extends Exception{
    Invalidwalletexception(String msg)
    {
        super(msg);
    }
}
class WalletPayment implements Payment{
   private double walletbalance;
   public WalletPayment(double walletbalance)
   {
       this.walletbalance=walletbalance;
   }
      @Override
  public void pay(double amount) throws Invalidwalletexception{
      if(amount<=0){
          throw new Invalidwalletexception("Amount must be greater than zero");
      }
      if(amount>walletbalance){
          throw new Invalidwalletexception("Amount must be greater than or equal Wallet Balance");
      }
      walletbalance-=amount;
      System.out.println("Mobile Wallet Payment"+amount+"Successful.Remaining Balance:"+ walletbalance);
  }
  
}
class Cardpayment implements Payment{
    private double cardballance;
    public Cardpayment(double cardballance){
        this.cardballance=cardballance;
    }
    @Override
    public void pay(double amount) throws IllegalArgumentException{
        if(amount<=0)
        {
            throw new IllegalArgumentException ("Amount must be greater than zero");
        }
        if(amount>cardballance)
        {
            throw new IllegalArgumentException ("Card limit exceed");
        }
         System.out.println("Credit Card Payment"+amount+"Successful");
    }
}
public class PaymentGatewaySimulation {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to payment gateway simulation");
        System.out.println("How would you like to pay?");
        System.out.println("1 for Credit Card");
        System.out.println("2 for Mobile Wallet Balance");
        System.out.println("Enter 1 or 2");
        int choice=sc.nextInt();
        Payment p;
        if(choice==1)
        {
            p=new Cardpayment(7000);
        }
        else if(choice==2)
        {
            p=new WalletPayment(4000);
        }
        else
        {
            System.out.println("Invalid exit..");
        sc.close();
        return;
        }
        System.out.println("Enter the amount to Pay: ");
        double amount=sc.nextDouble();
        try{
            p.pay(amount);
        }
        catch(Invalidwalletexception e){
            System.out.println("Payment failed:"+e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
             System.out.println("Payment failed:"+e.getMessage());
        }
          catch(Exception e)
        {
             System.out.println("Payment failed due to an unexpected error:"+e.getMessage());
        }  
        sc.close();
    
    }
}
