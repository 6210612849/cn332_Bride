import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawTool extends Applet {
        ItemFactory main_obj;
        String type_text;
        Graphics g_main;

        public DrawTool(ItemFactory current_obj) {
                main_obj = current_obj;
                type_text = current_obj.main_Type;
        }

        public void paint(Graphics g) {
                // this is for first big rectangle
                if (main_obj.main_Shape.get_shape().equals("Car")) {
                        g.setColor(main_obj.main_Color);
                        g.fillRect(300, 400, main_obj.main_Shape.get_width(), main_obj.main_Shape.get_length());
                        g.drawRect(300, 400, main_obj.main_Shape.get_width(), main_obj.main_Shape.get_length());

                        // this is for the upper polygon
                        int[] x = { 300 + main_obj.main_Shape.get_width() / 8,
                                        300 + main_obj.main_Shape.get_width() / 8 * 2,
                                        main_obj.main_Shape.get_width() / 8 * 6 + 300,
                                        main_obj.main_Shape.get_width() / 8 * 7 + 300 };
                        int[] y = { 400, 400 - main_obj.main_Shape.get_length() / 4,
                                        400 - main_obj.main_Shape.get_length() / 4,
                                        400 };

                        g.setColor(Color.black);
                        g.fillPolygon(x, y, 4);
                        g.drawPolyline(x, y, 4);

                        // this is for car's wheel
                        g.setColor(Color.black);
                        g.fillOval(300, 400 + main_obj.main_Shape.get_length(), main_obj.main_Shape.get_width() / 3,
                                        main_obj.main_Shape.get_width() / 3);
                        g.drawOval(300, 400 + main_obj.main_Shape.get_length(), main_obj.main_Shape.get_length() / 3,
                                        main_obj.main_Shape.get_length() / 3);

                        // this is also for cars wheel
                        g.setColor(Color.black);
                        g.fillOval(300 + main_obj.main_Shape.get_width() - main_obj.main_Shape.get_width() / 3,
                                        400 + main_obj.main_Shape.get_length(),
                                        main_obj.main_Shape.get_width() / 3,
                                        main_obj.main_Shape.get_width() / 3);
                        g.drawOval(300 + main_obj.main_Shape.get_width() - main_obj.main_Shape.get_width() / 3,
                                        400 + main_obj.main_Shape.get_length(),
                                        main_obj.main_Shape.get_length() / 3,
                                        main_obj.main_Shape.get_length() / 3);

                        // its the valu declaration part of polygon
                        int[] x1 = { 300 + main_obj.main_Shape.get_width() / 7 * 2
                                        - main_obj.main_Shape.get_width() / 21,
                                        300 + main_obj.main_Shape.get_width() / 7 * 2,
                                        main_obj.main_Shape.get_width() / 7 * 5 + 300,
                                        main_obj.main_Shape.get_width() / 7 * 5 + 300
                                                        + main_obj.main_Shape.get_width() / 21 };
                        int[] y1 = { 400 - main_obj.main_Shape.get_length() / 28,
                                        400 - main_obj.main_Shape.get_length() / 5,
                                        400 - main_obj.main_Shape.get_length() / 5,
                                        400 - main_obj.main_Shape.get_length() / 28 };

                        // this is for polygon
                        g.setColor(Color.yellow);
                        g.fillPolygon(x1, y1, 4);
                        g.drawPolygon(x1, y1, 4);

                        // this is for car's window

                        // this is for also cars window
                        g.setColor(Color.gray);
                        int[] x2 = { 300 + main_obj.main_Shape.get_width(), 300 + main_obj.main_Shape.get_width(),
                                        300 + main_obj.main_Shape.get_width() * 2 };
                        int[] y2 = { 400, 400 + main_obj.main_Shape.get_length(),
                                        400 + main_obj.main_Shape.get_length() };
                        g.fillPolygon(x2, y2, 3);
                        g.drawPolygon(x2, y2, 3);

                } else if (main_obj.main_Shape.get_shape().equals("Home")) {

                        g.setColor(Color.white);
                        int[] x = { 300 + main_obj.main_Shape.get_width() / 2,
                                        300 + main_obj.main_Shape.get_width() * 2,
                                        300 + main_obj.main_Shape.get_width() * 2,
                                        300 + main_obj.main_Shape.get_width() / 2 };
                        int[] y = { 400 - main_obj.main_Shape.get_length(), 400 - main_obj.main_Shape.get_length(),
                                        400 + main_obj.main_Shape.get_length(),
                                        400 + main_obj.main_Shape.get_length() };
                        g.fillPolygon(x, y, 4);
                        g.drawPolygon(x, y, 4);

                        g.setColor(main_obj.main_Color);
                        g.fillRect(300, 400, main_obj.main_Shape.get_width(), main_obj.main_Shape.get_length());
                        g.drawRect(300, 400, main_obj.main_Shape.get_width(), main_obj.main_Shape.get_length());

                        g.setColor(main_obj.main_Color);
                        int[] x1 = { 300, 300 + main_obj.main_Shape.get_width(),
                                        300 + main_obj.main_Shape.get_width() / 2 };
                        int[] y1 = { 400, 400, 400 - main_obj.main_Shape.get_length() };
                        g.fillPolygon(x1, y1, 3);
                        g.drawPolygon(x1, y1, 3);

                        g.setColor(Color.BLACK);

                        g.fillRect(300 + main_obj.main_Shape.get_width() / 8 * 3,
                                        400 + main_obj.main_Shape.get_length() / 8 * 5,
                                        main_obj.main_Shape.get_width() / 8 * 2,
                                        main_obj.main_Shape.get_length() / 8 * 3);
                        g.drawRect(300 + main_obj.main_Shape.get_width() / 8 * 3,
                                        400 + main_obj.main_Shape.get_length() / 8 * 5,
                                        main_obj.main_Shape.get_width() / 8 * 2,
                                        main_obj.main_Shape.get_length() / 8 * 3);

                }

        }

}