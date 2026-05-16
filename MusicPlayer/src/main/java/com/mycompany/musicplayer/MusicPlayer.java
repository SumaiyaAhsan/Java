/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.musicplayer;

/**
 *
 * @author tamanna
 */
import javax.swing.*;
import java.awt.*;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


//Song Class
class Song {
    private String name;
    private String mood;
    private String url;

    public Song(String name, String mood, String url) {
        this.name = name;
        this.mood = mood;
        this.url = url;
    }

    //getter....
    public String getName() { return name; }
    public String getMood() { return mood; }
    public String getUrl() { return url; }

    @Override
    public String toString()
    { 
        return name; 
    }
}


//Engine Class
class RecommendationEngine 
{
    private List<Song> songList;

    public RecommendationEngine() {
        songList = new ArrayList<>();
        loadSongs();
    }

    private void loadSongs() {
        
        //happy
        songList.add(new Song("Happy Pop-Tunes", "HAPPY", "https://youtu.be/uXJ62nB3-ZQ?si=yNjn7-XS09YCTKkX"));
        songList.add(new Song("Radiant Happiness", "HAPPY", "https://youtu.be/sYsusQGag9o?si=8eQRujqozxDl2mfj"));
        songList.add(new Song("Warm Hug", "HAPPY", "https://youtu.be/zUa5NhwmZf0?si=uYsTa4uSISeBaPHC"));
        songList.add(new Song("Aesthetic Happy Pop", "HAPPY", "https://youtu.be/wWPQfzvSStE?si=wSJFYqEQ3f-xa3gB"));
        songList.add(new Song("Good Time", "HAPPY", "https://youtu.be/cmLSizwDGj4?si=HIeND_K1mniv_s12"));
        songList.add(new Song("Blue","HAPPY", "https://youtu.be/4adZ7AguVcw?si=fgTkljPTP4qDesAC"));
        songList.add(new Song("Projapotita","HAPPY", "https://youtu.be/Zol-JKZL5x0?si=pmBKdJw1sXcqn8bz"));
        songList.add(new Song("The Best Day","SAD", "https://youtu.be/n0cde-Km05o?si=COlZ0FTXqzqnt1cI"));
        songList.add(new Song("Bood Booster","HAPPY", "https://youtu.be/ljnGl5nvUJY?si=poXd6O3RbxxRjBQd"));
        songList.add(new Song("Birds Of a Feather","HAPPY", "https://youtu.be/geKxhmZL8ao?si=FyA0bQQN6kgrqasW"));
        songList.add(new Song("Cupid","HAPPY", "https://youtu.be/bKcEpor1UIg?si=GEUxIwWqk1RW9r-R"));
        songList.add(new Song("Happy Face","HAPPY", "https://youtu.be/LBNWehxbS2M?si=EW0errjWrrwt9HRw"));

                
        
        //sad 
        songList.add(new Song("When I'm Gone", "SAD", "https://youtu.be/pWcFqsZe2ws?si=UPUaz2izt2htzlS6"));
        songList.add(new Song("Older", "SAD", "https://youtu.be/b1MJVZH3f8w?si=PYqO1X9eSY8TIvfX"));
        songList.add(new Song("Currents Of Life", "SAD", "https://youtu.be/-jpPIoWh3l0?si=H6i7u-aAH3VVTlYz"));
        songList.add(new Song("I Miss The Old Me", "SAD", "https://youtu.be/htv8jTzyI74?si=-906jgKpuYs0Lub-"));
        songList.add(new Song("Dancing With Your Ghost", "SAD", "https://youtu.be/Qzc_aX8c8g4?si=5_SyANLPg5AVpOHW"));
        songList.add(new Song("500 Miles", "SAD", "https://youtu.be/znLGPp2LabU?si=1xNcoU3zzqtbRGe5"));
        songList.add(new Song("Ahare Shoishob","SAD", "https://youtu.be/3EVTSc42fhM?si=jNCXxnKlW1kV0Okw"));
        songList.add(new Song("Woh Din", "SAD" , "https://youtu.be/6Vbgeiu9AIU?si=zkYlSrUt9HO3PBEB"));
        songList.add(new Song("Alone", "SAD" , "https://youtu.be/bPs0xFd4skY?si=LfAoo8Xp3djq4BR-"));
        songList.add(new Song("Faded", "SAD" , "https://youtu.be/qdpXxGPqW-Y?si=g2pd_01teDutcgeB"));
        songList.add(new Song("Lily", "SAD" , "https://youtu.be/ox4tmEV6-QU?si=2G5otTWKji6eF5Nz"));



        //inspirational 
        songList.add(new Song("Everything Has Beauty", "INSPIRATIONAL", "https://youtu.be/5zaSqWfBA8s?si=294jD982E-GHau3o"));
        songList.add(new Song("Sia - Unstoppable", "INSPIRATIONAL", "https://youtu.be/h3h035Eyz5A?si=htUZpyg303KJdMPc"));
        songList.add(new Song("Ziddi Dil", "INSPIRATIONAL", "https://youtu.be/puKD3nkB1h4?si=dUkCKJb7nSoHvIzx"));
        songList.add(new Song("Labour", "INSPIRATIONAL", "https://youtu.be/a6NrnPzFkI0?si=Y9tvTZFrloW8F90d"));
        songList.add(new Song("Badal Pe Paon Hain", "INSPIRATIONAL", "https://youtu.be/m0wYJnCq-4M?si=O9RmYXCNegLYtDT6"));
        songList.add(new Song("Who Says", "INSPIRATIONAL", "https://youtu.be/J5gVq9C--zg?si=oMFaEu5Du7GqRKJc"));
        songList.add(new Song("Ek Zindagi", "INSPIRATIONAL", "https://youtu.be/9MH9gKM_LEE?si=XZo3F4MdnBFI6Kbg"));
        songList.add(new Song("Besabriyaan", "INSPIRATIONAL", "https://youtu.be/icRYTYahpOk?si=D-MmVWFg_zJNxosp"));
        songList.add(new Song("Aashayein", "INSPIRATIONAL", "https://youtu.be/xIob3OjpnFg?si=--wffwou60em3397"));
        songList.add(new Song("Tumra Ki Dekhecho", "INSPIRATIONAL", "https://youtu.be/NiGZKrdSZkM?si=_ScLQoGA3PTSmnn6"));
  
  
        // study mood 
        songList.add(new Song("Night Study Mode", "STUDY MOOD", "https://www.youtube.com/watch?v=7wtfhZwyrcc"));
        songList.add(new Song("Lofi Study Session", "STUDY MOOD", "https://youtu.be/lTRiuFIWV54?si=q9h9K_jbu9L-wXpQ"));
        songList.add(new Song("Exam Study Music", "STUDY MOOD", "https://youtu.be/qQzf-xzZO7M?si=NSAg9bMt6nkrsrqn"));
        songList.add(new Song("Intense Study-Gamma Beats", "STUDY MOOD", "https://youtu.be/lkkGlVWvkLk?si=L1nrjM_UhI_4GVhS"));
        songList.add(new Song("Alpha Waves", "STUDY MOOD", "https://youtu.be/lecITZkWqzg?si=c5gesifPztd8kBTg"));
        songList.add(new Song("Give Me Some Sunshine", "STUDY MOOD", "https://youtu.be/RKFsnDsazeU?si=4y3ZQuSQsg3nJouS"));
    }
    
    

    public List<Song> getSongsByMood(String mood) {
        List<Song> result = new ArrayList<>();
        for (Song s : songList) {
            if (s.getMood().equalsIgnoreCase(mood)) 
                result.add(s);
        }
        return result;
    }
}



// Music player class
public class MusicPlayer extends JFrame {

    private JComboBox<String> moodBox;
    private DefaultListModel<Song> listModel;
    private JList<Song> songList;
    private RecommendationEngine engine;
    private JPanel top, bottomPanel;
    private JScrollPane scroll;
    private JButton playBtn;

    
    //construc...
    public MusicPlayer() 
    {
       
        //title name...
        setTitle("Mood Music Player");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        engine = new RecommendationEngine();

        
        
         //button
        top = new JPanel();
        String moods[] = {"HAPPY", "SAD", "INSPIRATIONAL", "STUDY MOOD"};
        moodBox = new JComboBox<>(moods);
        top.add(moodBox);
        top.add(new JLabel("Select Mood:"));
        

        
        
        // button to show  songs
        JButton moodBtn = new JButton("Find Mood Songs");
        moodBtn.addActionListener(e -> showMoodSongs());
        top.add(moodBtn);
        add(top, BorderLayout.NORTH);

        
        
        //show song list
        listModel = new DefaultListModel<>();
        songList = new JList<>(listModel);
        songList.setFont(new Font("Arial", Font.BOLD, 16));
        scroll = new JScrollPane(songList);
        add(scroll, BorderLayout.CENTER);

        
        
        //play button....
        bottomPanel = new JPanel();
        playBtn = new JButton("Play");
        playBtn.setFont(new Font("Arial", Font.BOLD, 20));
        playBtn.addActionListener(e -> playSong());
        bottomPanel.add(playBtn);
        add(bottomPanel, BorderLayout.SOUTH);

        
        setVisible(true);
    }
    
    

    private void showMoodSongs() {
        listModel.clear();
        String selectedMood = (String) moodBox.getSelectedItem();
        List<Song> songs = engine.getSongsByMood(selectedMood);
        for (Song s : songs) listModel.addElement(s);
        changeColorForMood(selectedMood);
    }
    

    //colour fix...
    private void changeColorForMood(String mood) {
        switch (mood) {
            case "HAPPY":
                changeColor(new Color(255, 200, 220), new Color(255, 120, 180));
                break;
            case "SAD":
                changeColor(Color.LIGHT_GRAY, new Color(80, 80, 80));
                break;
            case "INSPIRATIONAL":
                changeColor(new Color(230, 255, 230), new Color(0, 170, 90));
                break;
            case "STUDY MOOD":
                changeColor(new Color(220, 240, 255), new Color(0, 110, 220));
                break;
        }
    }

    private void changeColor(Color bg, Color btnColor) {
        getContentPane().setBackground(bg);
        top.setBackground(bg);
        songList.setBackground(bg);
        scroll.getViewport().setBackground(bg);
        playBtn.setBackground(btnColor);
        playBtn.setForeground(Color.WHITE);
        bottomPanel.setBackground(bg);
    }

    private void playSong() 
    {
        Song s = songList.getSelectedValue();
        if (s == null) {
            JOptionPane.showMessageDialog(this,"Select a song first!");
            return;
        }
        try {
            Desktop.getDesktop().browse(new URI(s.getUrl()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
       MusicPlayer mp= new MusicPlayer();
    }
}