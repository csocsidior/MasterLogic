package MasterLogic;

import java.awt.Color;
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

	Icon red = new ImageIcon(Colour.class.getResource("red.png"));
	Icon red_glow = new ImageIcon(Colour.class.getResource("red_glow.png"));
	
	Icon orange = new ImageIcon(Colour.class.getResource("orange.png"));
	Icon orange_glow = new ImageIcon(Colour.class.getResource("orange_glow.png"));
	
	Icon blue = new ImageIcon(Colour.class.getResource("blue.png"));
	Icon blue_flow = new ImageIcon(Colour.class.getResource("blue_glow.png"));
	
	//smaller icons for the guesses -> to save some space in the workSheet
	Icon blue_little = new ImageIcon(Colour.class.getResource("blue_36x49.png"));
	Icon red_little = new ImageIcon(Colour.class.getResource("red_36x49.png"));
	Icon green_little = new ImageIcon(Colour.class.getResource("green_36x49.png"));
	Icon orange_little = new ImageIcon(Colour.class.getResource("orange_36x49.png"));
	
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
			 		 colourButtons[i].setDisabledIcon(orange);
			 		 colourButtons[i].setPressedIcon(orange);
			 		 colourButtons[i].setContentAreaFilled(false);
			 		 colourButtons[i].setBorderPainted(false); //these 3 settings are making the
			 		 colourButtons[i].setOpaque(false);			// buttons disappear
			 		 colourButtons[i].setRolloverIcon(orange_glow);
			 		 break;
			 		 
			 case 1: colourButtons[i].setBackground(Color.WHITE);
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
	 		 		 colourButtons[i].setRolloverIcon(blue_flow);
		 		 	 break;
		 		 	 
			 case 4: colourButtons[i].setIcon(green);
			 		 colourButtons[i].setDisabledIcon(green);
			 		 colourButtons[i].setPressedIcon(green);
			 		 colourButtons[i].setContentAreaFilled(false);
			 		 colourButtons[i].setBorderPainted(false);
			 		 colourButtons[i].setOpaque(false);
			 		 colourButtons[i].setRolloverIcon(green_glow);
		 		 	 break;
		 		 	 
			 case 5: colourButtons[i].setBackground(Color.BLACK);
 		 	 		 break;
 		 	 		 
			 case 6: colourButtons[i].setBackground(Color.ORANGE);
	 	 		 	 break;
	 	 		 	 
			 case 7: colourButtons[i].setBackground(Color.PINK);
	 	 		 	 break;

	 	 	default: 
	 	 			break;
			 }
			 
			 colourButtons[i].setSize(60, 80);
			 instanceOfStartHandler.gameWindow.add(colourButtons[i]); //adding everything to the panel
		 }
	}
	
	
	public void createGuessedButtons() //this function saves the guesses in a button array
	{
		
		System.out.println(""+ ItemListeners.tries);  //for testing
		
		for(int i=0;i<StartScreen.numOfPlaces;i++)
		{
			guessedButtons[i] = new JToggleButton("");
			guessedButtons[i].setLocation(300+i*40, 100+(ItemListeners.tries*60));
			
			 switch(ItemListeners.containerForGuessedButtons[i])   //copying the values from 
			 {													  //the placeButtons to the guessedButtons
			 
			 case 0: guessedButtons[i].setIcon(orange_little);
		 		 	 guessedButtons[i].setDisabledIcon(orange_little);
		 		 	 guessedButtons[i].setPressedIcon(orange_little);
		 		 	 guessedButtons[i].setContentAreaFilled(false);
		 		 	 guessedButtons[i].setBorderPainted(false);
		 		 	 guessedButtons[i].setOpaque(false);
			 		 break;
			 
			 		 
			 case 1: guessedButtons[i].setBackground(Color.WHITE);
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
		 		 	 
			 case 5: guessedButtons[i].setBackground(Color.BLACK);
 		 	 		 break;
 		 	 		 
			 case 6: guessedButtons[i].setBackground(Color.ORANGE);
	 	 		 	 break;
	 	 		 	 
			 case 7: guessedButtons[i].setBackground(Color.PINK);
	 	 		 	 break;

	 	 	default: 
	 	 			break;
			 }
			 guessedButtons[i].setSize(36, 49);
			 instanceOfStartHandler.gameWindow.add(guessedButtons[i]);
			
		}
	}
	
	
	public void createItemListeners()   //creating instance of ItemListeners
	{
		  ItemListeners listeners = new ItemListeners(this, instanceOfGuessedColours, instanceOfStartHandler);
		  listeners.createItemListeners();	
		  listeners.generate();      //function that provides the random numbers is called here
	}
	
	
}

