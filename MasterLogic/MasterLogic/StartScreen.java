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

	JFrame f = new JFrame("Test");
	JPanel firstScreen = new JPanel();				//firstscreen
	JLabel label = new JLabel("Mastermind");		
		
	JPanel firstScreen4 = new JPanel();				//Credits window
	JButton b4_back = new JButton("Back");
		
	JPanel firstScreen3 = new JPanel();				//How to play window
	JButton b3_back = new JButton("Back");
		
	JPanel firstScreen2 = new JPanel();				//Settings window
	JButton b2_back = new JButton("Back");
		
	Icon button1 = new ImageIcon(StartScreen.class.getResource("b_newgame_up.png"));
	Icon button11 = new ImageIcon(StartScreen.class.getResource("b_newgame_down.png"));   
	    
	Icon button2 = new ImageIcon(StartScreen.class.getResource("b_settings_up.png"));
	Icon button22 = new ImageIcon(StartScreen.class.getResource("b_settings_down.png"));   
	    
	Icon button3 = new ImageIcon(StartScreen.class.getResource("b_howto_up.png"));
	Icon button33 = new ImageIcon(StartScreen.class.getResource("b_howto_down.png"));    //graphical objects
	    
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
	    
	JButton b1 = new JButton("",button1);
	JButton b2 = new JButton("",button2);
	JButton b3 = new JButton("",button3);		//menu buttons
	JButton b4 = new JButton("",button4);
	JButton b5 = new JButton("",button5);
	    
	JToggleButton level_Easy = new JToggleButton("Easy");
	JToggleButton level_Medium = new JToggleButton("Medium");	// Settings\level togglebuttons
	JToggleButton level_Hard = new JToggleButton("Hard");
	
	static  int numOfColours=6;
	static  int numOfPlaces=4;			//default colour&place values

	Sound sound = new Sound();

	
	Firstpanel_overrided firstpanel = new Firstpanel_overrided();
	
	
	public void defaultlevel()
	{
		
		level_Easy.setSelected(true);		//sets the default level easy & the easy button pressed
		
	}
	   
    public void buildStartMenu() 		//This function creates the whole Menu
        {
    	System.out.println("build");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  	//frame settings	
        f.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        f.setLocation(dim.width/6-f.getSize().width/2, dim.height/24-f.getSize().height/2);
        f.setUndecorated(true);
        f.setVisible(true);
        
        
        firstpanel.setLayout(null);
        firstpanel.setVisible(true);								
        firstpanel.setBackground(Color.darkGray);						//firstScreen JPanel settings
        firstpanel.setPreferredSize(new Dimension(800, 700));    
        firstpanel.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        f.getContentPane().add(firstpanel);
        //f.add(firstpanel);
        
        
        label.setLocation(240, 100);									//label of the firstScreen
        label.setSize(400,200);
        label.setFont(new java.awt.Font("Times New Roman", 1, 60));
        label.setForeground (Color.BLACK);
        firstpanel.add(label);   

        b1.setRolloverIcon(button11);
        b1.setSize(190, 64);
        b1.setLocation(305, 292);										// "New Game" button settings
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.setFocusPainted(false);
        firstpanel.add(b1);	
       
        b2.setRolloverIcon(button22);
        b2.setSize(190, 64);
        b2.setLocation(305, 356);															
        b2.setContentAreaFilled(false);									// "Settings" button settings
        b2.setBorderPainted(false);
        b2.setFocusPainted(false);
        firstpanel.add(b2);	
        
        b3.setRolloverIcon(button33);
        b3.setSize(190, 64);
        b3.setLocation(305, 420);
        b3.setContentAreaFilled(false);									// "How to Play" button settings
        b3.setBorderPainted(false);
        b3.setFocusPainted(false);
        firstpanel.add(b3);
        
        b4.setRolloverIcon(button44);
        b4.setSize(190, 64);
        b4.setLocation(305, 484);
        b4.setContentAreaFilled(false);									// "Credits" button settings
        b4.setBorderPainted(false);
        b4.setFocusPainted(false);
        firstpanel.add(b4);
        
        b5.setRolloverIcon(button55);
        b5.setSize(190, 64);
        b5.setLocation(305, 548);
        b5.setContentAreaFilled(false);									//"Quit" button settings
        b5.setBorderPainted(false);
        b5.setFocusPainted(false);
        firstpanel.add(b5);
        }
  
    public void startquitHandler()				// This function creates action listener on  
       {										// StartHandler & QuitHandler classes.
    	StartHandler click_startmenu = new StartHandler(this);								
	 	b1.addActionListener(click_startmenu);
	 	
	 	QuitHandler click_quit = new QuitHandler();			 				
        b5.addActionListener(click_quit);
       }
    
    
     public void startMenu_ActionListeners ()	// startMenu ActionListeners >> button action listeners >> 
     											// actionperformed functions
        { 
    	 	

	        b2.addActionListener(new ActionListener() 
	        {
	        	
				 public void actionPerformed(ActionEvent e)
				 {

					 firstpanel.setVisible(false);
					 firstpanel.invalidate();				//clearing window
					 
					 firstScreen2.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 firstScreen2.setLayout(null);
				     firstScreen2.setVisible(true);					//Change to firstScreen2 & create back button
				     firstScreen2.setBackground(Color.darkGray);
				     firstScreen2.setPreferredSize(new Dimension(800, 700));
					 f.add(firstScreen2);
					 
					 System.out.println("clear");
					 
					 b2_back.setSize(117, 64);
				     b2_back.setLocation(50, 610);			//back button settings
				     b2_back.setIcon(back_up);
				     b2_back.setRolloverIcon(back_down);
				     b2_back.setContentAreaFilled(false);
				     b2_back.setBorderPainted(false);
				     b2_back.setOpaque(false);
				     firstScreen2.add(b2_back);
				     
				     level_Easy.setSize(190,64);
				     level_Easy.setLocation(305,100);
				     level_Easy.setToolTipText("blablabla");
				     level_Easy.setIcon(easy_up);
				     level_Easy.setSelectedIcon(easy_down);
				     level_Easy.setContentAreaFilled(false);
				     level_Easy.setBorderPainted(false);
				     level_Easy.setOpaque(false);
				     
				     level_Medium.setSize(190,64);
				     level_Medium.setLocation(305,200);
				     level_Medium.setToolTipText("blablabla");
				     level_Medium.setIcon(medium_up);				//level buttons settings
				     level_Medium.setSelectedIcon(medium_down);
				     level_Medium.setContentAreaFilled(false);
				     level_Medium.setBorderPainted(false);
				     level_Medium.setOpaque(false);
				     
				     level_Hard.setSize(190,64);
				     level_Hard.setLocation(305,300);
				     level_Hard.setToolTipText("blablabla");
				     level_Hard.setIcon(hard_up);
				     level_Hard.setSelectedIcon(hard_down);
				     level_Hard.setContentAreaFilled(false);
				     level_Hard.setBorderPainted(false);
				     level_Hard.setOpaque(false);
				     
				     firstScreen2.add(level_Medium);
				     firstScreen2.add(level_Easy);
				     firstScreen2.add(level_Hard);
				  
					 sound.playSound("Button_Push.wav");
					 
					 f.pack();
				 }
	        }
	        );

	        b2_back.addActionListener(new ActionListener() 
	        
	        {
	        	
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 
					 firstScreen2.setVisible(false);
					 firstpanel.setLayout(null);	//Action Listener on Back button -> go back to firstScreen
					 firstpanel.setVisible(true);
					 firstpanel.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("Button_Push_back.wav");
				 }
			 }
			 );

	        b3.addActionListener(new ActionListener() 
	        {
	    		
				 public void actionPerformed(ActionEvent e)
				 {
					 firstScreen.setVisible(false);
					 firstScreen.invalidate();
					 
					 firstScreen3.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 firstScreen3.setLayout(null);
				     firstScreen3.setVisible(true);
				     firstScreen3.setBackground(Color.darkGray);
				     firstScreen3.setPreferredSize(new Dimension(800, 700));
					 f.add(firstScreen3);
					 
					 System.out.println("clear");
					 
					 b3_back.setSize(117, 64);
				     b3_back.setLocation(50, 610);
				     b3_back.setIcon(back_up);
				     b3_back.setRolloverIcon(back_down);
				     b3_back.setContentAreaFilled(false);
				     b3_back.setBorderPainted(false);
				     b3_back.setOpaque(false);
				     firstScreen3.add(b3_back);
					 
				     sound.playSound("Button_Push.wav");
				     
					 f.pack();
				 }
	        }
	        );
	        
	        level_Easy.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  //level_Easy.setBackground(Color.DARK_GRAY);
		    	    	  
		    	    	  level_Medium.setSelected(false);
		    	    	  level_Hard.setSelected(false);
		    	    	  
		    	    	  numOfColours = 6;
		    	    	  numOfPlaces = 4;
		    	    	  
		    	    	  sound.playSound("Button_Push.wav");
		    	    	  
		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
		    	      {
		    	    	  //level_Easy.setBackground(Color.GRAY);
		    	      }
		    	   }
		    	});
	     
	     
	     level_Medium.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  //level_Medium.setBackground(Color.DARK_GRAY);	
		    	    	  
		    	    	  level_Easy.setSelected(false);
		    	    	  level_Hard.setSelected(false);
		    	    	  
		    	    	  numOfColours = 7;
		    	    	  numOfPlaces = 5;
		    	    	  
		    	    	  sound.playSound("Button_Push.wav");
		    	    	  
		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
		    	      {
		    	    	  //level_Medium.setBackground(Color.GRAY);
		    	      }
		    	   }
		    	});
	     
	     level_Hard.addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	    	  //level_Hard.setBackground(Color.DARK_GRAY);	
		    	    	  
		    	    	  level_Easy.setSelected(false);
		    	    	  level_Medium.setSelected(false);
		    	    	  
		    	    	  numOfColours = 8;
		    	    	  numOfPlaces = 6;
		    	    	  
		    	    	  sound.playSound("Button_Push.wav");

		    	    	  System.out.println("Colours:"+ numOfColours + "	Places:" + numOfPlaces );
		    	      } 																		 
		    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
		    	      {
		    	    	  //level_Hard.setBackground(Color.GRAY);
		    	      }
		    	   }
		    	});
	     
	        b3_back.addActionListener(new ActionListener() 
	        
	        {
	    		
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 
					 firstScreen3.setVisible(false);
					 firstScreen.setLayout(null);
					 firstScreen.setVisible(true);
					 firstScreen.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("Button_Push_back.wav");
				 }
			 }
			 );

	        b4.addActionListener(new ActionListener() 
	        {
	    		
				 public void actionPerformed(ActionEvent e)
				 {
					 firstScreen.setVisible(false);
					 firstScreen.invalidate();
					 
					 firstScreen4.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
					 firstScreen4.setLayout(null);
				     firstScreen4.setVisible(true);
				     firstScreen4.setBackground(Color.darkGray);
				     firstScreen4.setPreferredSize(new Dimension(800, 700));
					 f.add(firstScreen4);
					 
					 System.out.println("clear");
					 
					 b4_back.setSize(117, 64);
				     b4_back.setLocation(50, 610);
				     b4_back.setIcon(back_up);
				     b4_back.setRolloverIcon(back_down);
				     b4_back.setContentAreaFilled(false);
				     b4_back.setBorderPainted(false);
				     b4_back.setOpaque(false);
				     firstScreen4.add(b4_back);
					
				     sound.playSound("Button_Push.wav");
				     
					 f.pack();
				 }
	        }
	        );
        
	        b4_back.addActionListener(new ActionListener() 
	        
	        {
	    		
				 public void actionPerformed(ActionEvent e)
				 {
					 System.out.println("back");
					 
					 firstScreen4.setVisible(false);
					 firstScreen.setLayout(null);
					 firstScreen.setVisible(true);
					 firstScreen.setPreferredSize(new Dimension(800, 700));
					 sound.playSound("Button_Push_back.wav");
				 }
				 }
			 );

        f.pack();
        }
}
    
    
    

