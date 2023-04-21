import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    JButton bn =new JButton("North");
    JButton bs =new JButton("South");
    JButton be =new JButton("East");
    JButton bw =new JButton("West");
    JButton bc =new JButton("Center");


    public Main() {
        this.setTitle("BorderLayout");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(BorderLayout.NORTH, bn);
        this.add(BorderLayout.SOUTH, bs);
        this.add(BorderLayout.EAST, be);
        this.add(BorderLayout.WEST, bw);
        this.add(BorderLayout.CENTER, bc);

        bn.setBackground(Color.RED);
        bs.setBackground(Color.YELLOW);
        be.setBackground(Color.BLACK);
        bw.setBackground(Color.BLUE);
        bc.setBackground(Color.CYAN);
    }
    public static void main(String[] args) {
        new Main().setVisible(true);

    }
}