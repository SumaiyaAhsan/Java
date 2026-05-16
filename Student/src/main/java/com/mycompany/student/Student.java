/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author tamanna
 */
public class Student {

    
    String name;
    int id;
    public Student(String name,int id)
    {
        this.name=name;
        this.id=id;
        
    }
    
 public String toString()
  {
      return name;
   }
 
 public int hashcode()
  {
      return id;
   }
    
   public static void main(String[] args)
   {
       Student s1=new Student("musu",26);
       System.out.println(s1);
       System.out.println(s1.hashcode());                        //if toString() didn't call then..... default method will auto call by Student class...
   }
   
}
