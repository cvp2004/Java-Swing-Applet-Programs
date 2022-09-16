/*
    <applet code="SampleApplet.class" width="500" height="500"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JTable
*/

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SampleApplet extends JApplet {

    JTable j;

    @Override
    public void init() {

        DefaultMutableTreeNode style = new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("color");
        DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
        
        style.add(color);
        style.add(font);
        
        DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
        DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
        DefaultMutableTreeNode black = new DefaultMutableTreeNode("black");
        DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
        
        color.add(red);
        color.add(blue);
        color.add(black);
        color.add(green);
        
        JTree jt = new JTree(style);
        
        add(jt);
        
        setSize(500, 500);
        setVisible(true);

    }

}
