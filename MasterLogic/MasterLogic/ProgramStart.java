package MasterLogic;


public class ProgramStart 
		{        //main

	//This class calls the functions that are responsible for building the main menu
	
	public static void main(String[] args) 
	
		{
			StartScreen mainMenu = new StartScreen();  //instance of StartScreen

	         mainMenu.buildStartMenu();				//building the StartScreen
	         mainMenu.startMenu_ActionListeners();//creating the actionListeners on the menu buttons
	         mainMenu.startquitHandler();		// provides the Start and Quit handling
	         mainMenu.defaultlevel();			//sets the numberOfColours and numberOfPlaces 
	         									//variables to default
    	}
	    }
	         
	



