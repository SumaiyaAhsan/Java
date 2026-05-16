/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cat;

/**
 *
 * @author tamanna
 */
public class Cat {

    String name;
    String breed;
    int age;
    String color;
    
    public Cat(String name,String breed,int age,String color)
    {
        this.name=name;
        this.breed=breed;
        this.age=age;
        this.color=color;
    }
    
    public String getName()
    {
        return name;
    }
     public String getBreed()
    {
        return breed;
    }
      public int getAge()
    {
        return age;
    }
       public String getColor()
    {
        return color;
    }
       
       public String toString()
       {
           return ("Name:"+this.getName()+"\nBreed:"+this.getBreed()+"\nAge:"+getAge()+"\nColor:"+this.getColor());
       }
      
       public static void main(String[] args)
           {
               Cat c=new Cat("Minni","parsian",4,"White");
               System.out.println(c.toString());
           }
       
    
}
