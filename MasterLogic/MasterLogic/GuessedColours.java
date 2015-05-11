package MasterLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

//This class creates the places of the mushrooms. It's called in the StartHandler class. 															

public class GuessedColours 
	{
	StartHandler instanceOfStartHandler;   // instance of StartHandler
	
	// selectedGuess.png provides the selectedIcon in case the button is not empty
	Icon backOfMush = new ImageIcon(StartScreen.class.getResource("dirt.png"));
	Icon selectedGuess = new ImageIcon(StartScreen.class.getResource("dirt_selected.png"));
	
	
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
		    placeButtons[i].setLocation(260+i*60, 110);		
		    placeButtons[i].setIcon(backOfMush);
		    placeButtons[i].setDisabledIcon(backOfMush);	//setting the icon
		    placeButtons[i].setPressedIcon(backOfMush);
		    placeButtons[i].setContentAreaFilled(false);
		    placeButtons[i].setBorderPainted(false); //these 3 settings are making the
		    placeButtons[i].setOpaque(false);			
		    placeButtons[i].setSelectedIcon(selectedGuess);
		    StartHandler.gameWindow.add(placeButtons[i]);  
		} 
	}
	}
	
	

