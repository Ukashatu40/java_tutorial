package my2DGraphics;

import java.awt.*;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    Image image;
    public MyPanel() {
        image = new ImageIcon("my2DGraphics/nigeria.png").getImage();
        this.setPreferredSize(new java.awt.Dimension(600, 600));
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null); // Draw an image
        g2D.setPaint(Color.RED); // Set the color to red
        // g2D.setStroke(new BasicStroke(5)); // Set the stroke to 5
        // g2D.drawLine(0, 0, 600, 600); // Draw a line from (0, 0) to (600, 600)

        // g2D.drawRect(0, 0, 50, 100); // Draw a 3D rectangle
        // g2D.fillRect(0, 0, 50, 100); // Draw a filled rectangle

        // g2D.drawOval(0, 0, 100, 100); // Draw an oval
        // g2D.fillOval(0, 0, 100, 100); // Draw a filled oval

        g2D.drawArc(0, 0, 100, 100, 0, 180); // Draw an arc
        g2D.fillArc(0, 0, 100, 100, 0, 180); // Draw a filled arc
        g2D.setPaint(Color.BLUE); // Set the color to blue
        g2D.fillArc(0, 0, 100, 100, 180, 180); // Draw a filled circle

        int[] xPoints = {150, 250, 350}; // Create an array of x points
        int[] yPoints = {300, 150, 300}; // Create an array of y points
        g2D.setPaint(Color.GREEN); // Set the color to green
        // g2D.drawPolygon(xPoints, yPoints, 3); // Draw a polygon
        g2D.fillPolygon(xPoints, yPoints, 3); // Draw a filled polygon

        // g2D.setFont(new Font("Ink Free", Font.BOLD, 50)); // Set the font
        // g2D.drawString("UKASHAT IS WINNING", 50, 50); // Draw a string

    }
    
}
