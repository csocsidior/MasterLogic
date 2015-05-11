package MasterLogic;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StartScreen   
{	
    //Class of the Start Menu

	JFrame frame = new JFrame("Test");
	JPanel firstScreen = new JPanel();					//firstScreen
	JPanel creditsScreen = new JPanel();				//Credits panel
	JPanel howtoScreen = new JPanel();					//How to play panel
	JPanel settingsScreen = new JPanel();				//Settings panel	
		
	JButton credits_backButton = new JButton("Back");
	JButton howto_backButton = new JButton("Back");	
	JButton settings_backButton = new JButton("Back");
		
	Icon button1 = new ImageIcon(StartScreen.class.getResource("b_newgame_up.png"));
	Icon button11 = new ImageIcon(StartScreen.class.getResource("b_newgame_down.png"));   
	    
	Icon button2 = new ImageIcon(StartScreen.class.getResource("b_settings_up.png"));
	Icon button22 = new ImageIcon(StartScreen.class.getResource("b_settings_down.png"));   
	    
	Icon button3 = new ImageIcon(StartScreen.class.getResource("b_howto_up.png"));
	Icon button33 = new ImageIcon(StartScreen.class.getResource("b_howto_down.png"));  //graphical objects
	    
	Icon button4 = new ImageIcon(StartScreen.class.getResource("b_credits_up.png"));
	Icon button44 = new ImageIcon(StartScreen.class.getResource("b_credits_down.png"));    
	    
	Icon button5 = new ImageIcon(StartScreen.class.getResource("b_quit_up.png"));
	Icon button55 = new ImageIcon(StartScreen.class.getResource("b_quit_down.png"));  
	    
	Icon easy_up = new ImageIcon(StartScreen.class.getResource("b_easy_up.png")); 
	Icon easy_down = new ImageIcon(StartScreen.class.getResource("b_easy_down.png"));
	    
	Icon medium_up = new ImageIcon(StartScreen.class.getResource("b_medium_up.png"));
	Icon medium_down = new ImageIcon(StartScreen.class.getResource("b_medium_down.png"));
	    
	Icon hard_up = new ImageIcon(StartScreen.class.getResource("b_hard_up.png"));
	Icon hard_down = new ImageIcon(StartScreen.class.getResource("b_hard_down.png"));
	
	Icon back_up = new ImageIcon(StartScreen.class.getResource("b_back_up.png"));
	Icon back_down = new ImageIcon(StartScreen.class.getResource("b_back_down.png"));
	
	Icon bgroundImage = new ImageIcon(StartScreen.class.getResource("mainmenu_bg.png"));
	Icon mainmenu_logo = new ImageIcon(StartScreen.class.getResource("mainmenu_logo.png"));
	
	Icon howtoIcon = new ImageIcon(StartScreen.class.getResource("howto.png"));
	Icon settingsH = new ImageIcon(StartScreen.class.getResource("settings_header.png"));
    
	Icon credits = new ImageIcon(StartScreen.class.getResource("credits.png"));
	
	JButton newgameButton = new JButton("",button1);
	JButton settingsButton = new JButton("",button2);
	JButton howtoButton = new JButton("",button3);		//menu buttons
	JButton creditsButton = new JButton("",button4);
	JButton quitButton = new JButton("",button5);
	    
	JToggleButton easyButton = new JToggleButton("Easy");
	JToggleButton mediumButton = new JToggleButton("Medium");	// Settings\level togglebuttons
	JToggleButton hardButton = new JToggleButton("Hard");
	
    JLabel imagelabel = new JLabel("", bgroundImage,JLabel.CENTER);    //label for background picture
	JLabel firstScreenLabel = new JLabel("", mainmenu_logo,JLabel.CENTER);
	JLabel imagelabel_settings = new JLabel("", bgroundImage,JLabel.CENTER);
	JLabel imagelabel_howto = new JLabel("", bgroundImage,JLabel.CENTER);
	JLabel imagelabel_credits = new JLabel("", bgroundImage,JLabel.CENTER);
	JLabel howto = new JLabel("", howtoIcon,JLabel.CENTER);
	JLabel settingsHeader = new JLabel("", settingsH,JLabel.CENTER);
	JLabel creditslabel = new JLabel("", credits,JLabel.CENTER);

	static  int numOfColours=6;
	static  int numOfPlaces=4;			//default colour&place values

	Sound sound = new Sound();

	public void defaultlevel()
	{
		easyButton.setSelected(true);	//sets the default level easy & the easy button pressed	
	}
	   
    public void buildStartMenu() 		//This function creates the whole Menu
        {
    	System.out.println("build");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  	//frame settings	
        frame.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/5-frame.getSize().width/2,
        dim.height/24-frame.getSize().height/2);
        frame.setUndecorated(false);
        frame.setVisible(true);

      //imageLabel for background image
        imagelabel.setSize(firstScreen.getWidth(), firstScreen.getHeight());
        imagelabel.setSize(800, 700);
        firstScreen.add(imagelabel);
        
        firstScreen.setLayout(null);
        firstScreen.setVisible(true);								//firstScreen JPanel settings
        firstScreen.setPreferredSize(new Dimension(800, 700));    
        firstScreen.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        frame.add(firstScreen);

        firstScreenLabel.setLocation(114, 100);						//label of the firstScreen
        firstScreenLabel.setSize(600,140);
        firstScreenLabel.setFont(new java.awt.Font("Times New Roman", 1, 60));
        firstScreenLabel.setForeground (Color.BLACK);
        firstScreen.add(firstScreenLabel);   

        newgameButton.setRolloverIcon(button11);
        newgameButton.setSize(190, 64);
        newgameButton.setLocation(305, 292);					// "New Game" button settings
        newgameButton.setContentAreaFilled(false);
        newgameButton.setBorderPainted(false);
        newgameButton.setFocusPainted(false);
        firstScreen.add(newgameButton);	
       
        settingsButton.setRolloverIcon(button22);
        settingsButton.setSize(190, 64);
        settingsButton.setLocation(305, 356);															
        settingsButton.setContentAreaFilled(false);				// "Settings" button settings
        settingsButton.setBorderPainted(false);
        settingsButton.setFocusPainted(false);
        firstScreen.add(settingsButton);	
        
        howtoButton.setRolloverIcon(button33);
        howtoButton.setSize(190, 64);
        howtoButton.setLocation(305, 420);
        howtoButton.setContentAreaFilled(false);				// "How to Play" button settings
        howtoButton.setBorderPainted(false);
        howtoButton.setFocusPainted(false);
        firstScreen.add(howtoButton);
        
        creditsButton.setRolloverIcon(button44);
        creditsButton.setSize(190, 64);
        creditsButton.setLocation(305, 484);
        creditsButton.setContentAreaFilled(false);				// "Credits" button settings
        creditsButton.setBorderPainted(false);
        creditsButton.setFocusPainted(false);
        firstScreen.add(creditsButton);
        
        quitButton.setRolloverIcon(button55);
        quitButton.setSize(190, 64);
        quitButton.setLocation(305, 548);
        quitButton.setContentAreaFilled(false);					//"Quit" button settings
        quitButton.setBorderPainted(false);
        quitButton.setFocusPainted(false);
        firstScreen.add(quitButton);
        
        settingsHeader.setSize(300, 155);
        settingsHeader.setLocation(260, 50);
        settingsScreen.add(settingsHeader);

      //sets the Z-order of different components on the Jpanels
        firstScreen.setComponentZOrder(imagelabel, 
        firstScreen.getComponentCount()-1);	
        }
  
    public void startquitHandler()				// This function creates action listener on  
       {										// StartHandler & QuitHandler classes.
    	StartHandler click_startmenu = new StartHandler(this);								
	 	newgameButton.addActionListener(click_startmenu);
	 	
	 	QuitHandler click_quit = new QuitHandler();			 				
        quitButton.addActionListener(click_quit);
       }

     public void startMenu_ActionListeners ()	// startMenu ActionListeners >> 
     											//button action listeners >> 
     											// actionperformed functions
        { 
	        settingsButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 firstScreen.setVisible(false);
					 firstScreen.invalidate();				//clearing window
					 
					 imagelabel_settings.setSize(settingsScreen.getWidth(), settingsScreen.getHeight());
					 imagelabel_settings.setSize(800, 700);

					 settingsScreen.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 settingsScreen.setLayout(null);
				     settingsScreen.setVisible(true);	//Change to settingsScreen & create back button
				     settingsScreen.setBackground(Color.darkGray);
				     settingsScreen.setPreferredSize(new Dimension(800, 700));
				     settingsScreen.add(imagelabel_settings);
					 frame.add(settingsScreen);

					 settings_backButton.setSize(130, 64);
				     settings_backButton.setLocation(50, 610);		//back button settings
				     settings_backButton.setIcon(back_up);
				     settings_backButton.setRolloverIcon(back_down);
				     settings_backButton.setContentAreaFilled(false);
				     settings_backButton.setBorderPainted(false);
				     settings_backButton.setOpaque(false);
				     settingsScreen.add(settings_backButton);
				     
				     easyButton.setSize(200,64);
				     easyButton.setLocation(305,300);
				     easyButton.setToolTipText("<html><img src=\"" +
			    	      	  StartScreen.class.getResource("tooltiptext_easy.png") +
			    	          "\"");
				     easyButton.setIcon(easy_up);
				     easyButton.setSelectedIcon(easy_down);
				     easyButton.setContentAreaFilled(false);
				     easyButton.setBorderPainted(false);
				     easyButton.setOpaque(false);
				     
				     mediumButton.setSize(200,64);
				     mediumButton.setLocation(305,400);
				     mediumButton.setToolTipText("<html><img src=\"" +
				    	      	  StartScreen.class.getResource("tooltiptext_medium.png") +
				    	          "\"");
				     mediumButton.setIcon(medium_up);				//level buttons settings
				     mediumButton.setSelectedIcon(medium_down);
				     mediumButton.setContentAreaFilled(false);
				     mediumButton.setBorderPainted(false);
				     mediumButton.setOpaque(false);
				     
				     hardButton.setSize(200,64);
				     hardButton.setLocation(305,500);
				     hardButton.setToolTipText("<html><img src=\"" +
			    	      	  StartScreen.class.getResource("tooltiptext_hard.png") +
			    	          "\"");
				     hardButton.setIcon(hard_up);
				     hardButton.setSelectedIcon(hard_down);
				     hardButton.setContentAreaFilled(false);
				     hardButton.setBorderPainted(false);
				     hardButton.setOpaque(false);
				     
				     settingsScreen.add(mediumButton);
				     settingsScreen.add(easyButton);
				     settingsScreen.add(hardButton);
				  
					 sound.playSound("button_push.wav");
					 System.out.println("clear");
					 
					 settingsScreen.setComponentZOrder(imagelabel_settings, 
					 settingsScreen.getComponentCount()-1);	
					  
					 frame.pack();
				 }
	        }
	        );
	        settings_backButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 settingsScreen.setVisible(false);
					 firstScreen.setLayout(null);//Action Listener on Back button -> go back to firstScreen
					 firstScreen.setVisible(true);
					 firstScreen.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("button_push_back.wav");
				 }
			 }
			 );
	        howtoButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 firstScreen.setVisible(false);
					 firstScreen.invalidate();
					 
					 imagelabel_howto.setSize(howtoScreen.getWidth(), howtoScreen.getHeight());
					 imagelabel_howto.setSize(800, 700);
					 
					 howtoScreen.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 howtoScreen.setLayout(null);
				     howtoScreen.setVisible(true);
				     howtoScreen.setBackground(Color.darkGray);
				     howtoScreen.setPreferredSize(new Dimension(800, 700));
				     howtoScreen.add(imagelabel_howto);
					 frame.add(howtoScreen);

					 howto_backButton.setSize(130, 64);
				     howto_backButton.setLocation(50, 610);
				     howto_backButton.setIcon(back_up);
				     howto_backButton.setRolloverIcon(back_down);
				     howto_backButton.setContentAreaFilled(false);
				     howto_backButton.setBorderPainted(false);
				     howto_backButton.setOpaque(false);
				     howtoScreen.add(howto_backButton);
					 
				     sound.playSound("button_push.wav");
				     System.out.println("clear");
				     
				     howto.setSize(500, 600);
				     howto.setLocation(160, 5);
				     howtoScreen.add(howto);

				     howtoScreen.setComponentZOrder(imagelabel_howto, 
				     howtoScreen.getComponentCount()-1);	
				     
					 frame.pack();
				 }
	        }
	        );
	        easyButton.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  mediumButton.setSelected(false);
		    	    	  hardButton.setSelected(false);
		    	    	  
		    	    	  numOfColours = 6;
		    	    	  numOfPlaces = 4;
		    	    	  
		    	    	  sound.playSound("button_push.wav");
		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	   }
		    	});
	     mediumButton.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  easyButton.setSelected(false);
		    	    	  hardButton.setSelected(false);
		    	    	  
		    	    	  numOfColours = 7;
		    	    	  numOfPlaces = 5;
		    	    	  
		    	    	  sound.playSound("button_push.wav");
		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	   }
		    	});
	     hardButton.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  easyButton.setSelected(false);
		    	    	  mediumButton.setSelected(false);
		    	    	  
		    	    	  numOfColours = 8;
		    	    	  numOfPlaces = 6;
		    	    	  
		    	    	  sound.playSound("button_push.wav");
		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	   }
		    	});
	        howto_backButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 
					 howtoScreen.setVisible(false);
					 firstScreen.setLayout(null);
					 firstScreen.setVisible(true);
					 firstScreen.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("button_push_back.wav");
				 }
			 }
			 );
	        creditsButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 firstScreen.setVisible(false);
					 firstScreen.invalidate();

					 imagelabel_credits.setSize(800, 700);
				     creditsScreen.add(imagelabel_credits);
					 
					 creditsScreen.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 creditsScreen.setLayout(null);
				     creditsScreen.setVisible(true);
				     creditsScreen.setBackground(Color.darkGray);
				     creditsScreen.setPreferredSize(new Dimension(800, 700));
					 frame.add(creditsScreen);

					 credits_backButton.setSize(130, 64);
				     credits_backButton.setLocation(50, 610);
				     credits_backButton.setIcon(back_up);
				     credits_backButton.setRolloverIcon(back_down);
				     credits_backButton.setContentAreaFilled(false);
				     credits_backButton.setBorderPainted(false);
				     credits_backButton.setOpaque(false);
				     creditsScreen.add(credits_backButton);
				     
				     creditslabel.setSize(600,400);
				     creditslabel.setLocation(100, 50);
				     creditsScreen.add(creditslabel);
					
				     sound.playSound("button_push.wav");
					 System.out.println("clear");
					 
					 creditsScreen.setComponentZOrder(imagelabel_credits, 
					 creditsScreen.getComponentCount()-1);	
				     
					 frame.pack();
				 }
	        }
	        );
	        credits_backButton.addActionListener(new ActionListener() 
	        {
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 
					 creditsScreen.setVisible(false);
					 firstScreen.setLayout(null);
					 firstScreen.setVisible(true);
					 firstScreen.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("button_push_back.wav");
				 }
				 }
			 );
        frame.pack();
        }
}
    
    
    

