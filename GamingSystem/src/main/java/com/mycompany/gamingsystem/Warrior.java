/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gamingsystem;

/**
 *
 * @author tamanna
 */
public class Warrior extends GameCharacter {
    
    public Warrior (String name,int level,int experience)
    {
        super(name,level,experience);
    }
    
    @Override
    public void attack()
    {
        System.out.println(name+" attacks fiercely with a sword!");
        gainExperience(40);
        System.out.println("Experience gained: "+experience);
        
    }
    
    public void defend()
    {
        System.out.println("\t"+name+" defends with a shield!");
    }
    
    @Override
    public void gainExperience(int points)
    {
        if(experience>=100)
        {
            level++;
            experience-=points;
            
           System.out.println("\tLevel up!"+name+" reached Level "+level);
        }
        else{
            experience+=points;
        }
        
    }
    
    
}
