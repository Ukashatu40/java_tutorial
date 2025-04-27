package filechooser;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.addActionListener(this);

        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            JFileChooser fileChooser = new JFileChooser(); // create a file chooser
            fileChooser.setCurrentDirectory(new File(".")); // set the current directory

            // int response = fileChooser.showOpenDialog(null); // to open a file
            int response = fileChooser.showSaveDialog(null); // to save a file
            if(response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath()); // get the selected file
                System.out.println(file);
        }
    }
  }
} 
