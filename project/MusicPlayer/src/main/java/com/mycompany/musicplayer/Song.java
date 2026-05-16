/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicplayer;

/**
 *
 * @author tamanna
 */
public class Song {
    private String title;
    private String mood;
    private String url;

    public Song(String title, String mood, String url) {
        this.title = title;
        this.mood = mood;
        this.url = url;
    }

    public String getTitle() { return title; }
    public String getMood() { return mood; }
    public String getUrl() { return url; }

    @Override
    public String toString() {
        return title + " (" + mood + ")";
    }
}
