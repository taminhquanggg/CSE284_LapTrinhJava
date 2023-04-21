import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {

        Frame panel = new Frame();
        panel.setLayout(new GridLayout(2, 2));
        panel.setSize(350, 400);

        JPanel rb_ConVat = new JPanel();
//        rb_ConVat.setSize(300, 200);
        rb_ConVat.setLayout(new BoxLayout(rb_ConVat, BoxLayout.Y_AXIS));
        rb_ConVat.setBorder(new TitledBorder(new EtchedBorder(), "Chọn con vật"));
        final JRadioButton  rbCow = new JRadioButton ("Bò");
        final JRadioButton  rbChicken = new JRadioButton ("Gà");
        final JRadioButton  rbFish = new JRadioButton ("Cá");
        rb_ConVat.add(rbCow);
        rb_ConVat.add(rbChicken);
        rb_ConVat.add(rbFish);
        panel.add(rb_ConVat);


        panel.add(new JButton("Kết thúc"));

        JPanel cb_MonAn = new JPanel();
//        cb_MonAn.setSize(300, 200);
        cb_MonAn.setLayout(new BoxLayout(cb_MonAn, BoxLayout.Y_AXIS));
        cb_MonAn.setBorder(new TitledBorder(new EtchedBorder(), "Món có thể chọn"));
        final JCheckBox chkNuong = new JCheckBox("Nướng");
        final JCheckBox chkLuoc = new JCheckBox("Luộc");
        final JCheckBox chkChien = new JCheckBox("Chiên");
        cb_MonAn.add(chkNuong);
        cb_MonAn.add(chkLuoc);
        cb_MonAn.add(chkChien);
        panel.add(cb_MonAn);
        panel.add(cb_MonAn);



        JPanel boxChoosed = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        boxChoosed.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        boxChoosed.add(new JButton(">>"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridheight = 1;
        gbc.gridwidth = 1;
        boxChoosed.add(new JButton("<<"), gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 4;
        gbc.gridwidth = 3;


        JPanel labelMon = new JPanel();
        labelMon.setBorder(new TitledBorder(new EtchedBorder(), "Món có thể chọn"));
        labelMon.setLayout(new BoxLayout(labelMon, BoxLayout.Y_AXIS));

        labelMon.add(new JLabel("Gà nướng"));
        labelMon.add(new JLabel("Bò luộc"));
        labelMon.add(new JLabel("Cá Chiên"));


        boxChoosed.add(labelMon, gbc);

        panel.add(boxChoosed);

        panel.setVisible(true);

    }
}