/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeemain;

/**
 *
 * @author tamanna
 */

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        Employee[] emp=new Employee[3];
        
        
        //manager input....
        System.out.println("Manager ID:");
        int m_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Manager name:");
        String m_name=sc.nextLine();
        System.out.println("Salary:");
        double m_salary=sc.nextDouble();
        System.out.println("Bonus:");
        double m_bonus=sc.nextDouble();
        
        
        //developer...
        System.out.println("Developer ID:");
        int d_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Manager name:");
        String d_name=sc.nextLine();
        System.out.println("Salary:");
        double d_salary=sc.nextDouble();
        System.out.println("Allowance:");
        double d_allowance=sc.nextDouble();
        
        //employee...
        System.out.println("Employee ID:");
        int e_id=sc.nextInt();
        sc.nextLine();
        System.out.println("Employee name:");
        String e_name=sc.nextLine();
        System.out.println("Salary:");
        double e_salary=sc.nextDouble();
        
        
        
        Employee M=new Manager(m_id,m_name,m_salary,m_bonus);
        Employee D=new Developer(d_id,d_name,d_salary,d_allowance);
        Employee E=new Employee(e_id,e_name,e_salary);
        
        emp[0]=M;
        emp[1]=D;
        emp[2]=E;
        
        M.displayCompanyName();
        System.out.println("\n");
        System.out.println("Manager Salary Calculated: "+M.calculateSalary());
        System.out.println("\n");
        System.out.println("Developer Salary Calculated: "+D.calculateSalary());
        System.out.println("\n");
        
        System.out.println("Employee Details:");
        for(int i=0;i<3;i++)
        {
            System.out.println("ID:"+emp[i].getEmpId()+"| Name:"+emp[i].getName()+"| Company:"+emp[i].COMPANY_NAME+"| Salary:"+emp[i].calculateSalary());
        }
        System.out.println("\nTotal Employees:"+Employee.getTotalEmployees());
        
    }
}
