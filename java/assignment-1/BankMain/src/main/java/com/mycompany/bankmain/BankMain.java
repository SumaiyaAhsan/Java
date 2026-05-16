/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankmain;

/**
 *
 * @author tamanna
 */
public class BankMain {

    public static void main(String[] args) {
        BankAccount b1=new BankAccount(111," xiju ",10000.00);
        BankAccount b2=new BankAccount(222," ori ",3000.00);
        BankAccount b3=new BankAccount(333," piko ",300.00);
        
        b1.deposit(700);
        b2.withdraw(1000);
        b3.withdraw(300);
        
        System.out.println("Account Details:");
        
        System.out.println("Account Holder 1:"+b1.getAccountHolder()+",(Account Number:"+b1.getAccountNumber()+"),Total balance:"+b1.getBalance());
        System.out.println("Account Holder 2:"+b2.getAccountHolder()+" ,(Account Number:"+b2.getAccountNumber()+"),Total balance:"+b2.getBalance());
        System.out.println("Account Holder 3:"+b3.getAccountHolder()+",(Account Number:"+b3.getAccountNumber()+"),Total balance:"+b3.getBalance());
        
        System.out.println("Total bank accounts:"+BankAccount.getTotalAccounts());
        System.out.println("Total bank balance:"+BankAccount.getTotalBankBalance());
    }
}
