package jslider;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    SliderDemo() {
        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(400, 200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
        // slider.setOrientation(SwingConstants.HORIZONTAL);
        slider.addChangeListener(this);

        label.setPreferredSize(new Dimension(400, 100));
        label.setOpaque(true); // 
        // label.setBackground(Color.GREEN); // set the background color
        label.setText("Volume: 50");

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Volume: " + slider.getValue());
    }
    
}
