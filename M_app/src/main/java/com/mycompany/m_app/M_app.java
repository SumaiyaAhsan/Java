/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.m_app;

/**
 *
 * @author tamanna
 */

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


class Song{
    
    
    private String name;
    private String mood;
    private String url;
    
    
    public Song(String name,String mood,String url)
    {
        this.name=name;
        this.mood=mood;
        this.url=url;
        
    }
    
    
    //getter...
    public String getName() {
        return name;
    }
    public String getMood() {
        return mood;
    }
     public String getUrl() {
        return url;
    }
     
     @Override
     public String toString()
     {
         return name;
     }
    
}






public class M_app extends JFrame{
    
    
    private JComboBox<String>boxmood;
    private JList<Song>songlist;
    private DefaultListModel<Song>song;
    private Engine e;
    private JPanel top,bottom;
    private JButton playbtn;
    private JScrollPane scroll;
    
    public M_app()
    {
        
        setTitle("Mood Music");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        e =new Engine();
        
        top=new JPanel();
        String mood[]={"happy","sad","inspire","study"};
        boxmood=new JComboBox<>(mood);
        top.add(boxmood);
        top.add(new JLabel("select mood"));
        
        
        JButton  moodbtn=new JButton("Find Songs");
        //moodbtn.addActionListener(e -> showMoodSongs());
        top.add(moodbtn);
        add(top,BorderLayout.NORTH);
        
        
       
        
        
    }
    
    
    
    
    
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
