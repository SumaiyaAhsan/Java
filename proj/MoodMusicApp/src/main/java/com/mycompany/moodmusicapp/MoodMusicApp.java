/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moodmusicapp;

/**
 *
 * @author tamanna
 */
import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


//song....
class Song {
    private String name;
    private String mood;
    private String url;

    public Song(String name, String mood, String url) {
        this.name = name;
        this.mood = mood;
        this.url = url;
    }

    public String getName() { return name; }
    public String getMood() { return mood; }
    public String getUrl() { return url; }

    @Override
    public String toString() {
        return name + " (" + mood + ")";
    }
}



//recomm....
class RecommendationEngine {
    private List<Song> songList;

    public RecommendationEngine() {
        songList = new ArrayList<>();
        loadSongs();
    }

    private void loadSongs()
    {
        
        //happy song
        songList.add(new Song("Happy Pop-Tunes", "HAPPY", "https://youtu.be/uXJ62nB3-ZQ?si=yNjn7-XS09YCTKkX"));
        songList.add(new Song("Radiant Happiness", "HAPPY", "https://youtu.be/sYsusQGag9o?si=8eQRujqozxDl2mfj"));
        songList.add(new Song("Warm Hug", "HAPPY", "https://youtu.be/zUa5NhwmZf0?si=uYsTa4uSISeBaPHC"));
        songList.add(new Song("Aesthetic Happy Pop", "HAPPY", "https://youtu.be/wWPQfzvSStE?si=wSJFYqEQ3f-xa3gB"));
        songList.add(new Song("Good Time", "HAPPY", "https://youtu.be/cmLSizwDGj4?si=HIeND_K1mniv_s12"));

        
        //sad song
        songList.add(new Song("When I'm Gone", "SAD", "https://youtu.be/pWcFqsZe2ws?si=UPUaz2izt2htzlS6"));
        songList.add(new Song("Older", "SAD", "https://youtu.be/b1MJVZH3f8w?si=PYqO1X9eSY8TIvfX"));
        songList.add(new Song("Currents Of Life", "SAD", "https://youtu.be/-jpPIoWh3l0?si=H6i7u-aAH3VVTlYz"));
        songList.add(new Song("I Miss The Old Me", "SAD", "https://youtu.be/htv8jTzyI74?si=-906jgKpuYs0Lub-"));
        songList.add(new Song("Dancing With Your Ghost", "SAD", "https://youtu.be/Qzc_aX8c8g4?si=5_SyANLPg5AVpOHW"));
        songList.add(new Song("500 Miles", "SAD", "https://youtu.be/znLGPp2LabU?si=1xNcoU3zzqtbRGe5"));

        
        
        //inspirational
        songList.add(new Song("Everything Has Beauty", "INSPIRATIONAL", "https://youtu.be/5zaSqWfBA8s?si=294jD982E-GHau3o"));
        songList.add(new Song("Sia-Unstoppable", "INSPIRATIONAL", "https://youtu.be/h3h035Eyz5A?si=htUZpyg303KJdMPc"));
        songList.add(new Song("Ziddi Dil", "INSPIRATIONAL", "https://youtu.be/puKD3nkB1h4?si=dUkCKJb7nSoHvIzx"));
        songList.add(new Song("Labour", "INSPIRATIONAL", "https://youtu.be/a6NrnPzFkI0?si=Y9tvTZFrloW8F90d"));
        songList.add(new Song("Badal Pe Paon Hain", "INSPIRATIONAL", "https://youtu.be/m0wYJnCq-4M?si=O9RmYXCNegLYtDT6"));
        songList.add(new Song("Who Says", "INSPIRATIONAL", "https://youtu.be/J5gVq9C--zg?si=oMFaEu5Du7GqRKJc"));

        

        //study mood
        songList.add(new Song("Night Study Mode", "STUDY MOOD", "https://www.youtube.com/watch?v=7wtfhZwyrcc"));
        songList.add(new Song("Lofi Study Session", "STUDY MOOD", "https://youtu.be/lTRiuFIWV54?si=q9h9K_jbu9L-wXpQ"));
        songList.add(new Song("Exam Study Music", "STUDY MOOD", "https://youtu.be/qQzf-xzZO7M?si=NSAg9bMt6nkrsrqn"));
        songList.add(new Song("Intense Study-Gamma Beats", "STUDY MOOD", "https://youtu.be/lkkGlVWvkLk?si=L1nrjM_UhI_4GVhS"));
        songList.add(new Song("Alpha Waves", "STUDY MOOD", "https://youtu.be/lecITZkWqzg?si=c5gesifPztd8kBTg"));
    }

    public List<Song> getSongsByMood(String mood) {
        List<Song> result = new ArrayList<>();
        for (Song s : songList) {
            if (s.getMood().equalsIgnoreCase(mood)) {
                result.add(s);
            }
        }
        return result;
    }
}

// ---------- MAIN UI ----------
public class MoodMusicApp extends JFrame {

    private JComboBox<String> moodBox;
    private DefaultListModel<Song> listModel;
    private JList<Song> songList;
    private RecommendationEngine engine;

    private JPanel top;
    private JScrollPane scroll;
    private JButton playBtn;

    public MoodMusicApp() {
        setTitle("Mood Based Music Player");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        engine = new RecommendationEngine();

        String moods[] = {"HAPPY", "SAD", "CALM", "ENERGETIC"};
        moodBox = new JComboBox<>(moods);
        JButton searchBtn = new JButton("Find Songs");
        searchBtn.addActionListener(e -> showSongs());

        // TOP PANEL
        top = new JPanel();
        top.add(new JLabel("Select Mood:"));
        top.add(moodBox);
        top.add(searchBtn);

        // SONG LIST
        listModel = new DefaultListModel<>();
        songList = new JList<>(listModel);
        scroll = new JScrollPane(songList);

        // PLAY BUTTON
        playBtn = new JButton("Play");
        playBtn.addActionListener(e -> playSong());

        add(top, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(playBtn, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void showSongs() {
        listModel.clear();
        String selectedMood = (String) moodBox.getSelectedItem();
        List<Song> songs = engine.getSongsByMood(selectedMood);

        for (Song s : songs) {
            listModel.addElement(s);
        }

        // ----- CHANGE BACKGROUND BASED ON MOOD -----
        switch (selectedMood) {
            case "HAPPY":
                changeColor(new Color(255, 200, 220)); // Light pink
                break;

            case "SAD":
                changeColor(Color.LIGHT_GRAY);
                break;

            case "CALM":
                changeColor(Color.WHITE);
                break;

            case "ENERGETIC":
                changeColor(new Color(200, 255, 200)); // Light green
                break;
        }
    }

    private void changeColor(Color c) {
        getContentPane().setBackground(c);   // Whole window
        top.setBackground(c);                // Top panel
        songList.setBackground(c);           // List background
        scroll.getViewport().setBackground(c);
        playBtn.setBackground(c);
    }

    private void playSong() {
        Song s = songList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(this, "Select a song first!");
            return;
        }
        try {
            Desktop.getDesktop().browse(new URI(s.getUrl()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new MoodMusicApp();
    }
}
