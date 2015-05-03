package MasterLogic;

public class GameEngine
{
	//This class is the engine of the game. The checking algorithm is written here. 
	
	int[] generatedTempNums = new int[StartScreen.numOfPlaces]; //this class will make changes on
																//this array only, not on the original 
																//generatedNums array
	int[] arraycheck = new int[StartScreen.numOfPlaces]; //this array provides the information about
														 //the current matches
	int white=0;
	int black=0;		// variables for the sticks
	int nomatch=0;
	
	static int tempwhite = 0;
	static int tempblack = 0;	//they will be used for further calculation
	static int tempnomatch = 0;
	
	public GameEngine()
	{}							//constructor with no parameter
	
	public  void check()		//checking algorithm
	{
		
	System.out.println();
	for (int i = 0; i< StartScreen.numOfPlaces ; i++)
	{
		
		System.out.print(ItemListeners.container[i]); //container is always filled up with
													  //the guesses
	}
	
	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		generatedTempNums[i] = ItemListeners.generatedNums[i] ; //this array contains the generated 
																//random numbers
	}

	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		if (ItemListeners.container[i] == generatedTempNums[i] ) //comparing
		{
			white++;	//looking for guesses that are correct in both colour & position
			ItemListeners.container[i]= 8;  
			generatedTempNums[i]= 9;
			//if two numbers are equal, we change the matching values in both of them.Since we
			//have colours from 0 to 7 only, the number of '8' and '9' is never used. So changing to 
			//these values will prevent to find another match. 
		}
	}
	
	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		for (int j = 0; j<StartScreen.numOfPlaces ; j++)
		{
			if (ItemListeners.container[i] == generatedTempNums[j] )
			{
				black++;	//looking for guesses that are correct in colour
				ItemListeners.container[i]= 8;
				generatedTempNums[j]= 9;       //changing the values for the same reason
				break;    //if there's any match during one iteration
			}
		}
	}
	nomatch = StartScreen.numOfPlaces-(black+white);
	System.out.println();                             //these are for testing
	System.out.println("Black:  " + black +" "+ "White:" + white + " " + "No match:" + nomatch);
	tempblack = black;
	tempwhite = white;
	tempnomatch = nomatch;

	}	
}
		
		
		
		
	
	
	

	

