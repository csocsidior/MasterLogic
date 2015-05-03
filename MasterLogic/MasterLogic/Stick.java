package MasterLogic;

import java.awt.Color;
import javax.swing.JButton;

public class Stick {

	//This class is providing the Sticks. The sticks are giving feedback about the guesses
	
	GameEngine engine = new GameEngine();
	StartHandler instanceOfStartHandler = new StartHandler();
	
	int[] sticks = new int[StartScreen.numOfPlaces];
	JButton stickButtons[] = new JButton[6];	

	public Stick()
	{}
	
	public void generateStickArray()
	{
		int localBlack = engine.tempblack;
		int localWhite = GameEngine.tempwhite;
		int localNomatch = GameEngine.tempnomatch;
		
		for(int i = 0; i < StartScreen.numOfPlaces; i++)
		{
		sticks[i]=5;
		}
		
		for(int i = 0; i < localBlack; i++)
		{
			sticks[i] = 0;
		}
		
		for(int i = localBlack; i < (localBlack + localWhite); i++)
		{
			sticks[i] = 1;
		}
		
		for(int i = (localBlack + localWhite) ; i < (localBlack + localWhite + localNomatch); i++)
		{
			sticks[i]=9;
		}
		
		for(int i = 0; i < StartScreen.numOfPlaces; i++)
		{
		System.out.print("_" + sticks[i]);
		}
		System.out.print("_BLACK_ : " + localBlack);
	
	}
	
	public void generateSticks()
	{
		int counter = 0;
		for(int i = 0; i < StartScreen.numOfPlaces; i++)
		{
			
			stickButtons[i] = new JButton("");
			stickButtons[i].setSize(30, 30);
			stickButtons[i].setLocation(570 +(counter*30), 100+ (ItemListeners.tries*60));
			
			switch(sticks[i])
			{
			case 0: 
				stickButtons[i].setBackground(Color.BLACK);
				break;
			case 1: 
				stickButtons[i].setBackground(Color.WHITE);
				break;
			case 9: 
				stickButtons[i].setBackground(Color.GRAY);
				break;
			default: 
 	 			break;
			}
			StartHandler.gameWindow.add(stickButtons[i]);
			counter++;
		}
		
	}
	
}
