/*
    <applet code="SampleApplet.class" width="500" height="500"></applet>
*/

/*
    Name : Chaitanya Praskar
    Id Code : 20CM004
    Applet Program for JSlider
*/


import java.awt.*;
import javax.swing.JApplet;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.*;

public class SampleApplet extends JApplet implements ChangeListener {

    JSlider jsl = new JSlider(JSlider.HORIZONTAL, 0, 1000, 0);
    JLabel jl1 = new JLabel();

    @Override
    public void init() {

        jl1.setText("Value = 0");
        jl1.setBounds(0, 250, 500, 50);
        jl1.setHorizontalAlignment(JLabel.CENTER);
        jl1.setFont(new Font("Calibri", Font.BOLD, 24));
        add(jl1);

        jsl.setMinorTickSpacing(10);
        jsl.setMajorTickSpacing(100);
        jsl.setPaintTicks(true);
        jsl.setPaintLabels(true);
        jsl.addChangeListener(this);
        jsl.setBounds(0, 300, 500, 200);

        add(jsl);

        setSize(500, 500);
        setLayout(null);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        int n = jsl.getValue();

        jl1.setText("Value = " + n);
        
    }

}
