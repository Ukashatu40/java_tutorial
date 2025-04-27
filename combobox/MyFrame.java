package combobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog", "cat", "bird"}; // create an array of items
        comboBox = new JComboBox(animals); // create a combo box with items
        comboBox.addActionListener(this); // add action listener to the combo box

        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        // comboBox.addItem("horse");
        // comboBox.insertItemAt("pig", 0);
        // comboBox.setSelectedIndex(0);
        // comboBox.removeItem("cat");
        // comboBox.removeItemAt(0);
        // comboBox.removeAllItems(); // remove all items

        this.add(comboBox);
        this.pack(); // set the frame size
        this.setVisible(true); // set the frame visible
    }

    @Override
    public void actionPerformed(ActionEvent e) { // override the actionPerformed method
        if (e.getSource() == comboBox) { // check if the event source is the combo box
            System.out.println(comboBox.getSelectedItem()); // get the selected item
            // System.out.println(comboBox.getSelectedIndex()); // get the selected index

        }
    }
}
