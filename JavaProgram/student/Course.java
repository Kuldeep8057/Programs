import javax.swing.*;  
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
public class Course {    
JFrame f;    
JButton b1;
JLabel name,name1;
JTextField tname;

Course(){    
    f=new JFrame("Course");    
    String Branch1[]={"","MCA","BCA","BBA","B.tech"};        
    JComboBox cb=new JComboBox(Branch1);  
    
    name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 20));
		name.setSize(100, 30);
		name.setLocation(100, 100);
		f.add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(150, 30);
		tname.setLocation(200, 100);
		f.add(tname);

        name1 = new JLabel("Branch");
		name1.setFont(new Font("Arial", Font.PLAIN, 20));
		name1.setSize(100, 30);
		name1.setLocation(100, 150);
		f.add(name1);

    b1=new JButton("submit");
    f.add(b1);
    b1.setBounds(150, 200, 90, 20);
    cb.setBounds(200, 150,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);      
    f.setLayout(new BorderLayout());
    JLabel background = new JLabel(new ImageIcon("image2.jpg") );
    f.add(background);

}    
}
