package MasterLogic;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

//This class creates the places of the mushrooms. It's called in the StartHandler class. 															

public class GuessedColours 
	{

	StartHandler instanceOfStartHandler;
	
	// selectedGuess.png provides the selectedIcon in case the button is not empty
	ImageIcon selectedGuess = new ImageIcon(Colour.class.getResource("selectedGuess.png"));
	
	public GuessedColours(StartHandler s)
	{
		instanceOfStartHandler = s;			//this class gets the createSelectedButtons()
		createSelectedButtons();			// function with this constructor
		
	}

	JToggleButton placeButtons[] = new JToggleButton[6];   //creates the array of places 
														   //(It's maximum size is 6)
	
	public void createSelectedButtons() 
	{

		for(int i=0;i<6;i++)
		{
			placeButtons[i] = new JToggleButton("");		//creating the components
		}
		
		for(int i=0;i<StartScreen.numOfPlaces;i++)
		{
		    placeButtons[i].setSize(60, 80);
		    placeButtons[i].setLocation(260+i*60, 100);								
		    placeButtons[i].setBackground(Color.darkGray);		//Button settings					
		    placeButtons[i].setForeground(Color.BLACK);
		    placeButtons[i].setSelectedIcon(selectedGuess);
		    instanceOfStartHandler.gameWindow.add(placeButtons[i]);
		} 
	}
	

	
	}
	
	

