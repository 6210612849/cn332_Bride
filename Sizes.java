public class Sizes {
    private int main_width;
    private int main_length;

    public Sizes(int int_text) {
        if (int_text == 1) {
            main_width = 50;
            main_length = 50;
        } else if (int_text == 2) {
            main_width = 100;
            main_length = 100;
        } else if (int_text == 3) {
            main_width = 200;
            main_length = 200;
        } else if (int_text == 4) {
            main_width = 400;
            main_length = 400;
        } else if (int_text == 5) {
            main_width = 500;
            main_length = 500;
        }
    }

    public int getSize_width() {
        return main_width;
    }

    public int getSize_length() {
        return main_length;
    }

    public String tostrString() {
        return "size";
    }
}