package menubar;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener {
    
    JMenuBar menuBar; // a bar that contains menus
    JMenuItem fileMenu; // a menu that contains menu items
    JMenuItem editMenu;
    JMenuItem helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;


    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        loadIcon = new ImageIcon("path/to/image");
        saveIcon = new ImageIcon("path/to/image");
        exitIcon = new ImageIcon("path/to/image");


        menuBar = new JMenuBar();

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + F for File
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + E for Edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + H for Help
        loadItem.setMnemonic(KeyEvent.VK_L); //  L for Load
        saveItem.setMnemonic(KeyEvent.VK_S); //  S for Save
        exitItem.setMnemonic(KeyEvent.VK_E); //  E for Exit
        


        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("Loading a file");
        }
        if(e.getSource() == saveItem){
            System.out.println("Saving a file");
        }
        if(e.getSource() == exitItem){
            System.out.println("Exiting the program");
            System.exit(0);
        }
    }

}
