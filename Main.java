
import java.util.Scanner;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner myscanner = new Scanner(System.in);
        System.out.print("Enter Data(Home or Car,Size1-4,color,graphic or txt ) >: ");

        String userName = myscanner.nextLine();
        String[] info = userName.split(" ");

        myscanner.close();
        ItemFactory myobj = new ItemFactory(info[0], info[1], info[2], info[3]);
        DrawTool myPaint = new DrawTool(myobj);
        System.out.print(myPaint.getClass().getSimpleName());
        JFRAME_Setting myJframe_Setting = new JFRAME_Setting(myPaint);
    }
}