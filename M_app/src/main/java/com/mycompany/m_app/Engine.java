/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.m_app;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tamanna
 */
public class Engine {
    
    private List<Song>songlist;
    
    public Engine()
    {
        List<Song> songlist=new ArrayList<>();
        loadsong();
        
    }
    
    private void loadsong(){
        
        songlist.add(new Song("Happy Pop-Tunes", "HAPPY", "https://youtu.be/uXJ62nB3-ZQ?si=yNjn7-XS09YCTKkX"));
        songlist.add(new Song("When I'm Gone", "SAD", "https://youtu.be/pWcFqsZe2ws?si=UPUaz2izt2htzlS6"));
        songlist.add(new Song("Everything Has Beauty", "INSPIRATIONAL", "https://youtu.be/5zaSqWfBA8s?si=294jD982E-GHau3o"));
        songlist.add(new Song("Everything Has Beauty", "Study", "https://youtu.be/5zaSqWfBA8s?si=294jD982E-GHau3o"));
        
        
    }
    
    public List<Song> MoodwiseSong(String mood)
    {
         List<Song> result=new ArrayList<>();
         for(Song s: songlist)
         {
             if(s.getMood().equalsIgnoreCase(mood))
             {
                 result.add(s);
             }
         }
         
         return result;
    }
    
}
