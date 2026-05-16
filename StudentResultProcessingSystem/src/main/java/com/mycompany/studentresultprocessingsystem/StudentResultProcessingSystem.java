/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentresultprocessingsystem;

/**
 *
 * @author tamanna
 */
public class StudentResultProcessingSystem {
    
    
    public double calculateAverage(int[] marks) throws InvalidScoreException
    {
        
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<0 || marks[i]>100)
            {
                throw new InvalidScoreException(" marks should be between 0 to 100");
            }
        }
        
    }
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
