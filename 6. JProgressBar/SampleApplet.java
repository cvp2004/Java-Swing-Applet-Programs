/*
    <applet code="SampleApplet.class" width="500" height="500"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JProgressBar
*/


import java.awt.*;
import javax.swing.JApplet;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;

public class SampleApplet extends JApplet  {

    static JProgressBar b;
 
    @Override
    public void init()
    {

        setLayout(null);

        // create a progressbar
        b = new JProgressBar(SwingConstants.HORIZONTAL);
 
        // set initial value
        b.setValue(0);
 
        b.setStringPainted(true);
 
        b.setBounds(0, 200, 500, 200);

        // add progressbar
        add(b);

        // set the size of the frame
        setSize(500, 500);
        setVisible(true);
 
        fill();
    }
 
    // function to increase progress
    public static void fill()
    {
        int i = 0;
        try {
            while (i <= 100) {
                // fill the menu bar
                b.setValue(i + 10);
 
                // delay the thread
                Thread.sleep(1000);
                i += 20;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
