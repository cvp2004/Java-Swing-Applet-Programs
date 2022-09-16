/*
    <applet code="SampleApplet.class" width="500" height="500"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JTabbedPane
*/

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;

class AddPanel extends JPanel implements ActionListener {

    JLabel lbl1 = new JLabel("Enter 1st Number"), lbl2 = new JLabel("Enter 2nd Number");
    JTextField jtf1 = new JTextField(), jtf2 = new JTextField();
    JButton btn1 = new JButton("ADD");

    public AddPanel() {
        this.setLayout(null);

        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl1.setBounds(50, 100, 150, 35);
        add(lbl1);

        jtf1.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf1.setBounds(220, 100, 150, 35);
        add(jtf1);
        
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl2.setBounds(50, 150, 150, 35);
        add(lbl2);

        jtf2.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf2.setBounds(220, 150, 150, 35);
        add(jtf2);

        btn1.setFont(new Font("Calibri", Font.BOLD, 24));
        btn1.setBounds(175, 200, 150, 40);
        btn1.addActionListener(this);
        add(btn1);

        this.setSize(500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(jtf1.getText());
        int num2 = Integer.parseInt(jtf2.getText());
        int num3 = num1 + num2;

        JOptionPane.showMessageDialog(null, "SUM = " + num3);
    }

}

class MultPanel extends JPanel implements ActionListener {

    JLabel lbl1 = new JLabel("Enter 1st Number"), lbl2 = new JLabel("Enter 2nd Number");
    JTextField jtf1 = new JTextField(), jtf2 = new JTextField();
    JButton btn1 = new JButton("MULTIPLY");

    public MultPanel() {
        this.setLayout(null);

        lbl1.setHorizontalAlignment(JLabel.CENTER);
        lbl1.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl1.setBounds(50, 100, 150, 35);
        add(lbl1);

        jtf1.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf1.setBounds(220, 100, 150, 35);
        add(jtf1);
        
        lbl2.setHorizontalAlignment(JLabel.CENTER);
        lbl2.setFont(new Font("Calibri", Font.BOLD, 18));
        lbl2.setBounds(50, 150, 150, 35);
        add(lbl2);

        jtf2.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf2.setBounds(220, 150, 150, 35);
        add(jtf2);

        btn1.setFont(new Font("Calibri", Font.BOLD, 24));
        btn1.setBounds(175, 200, 150, 40);
        btn1.addActionListener(this);
        add(btn1);

        this.setSize(500, 500);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(jtf1.getText());
        int num2 = Integer.parseInt(jtf2.getText());
        int num3 = num1 * num2;

        JOptionPane.showMessageDialog(null, "Product = " + num3);
    }
}

public class SampleApplet extends JApplet {

    JTabbedPane jtp1 = new JTabbedPane(JTabbedPane.TOP);

    @Override
    public void init() {

        setLayout(new BorderLayout());

        jtp1.add("Addition", new AddPanel());
        jtp1.add("Multiplication", new MultPanel());
        add(jtp1, BorderLayout.CENTER);


        setSize(500, 500);

    }

}
