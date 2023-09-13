import java.awt.*;
import javax.swing.*;
class Menu {
    JFrame f1;
    JMenuBar mb;
    JMenu fi,ed;
    JMenuItem ne,op,sa,sas;
    public Menu()
    {
        f1=new JFrame ("notepad");
        f1.setLayout(null);
        mb=new JMenuBar();
        f1.setJMenuBar( mb);
        fi=new JMenu("File");
        ed=new JMenu("Edit");
        mb.add(fi);
        mb.add(ed);

        ne = new JMenuItem("New");
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");

        sas = new JMenuItem("Save as");

        fi.add(ne);
        fi.add(op);
        fi.add(sa);
        fi.add("-");
        fi.add(sas);




        f1.setSize(300,300);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        Menu mn = new Menu();
    }
}
