import java.awt.Color;

public class ItemFactory {
    Color main_Color;
    Shape_Setting main_Shape;
    String main_Type;

    public ItemFactory(String shape, String size, String color, String type) {
        color_setting Color_text = new color_setting(color);
        main_Color = Color_text.getColor();
        Shape_Setting Shape_text = new Shape_Setting(shape, size);
        main_Shape = Shape_text;
        main_Type = type;

    }

}
