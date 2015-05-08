package MasterLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Stick 
{
//This class is providing the Sticks. The sticks are giving feedback about the guesses
	
	GameEngine engine = new GameEngine();
	StartHandler instanceOfStartHandler = new StartHandler();
	
	Icon blackStick = new ImageIcon(Colour.class.getResource("stick_black.png"));
	Icon whiteStick = new ImageIcon(Colour.class.getResource("stick_white.png"));
	
	int[] sticks = new int[StartScreen.numOfPlaces];   //container array for the sticks
	JButton stickButtons[] = new JButton[6];	// these buttons are giving feedback on the GUI

	public Stick()
	{}					//constructor with no parameter
	
	public void generateStickArray()   //fills the 'sticks' array with the colour-codes
	{
		int localBlack = GameEngine.tempblack;
		int localWhite = GameEngine.tempwhite;			//for using local variables 
		int localNomatch = GameEngine.tempnomatch;
		
		for(int i = 0; i < StartScreen.numOfPlaces; i++)
		{
		sticks[i]=5;					//Since we are not using 5, the values are undefined 
		}
		for(int i = 0; i < localBlack; i++)
		{
			sticks[i] = 0;	// '0' means, there are guesses that are correct in colour
							//  - > black stick
		}
		for(int i = localBlack; i < (localBlack + localWhite); i++)
		{
			sticks[i] = 1;	// '1' means, there are guesses that are correct in both colour & place
							//  - > white stick
		}
		for(int i = (localBlack + localWhite) ; i < (localBlack + 
								  localWhite + localNomatch); i++)
		{
			sticks[i]=9;	//in cases there are no matches
		}
	}

	public void generateSticks()	//generates the sticks in the GUI
	{
		int counter = 0;			//the local counter variable
		for(int i = 0; i < StartScreen.numOfPlaces; i++)
		{
			stickButtons[i] = new JButton("");
			stickButtons[i].setSize(15, 50);
			stickButtons[i].setLocation(585 +(counter*10), 105+ (ItemListeners.tries*60));
			
			//switch-case for deciding the icons displayed on the sticks array
			switch(sticks[i])
			{
			case 0: 
				stickButtons[i].setIcon(blackStick);
				stickButtons[i].setDisabledIcon(blackStick);
				stickButtons[i].setPressedIcon(blackStick);
				stickButtons[i].setContentAreaFilled(false);
				stickButtons[i].setBorderPainted(false);
				stickButtons[i].setOpaque(false);
				break;
			case 1: 
				stickButtons[i].setIcon(whiteStick);
				stickButtons[i].setDisabledIcon(whiteStick);
				stickButtons[i].setPressedIcon(whiteStick);
				stickButtons[i].setContentAreaFilled(false);
				stickButtons[i].setBorderPainted(false);
				stickButtons[i].setOpaque(false);
				break;
			case 9: 
				stickButtons[i].setContentAreaFilled(false);
				stickButtons[i].setBorderPainted(false);
				stickButtons[i].setOpaque(false);
				break;
			default: 
 	 			break;
			}
			StartHandler.gameWindow.add(stickButtons[i]);
			counter++;
		}
	}
}
