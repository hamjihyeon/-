package img;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI11_주민번호테스터 {
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField ju0 = new JTextField(10);
    JLabel lb = new JLabel("-");
    JTextField ju1 = new JTextField(10);
    JButton bt = new JButton("테스트");
    bt.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            String jn = ju0.getText()+ju1.getText();
            if(isGood(jn)==true){
                lb.setText("o");
            } else {
                lb.setText("x");
            }
        }
    });

    panel.add(ju0);
    panel.add(lb);
    panel.add(ju1);
    panel.add(bt);
    frame.add(panel);

    frame.setPreferredSize(new Dimension(600, 400));
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    private static boolean isGood(String jn) {
        int [] mulN = {2,3,4,5,6,7,8,9,2,3,4,5};
        int sum = 0;
        for(int i = 0; i<jn.length()-1; i++) {
            sum += (jn.charAt(i)-'0') * mulN[i];
        }
        System.out.println(sum);
        int last = (11-(sum%11)) %10;   //10일때 한자리만 써져야하므로 0 구하자

        return (jn.charAt(jn.length()-1)-'0') == last;
    }
}
