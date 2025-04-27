package gui_swinng_files;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MyGridLayout {

    public static void main(String[] args) {
        // GridLayout = places component in a grid cells.
        //              Each component takes all the available spaces within itt cell,
        //              and each cell is the same size
        //              (components are the same size)
        //              (components are stretched to fill the cell)

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        frame.setVisible(true);
    }
}