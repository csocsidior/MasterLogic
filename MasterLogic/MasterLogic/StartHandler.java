package MasterLogic;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartHandler  implements ActionListener 

//Handler class of the Start button
{
	StartScreen start;
	Sound sound = new Sound();
	Colours_Guessed colourplaces;
	
	static JPanel gameWindow = new JPanel();
	JButton back = new JButton("Quit to menu");
	
	public StartHandler(StartScreen s)
	{
		start = s;
	}
	
	public StartHandler()
	{}

	public void actionPerformed(ActionEvent event)
	{
		back.setSize(117, 80);
	    back.setLocation(50, 610);

		start.firstScreen.setVisible(false);												
		gameWindow.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		gameWindow.setLayout(null);
		gameWindow.setVisible(true);
		gameWindow.setBackground(Color.LIGHT_GRAY);
		gameWindow.setPreferredSize(new Dimension(800, 700));
		gameWindow.add(back);
		start.f.add(gameWindow);
		start.f.pack();

		Colour colours = new Colour(this);				
		colours.createGuessButtons();
		colours.createItemListeners();
		
		sound.playSound("Button_Push.wav");
		
		
	
	
	
	
	
	
	}
}
