/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accounts;

/**
 *
 * @author tamanna
 */
public class Student {
    private int studentId;
    private String name;
    private String dept;
    private double baseMarks;
    
    final String INSTITUTE_NAME="TechNova Institute of Technology";
    static double totalStudents=0.0;
    
    //constructor.....
    public Student(int studentId,String name,String dept,double baseMarks)
    {
        this.studentId=studentId;
        this.dept=dept;
       
        if(name.isEmpty())
        {
            System.out.println("Invalid");
        }
        else{
            this.name=name;
            
        }
        
        if(baseMarks < 40)
        {
            System.out.println("hehehehe");

           baseMarks=40; 
        }
        else{
            this.baseMarks=baseMarks;
            
        }
        totalStudents++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty())
        {
            System.out.println("Invalid");
        }
        else{
            this.name=name;
            
        }
       
    }

    public int getStudentId() {
        return studentId;
    }


    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getBaseMarks() {
        return baseMarks;
    }

    public void setBaseMarks(double baseMarks) {
         if(baseMarks < 40)
        {
            System.out.println("hehehehe");
           baseMarks=40; 
        }
        else{
            this.baseMarks=baseMarks;
            
        }
    }
    
    public double calculateMarks()
    {
        return baseMarks;
    }
    
    public static double getTotalStudents()
    {
        return totalStudents;
    }
    
    public final void displayInstituteName()
    {
       
       System.out.println("Inistitute name is:"+INSTITUTE_NAME);
    }
    
  
}


//subclass...
class Under_graduate extends Student{
    
    double internshipBonus;
     
     public Under_graduate(int studentId,String name,String dept,double baseMarks,double internshipBonus)
     {
         super(studentId,name,dept,baseMarks);
         this.internshipBonus=internshipBonus;
     }
     
     @Override
     public double calculateMarks()
    {
        return getBaseMarks()+internshipBonus;
    }
     
}

class Graduate extends Student{
    
    double researchBonus;
    public Graduate (int studentId,String name,String dept,double baseMarks,double researchBonus)
    {
        super(studentId,name,dept,baseMarks);
        this.researchBonus=researchBonus;
    }
    
    @Override
     public double calculateMarks()
    {
        return getBaseMarks()+researchBonus;
    }
            
}
