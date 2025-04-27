package joptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = pop up a standard dialog box that prompts users for a value
        ////             or informs them of something
        /// 
        
        // JOptionPane.showMessageDialog(null, "This is plain text", "Title",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Informational text", "Title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Question text?", "Title",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Warning text", "Title",JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is Error text", "Title",JOptionPane.ERROR_MESSAGE);

        // int answer = JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
        // String name = JOptionPane.showInputDialog("What is your name?");
        // // System.out.println("Answer: " + answer);
        // System.out.println("Hello " + name);

        String[] responses = {"No, you're awesome!", "Thank you!", "*blush*"};
        ImageIcon icon = new ImageIcon("/Users/apple/Library/Mobile Documents/com~apple~CloudDocs/java_tutorial/gui_swinng_files/nigeria.png");

        JOptionPane.showOptionDialog(
            null,
            "You are awesome!",
            "Secret message",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            icon,
            responses,
            0);

    }
}
