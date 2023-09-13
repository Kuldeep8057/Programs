import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class Calculator implements ActionListener,ItemListener{
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1;
    JComboBox cb;


    public Calculator(){
        f1=new JFrame("Calcualte Sum");
        f1.setLayout(null);
        f1.getContentPane().setBackground(Color.PINK);
        f1.setSize(1400,1300);


        l1 = new JLabel ("Enter Number First");
        l1.setBounds(40, 40, 120, 30);
        l2 = new JLabel ("Enter Number Second");
        l2.setBounds(40, 80, 120, 30);
        l3 = new JLabel ("Sum");
        l3.setBounds(100, 160, 120, 30);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);

        
        t1= new JTextField();
        t1.setBounds(200,40,120,30);
        t2= new JTextField();
        t2.setBounds(200,80,120,30);
        b1=new JButton("Submit");
        b1.setBounds(200,120,120,30);
        t3= new JTextField();
        t3.setBounds(200,160,120,30);

        f1.setVisible(true);
        f1.add(t1);
        f1.add(t2);
        f1.add(t3);

        f1.add(l2);
        f1.add(l1);
        f1.add(b1);

        //creating a Combo for option
        cb = new JComboBox();
        cb.setBorder(null);
        cb.addItem("Add");
        cb.addItem("Sub");
        cb.addItem("Mul");
        cb.addItem("Div");
        cb.addItem("Mod");
        f1.add(cb);


            f1.setVisible(true);
            b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
    }
        public void itemStateChanged(ItemEvent e) {
            if(e.getItemSelectable()== cb)
            {
            int a,b,c;
            a=Integer.parseInt(t1.getText());
            b=Integer.parseInt(t2.getText());
            c=a+b;
            t3.setText(String.valueOf(c));
        }
    }

        public static void main(String[] args) {
            Calculator s1 = new Calculator();
        }
}

