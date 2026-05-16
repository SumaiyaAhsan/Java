/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.software;

/**
 *
 * @author tamanna
 */
public class Software {

   private static String name;
   private static double version;
   
   public static void set(String n,double v)
   {
       name=n;
       version=v;
   }
   
   public static void get()
   {
       System.out.println("Name:"+name);
       System.out.println("Name:"+version);
   }
   
   public static void main(String[] args)
   {
       
       Software.set("Vs",11);
       Software.get();
   }
   
   
    
}
