import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI2 implements ActionListener {
    private static JLabel userlabel;
    private static JTextField usertext;
    private static JLabel passwordlabel;
    private static JPasswordField passwordtext;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args){

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);
        userlabel = new JLabel("User");
        userlabel.setBounds(10, 20, 80, 25);
        panel.add(userlabel);

        usertext = new JTextField(20);
        usertext.setBounds(100, 20, 165, 25);
        panel.add(usertext);

        panel.setLayout(null);
        passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(10, 50, 80, 25);
        panel.add(passwordlabel);

        passwordtext = new JPasswordField();
        passwordtext.setBounds(100, 50, 165, 25);
        panel.add(passwordtext);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI2());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        //success.setText();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = usertext.getText();
        String password = passwordtext.getText();
        System.out.println(user + ", " + password);

        if(user.equals("John") && password.equals("omega123")){
            success.setText("Login berhasil!");
        }
        else{
            success.setText("Login failed");
        }
    }
}
