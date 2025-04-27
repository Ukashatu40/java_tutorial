package gui_swinng_files;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyJlabels {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //JLabel
        //JLabel is a GUI display area for a string of text, an image, or both.
        //It can be placed on a container to display a text or an image.
        //It is a passive control which means it does not support interaction.
        //It is used to display a message
        ImageIcon image = new ImageIcon("ui_swinng_files/ukasha.png"); // create an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.GREEN,3);
        
        JLabel label = new JLabel(); // create a label
        label.setText("Ukasha, do you even code?"); 
        label.setIcon(image); // add image to label
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of image icon
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of image icon
        label.setForeground(Color.GREEN); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 50)); // set font of text
        label.setIconTextGap(20); // set gap of text to image
        label.setBackground(Color.BLACK); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // 
        label.setVerticalAlignment(JLabel.CENTER); //
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,250,250); //

        JFrame frame = new JFrame(); // create a frame
        
        
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        // frame.setSize(500, 500); // x-dimension, y-dimension
        // frame.setLayout(null);
        frame.setVisible(true); // 
        frame.add(label);
        frame.pack();  // 
    }
}

