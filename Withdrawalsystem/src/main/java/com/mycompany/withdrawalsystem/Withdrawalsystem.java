/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.withdrawalsystem;

/**
 *
 * @author tamanna
 */

import java.util.Scanner;
public class Withdrawalsystem {
    
    
    public static void withdraw(double balance,double amount) throws InsufficientBalanceException
    {
        if(amount>balance)
        {
            throw new InsufficientBalanceException("Error! amount must be less than balance");
        }
        if(amount<=0) 
        {
            throw new ArithmeticException("Error.");
        }
        
        balance-=amount;
        
        System.out.println("Withdrawal successful."+"\n"+"Remaining balance:"+balance);
            
        
    }
    
   

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        try
        {
            
         System.out.println("Enter balance:");
         String b=sc.next();
         double balance=Double.parseDouble(b);
        
        System.out.println("Enter withdrawal amount:");
        String a=sc.next();
        double amount=Double.parseDouble(a);
        
         withdraw(balance,amount);
        
        
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid amount");
        }
        catch(ArithmeticException e)
        {
             System.out.println(e.getMessage());

        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        
        sc.close();
            
        
        }
        
}
