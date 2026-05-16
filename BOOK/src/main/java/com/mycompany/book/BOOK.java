/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;
public class BOOK {
    
    
    private String name;

    private String author;
    private int year;
    
    private double price;
    
    public BOOK(String name,String author,int year,double price)
    {
        
        this.name=name;
        this.author=author;
        this.year= year;
        
        if(price>=200)
        {
           this.price=price; 
        }
        else
        {
           System.out.println("invalid!!!");
            
        }
    }
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
     public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        if(price>=200)
        {
           this.price=price; 
        }
        else
        {
            System.out.println("invalid!!!");
            
        }
       
    }

    public double getPrice() {
        return price;
    }
    
    

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Book name:");
        String name=sc.nextLine();
        System.out.println("Author name:");
        String author=sc.nextLine();
        System.out.println("year:");
        int year=sc.nextInt();
        System.out.println("Price:");
        double price=sc.nextDouble();
        
        
        BOOK b1=new BOOK(name,author,year,price);
        
        System.out.println("Name:"+b1.getName());
        System.out.println("Author:"+b1.getAuthor());
        System.out.println("Price:"+b1.getPrice());
        
    }
}
