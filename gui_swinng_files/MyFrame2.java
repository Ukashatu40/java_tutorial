package gui_swinng_files;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

public class MyFrame2 extends JFrame implements ActionListener{
     
    JButton button;
    JLabel label;

    MyFrame2(){

        ImageIcon icon = new ImageIcon("gui_swing_files/ukasha.png");
        ImageIcon icon2 = new ImageIcon("gui_swinng_files/nigeria.png");
        
        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 250, 100); // x, y, width, height
        button.setText("Click me");
        button.setFocusable(false); //
        button.addActionListener(this);
        // button.addActionListener(e -> System.err.println("Ukasha, do you even code?")); // Alternative
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("italic",Font.BOLD,25)); // 
        button.setIconTextGap(-15);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        // button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click event here
        if(e.getSource() == button){
            //System.out.println("Ukasha, do you even code?");
            //button.setEnabled(false);
            label.setVisible(true);
        }
    }
}
