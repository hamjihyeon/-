import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class Main extends JFrame {
    Container contentPane;
    Connection conn;

    public Main() {

        try {
            Class.forName("org.gjt.mm.mysql.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javap", "root", "mirim2");
        }catch(SQLException ex) {
            System.out.println("SQLException: " + ex);
        }catch(Exception ex) {
            System.out.println("Exception: " + ex);
        }

        setTitle("반가워");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());

        JTextField name = new JTextField("이름을 입력해주세요");
        name.setText("이름을 입력해주세요.");
        name.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if (name.getText().equals("이름을 입력해주세요.")) {
                    name.setText("");
                }
            }

                public void focusLost(FocusEvent focusEvent) {
                    if (name.getText().equals("")) {
                        name.setText("이름을 입력해주세요.");
                    }
                }
            });

        JButton btn = new JButton("다음");
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new question1();
            }
        });
        this.add(name);
        this.add(btn);
        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
