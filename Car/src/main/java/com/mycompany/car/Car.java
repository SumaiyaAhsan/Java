/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.car;

/**
 *
 * @author tamanna
 */
public class Car {

    private String make;
    private String model;
    private int year;
    public Car()
    {
        this.make="Unknown";
         this.model="Unknown";
         this.year=0;
        
    }
    
    public Car(String make,String model,int year)
    {
         this.make=make;
         this.model=model;
         this.year=year;
         
    }
    public static void main(String[] args) {
        
        Car c1=new Car("Honda","uk",2021);
        
        System.out.println("Car 1:"+c1.make);
        System.out.println("Car 1:"+c1.model);
        System.out.println("Car 1:"+c1.year);
        
        Car c2=new Car();
        
        System.out.println("Car 2:"+c2.make);
        System.out.println("Car 2:"+c2.model);
        System.out.println("Car 2:"+c2.year);
        
        
    }
}
