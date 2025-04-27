package draganddrop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel {

    ImageIcon image = new ImageIcon("draganddrop/nigeria.png"); // load the image
    final int WIDTH = image.getIconWidth(); // get the width of the image
    final int HEIGHT = image.getIconHeight(); // get the height of the image
    Point imageCorner; // the top-left corner of the image
    Point prevPt; // the last point clicked

    DragPanel() {
        imageCorner = new Point(0, 0); // set the top-left corner of the image to (0, 0)
        ClickListener clickListener = new ClickListener(); // create a click listener
        DragListener dragListener = new DragListener(); // create a drag listener
        this.addMouseListener(clickListener); // add the click listener to the panel
        this.addMouseMotionListener(dragListener); // add the drag listener to the panel
    }

    public void paintComponent(Graphics g) { // paint the image on the panel
        super.paintComponent(g); // call the super class
        image.paintIcon(this, g, (int) imageCorner.getX(), (int) imageCorner.getY()); // paint the image
    }

    private class ClickListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            System.out.println("Mouse Pressed");
            prevPt = e.getPoint(); // get the point clicked
        }
    }

    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);
            System.out.println("Mouse Dragged");
            Point currentPt = e.getPoint(); // get the current point
            imageCorner.translate((int) (currentPt.getX() - prevPt.getX()), (int) (currentPt.getY() - prevPt.getY())); // move the image
            prevPt = currentPt; // set the current point as the previous point
            repaint(); // repaint the panel
        }
    }
}
