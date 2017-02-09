package Polygon;

import javax.management.InvalidAttributeValueException;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by cd16606 on 09/02/2017.
 */
public class Polygon extends JComponent {
    private int verticesCount;
    private int margin;
    private int size;

    Polygon(int size, int margin, int verticesCount) {
        setPreferredSize(new Dimension(size, size));
        this.margin = margin;
        this.verticesCount = verticesCount;
        this.size = size;
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics graphics) {
        Graphics2D g = (Graphics2D) graphics;
        //int colorRGB = 0xFFFFFF;
        Random random = new Random();

        g.setColor(Color.BLACK);
        g.fillRect(0, 0, size, size);

        for (int i = 0; i < verticesCount; i++) {
            int xi = (int) Math.round(Math.cos(2 * Math.PI * i / verticesCount) * (size / 2 - margin) + size / 2);
            int yi = (int) Math.round(Math.sin(2 * Math.PI * i / verticesCount) * (size / 2 - margin) + size / 2);
            for (int j = i + 1; j < verticesCount; j++) {
                int xj = (int) Math.round(Math.cos(2 * Math.PI * j / verticesCount) * (size / 2 - margin) + size / 2);
                int yj = (int) Math.round(Math.sin(2 * Math.PI * j / verticesCount) * (size / 2 - margin) + size / 2);
                g.setColor(new Color(random.nextInt(0xFFFFFF)));
               // colorRGB -= 0xFFFFFF / (verticesCount * (verticesCount - 1) / 2);
                g.drawLine(xi, yi, xj, yj);
            }
        }
    }
}
