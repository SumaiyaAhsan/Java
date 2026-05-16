/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parametercostructor;

/**
 *
 * @author tamanna
 */
public class ParameterCostructor {

    private String name;
    private String colour;
     public ParameterCostructor(String name, String colour)
     {
         this.name=name;
         this.colour=colour;
     }
    
     public String getname()
     {
         return name;
     }
     public String getcolour()
     {
         return colour;
     }
    public static void main(String[] args) {
        ParameterCostructor p1=new ParameterCostructor("minni","white");
        System.out.println("Pet:"+p1.getname());
        
           System.out.println("Colour:"+p1.getcolour());
    }
}
