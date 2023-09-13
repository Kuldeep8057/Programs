import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
class Log1 implements ActionListener
{
JFrame f1;
JButton b1;
JTextField t1,t2,t3;
JLabel l1,l2,l3,bg;
public Log1()
{
f1=new JFrame("MyFrame");
f1.setLayout(null);
bg=new JLabel(new ImageIcon("my.jpg"));
f1.add(bg);
l1=new JLabel("enter Id");
l2=new JLabel("Enter Customer Name");
l3=new JLabel("Enter Customer age");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
b1=new JButton("submit");
l1.setBounds(30,30,80,30);
t1.setBounds(120,30,80,30);
l2.setBounds(30,80,80,30);
t2.setBounds(120,80,80,30);
l3.setBounds(30,130,80,30);
t3.setBounds(120,130,80,30);
b1.setBounds(190,200,80,30);
f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);
f1.add(b1);

f1.setSize(400,400);
f1.setVisible(true);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	
		

	
	if(e.getSource()==b1)
	{
		try
		{
		Statement st;
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	System.out.println("connecting...");
            String server = "DESKTOP-VFJGRPH";
            String database = "customer";
            String password = "kuldeep";
            //String connectionUrl = "jdbc:sqlserver://"+server+":1433;databaseName="+database+";user=shivani;password="+password+";";
			String connectionUrl = "jdbc:sqlserver://"+server+":1433;databaseName="+database+";user=sa;password="+password+";encrypt=true;trustServerCertificate=true";
            Connection con =  DriverManager.getConnection(connectionUrl);
			System.out.println("ooooo..");
		if(con!=null)
            {
				
                System.out.println("connected");
			}
String str1=t1.getText();
String str2=t2.getText();
String str3=t3.getText();

st=con.createStatement();
st.executeUpdate("insert into cust values('"+str1+"','"+str2+"','"+str3+"')");
JOptionPane.showMessageDialog(null,"Hello, Welcome to Javatpoint.");  
System.out.println("hello");
			}
		catch(Exception ex)
		{
			System.out.println("conn.."+e);
		}
	}
	
	
		
	}
}

class Testmy
{
public static void main(String args[])
{
Log1 lg=new Log1();
}
}


    

