package my2Danimation;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyPanel panel;
    
    MyFrame() {
        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack(); // This is used to fit the frame to the panel
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
