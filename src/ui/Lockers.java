package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lockers extends JFrame {
    public static void main(String[] args) {
        Lockers lock = new Lockers();
    }

    private JButton universal;
    private JButton mens;
    private JButton womens;

    public Lockers() {
        super("Locker Rental");
        setLayout(new FlowLayout());

        this.universal = new JButton("Universal");
        universal.setToolTipText("Universal Locker Room");
        universal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UniversalLockerRoom u = new UniversalLockerRoom();
                u.setVisible(true);
                u.setSize(1000, 500);
            }

        });
        add(universal);

        this.mens = new JButton("Mens");
        mens.setToolTipText("Men's Locker Room");
        mens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MensLockerRoom m = new MensLockerRoom();
                m.setVisible(true);
                m.setSize(1000, 500);
            }
        });
        add(mens);

        this.womens = new JButton("Womens");
        womens.setToolTipText("Women's Locker Room");
        womens.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WomensLockerRoom w = new WomensLockerRoom();
                w.setVisible(true);
                w.setSize(1000, 500);
            }
        });
        add(womens);
    }

}




