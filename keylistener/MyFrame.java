package keylistener;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;
    ImageIcon icon;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.addKeyListener(this);
        // this.setFocusable(true);
        this.setLayout(null);

        // icon = new ImageIcon("src/keylistener/robot.png");

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        // label.setIcon(icon);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        
        this.getContentPane().setBackground(Color.BLACK);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is typed. Uses KeyChar, char output
        // System.out.println("Key Typed: " + e.getKeyChar());
        switch (e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 's':
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 'd':
                label.setLocation(label.getX() + 10, label.getY());
                break;
            default:
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a physical key is pressed down. Uses KeyCode, int output
        // System.out.println("Key Pressed: " + e.getKeyCode());
        switch (e.getKeyCode()) {
            case 37:
                label.setLocation(label.getX() - 10, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY() - 10);
                break;
            case 40:
                label.setLocation(label.getX(), label.getY() + 10);
                break;
            case 39:
                label.setLocation(label.getX() + 10, label.getY());
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Invoked whenever a button is released. Uses KeyCode, int output
        System.out.println("Key Typed: " + e.getKeyChar());
        System.out.println("Key Released: " + e.getKeyCode());
    }
    
}
