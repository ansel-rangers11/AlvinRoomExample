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

public class WomensLockerRoom extends JFrame {
    private JPanel panel1;
    private JButton c5005Button;
    private JButton availableButton;
    private JButton resetButton;
    private JButton brokenButton;
    private JPanel panel2;
    private JButton c5019Button;
    private JButton c5012Button;
    private JButton c5013Button;
    private JPanel panel3;
    private JButton c5009Button;
    private JButton c5003Button;
    private JButton c5014Button;
    private JButton c5001Button;
    private JButton c5010Button;
    private JButton c5007Button;
    private JButton c5011Button;
    private JButton c5021Button;
    private JButton c5000Button;
    private JButton c5002Button;
    private JButton c5017Button;
    private JButton c5008Button;
    private JButton c5018Button;
    private JButton c5016Button;
    private JButton c5006Button;
    private JButton c5004Button;
    private JButton c5015Button;
    private JButton c5020Button;
    private HashSet<JButton> buttons;
    private Database d;

    public WomensLockerRoom() {

        this.buttons = new HashSet<>();
        buttons.add(c5000Button);
        buttons.add(c5001Button);
        buttons.add(c5002Button);
        buttons.add(c5003Button);
        buttons.add(c5004Button);
        buttons.add(c5005Button);
        buttons.add(c5006Button);
        buttons.add(c5007Button);
        buttons.add(c5008Button);
        buttons.add(c5009Button);
        buttons.add(c5010Button);
        buttons.add(c5011Button);
        buttons.add(c5012Button);
        buttons.add(c5013Button);
        buttons.add(c5014Button);
        buttons.add(c5015Button);
        buttons.add(c5016Button);
        buttons.add(c5017Button);
        buttons.add(c5018Button);
        buttons.add(c5019Button);
        buttons.add(c5020Button);
        buttons.add(c5021Button);

        d = Database.getInstance();
        Locker w1 = new Locker(5000, Room.WOMENS, 9876);
        Locker w2 = new Locker(5001, Room.WOMENS, 9876);
        Locker w3 = new Locker(5002, Room.WOMENS, 9876);
        Locker w4 = new Locker(5003, Room.WOMENS, 9876);
        Locker w5 = new Locker(5004, Room.WOMENS, 9876);
        Locker w6 = new Locker(5005, Room.WOMENS, 9876);
        Locker w7 = new Locker(5006, Room.WOMENS, 9876);
        Locker w8 = new Locker(5007, Room.WOMENS, 9876);
        Locker w9 = new Locker(5008, Room.WOMENS, 9876);
        Locker w10 = new Locker(5009, Room.WOMENS, 9876);
        Locker w11 = new Locker(5010, Room.WOMENS, 9876);
        Locker w12 = new Locker(5011, Room.WOMENS, 9876);
        Locker w13 = new Locker(5012, Room.WOMENS, 9876);
        Locker w14 = new Locker(5013, Room.WOMENS, 9876);
        Locker w15 = new Locker(5014, Room.WOMENS, 9876);
        Locker w16 = new Locker(5015, Room.WOMENS, 9876);
        Locker w17 = new Locker(5016, Room.WOMENS, 9876);
        Locker w18 = new Locker(5017, Room.WOMENS, 9876);
        Locker w19 = new Locker(5018, Room.WOMENS, 9876);
        Locker w20 = new Locker(5019, Room.WOMENS, 9876);
        Locker w21 = new Locker(5020, Room.WOMENS, 9876);
        Locker w22 = new Locker(5021, Room.WOMENS, 9876);

        Customer c7 = new Customer("Roberto L");
        Customer c8 = new Customer("Henrik S");
        Customer c9 = new Customer("Daniel S");
        w3.assignLocker(c7, 1);
        w9.setBroken();
        w11.setBroken();
        w20.setBroken();
        w5.assignLocker(c8, 4);
        w15.assignLocker(c9, 4);
        w15.setBroken();

        d.addLockers(w1);
        d.addLockers(w2);
        d.addLockers(w3);
        d.addLockers(w4);
        d.addLockers(w5);
        d.addLockers(w6);
        d.addLockers(w7);
        d.addLockers(w8);
        d.addLockers(w9);
        d.addLockers(w10);
        d.addLockers(w11);
        d.addLockers(w12);
        d.addLockers(w13);
        d.addLockers(w14);
        d.addLockers(w15);
        d.addLockers(w16);
        d.addLockers(w17);
        d.addLockers(w18);
        d.addLockers(w19);
        d.addLockers(w20);
        d.addLockers(w21);
        d.addLockers(w22);


        d.addCustomers(c7);
        d.addCustomers(c8);
        d.addCustomers(c9);

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

        c5001Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w2.getLockerNumber()
                        + "\nCustomer Name: " + w2.lockerAssignment()
                        + "\nCombo: " + w2.getCombo()
                        + "\nPhone Number: " + w2.helperFunctionCustomer()
                        + "\nState of Operation: " + w2.isBroken());

            }
        });
        c5002Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w3.getLockerNumber()
                        + "\nCustomer Name: " + w3.lockerAssignment()
                        + "\nCombo: " + w3.getCombo()
                        + "\nPhone Number: " + w3.helperFunctionCustomer()
                        + "\nState of Operation: " + w3.isBroken());

            }
        });
        c5003Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w4.getLockerNumber()
                        + "\nCustomer Name: " + w4.lockerAssignment()
                        + "\nCombo: " + w4.getCombo()
                        + "\nPhone Number: " + w4.helperFunctionCustomer()
                        + "\nState of Operation: " + w4.isBroken());

            }
        });
        c5004Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w5.getLockerNumber()
                        + "\nCustomer Name: " + w5.lockerAssignment()
                        + "\nCombo: " + w5.getCombo()
                        + "\nPhone Number: " + w5.helperFunctionCustomer()
                        + "\nState of Operation: " + w5.isBroken());

            }
        });
        c5005Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w6.getLockerNumber()
                        + "\nCustomer Name: " + w6.lockerAssignment()
                        + "\nCombo: " + w6.getCombo()
                        + "\nPhone Number: " + w6.helperFunctionCustomer()
                        + "\nState of Operation: " + w6.isBroken());

            }
        });
        c5006Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w7.getLockerNumber()
                        + "\nCustomer Name: " + w7.lockerAssignment()
                        + "\nCombo: " + w7.getCombo()
                        + "\nPhone Number: " + w7.helperFunctionCustomer()
                        + "\nState of Operation: " + w7.isBroken());

            }
        });
        c5007Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w8.getLockerNumber()
                        + "\nCustomer Name: " + w8.lockerAssignment()
                        + "\nCombo: " + w8.getCombo()
                        + "\nPhone Number: " + w8.helperFunctionCustomer()
                        + "\nState of Operation: " + w8.isBroken());

            }
        });
        c5008Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w9.getLockerNumber()
                        + "\nCustomer Name: " + w9.lockerAssignment()
                        + "\nCombo: " + w9.getCombo()
                        + "\nPhone Number: " + w9.helperFunctionCustomer()
                        + "\nState of Operation: " + w9.isBroken());

            }
        });
        c5009Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w10.getLockerNumber()
                        + "\nCustomer Name: " + w10.lockerAssignment()
                        + "\nCombo: " + w10.getCombo()
                        + "\nPhone Number: " + w10.helperFunctionCustomer()
                        + "\nState of Operation: " + w10.isBroken());

            }
        });
        c5010Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w11.getLockerNumber()
                        + "\nCustomer Name: " + w11.lockerAssignment()
                        + "\nCombo: " + w11.getCombo()
                        + "\nPhone Number: " + w11.helperFunctionCustomer()
                        + "\nState of Operation: " + w11.isBroken());

            }
        });
        c5011Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w12.getLockerNumber()
                        + "\nCustomer Name: " + w12.lockerAssignment()
                        + "\nCombo: " + w12.getCombo()
                        + "\nPhone Number: " + w12.helperFunctionCustomer()
                        + "\nState of Operation: " + w12.isBroken());

            }
        });
        c5012Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w13.getLockerNumber()
                        + "\nCustomer Name: " + w13.lockerAssignment()
                        + "\nCombo: " + w13.getCombo()
                        + "\nPhone Number: " + w13.helperFunctionCustomer()
                        + "\nState of Operation: " + w13.isBroken());

            }
        });
        c5013Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w14.getLockerNumber()
                        + "\nCustomer Name: " + w14.lockerAssignment()
                        + "\nCombo: " + w14.getCombo()
                        + "\nPhone Number: " + w14.helperFunctionCustomer()
                        + "\nState of Operation: " + w14.isBroken());

            }
        });
        c5014Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w15.getLockerNumber()
                        + "\nCustomer Name: " + w15.lockerAssignment()
                        + "\nCombo: " + w15.getCombo()
                        + "\nPhone Number: " + w15.helperFunctionCustomer()
                        + "\nState of Operation: " + w15.isBroken());

            }
        });
        c5015Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w16.getLockerNumber()
                        + "\nCustomer Name: " + w16.lockerAssignment()
                        + "\nCombo: " + w16.getCombo()
                        + "\nPhone Number: " + w16.helperFunctionCustomer()
                        + "\nState of Operation: " + w16.isBroken());

            }
        });
        c5016Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w17.getLockerNumber()
                        + "\nCustomer Name: " + w17.lockerAssignment()
                        + "\nCombo: " + w17.getCombo()
                        + "\nPhone Number: " + w17.helperFunctionCustomer()
                        + "\nState of Operation: " + w17.isBroken());

            }
        });
        c5017Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w18.getLockerNumber()
                        + "\nCustomer Name: " + w18.lockerAssignment()
                        + "\nCombo: " + w18.getCombo()
                        + "\nPhone Number: " + w18.helperFunctionCustomer()
                        + "\nState of Operation: " + w18.isBroken());

            }
        });
        c5018Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w19.getLockerNumber()
                        + "\nCustomer Name: " + w19.lockerAssignment()
                        + "\nCombo: " + w19.getCombo()
                        + "\nPhone Number: " + w19.helperFunctionCustomer()
                        + "\nState of Operation: " + w19.isBroken());

            }
        });
        c5019Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w20.getLockerNumber()
                        + "\nCustomer Name: " + w20.lockerAssignment()
                        + "\nCombo: " + w20.getCombo()
                        + "\nPhone Number: " + w20.helperFunctionCustomer()
                        + "\nState of Operation: " + w20.isBroken());

            }
        });

        c5020Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w21.getLockerNumber()
                        + "\nCustomer Name: " + w21.lockerAssignment()
                        + "\nCombo: " + w21.getCombo()
                        + "\nPhone Number: " + w21.helperFunctionCustomer()
                        + "\nState of Operation: " + w21.isBroken());

            }
        });
        c5021Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ w22.getLockerNumber()
                        + "\nCustomer Name: " + w22.lockerAssignment()
                        + "\nCombo: " + w22.getCombo()
                        + "\nPhone Number: " + w22.helperFunctionCustomer()
                        + "\nState of Operation: " + w22.isBroken());

            }
        });
        add(panel1);
    }

    public void available() {
        availableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton next : buttons) {
                    for (Locker l : d.getNotAvailableWomenLockers()) {
                        if (next.getText().equals(l.getLockerNumber().toString())) {
                            next.setBackground(Color.BLACK);
                            next.setForeground(Color.BLACK);
                        }
                    }
                }
            }
        });
    }

    public void broken() {
        brokenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton b : buttons) {
                    for (Locker l : d.getBrokenWomenLockers()) {
                        if (b.getText().equals(l.getLockerNumber().toString())) {
                            b.setBackground(Color.RED);
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Men's Locker Room");
        frame.setContentPane(new WomensLockerRoom().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}





