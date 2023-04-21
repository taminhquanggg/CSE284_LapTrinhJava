import javax.swing.*;

public class Main extends JFrame {
    public Main() {
        this.setTitle("Demo JFrame");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);

    }

    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}