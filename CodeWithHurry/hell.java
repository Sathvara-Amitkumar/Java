package CodeWithHurry;

import javax.swing.*;
import java.awt.*;

public class hell {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("simple GUI");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(500, 200);
        jFrame.add(new JLabel("ERROR 404"));

        String name = JOptionPane.showInputDialog("NAME !");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("AGE !"));
        JOptionPane.showMessageDialog(null,"You are " + age + " years OLD");

        String uniName = JOptionPane.showInputDialog("UNIVERSITY !");
        JOptionPane.showMessageDialog(null, uniName);

        String clgName = JOptionPane.showInputDialog("COLLEGE !");
        JOptionPane.showMessageDialog(null, clgName);



        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
