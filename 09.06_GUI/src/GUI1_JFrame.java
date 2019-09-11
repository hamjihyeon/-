import javax.swing.*;
import java.awt.*;

public class GUI1_JFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("창이름");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int 화w = screenSize.width;
        int 창h = screenSize.height;
        int 쌍w = 400;
        int 쌍h = 200;
        frame.setPreferredSize(new Dimension(쌍w, 쌍h));
        frame.setLocation((화w-쌍w)/2, (창h-쌍h)/2);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("아싸 어쩌다 금요일");
        JButton button = new JButton("오예");


        panel.add(label);
        panel.add(button);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //x버튼 ->  끝
    }
}
