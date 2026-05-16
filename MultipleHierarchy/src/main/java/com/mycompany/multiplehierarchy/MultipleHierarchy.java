/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplehierarchy;

/**
 *
 * @author tamanna
 */

interface Father{
    default void papa()
    {
        System.out.println("Bujiii");
    }
}
interface Mother{
    default void mom()
    {
        System.out.println("ommaaa");
    }
}
class Child implements Father,Mother{
     public void ChildInfo()
     {
         System.out.println("me");
     }
    
}
public class MultipleHierarchy  {

    public static void main(String[] args) {
        Child c1;
        c1=new Child();
        
        c1.papa();
        c1.mom();
        c1.ChildInfo();
        
    }
}
