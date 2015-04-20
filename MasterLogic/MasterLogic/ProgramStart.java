package MasterLogic;


public class ProgramStart {        //main program

	
	public static void main(String[] args) {
		
		
		StartScreen a = new StartScreen();
			
			
	         a.buildStartMenu();
	         a.startMenu_ActionListeners();
	         a.startquitHandler();
	         a.defaultlevel();
    	}
	    }
	         
	



