import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.*;

public class Main extends JPanel {

    public Main() {
        this.setLayout(new BorderLayout());
//        this.setBorder(new EmptyBorder(10, 10, 10, 10));
        Box top = Box.createHorizontalBox();
        for (int i=0; i<=3; i++) {
            JButton bt = new JButton(("B" + i));
            bt.setFont(new Font("Serif", Font.BOLD, 12 + i ));
            top.add(bt);

        }
        this.add(top, BorderLayout.NORTH);

        JPanel right = new JPanel();
        right.setBorder(BorderFactory.createTitledBorder("Column"));
        for (int i=0; i<=3; i++) {
            JButton bt = new JButton(("B" + i));
            bt.setFont(new Font("Serif", Font.BOLD, 12 + i ));
            right.add(bt);
        }
        this.add(right, BorderLayout.EAST);

        Box bottom = Box.createHorizontalBox();
        bottom.add(Box.createHorizontalGlue());
        bottom.add(new JButton("Okay"));
        bottom.add(Box.createHorizontalGlue());
        bottom.add(new JButton("Cancle"));
        bottom.add(Box.createHorizontalGlue());
        bottom.add(new JButton("Help"));

        this.add(bottom, BorderLayout.SOUTH);

        JTextArea text = new JTextArea();
        text.setText("This component has 12-pixel margins on left and top and has 72-pixel margins on right and bottom.");
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        this.add(text, BorderLayout.WEST);

        Box centerCol = Box.createVerticalBox();
        centerCol.add(Box.createVerticalStrut(12));
        centerCol.add(Box.createVerticalStrut(72));

        Box centerRow = Box.createHorizontalBox();
        centerRow.add(Box.createHorizontalStrut(12));
        centerRow.add(centerCol);
        centerRow.add(Box.createHorizontalStrut(72));
        this.add(centerRow, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame view = new JFrame();
        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        view.setTitle("Layout Manager");
        view.setContentPane(new Main());
        view.pack();
        view.setLocationRelativeTo(null);
        view.setVisible(true);

    }
}