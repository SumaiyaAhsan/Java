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
import java.util.*;

public class MusicPlayer extends JFrame {

    private JComboBox<String> moodBox;
    private JComboBox<String> playlistBox;

    public MusicPlayer() {

        setTitle("Music Player");
        setSize(500, 350);                // SMALL WINDOW
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Music Player", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setOpaque(true);
        title.setBackground(Color.decode("#222831"));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        JPanel main = new JPanel(new GridLayout(1, 2));
        main.setBackground(Color.decode("#393E46"));

        // LEFT: Mood
        JPanel moodPanel = new JPanel();
        moodPanel.setLayout(new BoxLayout(moodPanel, BoxLayout.Y_AXIS));
        moodPanel.setBackground(Color.decode("#393E46"));

        JLabel moodLabel = new JLabel("Mood Playlist");
        moodLabel.setForeground(Color.WHITE);
        moodLabel.setFont(new Font("Arial", Font.BOLD, 16));
        moodLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] moods = {"Happy", "Sad", "Energetic", "Study Mode"};
        moodBox = new JComboBox<>(moods);
        JButton moodBtn = new JButton("Open Mood Songs");
        style(moodBtn);

        moodBtn.addActionListener(e -> showSongs("MOOD", (String) moodBox.getSelectedItem()));

        moodPanel.add(Box.createVerticalStrut(20));
        moodPanel.add(moodLabel);
        moodPanel.add(Box.createVerticalStrut(10));
        moodPanel.add(moodBox);
        moodPanel.add(Box.createVerticalStrut(10));
        moodPanel.add(moodBtn);

        // RIGHT: Our Playlist
        JPanel plPanel = new JPanel();
        plPanel.setLayout(new BoxLayout(plPanel, BoxLayout.Y_AXIS));
        plPanel.setBackground(Color.decode("#393E46"));

        JLabel plLabel = new JLabel("Our Playlist");
        plLabel.setForeground(Color.WHITE);
        plLabel.setFont(new Font("Arial", Font.BOLD, 16));
        plLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        String[] lists = {"Tasmi's Playlist", "Tamanna's Playlist", "Tuli's Playlist"};
        playlistBox = new JComboBox<>(lists);
        JButton plBtn = new JButton("Open Playlist Songs");
        style(plBtn);

        plBtn.addActionListener(e -> showSongs("PERSONAL", (String) playlistBox.getSelectedItem()));

        plPanel.add(Box.createVerticalStrut(20));
        plPanel.add(plLabel);
        plPanel.add(Box.createVerticalStrut(10));
        plPanel.add(playlistBox);
        plPanel.add(Box.createVerticalStrut(10));
        plPanel.add(plBtn);

        main.add(moodPanel);
        main.add(plPanel);

        add(main, BorderLayout.CENTER);
    }

    private void style(JButton b) {
        b.setBackground(Color.decode("#00ADB5"));
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Arial", Font.BOLD, 12));
    }

    private void showSongs(String type, String key) {

        Map<String, String[]> data = new HashMap<>();

        data.put("Happy", new String[]{
                "Happy Vibes | https://www.youtube.com/watch?v=ZbZSe6N_BXs"
        });
        data.put("Sad", new String[]{
                "Sad Piano | https://www.youtube.com/watch?v=1ZYbU82GVz4"
        });
        data.put("Energetic", new String[]{
                "Energy Boost | https://www.youtube.com/watch?v=Uj1ykZWtPYI"
        });
        data.put("Study Mode", new String[]{
                "Focus Study | https://www.youtube.com/watch?v=WPni755-Krg"
        });

        data.put("Tasmi's Playlist", new String[]{
                "Calm Focus | https://www.youtube.com/watch?v=1ZYbU82GVz4"
        });
        data.put("Tamanna's Playlist", new String[]{
                "Happy Pop | https://www.youtube.com/watch?v=ZbZSe6N_BXs"
        });
        data.put("Tuli's Playlist", new String[]{
                "Deep Energy | https://www.youtube.com/watch?v=Uj1ykZWtPYI"
        });

        String[] songs = data.get(key);

        JList<String> list = new JList<>(songs);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String val = list.getSelectedValue();
                if (val != null) {
                    String url = val.split("\\|")[1].trim();
                    try {
                        Desktop.getDesktop().browse(new URI(url));
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Can't open URL");
                    }
                }
            }
        });

        JOptionPane.showMessageDialog(this, new JScrollPane(list),
                key + " Songs", JOptionPane.PLAIN_MESSAGE);
    }

    public static void main(String[] args) {
        new MusicPlayer().setVisible(true);
    }
}
