/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingsystem;

/**
 *
 * @author tamanna
 */

 abstract class GameCharacter implements CharacterActions
{
    protected String name;
    protected int level;
    protected int experience;
    
    public GameCharacter(String name,int level,int experience)
    {
        this.experience=experience;
        this.level=level;
        this.name=name;
    }
     public void showStats()
     {
         System.out.println("Character Created:"+name+"\n"+"Level:"+level+"| Experience:"+experience);
     }
}

 

//main
public class GamingSystem {

    public static void main(String[] args) {
        
        
        Warrior w=new Warrior("xiju",1,0);
        w.showStats();
        w.attack();
        w.defend();
        w.attack();
        w.attack();
        w.defend();
        w.attack();
        
        
        
        
    }
}
