import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
JFrame f;
JLabel name;
JTextField tname;
  
class Attendance {
  
    // Declaration of object of JRadioButton class.
    JRadioButton j1,j2;
  
    // Declaration of object of JRadioButton class.
    // JRadioButton ;
  
    // Declaration of object of JButton class.
    JButton jButton;
  
    // Declaration of object of ButtonGroup class.
    ButtonGroup G1;

    // Declaration of object of  JLabel  class.
    JLabel L1;

    // Constructor of Demo class.
    public Attendance()
    {

        // Setting layout as null of JFrame.
        f.setLayout(null);

        name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		f.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		c.add(tname);

        // Initialization of object of "JRadioButton" class.
        j1 = new JRadioButton();

        // Initialization of object of "JRadioButton" class.
        j2 = new JRadioButton();

        // Initialization of object of "JButton" class.
        jButton = new JButton("Submit");

        // Initialization of object of "ButtonGroup" class.
        G1 = new ButtonGroup();

        // Initialization of object of " JLabel" class.
        L1 = new JLabel("Attendance");

        // setText(...) function is used to set text of radio button.
        // Setting text of "j2".
        j1.setText("Present");

        // Setting text of "jRadioButton4".
        j2.setText("Absent");

        // Setting Bounds of "j2".
        j1.setBounds(120, 30, 120, 50);

        // Setting Bounds of "jRadioButton4".
        j2.setBounds(250, 30, 80, 50);

        // Setting Bounds of "jButton".
        jButton.setBounds(125, 90, 80, 30);

        // Setting Bounds of JLabel "L2".
        L1.setBounds(20, 30, 150, 50);

        // "this" keyword in java refers to current object.
        // Adding "j2" on JFrame.
        this.add(j1);

        // Adding "jRadioButton4" on JFrame.
        this.add(j2);

        // Adding "jButton" on JFrame.
        this.add(jButton);

        // Adding JLabel "L2" on JFrame.
        this.add(L1);

        // Setting Bounds of JFrame.
        this.setBounds(100, 100, 400, 200);

        // Setting Title of frame.
        this.setTitle("RadioButtons");

        // Setting Visible status of frame as true.
        this.setVisible(true);

        // Adding "j1" and "jRadioButton3" in a Button Group "G2".
        G1.add(j1);
        G1.add(j2);
        this.setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("image.jpg") );
        this.add(background);

    }
}


