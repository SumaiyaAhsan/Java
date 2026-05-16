/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.useofsuper;

/**
 *
 * @author tamanna
 */

class Person {
    public Person()
    {
        System.out.println("Person class Constructor");
    }
}

// subclass Student extending the Person class
class Student extends Person {
    public Student()
    {
        // invoke or call parent class constructor
        super();
        System.out.println("Student class Constructor");
        
    }
}

public class UseOfSuper {

    public static void main(String[] args) {
       
        Student s1=new Student();
        
    }
}
