/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resultprocessingsystem;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;
public class ResultProcessingSystem {
    
    
    
   public static double calculateAverage(int[] marks) throws InvalidScoreException
   {
       for(int i=0;i<3;i++)
       {
           if(marks[i]<0 ||marks[i]>100)
           {
               throw new InvalidScoreException("Invalid mark entry ");
           }
       }
       
       double sum=0.0;
       for(int i=0;i<3;i++)
       {
           sum=sum+marks[i];
       }
       
       return sum/marks.length;
       
       
   }
  
       
   

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        
       try{
           
            System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("Enter subjects mark");
        
        int[] marks=new int[3];
        
        for(int i=0;i<3;i++)
        {
           String mark=sc.next();
            
            marks[i]=Integer.parseInt(mark);
        }
        
        double avg= calculateAverage(marks);
        
        
      System.out.println("Student name"+name);
      
      System.out.println("Marks:");
      
        for(int i=0;i<3;i++)
        {
           System.out.println("Subject "+ i+1 + marks[i]);
        }
      
        System.out.println("Average:"+avg);
       }
       
       catch(NumberFormatException e)
       {
           System.out.println("Invalid input");
       }
       catch(ArithmeticException e)
               {
           
            System.out.println("invalid!!!");
       }
       catch(ArrayIndexOutOfBoundsException e)
               {
                   
                   System.out.println("invalid index");
               }
       catch(InvalidScoreException e)
       {
           System.out.println("Error"+e.getMessage());
           
       }
       catch(Exception e)
       {
           System.out.println("Error!!!");
       }
       
       sc.close();
        
        

    }
}
