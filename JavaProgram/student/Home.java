import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Home implements ActionListener
{
JFrame f1;
JButton b1,b2,b3,b4;


public Home()
{
f1=new JFrame("Student Detail");
f1.setLayout(null);

b1=new JButton("Registration");
b2=new JButton("Course");
b3=new JButton("Fees");
b4=new JButton("Attendence");

b1.setBounds(40,40,120,30);
b2.setBounds(40,90,120,30);
b3.setBounds(40,140,120,30);
b4.setBounds(40,190,120,30);
f1.add(b1);
f1.add(b2);
f1.add(b3);
f1.add(b4);

f1.setLayout(new BorderLayout());
JLabel background = new JLabel(new ImageIcon("image7.jpg") );
f1.add(background);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);

f1.setSize(400,400);
f1.setVisible(true);
}
public void actionPerformed(ActionEvent e1)
{
	if(e1.getSource()==b1)
	{
        //f1.setVisible(false);
		Register rg = new Register();
		//f1.setVisible(true);
		System.out.println("Registration");
	}
	else if(e1.getSource()==b2)
	{
     //   f1.setVisible(false);
        
		Course cs = new Course();
       // f1.setVisible(true);
		System.out.println("Course");
	

	}
	else if(e1.getSource()==b3)
	{
        //f1.setVisible(false);
		Fees fs = new Fees();
				
		System.out.println("Fees");

	//f1.setVisible(true);

	}
	
	else if(e1.getSource()==b4)
	{
        //f1.setVisible(false);
		Attendance at = new Attendance();
		System.out.println("Attendance");

	//f1.setVisible(true);

	}
}
}


