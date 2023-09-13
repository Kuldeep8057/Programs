import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;
class Login implements ActionListener
{
JFrame f1;
JButton b1;
JTextField t1,t2;
JLabel l1,l2,bg;
public Login()
{
f1=new JFrame("MyFrame");
f1.setLayout(null);
l1=new JLabel("enter Id");
l2=new JLabel("Enter password");
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Login");
l1.setBounds(90,30,100,30);
t1.setBounds(200,30,80,30);
l2.setBounds(90,80,100,30);
t2.setBounds(200,80,80,30);
b1.setBounds(200,120,80,30);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(b1);

f1.setLayout(new BorderLayout());
bg = new JLabel(new ImageIcon("download1.jpg") );
f1.add(bg);



b1.addActionListener(this);
f1.setSize(400,400);
f1.setVisible(true);

}
public void actionPerformed(ActionEvent e1)
{
	if(e1.getSource()==b1)
	{
		String s1,s2;
		s1=t1.getText();
		s2=t2.getText();
		
		if(s1.equals("") && s2.equals(""))
		{
			// JOptionPane.showMessageDialog(null,"Login Successful");
		Home h1=new Home();
		f1.setVisible(false);
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Login Denied");
		}
	}
		
	}
	
}

class Test
{
public static void main(String args[])
{
Login lg = new Login();
	}
}

