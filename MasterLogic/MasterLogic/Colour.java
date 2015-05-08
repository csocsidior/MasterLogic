package MasterLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Colour 
{
	//This class creates the colour buttons on the left & creates button array for saving 
	// the guesses
	
	//creating Icons for JButtons -> setIcon & setRolloverIcon
	Icon green = new ImageIcon(Colour.class.getResource("green.png"));
	Icon green_glow = new ImageIcon(Colour.class.getResource("green_glow.png"));
	
	Icon purple = new ImageIcon(Colour.class.getResource("purple.png"));
	Icon purple_glow = new ImageIcon(Colour.class.getResource("purple_glow.png"));

	Icon red = new ImageIcon(Colour.class.getResource("red.png"));
	Icon red_glow = new ImageIcon(Colour.class.getResource("red_glow.png"));
	
	Icon orange = new ImageIcon(Colour.class.getResource("orange.png"));
	Icon orange_glow = new ImageIcon(Colour.class.getResource("orange_glow.png"));
	
	Icon blue = new ImageIcon(Colour.class.getResource("blue.png"));
	Icon blue_glow = new ImageIcon(Colour.class.getResource("blue_glow.png"));
	
	Icon yellow = new ImageIcon(Colour.class.getResource("yellow.png"));
	Icon yellow_glow = new ImageIcon(Colour.class.getResource("yellow_glow.png"));
	
	Icon white = new ImageIcon(Colour.class.getResource("white.png"));
	Icon white_glow = new ImageIcon(Colour.class.getResource("white_glow.png"));
	
	Icon brown = new ImageIcon(Colour.class.getResource("brown.png"));
	Icon brown_glow = new ImageIcon(Colour.class.getResource("brown_glow.png"));
	
	//smaller icons for the guesses -> to save some space in the workSheet
	Icon blue_little = new ImageIcon(Colour.class.getResource("blue_36x49.png"));
	Icon red_little = new ImageIcon(Colour.class.getResource("red_36x49.png"));
	Icon green_little = new ImageIcon(Colour.class.getResource("green_36x49.png"));
	Icon orange_little = new ImageIcon(Colour.class.getResource("orange_36x49.png"));
	Icon purple_little = new ImageIcon(Colour.class.getResource("purple_36x49.png"));
	Icon yellow_little = new ImageIcon(Colour.class.getResource("yellow_36x49.png"));
	Icon white_little = new ImageIcon(Colour.class.getResource("white_36x49.png"));
	Icon brown_little = new ImageIcon(Colour.class.getResource("brown_36x49.png"));
	
	StartHandler instanceOfStartHandler;	// instances of StartHandler & GuessedColours classes
	GuessedColours instanceOfGuessedColours;

	JToggleButton colourButtons[] = new JToggleButton[8];	//creates the colours ( Maximum number is 8)
	JToggleButton guessedButtons[] = new JToggleButton[50];	//creates the array of guesses
	// a "50-element array" is considerable when there isn't more than 10 tries available to guess
	
	ItemListeners listeners = new ItemListeners();
	
	public Colour(StartHandler s)
	{
		instanceOfStartHandler = s;
		instanceOfGuessedColours = new GuessedColours(s);
	}
	
	public void createGuessButtons () //Function for creating the colourButtons
	{
		for(int i=0; i<8; i++)
		 {
			colourButtons[i] = new JToggleButton("");
		 }
		 for(int i=0; i<StartScreen.numOfColours; i++)
		 {
			 colourButtons[i].setLocation(30, 30 + i*80);

			 switch(i)
			 {
			 case 0: colourButtons[i].setIcon(orange);
			 		 colourButtons[i].setDisabledIcon(orange);	//setting the icon
			 		 colourButtons[i].setPressedIcon(orange);
			 		 colourButtons[i].setContentAreaFilled(false);
			 		 colourButtons[i].setBorderPainted(false); //these 3 settings are making the
			 		 colourButtons[i].setOpaque(false);			// buttons disappear
			 		 colourButtons[i].setRolloverIcon(orange_glow);
			 		 break;
			 		 
			 case 1: colourButtons[i].setIcon(purple);
		 		 	 colourButtons[i].setDisabledIcon(purple);
		 		 	 colourButtons[i].setPressedIcon(purple);
		 		 	 colourButtons[i].setContentAreaFilled(false);
		 		 	 colourButtons[i].setBorderPainted(false);
		 		 	 colourButtons[i].setOpaque(false);
		 		 	 colourButtons[i].setRolloverIcon(purple_glow);
			 		 break;
			 		 
			 case 2: colourButtons[i].setIcon(red);
	 		 		 colourButtons[i].setDisabledIcon(red);
	 		 		 colourButtons[i].setPressedIcon(red);
	 		 		 colourButtons[i].setContentAreaFilled(false);
	 		 		 colourButtons[i].setBorderPainted(false);
	 		 		 colourButtons[i].setOpaque(false);
	 		 		 colourButtons[i].setRolloverIcon(red_glow);
	 		 		 break;
	 		 		 
			 case 3: colourButtons[i].setIcon(blue);
	 		 		 colourButtons[i].setDisabledIcon(blue);
	 		 		 colourButtons[i].setPressedIcon(blue);
	 		 		 colourButtons[i].setContentAreaFilled(false);
	 		 		 colourButtons[i].setBorderPainted(false);
	 		 		 colourButtons[i].setOpaque(false);
	 		 		 colourButtons[i].setRolloverIcon(blue_glow);
		 		 	 break;
		 		 	 
			 case 4: colourButtons[i].setIcon(green);
			 		 colourButtons[i].setDisabledIcon(green);
			 		 colourButtons[i].setPressedIcon(green);
			 		 colourButtons[i].setContentAreaFilled(false);
			 		 colourButtons[i].setBorderPainted(false);
			 		 colourButtons[i].setOpaque(false);
			 		 colourButtons[i].setRolloverIcon(green_glow);
		 		 	 break;
		 		 	 
			 case 5: colourButtons[i].setIcon(yellow);
	 		 		 colourButtons[i].setDisabledIcon(yellow);
	 		 		 colourButtons[i].setPressedIcon(yellow);
	 		 		 colourButtons[i].setContentAreaFilled(false);
	 		 		 colourButtons[i].setBorderPainted(false);
	 		 		 colourButtons[i].setOpaque(false);
	 		 		 colourButtons[i].setRolloverIcon(yellow_glow);
 		 	 		 break;
 		 	 		 
			 case 6: colourButtons[i].setIcon(white);
		 		 	 colourButtons[i].setDisabledIcon(white);
		 		 	 colourButtons[i].setPressedIcon(white);
		 		 	 colourButtons[i].setContentAreaFilled(false);
		 		 	 colourButtons[i].setBorderPainted(false);
		 		 	 colourButtons[i].setOpaque(false);
		 		 	 colourButtons[i].setRolloverIcon(white_glow);
	 	 		 	 break;
	 	 		 	 
			 case 7: colourButtons[i].setIcon(brown);
 		 	  		 colourButtons[i].setDisabledIcon(brown);
 		 	  		 colourButtons[i].setPressedIcon(brown);
 		 	  		 colourButtons[i].setContentAreaFilled(false);
 		 	  		 colourButtons[i].setBorderPainted(false);
 		 	  		 colourButtons[i].setOpaque(false);
 		 	  		 colourButtons[i].setRolloverIcon(brown_glow);
	 	 		 	 break;

	 	 	default: 
	 	 			break;
			 }
			 colourButtons[i].setSize(60, 80);
			//adding every component to the panel
			 StartHandler.gameWindow.add(colourButtons[i]); 
		 }
	}

	public void createGuessedButtons() //this function saves the guesses in a button array
	{
		for(int i=0;i<StartScreen.numOfPlaces;i++)
		{
			guessedButtons[i] = new JToggleButton("");
			guessedButtons[i].setLocation(300+i*40, 100+(ItemListeners.tries*60));
			
			 switch(ItemListeners.containerForGuessedButtons[i]) //copying the values from 
			 {													 //the placeButtons to the guessedButtons
			 case 0: guessedButtons[i].setIcon(orange_little);
		 		 	 guessedButtons[i].setDisabledIcon(orange_little);
		 		 	 guessedButtons[i].setPressedIcon(orange_little);
		 		 	 guessedButtons[i].setContentAreaFilled(false);
		 		 	 guessedButtons[i].setBorderPainted(false);
		 		 	 guessedButtons[i].setOpaque(false);
			 		 break;
 
			 case 1: guessedButtons[i].setIcon(purple_little);
			 		 guessedButtons[i].setDisabledIcon(purple_little);
			 		 guessedButtons[i].setPressedIcon(purple_little);
			 		 guessedButtons[i].setContentAreaFilled(false);
			 		 guessedButtons[i].setBorderPainted(false);
			 		 guessedButtons[i].setOpaque(false);
			 		 break;
			 
			 case 2: guessedButtons[i].setIcon(red_little);
	 		 		 guessedButtons[i].setDisabledIcon(red_little);
	 		 		 guessedButtons[i].setPressedIcon(red_little);
	 		 		 guessedButtons[i].setContentAreaFilled(false);
	 		 		 guessedButtons[i].setBorderPainted(false);
	 		 		 guessedButtons[i].setOpaque(false);
	 		 		 break;
	 		 		 
			 case 3: guessedButtons[i].setIcon(blue_little);
 		 	 		 guessedButtons[i].setDisabledIcon(blue_little);
 		 	 		 guessedButtons[i].setPressedIcon(blue_little);
 		 	 		 guessedButtons[i].setContentAreaFilled(false);
 		 	 		 guessedButtons[i].setBorderPainted(false);
 		 	 		 guessedButtons[i].setOpaque(false);
		 		 	 break;
		 		 	 
			 case 4: guessedButtons[i].setIcon(green_little);
			 		 guessedButtons[i].setDisabledIcon(green_little);
			 		 guessedButtons[i].setPressedIcon(green_little);
			 		 guessedButtons[i].setContentAreaFilled(false);
			 		 guessedButtons[i].setBorderPainted(false);
			 		 guessedButtons[i].setOpaque(false);
		 		 	 break;
		 		 	 
			 case 5: guessedButtons[i].setIcon(yellow_little);
			 		 guessedButtons[i].setDisabledIcon(yellow_little);
			 		 guessedButtons[i].setPressedIcon(yellow_little);
			 		 guessedButtons[i].setContentAreaFilled(false);
			 		 guessedButtons[i].setBorderPainted(false);
			 		 guessedButtons[i].setOpaque(false);
 		 	 		 break;
 		 	 		 
			 case 6: guessedButtons[i].setIcon(white_little);
			 		 guessedButtons[i].setDisabledIcon(white_little);
			 		 guessedButtons[i].setPressedIcon(white_little);
			 		 guessedButtons[i].setContentAreaFilled(false);
			 		 guessedButtons[i].setBorderPainted(false);
			 		 guessedButtons[i].setOpaque(false);
	 	 		 	 break;
	 	 		 	 
			 case 7: guessedButtons[i].setIcon(brown_little);
			 		 guessedButtons[i].setDisabledIcon(brown_little);
			 		 guessedButtons[i].setPressedIcon(brown_little);
			 		 guessedButtons[i].setContentAreaFilled(false);
			 		 guessedButtons[i].setBorderPainted(false);
			 		 guessedButtons[i].setOpaque(false);
	 	 		 	 break;

	 	 	default: break;
			 }
			 guessedButtons[i].setSize(36, 49);
			 StartHandler.gameWindow.add(guessedButtons[i]);
		}
	}

	public void createItemListeners()   //creating instance of ItemListeners
	{
		  ItemListeners listeners = new ItemListeners(this, 
		  instanceOfGuessedColours, instanceOfStartHandler);
		  listeners.createItemListeners();	
		  listeners.generate(); //function that provides the random numbers is called here
	}
}

