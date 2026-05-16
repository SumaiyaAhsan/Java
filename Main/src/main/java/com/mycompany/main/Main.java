/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author tamanna
 */
class Student{
    int id;
    String name;
    public Student(int id,String name)
    {
        this.name=name;
        this.id=id;
        
    }
}
public class Main {

    public static void main(String[] args) {
        
        Student s=new Student(26,"tamanna");
        System.out.println(s.id);
        System.out.println(s.name);
                
        
       
    }
}
