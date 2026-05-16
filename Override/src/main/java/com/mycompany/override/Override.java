/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.override;

/**
 *
 * @author tamanna
 */

class Parent{
    public void print() 
    {
        System.out.println("Parent class");
    }
}
class Father  extends Parent{
    //@Override
    
    public void print()
            
    {
        System.out.println("Bujiii");
    }
    
}
class Mother  extends Parent{
    
    public void print()
    {
        System.out.println("Ommaaaa");
    }
    
}

public class Override {

    public static void main(String[] args) {
        
        Parent a;
        a=new Parent();
        a.print();
        a=new Father();//dynamic dispatch
        a.print();
        a=new Mother();
        a.print();}
}
