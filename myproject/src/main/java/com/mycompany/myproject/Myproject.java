/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myproject;

/**
 *
 * @author tamanna
 */
public class Myproject {
    private String name;
    private int age;
    public Myproject()
    {
        this.name="unknown";
        this.age=0;
    }
    public String getname()
    {
        return name;
    }
     public int getage()
    {
        return age;
    }


    public static void main(String[] args) {
        Myproject cat=new Myproject();
        
        System.out.println(cat.getname());
          System.out.println(cat.getage());
    }
}
