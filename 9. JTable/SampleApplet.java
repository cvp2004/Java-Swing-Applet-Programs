/*
    <applet code="SampleApplet.class" width="500" height="200"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JTable
*/


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;

public class SampleApplet extends JApplet {

    JTable j;

    @Override
    public void init() {

        String[][] data = {
            { "Sherlock Holmes", "1010", "CSE" },
            { "Anthony Stark", "2020", "IT" }
        };
 
        String[] columnNames = { "Name", "Roll Number", "Department" };
 
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        JScrollPane sp = new JScrollPane(j);
        add(sp);
        setSize(500, 200);
        setVisible(true);

    }


}
