
public class Shape_Setting {
    private int width, length;
    private String main_shape;
    private int size_temp;

    public Shape_Setting(String shape, String size) {
        size_temp = Integer.parseInt(size);
        this.main_shape = shape;
        Sizes size_text = new Sizes(size_temp);
        width = size_text.getSize_width();
        length = size_text.getSize_length();
        main_shape = shape;

    }

    public int get_width() {
        return width;
    }

    public int get_length() {
        return length;
    }

    public String get_shape() {
        return main_shape;
    }

    public String tostrString() {
        return "shape";
    }
}
