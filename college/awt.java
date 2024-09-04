import java.awt.*;

public class awt {
    awt() {
        Frame fm = new Frame("Title");
        Label lb = new Label("Welcome to Java Graphics");
        fm.add(lb);
        fm.setSize(300, 300);
        fm.setVisible(true);
    }

    public static void main(String[] args) {
        new awt();
    }
}

