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

public class UniversalLockerRoom extends JFrame {
    private JPanel panel1;
    private JButton availableButton;
    private JButton resetButton;
    private JButton brokenButton;
    private JPanel panel2;
    private JPanel panel3;

    private JButton b4000Button;
    private JButton b4001Button;
    private JButton b4002Button;
    private JButton b4003Button;
    private JButton b4004Button;
    private JButton b4005Button;
    private JButton b4006Button;
    private JButton b4007Button;
    private JButton b4008Button;
    private JButton b4009Button;
    private JButton b4010Button;
    private JButton b4011Button;
    private JButton b4012Button;
    private JButton b4013Button;
    private JButton b4014Button;
    private JButton b4015Button;
    private JButton b4016Button;
    private JButton b4017Button;
    private JButton b4018Button;
    private JButton b4019Button;
    private JButton b4020Button;
    private JButton b4021Button;
    private JButton b4022Button;
    private JButton b4023Button;
    private JButton b4024Button;
    private JButton b4025Button;
    private JButton b4026Button;
    private JButton b4027Button;

    private HashSet<JButton> buttons;
    private Database d;

    public UniversalLockerRoom() {

        this.buttons = new HashSet<>();
        buttons.add(b4000Button);
        buttons.add(b4001Button);
        buttons.add(b4002Button);
        buttons.add(b4003Button);
        buttons.add(b4004Button);
        buttons.add(b4005Button);
        buttons.add(b4006Button);
        buttons.add(b4007Button);
        buttons.add(b4008Button);
        buttons.add(b4009Button);
        buttons.add(b4010Button);
        buttons.add(b4011Button);
        buttons.add(b4012Button);
        buttons.add(b4013Button);
        buttons.add(b4014Button);
        buttons.add(b4015Button);
        buttons.add(b4016Button);
        buttons.add(b4017Button);
        buttons.add(b4018Button);
        buttons.add(b4019Button);
        buttons.add(b4020Button);
        buttons.add(b4021Button);
        buttons.add(b4022Button);
        buttons.add(b4023Button);
        buttons.add(b4024Button);
        buttons.add(b4025Button);
        buttons.add(b4026Button);
        buttons.add(b4027Button);


        d = Database.getInstance();
        Locker ul1 = new Locker(4000, Room.UNIVERSAL, 4567);
        Locker ul2 = new Locker(4001, Room.UNIVERSAL, 4567);
        Locker ul3 = new Locker(4002, Room.UNIVERSAL, 4567);
        Locker ul4 = new Locker(4003, Room.UNIVERSAL, 4567);
        Locker ul5 = new Locker(4004, Room.UNIVERSAL, 4567);
        Locker ul6 = new Locker(4005, Room.UNIVERSAL, 4567);
        Locker ul7 = new Locker(4006, Room.UNIVERSAL, 4567);
        Locker ul8 = new Locker(4007, Room.UNIVERSAL, 4567);
        Locker ul9 = new Locker(4008, Room.UNIVERSAL, 4567);
        Locker ul10 = new Locker(4009, Room.UNIVERSAL, 4567);
        Locker ul11 = new Locker(4010, Room.UNIVERSAL, 4567);
        Locker ul12 = new Locker(4011, Room.UNIVERSAL, 4567);
        Locker ul13 = new Locker(4012, Room.UNIVERSAL, 4567);
        Locker ul14 = new Locker(4013, Room.UNIVERSAL, 4567);
        Locker ul15 = new Locker(4014, Room.UNIVERSAL, 4567);
        Locker ul16 = new Locker(4005, Room.UNIVERSAL, 4567);
        Locker ul17 = new Locker(4016, Room.UNIVERSAL, 4567);
        Locker ul18 = new Locker(4017, Room.UNIVERSAL, 4567);
        Locker ul19 = new Locker(4018, Room.UNIVERSAL, 4567);
        Locker ul20 = new Locker(4019, Room.UNIVERSAL, 4567);
        Locker ul21 = new Locker(4020, Room.UNIVERSAL, 4567);
        Locker ul22 = new Locker(4021, Room.UNIVERSAL, 4567);
        Locker ul23 = new Locker(4022, Room.UNIVERSAL, 4567);
        Locker ul24 = new Locker(4023, Room.UNIVERSAL, 4567);
        Locker ul25 = new Locker(4024, Room.UNIVERSAL, 4567);
        Locker ul26 = new Locker(4025, Room.UNIVERSAL, 4567);
        Locker ul27 = new Locker(4026, Room.UNIVERSAL, 4567);
        Locker ul28 = new Locker(4027, Room.UNIVERSAL, 4567);

        Customer c4 = new Customer("Peter H");
        Customer c5 = new Customer("Agnes T");
        Customer c6 = new Customer("Rebecca X");
        ul1.assignLocker(c4, 1);
        ul1.setBroken();
        ul11.setBroken();
        ul25.setBroken();
        ul3.assignLocker(c4, 4);
        ul20.assignLocker(c5, 4);
        ul6.assignLocker(c6, 4);

        d.addLockers(ul1);
        d.addLockers(ul2);
        d.addLockers(ul3);
        d.addLockers(ul4);
        d.addLockers(ul5);
        d.addLockers(ul6);
        d.addLockers(ul7);
        d.addLockers(ul8);
        d.addLockers(ul9);
        d.addLockers(ul10);
        d.addLockers(ul11);
        d.addLockers(ul12);
        d.addLockers(ul13);
        d.addLockers(ul14);
        d.addLockers(ul15);
        d.addLockers(ul16);
        d.addLockers(ul17);
        d.addLockers(ul18);
        d.addLockers(ul19);
        d.addLockers(ul20);
        d.addLockers(ul21);
        d.addLockers(ul22);
        d.addLockers(ul23);
        d.addLockers(ul24);
        d.addLockers(ul25);
        d.addLockers(ul26);
        d.addLockers(ul27);
        d.addLockers(ul28);

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

        b4000Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul1.getLockerNumber()
                        + "\nCustomer Name: " + ul1.lockerAssignment()
                        + "\nCombo: " + ul1.getCombo()
                        + "\nPhone Number: " + ul1.helperFunctionCustomer()
                        + "\nState of Operation: " + ul1.isBroken());

            }
        });
        b4001Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul2.getLockerNumber()
                        + "\nCustomer Name: " + ul2.lockerAssignment()
                        + "\nCombo: " + ul2.getCombo()
                        + "\nPhone Number: " + ul2.helperFunctionCustomer()
                        + "\nState of Operation: " + ul2.isBroken());

            }
        });
        b4002Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul3.getLockerNumber()
                        + "\nCustomer Name: " + ul3.lockerAssignment()
                        + "\nCombo: " + ul3.getCombo()
                        + "\nPhone Number: " + ul3.helperFunctionCustomer()
                        + "\nState of Operation: " + ul3.isBroken());

            }
        });
        b4003Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul4.getLockerNumber()
                        + "\nCustomer Name: " + ul4.lockerAssignment()
                        + "\nCombo: " + ul4.getCombo()
                        + "\nPhone Number: " + ul4.helperFunctionCustomer()
                        + "\nState of Operation: " + ul4.isBroken());

            }
        });
        b4004Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul5.getLockerNumber()
                        + "\nCustomer Name: " + ul5.lockerAssignment()
                        + "\nCombo: " + ul5.getCombo()
                        + "\nPhone Number: " + ul5.helperFunctionCustomer()
                        + "\nState of Operation: " + ul5.isBroken());

            }
        });
        b4005Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul6.getLockerNumber()
                        + "\nCustomer Name: " + ul6.lockerAssignment()
                        + "\nCombo: " + ul6.getCombo()
                        + "\nPhone Number: " + ul6.helperFunctionCustomer()
                        + "\nState of Operation: " + ul6.isBroken());

            }
        });
        b4006Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul7.getLockerNumber()
                        + "\nCustomer Name: " + ul7.lockerAssignment()
                        + "\nCombo: " + ul7.getCombo()
                        + "\nPhone Number: " + ul7.helperFunctionCustomer()
                        + "\nState of Operation: " + ul7.isBroken());

            }
        });
        b4007Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul8.getLockerNumber()
                        + "\nCustomer Name: " + ul8.lockerAssignment()
                        + "\nCombo: " + ul8.getCombo()
                        + "\nPhone Number: " + ul8.helperFunctionCustomer()
                        + "\nState of Operation: " + ul8.isBroken());

            }
        });
        b4008Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul9.getLockerNumber()
                        + "\nCustomer Name: " + ul9.lockerAssignment()
                        + "\nCombo: " + ul9.getCombo()
                        + "\nPhone Number: " + ul9.helperFunctionCustomer()
                        + "\nState of Operation: " + ul9.isBroken());

            }
        });
        b4009Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul10.getLockerNumber()
                        + "\nCustomer Name: " + ul10.lockerAssignment()
                        + "\nCombo: " + ul10.getCombo()
                        + "\nPhone Number: " + ul10.helperFunctionCustomer()
                        + "\nState of Operation: " + ul10.isBroken());

            }
        });
        b4010Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul11.getLockerNumber()
                        + "\nCustomer Name: " + ul11.lockerAssignment()
                        + "\nCombo: " + ul11.getCombo()
                        + "\nPhone Number: " + ul11.helperFunctionCustomer()
                        + "\nState of Operation: " + ul11.isBroken());

            }
        });
        b4011Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul12.getLockerNumber()
                        + "\nCustomer Name: " + ul12.lockerAssignment()
                        + "\nCombo: " + ul12.getCombo()
                        + "\nPhone Number: " + ul12.helperFunctionCustomer()
                        + "\nState of Operation: " + ul12.isBroken());

            }
        });
        b4012Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul13.getLockerNumber()
                        + "\nCustomer Name: " + ul13.lockerAssignment()
                        + "\nCombo: " + ul13.getCombo()
                        + "\nPhone Number: " + ul13.helperFunctionCustomer()
                        + "\nState of Operation: " + ul13.isBroken());

            }
        });
        b4013Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul14.getLockerNumber()
                        + "\nCustomer Name: " + ul14.lockerAssignment()
                        + "\nCombo: " + ul14.getCombo()
                        + "\nPhone Number: " + ul14.helperFunctionCustomer()
                        + "\nState of Operation: " + ul14.isBroken());

            }
        });
        b4014Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul15.getLockerNumber()
                        + "\nCustomer Name: " + ul15.lockerAssignment()
                        + "\nCombo: " + ul15.getCombo()
                        + "\nPhone Number: " + ul15.helperFunctionCustomer()
                        + "\nState of Operation: " + ul15.isBroken());

            }
        });
        b4015Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul16.getLockerNumber()
                        + "\nCustomer Name: " + ul16.lockerAssignment()
                        + "\nCombo: " + ul16.getCombo()
                        + "\nPhone Number: " + ul16.helperFunctionCustomer()
                        + "\nState of Operation: " + ul16.isBroken());

            }
        });
        b4016Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul17.getLockerNumber()
                        + "\nCustomer Name: " + ul17.lockerAssignment()
                        + "\nCombo: " + ul17.getCombo()
                        + "\nPhone Number: " + ul17.helperFunctionCustomer()
                        + "\nState of Operation: " + ul17.isBroken());

            }
        });
        b4017Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul18.getLockerNumber()
                        + "\nCustomer Name: " + ul18.lockerAssignment()
                        + "\nCombo: " + ul18.getCombo()
                        + "\nPhone Number: " + ul18.helperFunctionCustomer()
                        + "\nState of Operation: " + ul18.isBroken());

            }
        });
        b4018Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul19.getLockerNumber()
                        + "\nCustomer Name: " + ul19.lockerAssignment()
                        + "\nCombo: " + ul19.getCombo()
                        + "\nPhone Number: " + ul19.helperFunctionCustomer()
                        + "\nState of Operation: " + ul19.isBroken());

            }
        });
        b4019Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul20.getLockerNumber()
                        + "\nCustomer Name: " + ul20.lockerAssignment()
                        + "\nCombo: " + ul20.getCombo()
                        + "\nPhone Number: " + ul20.helperFunctionCustomer()
                        + "\nState of Operation: " + ul20.isBroken());

            }
        });

        b4020Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul21.getLockerNumber()
                        + "\nCustomer Name: " + ul21.lockerAssignment()
                        + "\nCombo: " + ul21.getCombo()
                        + "\nPhone Number: " + ul21.helperFunctionCustomer()
                        + "\nState of Operation: " + ul21.isBroken());

            }
        });
        b4021Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul22.getLockerNumber()
                        + "\nCustomer Name: " + ul22.lockerAssignment()
                        + "\nCombo: " + ul22.getCombo()
                        + "\nPhone Number: " + ul22.helperFunctionCustomer()
                        + "\nState of Operation: " + ul22.isBroken());

            }
        });
        add(panel1);


        b4022Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul23.getLockerNumber()
                        + "\nCustomer Name: " + ul23.lockerAssignment()
                        + "\nCombo: " + ul23.getCombo()
                        + "\nPhone Number: " + ul23.helperFunctionCustomer()
                        + "\nState of Operation: " + ul23.isBroken());

            }
        });
        b4023Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul24.getLockerNumber()
                        + "\nCustomer Name: " + ul24.lockerAssignment()
                        + "\nCombo: " + ul24.getCombo()
                        + "\nPhone Number: " + ul24.helperFunctionCustomer()
                        + "\nState of Operation: " + ul24.isBroken());

            }
        });
        b4024Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul25.getLockerNumber()
                        + "\nCustomer Name: " + ul25.lockerAssignment()
                        + "\nCombo: " + ul25.getCombo()
                        + "\nPhone Number: " + ul25.helperFunctionCustomer()
                        + "\nState of Operation: " + ul25.isBroken());

            }
        });
        b4025Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul26.getLockerNumber()
                        + "\nCustomer Name: " + ul26.lockerAssignment()
                        + "\nCombo: " + ul26.getCombo()
                        + "\nPhone Number: " + ul26.helperFunctionCustomer()
                        + "\nState of Operation: " + ul26.isBroken());

            }
        });
        b4026Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul27.getLockerNumber()
                        + "\nCustomer Name: " + ul27.lockerAssignment()
                        + "\nCombo: " + ul27.getCombo()
                        + "\nPhone Number: " + ul27.helperFunctionCustomer()
                        + "\nState of Operation: " + ul27.isBroken());

            }
        });
        b4027Button.addActionListener(new ActionListener() {
            @Override
             public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Locker Number: "+ ul28.getLockerNumber()
                        + "\nCustomer Name: " + ul28.lockerAssignment()
                        + "\nCombo: " + ul28.getCombo()
                        + "\nPhone Number: " + ul28.helperFunctionCustomer()
                        + "\nState of Operation: " + ul28.isBroken());

            }
        });
    }

    public void available() {
        availableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (JButton next : buttons) {
                    for (Locker l : d.getNotAvailableUniversalLockers()) {
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
                    for (Locker l : d.getBrokenUniversalLockers()) {
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
        frame.setContentPane(new UniversalLockerRoom().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}





