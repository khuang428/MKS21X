import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t1;
    private JTextField t2;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("C to F");
	b.addActionListener(this);
	b.setActionCommand("C to F");
	JButton b2 = new JButton("F to C");
	b2.addActionListener(this);
	b2.setActionCommand("F to C");

	t1 = new JTextField("Celsius",5);
	t2 = new JTextField("Fahrenheit",5);

	j = new JLabel("Celsius to Fahrenheit and back");
	pane.add(t1);
	pane.add(t2);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }
    public static double CtoF(double t){
	return ((t*9)/5)+32;
    }
    public static double FtoC(double t){
	return ((t-32)*5)/9;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	try{
	    if(event.equals("C to F")){
		String s = t1.getText();
		int i = Integer.parseInt(s);
		t2.setText(""+CtoF(i));
	    }
	    if(event.equals("F to C")){
		String s = t2.getText();
		int i = Integer.parseInt(s);
		t1.setText(""+FtoC(i));
	    }
	}catch(NumberFormatException ex){
	    j.setText("Please input a number");
	}
    }
 
}



