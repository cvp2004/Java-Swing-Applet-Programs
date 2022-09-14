/*
    <applet code="JLabelApplet.class" width="300" height="300"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JLabel & ImageIcon
*/


import java.awt.*;
import javax.swing.JApplet;
import javax.swing.*;

public class JLabelApplet extends JApplet {

    @Override
    public void init() {

        ImageIcon imageIcon = new ImageIcon("img.png.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        
        imageLabel.setBounds(100, 0, 200, 200);

        add(imageLabel);
        

        setSize(300, 300);
        setLayout(null);

    }

}
