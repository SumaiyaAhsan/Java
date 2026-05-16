/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author tamanna
 */

class Helper{
    //method overloading
    int M(int a,int b)
    {
        return a*b;
    }
    double M(double a,double b)
    {
        return a*b;
    }
}
class Helper_2 extends Helper{
    //method overriding
    int M(int a,int b)
    {
        return a+b;
    }
}
public class MAIN {

    public static void main(String[] args) {
        Helper obj;//dynamic dispatch
        obj=new Helper();
        System.out.println("Multiplication:"+obj.M(3,5));
        System.out.println("Multiplication:"+obj.M(3.5,5.5));
        obj=new Helper_2();
        System.out.println("Add:"+obj.M(3,5));
        
    }
}
