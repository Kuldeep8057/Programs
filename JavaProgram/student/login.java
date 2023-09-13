import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class login extends JFrame {

    public login(){ //constructor
        new JFrame();
        setLayout(new BorderLayout());
        JLabel l1 = new JLabel(new ImageIcon("image.jpg"));

        setSize(400, 666);
        setVisible(true);
    }
}
