package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JTextField username;
    private JPasswordField password;

    private JButton loginBut;
    private JButton exitBut;


    public Login() {
        super("CLASS Software");
        setLayout(new FlowLayout());

        this.username = new JTextField(10);
        add(username);
        this.username.setToolTipText("Username");

        this.password = new JPasswordField(10);
        add(password);
        this.password.setToolTipText("Password");

        this.loginBut = new JButton("Login");
        loginBut.setToolTipText("Login");
        loginBut.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           String psw = password.getText();
                                           String user = username.getText();
                                           if ((user.equals("Alvin") && psw.equals("Lo")) || (user.equals("Ansel") && psw.equals("Hartanto"))) {
                                               JOptionPane.showMessageDialog(null, "Login Successful");
                                               username.setText(null);
                                               password.setText(null);
                                               Lockers lock = new Lockers();
                                               lock.setVisible(true);
                                               lock.setSize(400, 100);
                                               dispose();

                                           } else {
                                               JOptionPane.showMessageDialog(null, "Invalid Username/Password");
                                               username.setText(null);
                                               password.setText(null);
                                           }
                                       }
                                   }
        );
        add(loginBut);

        this.exitBut = new JButton("Exit");
        exitBut.addActionListener(new ActionListener() {
                                      @Override
                                      public void actionPerformed(ActionEvent e) {
                                          int result = JOptionPane.showConfirmDialog(null, "Exit?", "Are you sure?", JOptionPane.YES_NO_OPTION);
                                          if (result == JOptionPane.YES_OPTION) {
                                              System.exit(0);
                                          }
                                      }
                                  }
        );
        add(exitBut);

    }

}












