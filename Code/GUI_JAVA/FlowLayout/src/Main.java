import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        this.setTitle("FlowLayout");
        this.setSize(300,250);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);

        setLayout(new FlowLayout());
        for (int i = 1; i<21; i++) {
            this.add(new Button("Button " + i));
        }
    }
    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}