package MasterLogic;


public class ProgramStart {        //main program

	
	public static void main(String[] args) {
		
		
		StartScreen mainMenu = new StartScreen();
			
			
	         mainMenu.buildStartMenu();
	         mainMenu.startMenu_ActionListeners();
	         mainMenu.startquitHandler();
	         mainMenu.defaultlevel();
    	}
	    }
	         
	



