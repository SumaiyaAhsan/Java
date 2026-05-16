/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accounts;

/**
 *
 * @author tamanna
 */
import java.util.Scanner;

public class StudentMain {
    

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
         Student[] stu=new Student[3];//array
    
        System.out.println("Under Graduate student:");
        System.out.println("student id:");
        int u_id=sc.nextInt();
        sc.nextLine();
        System.out.println("student name:");
        String u_name=sc.nextLine();
        System.out.println("student dept:");
        String u_dept=sc.nextLine();
        System.out.println("Marks");
        double u_mark=sc.nextDouble();
        System.out.println("internshipBonus:");
        double internship=sc.nextDouble();
        
        
        
        System.out.println("Graduate student:");
        System.out.println("student id:");
        int g_id=sc.nextInt();
        sc.nextLine();
        System.out.println("student name:");
        String g_name=sc.nextLine();
        System.out.println("student dept:");
        String g_dept=sc.nextLine();
        System.out.println("Marks");
        double g_mark=sc.nextDouble();
        System.out.println("researchBonus:");
        double researchBonus=sc.nextDouble();
        
        System.out.println("student:");
        System.out.println("student id:");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("student name:");
        String name=sc.nextLine();
        System.out.println("student dept:");
        String dept=sc.nextLine();
        System.out.println("Marks");
        double mark=sc.nextDouble();
        
        Student a=new Student(id,name,dept,mark);
        Student b=new Under_graduate(u_id,u_name,u_dept,u_mark,internship);
        Student c=new Graduate(g_id,g_name,g_dept,g_mark,researchBonus);
        
        stu[0]=b;
        stu[1]=c;
        stu[2]=a;
        
        a.displayInstituteName();
        for(int i=0;i<3;i++)
        {
            System.out.println("Id:"+stu[i].getStudentId()+"  Name:"+stu[i].getName()+"  Dept:"+stu[i].getDept()+"  Total mark:"+stu[i].calculateMarks());
        }
        
        System.out.println("Total student:"+Student.getTotalStudents());
        
        
    }
}
