package my2DGraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.*;

public class MyFrame extends JFrame {

    MyPanel panel;
    
    public MyFrame() {

        panel = new MyPanel();
        
        this.setTitle("2D Graphics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

}
