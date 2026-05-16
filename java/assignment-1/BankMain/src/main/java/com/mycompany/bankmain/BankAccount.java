/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankmain;

/**
 *
 * @author tamanna
 */
public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    static int totalAccounts;
    static double totalBankBalance=0.0;
    
    
    //constructor...
    
    public BankAccount(int accountNumber,String accountHolder,double initialBalance)
    {
        
        this.accountNumber=accountNumber;
        this.accountHolder=accountHolder;
     
        
        if(initialBalance<500)
        {
            System.out.println("Initial deposit must be at least 500. Setting balance to 500.");
            balance=500;
            
        }
        else{
            balance=initialBalance;
        }
        totalAccounts++;
        totalBankBalance=totalBankBalance+balance; 
        
        
    }
    
    //setter getter....
    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    //Transaction method....
    
    public double deposit(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid!"+accountNumber+"Your amount must be positive.");
        }
        else{
            balance=balance+amount;
            System.out.println("Deposited: "+amount+". New balance: "+balance);
        }
        
        return balance;
    }
    
    public double withdraw(double amount)
    {
         if(balance-amount>=500)
         {
             balance=balance-amount;
             totalBankBalance=totalBankBalance-amount;
             System.out.println("Withdrawn: "+amount+". New balance: "+balance);
             
         }
         else{
             System.out.println("Insufficient balance! Minimum balance of 500 must be maintained.");
         }
         return balance;
        
    }
    
    //Static Methods...
    
    public static int getTotalAccounts()
    {
        return totalAccounts;  
        
    }
    
    public static double getTotalBankBalance()
    {
        return totalBankBalance; 
        
    }
    
    
}
