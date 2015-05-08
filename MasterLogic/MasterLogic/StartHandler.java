package MasterLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartHandler  implements ActionListener 

//Handler class of the Start button

{
	StartScreen start;
	Sound sound = new Sound();		//instances of classes
	GuessedColours colourplaces;
	
	Icon green = new ImageIcon(Colour.class.getResource("green.png"));
	Icon red = new ImageIcon(Colour.class.getResource("red.png"));
	Icon orange = new ImageIcon(Colour.class.getResource("orange.png")); //default icons
	Icon blue = new ImageIcon(Colour.class.getResource("blue.png"));
	Icon purple = new ImageIcon(Colour.class.getResource("purple.png"));
	Icon yellow = new ImageIcon(Colour.class.getResource("yellow.png"));
	Icon white = new ImageIcon(Colour.class.getResource("white.png"));
	Icon brown = new ImageIcon(Colour.class.getResource("brown.png"));

	
	//dashBoard background 
	Icon bgroundImage1 = new ImageIcon(StartScreen.class.getResource("mushroomBack1.png"));
	Icon bgroundImage2 = new ImageIcon(StartScreen.class.getResource("mushroomBack2.png"));
	Icon bgroundImage3 = new ImageIcon(StartScreen.class.getResource("mushroomBack3.png"));
	
	//background label on the dashBoard 
	Icon backOfMush = new ImageIcon(StartScreen.class.getResource("backback.png"));
	
	static JPanel gameWindow = new JPanel();	// static gameBoard panel
	JLabel coverlabel = new JLabel("Mushroom code");  //The guesses are hidden behind it
	JLabel imagelabel1 = new JLabel("", bgroundImage1,JLabel.CENTER);
	JLabel imagelabel2 = new JLabel("", bgroundImage2,JLabel.CENTER); 
	JLabel imagelabel3 = new JLabel("", bgroundImage3,JLabel.CENTER);
	JLabel mushroomBack [] = new JLabel[8];	   
	JLabel numberOfGuess [] = new JLabel[10];  //the numbering of the board

	JButton generatedMushroomArray[] = new JButton[6];	//array of the generated colours

	public StartHandler(StartScreen s)
	{
		start = s;			//constructor for StartScreen class
	}
	public StartHandler()	//constructor for Stick class
	{}
	
	public void createMushroomLabels() //creates the preferred size of the dashBoard
	{
		for(int i=0; i< StartScreen.numOfColours; i++)
		{
			mushroomBack[i] = new JLabel("", backOfMush,JLabel.CENTER);
			mushroomBack[i].setSize(60, 80);
			mushroomBack[i].setLocation(30, 30+i*80);
			gameWindow.add(mushroomBack[i]);
			gameWindow.setComponentZOrder(mushroomBack[i], gameWindow.getComponentCount()-1);
		}
		//creates the numbering ->> (numbering of the guesses)
		for(int i=0; i< 10; i++)
		{
			numberOfGuess[i] = new JLabel(""+(i+1),JLabel.CENTER);
			numberOfGuess[i].setSize(15, 15);
			numberOfGuess[i].setLocation(190, 125 + 60*i);
			numberOfGuess[i].setBackground(Color.CYAN);
			gameWindow.add(numberOfGuess[i]);
		}
	}
	
	public void createBackgroundLabels()
	{
		switch(StartScreen.numOfColours)
		 {
		case 6 : int i = 0;
				 imagelabel1.setSize(120, 540 + i*80);		
				 gameWindow.add(imagelabel1);
				 gameWindow.setComponentZOrder(imagelabel1, gameWindow.getComponentCount()-1);
				 break;
				 
		case 7 : i = 1;
		 		 imagelabel2.setSize(120, 540 + i*80);		
		         gameWindow.add(imagelabel2);
		         gameWindow.setComponentZOrder(imagelabel2, gameWindow.getComponentCount()-1);
		         break;
		         
		case 8 : i = 2;
		 		 imagelabel3.setSize(120, 540 + i*80);		
		 		 gameWindow.add(imagelabel3);
		 		 gameWindow.setComponentZOrder(imagelabel3, gameWindow.getComponentCount()-1);
				 break;
				 
		default: break;	 
		 }
	}
	
	public void createGeneratedMushrooms() // adds the generated mushrooms to the panel
	{
		for(int i=0;i<StartScreen.numOfPlaces;i++)
		{
			generatedMushroomArray[i] = new JButton("");
			generatedMushroomArray[i].setLocation(260+i*60, 5);
			
			 switch(ItemListeners.generatedNums[i])
			 {
			 case 0: generatedMushroomArray[i].setIcon(orange);
			 		 generatedMushroomArray[i].setDisabledIcon(orange);
			 		 generatedMushroomArray[i].setPressedIcon(orange);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
			 		 break;

			 case 1: generatedMushroomArray[i].setIcon(purple);
	 		 		 generatedMushroomArray[i].setDisabledIcon(purple);
	 		 		 generatedMushroomArray[i].setPressedIcon(purple);
	 		 		 generatedMushroomArray[i].setContentAreaFilled(false);
	 		 		 generatedMushroomArray[i].setBorderPainted(false);
	 		 		 generatedMushroomArray[i].setOpaque(false);
			 		 break;
			 
			 case 2: generatedMushroomArray[i].setIcon(red);
			 		 generatedMushroomArray[i].setDisabledIcon(red);
			 		 generatedMushroomArray[i].setPressedIcon(red);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
	 		 		 break;
	 		 		 
			 case 3: generatedMushroomArray[i].setIcon(blue);
			 		 generatedMushroomArray[i].setDisabledIcon(blue);
			 		 generatedMushroomArray[i].setPressedIcon(blue);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
		 		 	 break;
		 		 	 
			 case 4: generatedMushroomArray[i].setIcon(green);
			 		 generatedMushroomArray[i].setDisabledIcon(green);
			 		 generatedMushroomArray[i].setPressedIcon(green);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
		 		 	 break;
		 		 	 
			 case 5: generatedMushroomArray[i].setIcon(yellow);
	 		 	     generatedMushroomArray[i].setDisabledIcon(yellow);
	 		 	     generatedMushroomArray[i].setPressedIcon(yellow);
	 		 	     generatedMushroomArray[i].setContentAreaFilled(false);
	 		 	     generatedMushroomArray[i].setBorderPainted(false);
	 		 	     generatedMushroomArray[i].setOpaque(false);
 		 	 		 break;
 		 	 		 
			 case 6: generatedMushroomArray[i].setIcon(white);
			 		 generatedMushroomArray[i].setDisabledIcon(white);
			 		 generatedMushroomArray[i].setPressedIcon(white);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
	 	 		 	 break;
	 	 		 	 
			 case 7: generatedMushroomArray[i].setIcon(white);
			 		 generatedMushroomArray[i].setDisabledIcon(white);
			 		 generatedMushroomArray[i].setPressedIcon(white);
			 		 generatedMushroomArray[i].setContentAreaFilled(false);
			 		 generatedMushroomArray[i].setBorderPainted(false);
			 		 generatedMushroomArray[i].setOpaque(false);
	 	 		 	 break;

	 	 	default: break;	
			 }
			 generatedMushroomArray[i].setSize(60, 81);
			 gameWindow.add(generatedMushroomArray[i]);
		}
	}

	public void actionPerformed(ActionEvent event)
	{
		start.firstScreen.setVisible(false);												
		gameWindow.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		gameWindow.setLayout(null);
		gameWindow.setVisible(true);
		gameWindow.setBackground(Color.LIGHT_GRAY);
		gameWindow.setPreferredSize(new Dimension(800, 700));
		start.frame.add(gameWindow);
		start.frame.pack();

		switch(StartScreen.numOfColours)
		 {
		case 6 : int i = 0;
				 coverlabel.setSize(240+ i*60,90);
				 break;
				 
		case 7 : i = 1;
				 coverlabel.setSize(240+ i*60,90);
		         break;
		         
		case 8 : i = 2;
				 coverlabel.setSize(240+ i*60,90);
				 
		default: break; 
		 }
		
		coverlabel.setLocation(260, 5);									//label of the firstScreen
        coverlabel.setFont(new java.awt.Font("Times New Roman", 1, 30));
        coverlabel.setOpaque(true);
        coverlabel.setForeground (Color.BLACK);
        gameWindow.add(coverlabel);
		
		Colour colours = new Colour(this);		
		
		colours.createGuessButtons();   //Color class >> creates the mushrooms
		colours.createItemListeners();	//creates the mouseclick events
		createGeneratedMushrooms();		//creates the hidden mushrooms
		createMushroomLabels();			//creates the dashBoard
		createBackgroundLabels();		//creates the labels on the dashBoard
		
		sound.playSound("button_push.wav");

	
	}
}
