/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book;

/**
 *
 * @author tamanna
 */
public class Book {

    
    private String title;
    private String author;
    private double price;
    
    
    public Book()
    {
       this.author="unknown";
        this.title="unknown";
        this.price=0.0; 
    }
    public Book(String title,String author){
        this.author=author;
        this.title=title;
        
    }
    public  Book(String title,String author,double price){
        this.author=author;
        this.title=title;
        this.price=price;
        
    }

    
    public static void main(String[] args) {
        
        Book b1=new Book();
        System.out.println("Book 1:"+b1.title);
        System.out.println("Book 1:"+b1.author);
        System.out.println("Book 1:"+b1.price);
        
        Book b2=new Book("You've reached sam","Dustin thao");
        System.out.println("Book 2:"+b2.title);
        System.out.println("Book 2:"+b2.author);
        System.out.println("Book 2:"+b2.price);
        
        Book b3=new Book("I hope this doesn't find you","Dustin thao",300.00);
        System.out.println("Book 3:"+b3.title);
        System.out.println("Book 3:"+b3.author);
        System.out.println("Book 3:"+b3.price);
    }
}
