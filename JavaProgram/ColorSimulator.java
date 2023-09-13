package JavaProgram;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class ColorSimulator extends JPanel implements ActionListener {
    JFrame j;
    JRadioButton rb1,rb2,rb3;
    //JLabel l1,l2;
    JButton b1,b2,b3;

    Color c_red;
    Color c_blue;
    Color c_green;

    ButtonGroup gp;

    public ColorSimulator()
    {
        
        setBounds(0,0,640,480);
        b1=new JRadioButton("RED");
        b2=new JRadioButton("blue");
        b3=new JRadioButton("yellow");

        b1.setSelected(true);
        c_red = Color.red;
        c_blue=getBackground();

        ButtonGroup gp= new ButtonGroup();
        gp.add(b1);
        gp.add(b2);
        gp.add(b3);

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);

        b1.addActionListener(this);



    }
    public void actionPerformed (ActionEvent e);
    
    if(b1.Selected==true){
        c_red = Color.red;
        c_blue =getBackground();
        c_green=getBackground();
    }
    else if(b2.Selected==true){
        c_red = getBackground();
        c_blue =Color.blue();
        c_green=getBackground();
    }
    else if(b.Selected==true){
        c_red = getBackground();
        c_blue =Color.blue();
        c_green=getBackground();
    }
    repaint();
    
}
