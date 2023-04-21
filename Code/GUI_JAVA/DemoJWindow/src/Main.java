import javax.swing.*;
import java.awt.*;


public class Main extends JWindow {
    private JLabel headerLabel;

    public Main() {
        this.setSize(200, 300);
        this.setVisible(false);
        this.setLocationRelativeTo(null);
        Label lbText = new Label("Demo JWindow", Label.CENTER);
        this.add(lbText);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}