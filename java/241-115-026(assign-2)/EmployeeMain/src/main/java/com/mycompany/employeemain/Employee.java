/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeemain;

/**
 *
 * @author tamanna
 *
 */



public class Employee {
    private int empId;
    private String name;
    private double basicSalary;
    final static String COMPANY_NAME="TechNova Pvt. Ltd.";
    static int totalEmployees=0;
    
    //costructor...
    
    public Employee(int empId,String name,double salary)
    {
        this.empId=empId;
        
        
        
        
       if(name.isEmpty())
         {
             System.out.println("\nInvalid... Name not updated."); 
         }
         else
       {
       this.name=name;
       }
          
       
       
        if(salary<10000)
        {
            System.out.println("Invalid salary! Setting basic salary to 10000.0");
           
            basicSalary=10000;
        }
        else{
             basicSalary=salary;
        }
        
        
        
        totalEmployees++;
        
        
    }
    
    //method.....
    
    public double calculateSalary(){
        
        return basicSalary;
    }
    
    //setter getter.....
    
    public void setName(String name)
    {
        if(name==null)
         {
             System.out.println("Invalid...Enter name"); 
         }
         else{
       this.name=name;
       }
    }
    public String getName()
    {
        return name;
    }
    public void setBasicSalary(double salary)
    {
         if(salary<10000)
        {
            System.out.println("Invalid salary! Setting basic salary to 10000.0");
           
            basicSalary=10000;
            
            
        }
        else
         {
             basicSalary=salary;
       
         }
    
    }
    
    public double getBasicSalary()
    {
        return basicSalary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    

    public int getEmpId() {
        return empId;
    }
    
    
    
    //static method...
    public static int getTotalEmployees()
    {
        return totalEmployees;
    }
    
    //method using final key...
    public final void displayCompanyName() {
        System.out.println("Employee created at"+COMPANY_NAME);
    }
    
    
}


//subclass....

class Manager extends Employee{
    
    private double performanceBonus;
    
    public Manager(int empId,String name,double basicSalary,double performanceBonus){
        super(empId,name,basicSalary);
        this.performanceBonus=performanceBonus; 
        
    }
    
    @Override
    public double calculateSalary()
    {
        return getBasicSalary()+performanceBonus;
    }
    
    

}

class Developer extends Employee{
    
    private double projectAllowance;
    
    public Developer(int empId,String name,double basicSalary,double projectAllowance){
        super(empId,name,basicSalary);
        this.projectAllowance=projectAllowance; 
        
    }
    
    @Override
    public double calculateSalary()
    {
        return getBasicSalary()+projectAllowance;
    }
    
    

}