import javax.swing.*;
public class ProgressBar 
{

	JFrame f;
	static JProgressBar pb;
    public ProgressBar ()
	{
		f = new JFrame("progress bar");
        f.setLayout(null);
        pb = new JProgressBar();
		pb.setBounds(200,100,100,20);
        pb.setValue(0);
		pb.setStringPainted(true);
		f.add(pb);
		f.setSize(400,400);
		f.setVisible(true);
        pro();
    }
    public static void pro ()
    {
        int i=0;
        try{
            while(i<=100)
            {
                pb.setValue(i +5);
                Thread.sleep(1000);
                i+=10;
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
	}
	public static void main(String args[]) {
		ProgressBar p1 = new ProgressBar();
	    
    }
    
}
