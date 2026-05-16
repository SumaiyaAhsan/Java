/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;

/**
 *
 * @author tamanna
 */
public class Account {
    
      public String accountNumber;
      public double balance;
     
      public Account(String accountNumber,double balance)
      {
          
          if(accountNumber==null || accountNumber.isEmpty() )
          {
              System.out.println("Error: Account number cannot be null or empty.");
              
             
          }
          else
          {
              this.accountNumber=accountNumber;
          }
          
          if(balance<0)
          {
             System.out.println("Error: Balance cannot be negative.");
            
          }
          else{
         this.balance=balance;}
      }

    public static void main(String[] args) {
        Account a1=new Account("01374468",500000000);
         Account a2=new Account("",-400.0);
        
        
        System.out.println("Account Number:"+a1.accountNumber);
        System.out.println("Balance:"+a1.balance);
        System.out.println("Account Number:"+a2.accountNumber);
        System.out.println("Balance:"+a2.balance);
    }
   
}
