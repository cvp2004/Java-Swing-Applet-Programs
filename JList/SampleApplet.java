/*
    <applet code="SampleApplet.class" width="500" height="500"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JTextField and JButton
*/


import java.awt.Font;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.JApplet;
import javax.swing.event.AncestorListener;
import javax.swing.*;

public class SampleApplet extends JApplet implements ActionListener {
    
    JList jl = new JList<String>();
    Vector vlist = new Vector<String>();
    JTextField jtf1 = new JTextField();
    JButton btn1 = new JButton("Add");

    @Override
    public void init() {

        jl.setFont(new Font("Calibri", Font.BOLD, 18));
        jl.setBounds(10, 10, 200, 480);
        add(jl);

        jtf1.setFont(new Font("Calibri", Font.BOLD, 18));
        jtf1.setBounds(300, 75, 150, 45);
        add(jtf1);

        btn1.setBounds(300, 150, 150, 45);
        add(btn1);
        btn1.addActionListener(this);

        setSize(500, 500);
        setLayout(null);

    }

    public void actionPerformed(ActionEvent e) {
        
        String s = jtf1.getText();

        vlist.addElement(s);
        jl.setListData(vlist);

        jtf1.setText("");

    }

}
