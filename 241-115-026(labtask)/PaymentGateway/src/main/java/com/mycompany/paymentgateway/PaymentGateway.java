/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentgateway;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;


 interface Payment{
     void pay(double amount) throws Exception;
 }


//custom excep..

class IllegalException extends Exception{
    
    public IllegalException(String message)
    {
        super(message);
    }
    
}




public class PaymentGateway {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Choose:  1.Credit card payment  2.wallet payment");
        System.out.println("Enter 1 or 2");
        
        int choice=sc.nextInt();
        
      
        
        Payment p;
        
        if(choice==1)
        {
            p=new CreditCardPayment(50000);
        }
        
        else if(choice==2)
        {
            p=new MobileWalletPayment(7000);
        }
        else{
            System.out.println("Invalid choice");
            return;
        }
        
        
         System.out.println("Enter amount:");
        double amount=sc.nextDouble();
        
        try{
            p.pay(amount);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IllegalException e)
        {
            
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            
            System.out.println("Error!!");
        }
        
        sc.close();
        
        
    }
}
