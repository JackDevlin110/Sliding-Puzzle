import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class coursework implements ActionListener
{
	//Set Frame and Panel to add Buttons into the GUI
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	//Link each Button with the picture stored in the same folder as the files
	ImageIcon a = new ImageIcon("bart0.jpg");
	JButton button1 = new JButton(a);
	
	ImageIcon b = new ImageIcon("bart1.jpg");
	JButton button2 = new JButton(b);
	
	ImageIcon c = new ImageIcon("bart2.jpg");
	JButton button3 = new JButton(c);
	
	ImageIcon d = new ImageIcon("bart3.jpg");
	JButton button4 = new JButton(d);
	
	ImageIcon e = new ImageIcon("bart4.jpg");
	JButton button5 = new JButton(e);
	
	ImageIcon f = new ImageIcon("bart5.jpg");
	JButton button6 = new JButton(f);
	
	ImageIcon g = new ImageIcon("bart6.jpg");
	JButton button7 = new JButton(g);
	
	ImageIcon h = new ImageIcon("bart7.jpg");
	JButton button8 = new JButton(h);
	
	ImageIcon i = new ImageIcon("bart8.jpg");
	JButton button9 = new JButton(i);
	
	ImageIcon j = new ImageIcon("bart9.jpg");
	JButton button10 = new JButton(j);
	
	ImageIcon k = new ImageIcon("bart10.jpg");
	JButton button11 = new JButton(k);
	
	ImageIcon l = new ImageIcon("bart11.jpg");
	JButton button12 = new JButton(l);
	
	//set Grid Layout to represent the GUI
	GridLayout grid = new GridLayout(3,4);
	
	public coursework()
	{
		
		//Add the Buttons into the panels
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		
		//Set the Frame title and size and make it visible on the page
		frame.setContentPane(panel);
		frame.setTitle("Swingin' Simpsons");
		frame.setSize(450,370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(grid);
		frame.setVisible(true);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
}
