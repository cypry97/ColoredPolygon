package Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

/**
 * Created by cd16606 on 09/02/2017.
 */
public class TestPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Warning! May cause seizures!\n");
        System.out.print("Number of vertices: ");
        int verticesCount = scanner.nextInt();

        JFrame f = new JFrame("Polygon");
        f.add(new Polygon(640, 16, verticesCount));
        f.setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

        while(true) {
            f.repaint();
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e) {
            }
        }
    }
}
