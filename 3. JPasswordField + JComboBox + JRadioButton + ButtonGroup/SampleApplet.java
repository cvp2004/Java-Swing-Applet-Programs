/*
    <applet code="SampleApplet.class" width="300" height="300"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JPasswordField & JComboBox & JRadioButton & ButtonGroup
*/

import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;


public class SampleApplet extends JApplet implements ActionListener {
    
    JTextField jtf1 = new JTextField();
    JPasswordField jpf1 = new JPasswordField();
    JRadioButton rbtn1, rbtn2;
    ButtonGroup btngrp1 = new ButtonGroup();
    JComboBox cbx1 = new JComboBox<String>();

    @Override
    public void init() {
        
        JLabel lbl1 = new JLabel("SIGN-UP FORM");
        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setVerticalAlignment(JLabel.CENTER);
        lbl1.setFont(new Font("Calibri", Font.BOLD, 48));
        lbl1.setForeground(Color.RED);
        lbl1.setBounds(0, 0, 500, 75);
        add(lbl1);

        JLabel lbl2 = new JLabel("User Name : ");
        lbl2.setHorizontalAlignment(JLabel.RIGHT);
        lbl2.setVerticalAlignment(JLabel.CENTER);
        lbl2.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl2.setBounds(20, 95, 150, 35);
        add(lbl2);

        jtf1.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf1.setBounds(180, 95, 150, 35);
        add(jtf1);

        JLabel lbl3 = new JLabel("Password : ");
        lbl3.setHorizontalAlignment(JLabel.RIGHT);
        lbl3.setVerticalAlignment(JLabel.CENTER);
        lbl3.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl3.setBounds(20, 140, 150, 35);
        add(lbl3);

        jpf1.setBounds(180, 140, 150, 35);
        add(jpf1);
        
        JLabel lbl4 = new JLabel("Gender : ");
        lbl4.setHorizontalAlignment(JLabel.RIGHT);
        lbl4.setVerticalAlignment(JLabel.CENTER);
        lbl4.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl4.setBounds(20, 185, 150, 35);
        add(lbl4);

        rbtn1 = new JRadioButton("Male");
        rbtn1.setFont(new Font("Calibri", Font.BOLD, 18));
        rbtn1.setBounds(180, 185, 100, 35);
        btngrp1.add(rbtn1);
        add(rbtn1);
        
        rbtn2 = new JRadioButton("Female");
        rbtn2.setFont(new Font("Calibri", Font.BOLD, 18));
        rbtn2.setBounds(290, 185, 100, 35);
        btngrp1.add(rbtn2);
        add(rbtn2);
        
        JLabel lbl5 = new JLabel("User-Type : ");
        lbl5.setHorizontalAlignment(JLabel.RIGHT);
        lbl5.setVerticalAlignment(JLabel.CENTER);
        lbl5.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl5.setBounds(20, 230, 150, 35);
        add(lbl5);

        String[] cbx_members = {"User", "Manager", "Administrator", "Supervisor"};
        DefaultComboBoxModel cbm = new DefaultComboBoxModel<String>(cbx_members);

        cbx1.setModel(cbm);
        cbx1.setBounds(180, 230, 150, 35);
        cbx1.setFont(new Font("Calibri", Font.BOLD, 18));
        add(cbx1);

        JButton btn1 = new JButton("SIGN UP");
        btn1.setFont(new Font("Calibri", Font.BOLD, 18));
        btn1.addActionListener(this);
        btn1.setBounds(175, 300, 150, 35);
        add(btn1);

        
        setSize(500, 400);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String uname = jtf1.getText();
        String pass = new String(jpf1.getPassword());
        String gender = btngrp1.getSelection().getActionCommand();
        String utype = (String) cbx1.getSelectedItem();

        JOptionPane.showMessageDialog(this, "User Name = " + uname + "\nPassword = " + pass + "\nGender = " + gender + "\nUser Type = " + utype);
        
    }

}