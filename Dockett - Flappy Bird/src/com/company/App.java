package com.company;
import javax.swing.*;

public class App {

    /* ================================================
    ===================================================
    ======= DO NOT CHANGE ANYTHING IN THIS FILE =======
    ===================================================
    ================================================ */

    // Section 1: Found in Game.java
    // Section 2: Found in Bird.java
    // Section 3: Found in Game.java
    // Section 4: Found in Bird.java
    // Section 5: Found in Game.java
    // Section 6: Found in Pipe.java

    public static int WIDTH = 500;
    public static int HEIGHT = 500;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.setLocationRelativeTo(null);

        Keyboard keyboard = Keyboard.getInstance();
        frame.addKeyListener(keyboard);

        GamePanel panel = new GamePanel();
        frame.add(panel);
    }
}
