/*
    <applet code="SampleApplet.class" width="300" height="300"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JMenuBar, JMenu, JMenuItem, JtextArea, JFileChooser
*/

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

public class SampleApplet extends JApplet implements ActionListener {

    JMenuBar mb;
    JMenu file, edit, help;
    JMenuItem cut, copy, paste, selectAll;
    JTextArea ta;

    @Override
    public void init() {

        setLayout(new BorderLayout());

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(5, 5, 360, 320);

        add(ta, BorderLayout.CENTER);
        setJMenuBar(mb);

        setSize(500, 500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }
}