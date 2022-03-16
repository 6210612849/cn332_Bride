import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import java.awt.RenderingHints;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BorderLayout;

public class JFRAME_Setting {
    public JFRAME_Setting(DrawTool my_paint) throws IOException {
        JFrame fr = new JFrame();

        fr.setBounds(10, 10, 1200, 1200);
        fr.add(my_paint, BorderLayout.CENTER);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setUndecorated(true);
        fr.setVisible(true);
        BufferedImage img = new BufferedImage(fr.getWidth(), fr.getHeight(), BufferedImage.TYPE_INT_RGB);

        Graphics2D g2d = img.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        fr.printAll(g2d);
        g2d.dispose();
        ImageIO.write(img, "png", new File("Picture.png"));

        if (my_paint.type_text.equals("txt")) {
            FactoryPrint factoryPrint = new FactoryPrint("Picture.png");

        }
    }
}
