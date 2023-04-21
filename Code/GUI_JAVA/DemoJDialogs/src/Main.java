import javax.swing.*;

public class Main extends JDialog {
    public Main() {
        this.setTitle("Demo JDialog");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(300,200);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}