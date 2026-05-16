/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicplayer;

/**
 *
 * @author tamanna
 */
import java.util.*;

public class RecommendationEngine {

    public List<Song> getSongsByMood(Mood mood) {
        List<Song> moodSongs = new ArrayList<>();

        switch (mood) {
            case HAPPY:
                moodSongs.add(new Song("Happy Vibes", "HAPPY", "https://www.youtube.com/watch?v=ZbZSe6N_BXs"));
                break;

            case SAD:
                moodSongs.add(new Song("Sad Melodies", "SAD", "https://www.youtube.com/watch?v=hoNb6HuNmU0"));
                break;

            case ENERGETIC:
                moodSongs.add(new Song("Energy Booster", "ENERGETIC", "https://www.youtube.com/watch?v=Uj1ykZWtPYI"));
                break;

            case STUDY_MODE:
                moodSongs.add(new Song("Study Calm Focus", "STUDY_MODE", "https://www.youtube.com/watch?v=1ZYbU82GVz4"));
                break;
        }
        return moodSongs;
    }

    public List<Song> getPersonalPlaylist(String name) {
        List<Song> list = new ArrayList<>();

        if (name.equals("Tasmi's Playlist")) {
            list.add(new Song("Tasmi Calm", "CALM", "https://www.youtube.com/watch?v=1ZYbU82GVz4"));
        } 
        else if (name.equals("Tamanna's Playlist")) {
            list.add(new Song("Tamanna Happy Pop", "HAPPY", "https://www.youtube.com/watch?v=ZbZSe6N_BXs"));
        } 
        else if (name.equals("Tuli's Playlist")) {
            list.add(new Song("Tuli Energy", "ENERGETIC", "https://www.youtube.com/watch?v=Uj1ykZWtPYI"));
        }

        return list;
    }
}
