package colorchooser;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Color");
        button.addActionListener(this);

        label = new JLabel();
        label.setBackground(Color.WHITE);
        label.setText("This is some text :D ");
        label.setFont(new Font("MV Boli", Font.PLAIN, 100));
        label.setOpaque(true); // to make the background color visible

        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            JColorChooser colorChooser = new JColorChooser(); // create a color chooser
            Color color = colorChooser.showDialog(null, "Pick a Color", Color.BLACK); // show the dialog and get the selected color
            // label.setForeground(color); // set the color of the text
            label.setBackground(color); // set the color of the background
        }
    }
}
