import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Coursework110 implements ActionListener
{

	//Create the Frame and Panel
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	
	//Import the Images for the Puzzle
	private ImageIcon a = new ImageIcon("bart0.jpg");
	private ImageIcon b = new ImageIcon("bart1.jpg");
	private ImageIcon c = new ImageIcon("bart2.jpg");
	private ImageIcon d = new ImageIcon("bart3.jpg");
	private ImageIcon e = new ImageIcon("bart4.jpg");
	private ImageIcon f = new ImageIcon("bart5.jpg");
	private ImageIcon g = new ImageIcon("bart6.jpg");
	private ImageIcon h = new ImageIcon("bart7.jpg");
	private ImageIcon i = new ImageIcon("bart8.jpg");
	private ImageIcon j = new ImageIcon("bart9.jpg");
	private ImageIcon k = new ImageIcon("bart10.jpg");
	private ImageIcon l = new ImageIcon("bart11.jpg");
	
	//Create the Buttons
	private JButton button1 = new JButton(a);
	private JButton button2 = new JButton(b);
	private JButton button3 = new JButton(c);
	private JButton button4 = new JButton(d);
	private JButton button5 = new JButton(e);
	private JButton button6 = new JButton(f);
	private JButton button7 = new JButton(g);
	private JButton button8 = new JButton(h);
	private JButton button9 = new JButton(i);
	private JButton button10 = new JButton(j);
	private JButton button11 = new JButton(k);
	private JButton button12 = new JButton(l);
	
	//Array created for the Scoreboard
	private JLabel[] names = new JLabel[10];
	private JLabel[] scores = new JLabel[10];
	
	//Counter for the Scoreboard (click counter for puzzle)
	int counter = 0;
	
	//Implemeneted the Grid Layout
	GridLayout grid = new GridLayout(3,4);
	
	public Coursework110()
	{
		
		//Describe each image in a simple format
		a.setDescription("bart0");
		b.setDescription("bart1");
		c.setDescription("bart2");
		d.setDescription("bart3");
		e.setDescription("bart4");
		f.setDescription("bart5");
		g.setDescription("bart6");
		h.setDescription("bart7");
		i.setDescription("bart8");
		j.setDescription("bart9");
		k.setDescription("bart10");
		l.setDescription("bart11");
		
		//Implement an ActionCommand to refer to each Button easier
		button1.setActionCommand("1");
		button2.setActionCommand("2");
		button3.setActionCommand("3");
		button4.setActionCommand("4");
		button5.setActionCommand("5");
		button6.setActionCommand("6");
		button7.setActionCommand("7");
		button8.setActionCommand("8");
		button9.setActionCommand("9");
		button10.setActionCommand("10");
		button11.setActionCommand("11");
		button12.setActionCommand("12");
		
		//Add each Button to the Panel
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
		
		//Set the Frame details and make it visible
		frame.setContentPane(panel);
		frame.setTitle("Swingin' Simpsons");
		frame.setSize(450,370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(grid);
		frame.setVisible(true);
		
		//Activate ActionListener for each Button
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(this);
		button11.addActionListener(this);
		button12.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		JButton pressedButton = (JButton) e.getSource();
		String command = pressedButton.getActionCommand();
		
		//PRESSING BUTTON 1
		if(command.equals("1"))
		{
			if(((ImageIcon)button2.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button2.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button5.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button5.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			
		
		}
		
		//PRESSING BUTTON 2
		if(command.equals("2"))
		{
			if(((ImageIcon)button1.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button1.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button3.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button3.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button6.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button6.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
		
		//PRESSING BUTTON 3
		if(command.equals("3"))
		{
			if(((ImageIcon)button2.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button2.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button4.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button4.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button7.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button7.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		
			}
		
		//PRESSING BUTTON 4
		if(command.equals("4"))
		{
			if(((ImageIcon)button3.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button3.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button8.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button8.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
		
		//PRESSING BUTTON 5
		if(command.equals("5"))
		{
			if(((ImageIcon)button1.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button1.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button6.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button6.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button9.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button9.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
				
		//PRESSING BUTTON 6
		if(command.equals("6"))
		{
			if(((ImageIcon)button2.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button2.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button5.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button5.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button7.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button7.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button10.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button10.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
		
		//PRESSING BUTTON 7
		if(command.equals("7"))
		{
			if(((ImageIcon)button3.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button3.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button6.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button6.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button8.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button8.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button11.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button11.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
		
		//PRESSING BUTTON 8
		if(command.equals("8"))
		{
			if(((ImageIcon)button4.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button4.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button7.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button7.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button12.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button12.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		
		}
				
		//PRESSING BUTTON 9
		if(command.equals("9"))
		{
			if(((ImageIcon)button5.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button5.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button10.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button10.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
			
		//PRESSING BUTTON 10
		if(command.equals("10"))
		{
			if(((ImageIcon)button6.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button6.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button9.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button9.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button11.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button11.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
		
		//PRESSING BUTTON 11
		if(command.equals("11"))
		{
			if(((ImageIcon)button7.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button7.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button10.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button10.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button12.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button12.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
		}
				
		//PRESSING BUTTON 12
		if(command.equals("12"))
		{
			if(((ImageIcon)button8.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button8.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			if(((ImageIcon)button11.getIcon()).getDescription().equals("bart0"))
			{
				incrementScore();
				SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run()
					{
						button11.setIcon(pressedButton.getIcon());
						pressedButton.setIcon(a);
					}
				});
			}
			
		}

	}
	
	public void scoreboard()
	
	{
		//Create the Frame and Panel for the Scoreboard
		JFrame scoreboardFrame = new JFrame();
		JPanel scoreboardPanel = new JPanel();
		
		//Create an array of Labels (for inputted names)
		for(int i = 0; i < 11; i ++)
		{
			JLabel name = new JLabel("");
			scoreboardPanel.add(name);
		}
		
		//Create an array of Labels (for inputted scores)
		for(int j = 0; j < 10; j ++)
		{
			JLabel score = new JLabel("NONE");
			scoreboardPanel.add(score);
			scores[j] = score;
		}
		scores[0].setText("Score:");
		
		//Create text field for entering name of player
		JTextField textField = new JTextField();
		
		//Add an ActionListener so that when user presses enter the label is updated with current name.
		textField.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
    {
		scores[1].setText(textField.getText());

    }});
        
        //Add the text field to the panel and use grid layout
		scoreboardPanel.add(textField);
		GridLayout grid = new GridLayout(11,2);
		
		//Set the Scoreboard Frame details and make it visible
		scoreboardFrame.setContentPane(scoreboardPanel);
		scoreboardFrame.setTitle("HIGH SCORES");
		scoreboardFrame.setSize(450,300);
		scoreboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scoreboardPanel.setLayout(grid);
		scoreboardFrame.setVisible(true);
	}

	public void incrementScore()
	{
		//Implement the counter
		counter++;
		//Set the label to current click counter
		scores[2].setText("" + counter);
	}
		
}
