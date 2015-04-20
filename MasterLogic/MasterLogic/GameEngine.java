package MasterLogic;

public class GameEngine
{

	int[] generatedTempNums = new int[StartScreen.numOfPlaces];
	int[] arraycheck = new int[StartScreen.numOfPlaces];
	int white=0;
	int black=0;
	int nomatch=0;
	
	static int tempwhite = 0;
	static int tempblack = 0;
	static int tempnomatch = 0;
	
	public GameEngine()
	{}
	
	public  void check()
	{
		
	System.out.println();
	for (int i = 0; i< StartScreen.numOfPlaces ; i++)
	{
		
		System.out.print(ItemListeners.container[i]);
	}
	
	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		generatedTempNums[i] = ItemListeners.generatedNums[i] ;
		
	}

	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		if (ItemListeners.container[i] == generatedTempNums[i] )
		{
			white++;
			ItemListeners.container[i]= 8;
			generatedTempNums[i]= 9;
		}
		}
	
	for (int i = 0; i<StartScreen.numOfPlaces ; i++)
	{
		for (int j = 0; j<StartScreen.numOfPlaces ; j++)
		{
			if (ItemListeners.container[i] == generatedTempNums[j] )
			{
				black++;
				ItemListeners.container[i]= 8;
				generatedTempNums[j]= 9;
				break;
			}
			
		}
	}
	nomatch = StartScreen.numOfPlaces-(black+white);
	System.out.println();
	System.out.println("Black:  " + black +" "+ "White:" + white + " " + "No match:" + nomatch);
	tempblack = black;
	tempwhite = white;
	tempnomatch = nomatch;
	
	
	}	

}
		
		
		
		
	
	
	

	

