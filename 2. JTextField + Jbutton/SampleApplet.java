/*
    <applet code="SampleApplet.class" width="300" height="300"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JTextField and JButton
*/


import java.awt.event.*;
import javax.swing.JApplet;
import javax.swing.event.AncestorListener;
import javax.swing.*;

public class SampleApplet extends JApplet implements ActionListener {
    
    JTextField jtf = new JTextField();

    @Override
    public void init() {

        JLabel lbl1 = new JLabel("Enter Your Name : ");
        lbl1.setBounds(40, 100, 110, 25);
        
        jtf.setBounds(170, 100, 100, 25);

        JButton btn1 = new JButton("Submit");
        btn1.setBounds(100, 130, 100, 25);
        btn1.addActionListener(this);

        add(lbl1);
        add(jtf);
        add(btn1);

        setSize(300, 300);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent e) {
        String Name = jtf.getText().trim();

        if (Name == "") {
            JOptionPane.showMessageDialog(null, "!! Enter Name !!");
        } else {
            JOptionPane.showMessageDialog(null, "Your Name " + Name + " is Awesome !!");
        }
    }

}
