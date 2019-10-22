import javax.swing.*;
import java.awt.*;

public class GUI8_ImageIcon {
    public static void main(String[] args) {
       JFrame frame = new JFrame();;
       JPanel panel = new JPanel();
       ImageIcon iiJpg = new ImageIcon(GUI8_ImageIcon.class.getResource("img/a1.jpg"));
       ImageIcon iiJpg_edit = new ImageIcon(iiJpg.getImage().getScaledInstance(iiJpg.getIconWidth()/1,iiJpg.getIconHeight()/1, Image.SCALE_DEFAULT));
       JLabel jbii = new JLabel(iiJpg_edit);

       ImageIcon iiPng = new ImageIcon(GUI8_ImageIcon.class.getResource("img/a2.jpg"));
       ImageIcon iiPng_edit = new ImageIcon(iiPng.getImage().getScaledInstance(iiPng.getIconWidth()/2, iiPng.getIconHeight()/2, Image.SCALE_DEFAULT));
       JButton btii = new JButton(iiPng_edit);

       panel.add(jbii);
       panel.add(btii);
       frame.add(panel);

        frame.setPreferredSize(new Dimension(600, 400));
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
