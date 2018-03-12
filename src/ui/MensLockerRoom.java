package ui;

import model.Customer;
import model.Database;
import model.Locker;
import model.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

public class MensLockerRoom extends JFrame {
    private JPanel panel1;
    private JButton a3005Button;
    private JButton availableButton;
    private JButton resetButton;
    private JButton brokenButton;
    private JPanel panel2;
    private JButton a3019Button;
    private JButton a3012Button;
    private JButton a3013Button;
    private JPanel panel3;
    private JButton a3009Button;
    private JButton a3003Button;
    private JButton a3014Button;
    private JButton a3001Button;
    private JButton a3010Button;
    private JButton a3007Button;
    private JButton a3011Button;
    private JButton a3021Button;
    private JButton a3000Button;
    private JButton a3002Button;
    private JButton a3017Button;
    private JButton a3008Button;
    private JButton a3018Button;
    private JButton a3016Button;
    private JButton a3006Button;
    private JButton a3004Button;
    private JButton a3015Button;
    private JButton a3020Button;
    private HashSet<JButton> buttons;
    private Database d;

    public MensLockerRoom() {

        this.buttons = new HashSet<>();
        buttons.add(a3000Button);
        buttons.add(a3001Button);
        buttons.add(a3002Button);
        buttons.add(a3003Button);
        buttons.add(a3004Button);
        buttons.add(a3005Button);
        buttons.add(a3006Button);
        buttons.add(a3007Button);
        buttons.add(a3008Button);
        buttons.add(a3009Button);
        buttons.add(a3010Button);
        buttons.add(a3011Button);
        buttons.add(a3012Button);
        buttons.add(a3013Button);
        buttons.add(a3014Button);
        buttons.add(a3015Button);
        buttons.add(a3016Button);
        buttons.add(a3017Button);
        buttons.add(a3018Button);
        buttons.add(a3019Button);
        buttons.add(a3020Button);
        buttons.add(a3021Button);

        d = Database.getInstance();
        Locker l1 = new Locker(3000, Room.MENS, 1234);
        Locker l2 = new Locker(3001, Room.MENS, 1234);
        Locker l3 = new Locker(3002, Room.MENS, 1234);
        Locker l4 = new Locker(3003, Room.MENS, 1234);
        Locker l5 = new Locker(3004, Room.MENS, 1234);
        Locker l6 = new Locker(3005, Room.MENS, 1234);
        Locker l7 = new Locker(3006, Room.MENS, 1234);
        Locker l8 = new Locker(3007, Room.MENS, 1234);
        Locker l9 = new Locker(3008, Room.MENS, 1234);
        Locker l10 = new Locker(3009, Room.MENS, 1234);
        Locker l11 = new Locker(3010, Room.MENS, 1234);
        Locker l12 = new Locker(3011, Room.MENS, 1234);
        Locker l13 = new Locker(3012, Room.MENS, 1234);
        Locker l14 = new Locker(3013, Room.MENS, 1234);
        Locker l15 = new Locker(3014, Room.MENS, 1234);
        Locker l16 = new Locker(3015, Room.MENS, 1234);
        Locker l17 = new Locker(3016, Room.MENS, 1234);
        Locker l18 = new Locker(3017, Room.MENS, 1234);
        Locker l19 = new Locker(3018, Room.MENS, 1234);
        Locker l20 = new Locker(3019, Room.MENS, 1234);
        Locker l21 = new Locker(3020, Room.MENS, 1234);
        Locker l22 = new Locker(3021, Room.MENS, 1234);


        Customer c1 = new Customer("Alvin L");
        Customer c2 = new Customer("Ansel H");
        c2.setPhoneNum(911);
        Customer c3 = new Customer("Jessie J");

        l1.assignLocker(c1, 1);
        l1.setBroken();
        l3.assignLocker(c2, 4);
        l15.assignLocker(c3, 4);
        l18.setBroken();
        l19.setBroken();
        d.addLockers(l1);
        d.addLockers(l2);
        d.addLockers(l3);
        d.addLockers(l4);
        d.addLockers(l5);
        d.addLockers(l6);
        d.addLockers(l7);
        d.addLockers(l8);
        d.addLockers(l9);
        d.addLockers(l10);
        d.addLockers(l11);
        d.addLockers(l12);
        d.addLockers(l10);
        d.addLockers(l13);
        d.addLockers(l14);
        d.addLockers(l15);
        d.addLockers(l16);
        d.addLockers(l17);
        d.addLockers(l18);
        d.addLockers(l19);
        d.addLockers(l20);
        d.addLockers(l21);


        d.addCustomers(c1);
        d.addCustomers(c2);

        available();
        broken();

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton next : buttons) {
                    next.setBackground(null);
                }
                JOptionPane.showMessageDialog(null, "All Reset");
            }
        });

        a3000Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l1.getLockerNumber()
                        + "\nCustomer Name: " + l1.lockerAssignment()
                        + "\nCombo: " + l1.getCombo()
                        + "\nPhone Number: " + l1.helperFunctionCustomer()
                        + "\nState of Operation: " + l1.isBroken());

            }
        });
        a3001Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l2.getLockerNumber()
                        + "\nCustomer Name: " + l2.lockerAssignment()
                        + "\nCombo: " + l2.getCombo()
                        + "\nPhone Number: " + l2.helperFunctionCustomer()
                        + "\nState of Operation: " + l2.isBroken());

            }
        });
        a3002Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l3.getLockerNumber()
                        + "\nCustomer Name: " + l3.lockerAssignment()
                        + "\nCombo: " + l3.getCombo()
                        + "\nPhone Number: " + l3.helperFunctionCustomer()
                        + "\nState of Operation: " + l3.isBroken());

            }
        });
        a3003Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l4.getLockerNumber()
                        + "\nCustomer Name: " + l4.lockerAssignment()
                        + "\nCombo: " + l4.getCombo()
                        + "\nPhone Number: " + l4.helperFunctionCustomer()
                        + "\nState of Operation:" + l4.isBroken());

            }
        });
        a3004Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l5.getLockerNumber()
                        + "\nCustomer Name: " + l5.lockerAssignment()
                        + "\nCombo: " + l5.getCombo()
                        + "\nPhone Number: " + l5.helperFunctionCustomer()
                        + "\nState of Operation: " + l5.isBroken());

            }
        });
        a3005Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l6.getLockerNumber()
                        + "\nCustomer Name: " + l6.lockerAssignment()
                        + "\nCombo: " + l6.getCombo()
                        + "\nPhone Number: " + l6.helperFunctionCustomer()
                        + "\nState of Operation: " + l6.isBroken());

            }
        });
        a3006Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l7.getLockerNumber()
                        + "\nCustomer Name: " + l7.lockerAssignment()
                        + "\nCombo: " + l7.getCombo()
                        + "\nPhone Number: " + l7.helperFunctionCustomer()
                        + "\nState of Operation: " + l7.isBroken());

            }
        });
        a3007Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l8.getLockerNumber()
                        + "\nCustomer Name: " + l8.lockerAssignment()
                        + "\nCombo: " + l8.getCombo()
                        + "\nPhone Number: " + l8.helperFunctionCustomer()
                        + "\nState of Operation: " + l8.isBroken());

            }
        });
        a3008Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l9.getLockerNumber()
                        + "\nCustomer Name: " + l9.lockerAssignment()
                        + "\nCombo: " + l9.getCombo()
                        + "\nPhone Number: " + l9.helperFunctionCustomer()
                        + "\nState of Operation: " + l9.isBroken());

            }
        });
        a3009Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l10.getLockerNumber()
                        + "\nCustomer Name: " + l10.lockerAssignment()
                        + "\nCombo: " + l10.getCombo()
                        + "\nPhone Number: " + l10.helperFunctionCustomer()
                        + "\nState of Operation: " + l10.isBroken());

            }
        });
        a3010Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l11.getLockerNumber()
                        + "\nCustomer Name: " + l11.lockerAssignment()
                        + "\nCombo: " + l11.getCombo()
                        + "\nPhone Number: " + l11.helperFunctionCustomer()
                        + "\nState of Operation: " + l11.isBroken());

            }
        });
        a3011Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l12.getLockerNumber()
                        + "\nCustomer Name: " + l12.lockerAssignment()
                        + "\nCombo: " + l12.getCombo()
                        + "\nPhone Number: " + l12.helperFunctionCustomer()
                        + "\nState of Operation: " + l12.isBroken());

            }
        });
        a3012Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l13.getLockerNumber()
                        + "\nCustomer Name: " + l13.lockerAssignment()
                        + "\nCombo: " + l13.getCombo()
                        + "\nPhone Number: " + l13.helperFunctionCustomer()
                        + "\nState of Operation: " + l13.isBroken());

            }
        });
        a3013Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l14.getLockerNumber()
                        + "\nCustomer Name: " + l14.lockerAssignment()
                        + "\nCombo: " + l14.getCombo()
                        + "\nPhone Number: " + l14.helperFunctionCustomer()
                        + "\nState of Operation: " + l14.isBroken());

            }
        });
        a3014Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l15.getLockerNumber()
                        + "\nCustomer Name: " + l15.lockerAssignment()
                        + "\nCombo: " + l15.getCombo()
                        + "\nPhone Number: " + l15.helperFunctionCustomer()
                        + "\nState of Operation: " + l15.isBroken());
            }
        });
        a3015Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l16.getLockerNumber()
                        + "\nCustomer Name: " + l16.lockerAssignment()
                        + "\nCombo: " + l16.getCombo()
                        + "\nPhone Number: " + l16.helperFunctionCustomer()
                        + "\nState of Operation: " + l16.isBroken());
            }
        });
        a3016Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l17.getLockerNumber()
                        + "\nCustomer Name: " + l17.lockerAssignment()
                        + "\nCombo: " + l17.getCombo()
                        + "\nPhone Number: " + l17.helperFunctionCustomer()
                        + "\nState of Operation: " + l17.isBroken());
            }
        });
        a3017Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l18.getLockerNumber()
                        + "\nCustomer Name: " + l18.lockerAssignment()
                        + "\nCombo: " + l18.getCombo()
                        + "\nPhone Number: " + l18.helperFunctionCustomer()
                        + "\nState of Operation: " + l18.isBroken());
            }
        });
        a3018Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l19.getLockerNumber()
                        + "\nCustomer Name: " + l19.lockerAssignment()
                        + "\nCombo: " + l19.getCombo()
                        + "\nPhone Number: " + l19.helperFunctionCustomer()
                        + "\nState of Operation: " + l19.isBroken());
            }
        });
        a3019Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l20.getLockerNumber()
                        + "\nCustomer Name: " + l20.lockerAssignment()
                        + "\nCombo: " + l20.getCombo()
                        + "\nPhone Number: " + l20.helperFunctionCustomer()
                        + "\nState of Operation: " + l20.isBroken());
            }
        });

        a3020Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l21.getLockerNumber()
                        + "\nCustomer Name: " + l21.lockerAssignment()
                        + "\nCombo: " + l21.getCombo()
                        + "\nPhone Number: " + l21.helperFunctionCustomer()
                        + "\nState of Operation: " + l21.isBroken());
            }
        });
        a3021Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ l22.getLockerNumber()
                        + "\nCustomer Name: " + l22.lockerAssignment()
                        + "\nCombo: " + l22.getCombo()
                        + "\nPhone Number: " + l22.helperFunctionCustomer()
                        + "\nState of Operation: " + l22.isBroken());
            }
        });
        add(panel1);
    }

    public void available() {
        availableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton next : buttons) {
                    for (Locker l : d.getNotAvailableMenLockers()) {
                        if (next.getText().equals(l.getLockerNumber().toString())) {
                            next.setBackground(Color.BLACK);
                            next.setForeground(Color.BLACK);
                        }
                    }
                }
            }
        });
    }

    public void broken(){
        brokenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton b : buttons){
                    for (Locker l : d.getBrokenMenLockers()){
                        if (b.getText().equals(l.getLockerNumber().toString())){
                            b.setBackground(Color.RED);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Men's Locker Room");
        frame.setContentPane(new MensLockerRoom().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}





