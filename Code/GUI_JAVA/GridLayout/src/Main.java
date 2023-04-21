import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        this.setTitle("GirdLayout");
        this.setSize(300, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        setLayout(new GridLayout(7,3,5,5));
        for (int i=1; i<=20; i++) {
            this.add(new JButton("Button " + i ));

        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}