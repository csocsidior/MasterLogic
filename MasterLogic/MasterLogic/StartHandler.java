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
	Sound sound = new Sound();
	GuessedColours colourplaces;
	
	static JPanel gameWindow = new JPanel();
	JLabel label = new JLabel("Mushroom code");
	JButton generatedMushroomArray[] = new JButton[6];

	Icon green = new ImageIcon(Colour.class.getResource("green.png"));
	Icon red = new ImageIcon(Colour.class.getResource("red.png"));
	Icon orange = new ImageIcon(Colour.class.getResource("orange.png"));
	Icon blue = new ImageIcon(Colour.class.getResource("blue.png"));
	
	Icon bgroundImage1 = new ImageIcon(StartScreen.class.getResource("mushroomBack1.png"));
	Icon bgroundImage2 = new ImageIcon(StartScreen.class.getResource("mushroomBack2.png"));
	Icon bgroundImage3 = new ImageIcon(StartScreen.class.getResource("mushroomBack3.png"));
	
	JLabel imagelabel1 = new JLabel("", bgroundImage1,JLabel.CENTER);
	JLabel imagelabel2 = new JLabel("", bgroundImage2,JLabel.CENTER);
	JLabel imagelabel3 = new JLabel("", bgroundImage3,JLabel.CENTER);

	Icon backOfMush = new ImageIcon(StartScreen.class.getResource("backback.png"));
	JLabel mushroomBack [] = new JLabel[8];
	
	public StartHandler(StartScreen s)
	{
		start = s;
	}
	
	public StartHandler()
	{}
	
	public void createMushroomLabels()
	{
		for(int i=0; i< StartScreen.numOfColours; i++)
		{
			mushroomBack[i] = new JLabel("", backOfMush,JLabel.CENTER);
			mushroomBack[i].setSize(60, 80);
			mushroomBack[i].setLocation(30, 30+i*80);
			gameWindow.add(mushroomBack[i]);
			gameWindow.setComponentZOrder(mushroomBack[i], gameWindow.getComponentCount()-1);
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
				 
		default: 
				 break;
		 }
	}
	
	public void createGeneratedMushrooms()
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
			 
			 		 
			 case 1: generatedMushroomArray[i].setBackground(Color.WHITE);
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
		 		 	 
			 case 5: generatedMushroomArray[i].setBackground(Color.BLACK);
 		 	 		 break;
 		 	 		 
			 case 6: generatedMushroomArray[i].setBackground(Color.ORANGE);
	 	 		 	 break;
	 	 		 	 
			 case 7: generatedMushroomArray[i].setBackground(Color.PINK);
	 	 		 	 break;

	 	 	default: 
	 	 			break;
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

		label.setLocation(260, 5);									//label of the firstScreen
        label.setSize(240,90);
        label.setFont(new java.awt.Font("Times New Roman", 1, 30));
        label.setOpaque(true);
        label.setForeground (Color.BLACK);
        //label.setVisible(false);
        gameWindow.add(label);
		
		Colour colours = new Colour(this);				
		colours.createGuessButtons();
		colours.createItemListeners();
		createGeneratedMushrooms();
		createMushroomLabels();
		createBackgroundLabels();
		
		sound.playSound("Button_Push.wav");

	
	}
}
