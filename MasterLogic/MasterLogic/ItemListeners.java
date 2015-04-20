package MasterLogic;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ItemListeners {

	Colour colours;
	Colours_Guessed colourplaces;
	StartHandler a;
	static int container[] = new int[StartScreen.numOfColours];
	static int containerForGuessedButtons[] = new int[StartScreen.numOfColours];
	
	JButton done = new JButton("");
	static int[] generatedNums=new int[StartScreen.numOfPlaces];
	static int tries = 0;
	
	GameEngine engine = new GameEngine();
	Sound sound = new Sound();
	Stick stickInstance = new Stick();
	
	Icon green = new ImageIcon(Colour.class.getResource("green.png"));
	Icon red = new ImageIcon(Colour.class.getResource("red.png"));
	Icon green_glow = new ImageIcon(Colour.class.getResource("green_glow.png"));
	Icon red_glow = new ImageIcon(Colour.class.getResource("red_glow.png"));
	
	Icon b_done_disabled = new ImageIcon(StartScreen.class.getResource("b_done_disabled.png"));
	Icon b_done_down = new ImageIcon(StartScreen.class.getResource("b_done_down.png"));
	Icon b_done_up = new ImageIcon(StartScreen.class.getResource("b_done_up.png"));

	
	public ItemListeners()
	{}
	
	public ItemListeners(Colour s, Colours_Guessed sb, StartHandler sbb)
	{
		colours = s;
		colourplaces = sb;
		a = sbb;
	}
	
	
	
	public void generate()
	{
		for (int i = 0; i<StartScreen.numOfPlaces ; i++)
		{
			generatedNums[i] = (int)(Math.random() * StartScreen.numOfColours);
			System.out.print("-" + generatedNums[i]);
			engine.arraycheck[i]=10;
			
		}
	}
	
	public void createItemListeners()
	{
 
        for(int i=0; i<StartScreen.numOfColours; i++)
        {
        	colours.colourButtons[i].setEnabled(false);
        }

		colours.colourButtons[0].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour0 is selected");								//Itemlistenerjei a sz�neknek  	
	    	        
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=0)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }
	
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if( colourplaces.placeButtons[i].isSelected()  )
	    	        	{
	    	        		colours.colourButtons[0].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);
	    		    	    
	    		    	    container[i]=0;
	    		    	    engine.arraycheck[i]=0;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			       
	    			        colourplaces.placeButtons[i].setBackground(Color.YELLOW);
	    	        	}
	    	        }													
	    	      } 																		 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour0 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=0)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});
		
		colours.colourButtons[1].addItemListener(new ItemListener() 
		    {
		    	   public void itemStateChanged(ItemEvent press) 
		    	   {
		    	      if(press.getStateChange()==ItemEvent.SELECTED)
		    	      {
		    	        //System.out.println("colour1 is selected");
		    	        
		    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	        {
		    	        	if(i!=1)
		    	        	{
		    	        	colours.colourButtons[i].setEnabled(false);
		    	        	}
		    	        }
		    	        
		    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
		    	        {
		    	        	if(colourplaces.placeButtons[i].isSelected())
		    	        	{
		    	        		colours.colourButtons[1].setSelected(false);
		    		    	    colourplaces.placeButtons[i].setSelected(false);
		    		    	    
		    		    	    container[i]=1;
		    		    	    engine.arraycheck[i]=1;
		    		    	    
		    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
		    		    	    {
		    		    	    	colours.colourButtons[j].setEnabled(false);
		    		    	    }
		    		    	 
		    		    	    boolean flag = true;
		    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
		    		    	    {
		    		    	    	
		    		    	    	
		    		    	    	
		    		    	    	if(engine.arraycheck[k]==10 )
		    		    	    	{
		    		    	    		flag = false;
		    		    	    		
		    		    	    	}
		    		    	    }
		    			        if(flag)
		    			        {
		    			        	done.setEnabled(true);
		    			        }
		    			        
		    			        colourplaces.placeButtons[i].setBackground(Color.WHITE);	
		    	        	}
		    	        }
		    	      } 
		    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
		    	      {
		    	        //System.out.println("colour1 is not selected");
		    	        
		    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	        {
		    	        	if(i!=1)
		    	        	{
		    	        	colours.colourButtons[i].setEnabled(true);
		    	        	}
		    	        }
		    	      }
		    	      sound.playSound("place_sound.wav");
		    	   }
		    	});
		 
		colours.colourButtons[2].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour2 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=2)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[2].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=2;
	    		    	    engine.arraycheck[i]=2;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        colourplaces.placeButtons[i].setIcon(red);
	    			        colourplaces.placeButtons[i].setDisabledIcon(red);
	    			        colourplaces.placeButtons[i].setPressedIcon(red);
	    			        colourplaces.placeButtons[i].setContentAreaFilled(false);
	    			        colourplaces.placeButtons[i].setBorderPainted(false);
	    			        colourplaces.placeButtons[i].setOpaque(false);
	    			        //colourplaces.placeButtons[i].setBackground(Color.RED);	

	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour2 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=2)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});

		colours.colourButtons[3].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour3 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=3)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[3].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=3;
	    		    	    engine.arraycheck[i]=3;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        colourplaces.placeButtons[i].setBackground(Color.BLUE);	
	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour3 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=3)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});

		colours.colourButtons[4].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour4 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=4)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }
	    	      
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[4].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=4;
	    		    	    engine.arraycheck[i]=4;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        //colourplaces.placeButtons[i].setBackground(Color.GREEN);	
	    			        colourplaces.placeButtons[i].setIcon(green);
	    			        colourplaces.placeButtons[i].setDisabledIcon(green);
	    			        colourplaces.placeButtons[i].setPressedIcon(green);
	    			        colourplaces.placeButtons[i].setContentAreaFilled(false);
	    			        colourplaces.placeButtons[i].setBorderPainted(false);
	    			        colourplaces.placeButtons[i].setOpaque(false);
	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour4 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=4)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});

		colours.colourButtons[5].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour5 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=5)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }
	    	      
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[5].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=5;
	    		    	    engine.arraycheck[i]=5;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        colourplaces.placeButtons[i].setBackground(Color.BLACK);	
	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour5 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=5)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});

		colours.colourButtons[6].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour6 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=6)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }
	    	      
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[6].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=6;
	    		    	    engine.arraycheck[i]=6;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        colourplaces.placeButtons[i].setBackground(Color.ORANGE);	
	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        System.out.println("colour6 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=6)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});

		colours.colourButtons[7].addItemListener(new ItemListener() 
	    {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colour7 is selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=7)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(colourplaces.placeButtons[i].isSelected())
	    	        	{
	    	        		colours.colourButtons[7].setSelected(false);
	    		    	    colourplaces.placeButtons[i].setSelected(false);	
	    		    	    
	    		    	    container[i]=7;
	    		    	    engine.arraycheck[i]=7;
	    		    	    
	    		    	    for(int j=0; j<StartScreen.numOfColours; j++)
	    		    	    {
	    		    	    	colours.colourButtons[j].setEnabled(false);
	    		    	    }
	    		    	 
	    		    	    boolean flag = true;
	    		    	    for(int k=0; k<StartScreen.numOfPlaces; k++)
	    		    	    {
	    		    	    	
	    		    	    	
	    		    	    	
	    		    	    	if(engine.arraycheck[k]==10 )
	    		    	    	{
	    		    	    		flag = false;
	    		    	    		
	    		    	    	}
	    		    	    }
	    			        if(flag)
	    			        {
	    			        	done.setEnabled(true);
	    			        }
	    			        
	    			        colourplaces.placeButtons[i].setBackground(Color.PINK);	
	    	        	}
	    	        }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colour7 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
	    	        {
	    	        	if(i!=7)
	    	        	{
	    	        	colours.colourButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      sound.playSound("place_sound.wav");
	    	   }
	    	});
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		 colourplaces.placeButtons[0].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace0 is selected");	

	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=0)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace0 is not selected");
	    	    
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=0)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	      
	    	   }
		 });

		 colourplaces.placeButtons[1].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace1 is selected");	
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=1)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    } 
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace1 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=1)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	   }
		 });
		 
		 colourplaces.placeButtons[2].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace2 is selected");	
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=2)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace2 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=2)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	   }
		 });
	 
		 colourplaces.placeButtons[3].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace3 is selected");	
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=3)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace3 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=3)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	   }
		 });
		 
		 colourplaces.placeButtons[4].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace4 is selected");	
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=4)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }
	    	        
	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    }
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace4 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=4)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	   }
		 });

		 colourplaces.placeButtons[5].addItemListener(new ItemListener() 
		 {
	    	   public void itemStateChanged(ItemEvent press) 
	    	   {
	    	      if(press.getStateChange()==ItemEvent.SELECTED)
	    	      {
	    	        //System.out.println("colourplace5 is selected");	
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=5)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(false);
	    	        	}
	    	        }

	    	        for(int i=0; i<StartScreen.numOfColours; i++)
		    	    {
		    	    	colours.colourButtons[i].setEnabled(true);
		    	    } 
	    	      } 
	    	      else if(press.getStateChange()==ItemEvent.DESELECTED)
	    	      {
	    	        //System.out.println("colourplace5 is not selected");
	    	        
	    	        for(int i=0; i<StartScreen.numOfPlaces; i++)
	    	        {
	    	        	if(i!=5)
	    	        	{
	    	        	colourplaces.placeButtons[i].setEnabled(true);
	    	        	}
	    	        }
	    	      }
	    	   }
		 });
		 	
		 	done.setEnabled(false);
		 	done.setSize(64, 64);
		    done.setLocation(500, 150);
		    done.setDisabledIcon(b_done_disabled);
		    done.setIcon(b_done_up);
		    done.setRolloverIcon(b_done_down);
		    done.setContentAreaFilled(false);
		    done.setBorderPainted(false);
		    done.setOpaque(false);
		    a.gameWindow.add(done);
	        

		    
		    done.addActionListener(new ActionListener() 
		    {
		    	int counter =1;													//counter for the button displacements
		    	
				 public void actionPerformed(ActionEvent e)
				 {
					 for(int i=0; i<StartScreen.numOfPlaces; i++)
					 {
						 //System.out.print(" "+ container[i] );
						 
						 done.setEnabled(false);
						 
						 colourplaces.placeButtons[i].setLocation(40+i*60, 150+ 80*counter);	
						 done.setLocation(500, 150+ 80*counter);
						 colourplaces.placeButtons[i].setBackground(Color.DARK_GRAY);
						 containerForGuessedButtons[i]=container[i];
						 
						 System.out.print("   "+ containerForGuessedButtons[i] );
						 
						 	colourplaces.placeButtons[i].setIcon(null);
	    			        colourplaces.placeButtons[i].setDisabledIcon(null);
	    			        colourplaces.placeButtons[i].setPressedIcon(null);
	    			        colourplaces.placeButtons[i].setContentAreaFilled(true);
	    			        colourplaces.placeButtons[i].setBorderPainted(true);
	    			        colourplaces.placeButtons[i].setOpaque(true);
	    			        
	    			        engine.arraycheck[i]=10;
						 
					 }
					 
					 engine.check();
					 
					 //System.out.print("BLACK:"+ engine.black);
					 
					 stickInstance.generateStickArray();
					 stickInstance.generateSticks();
					
					 System.out.println("Try :" + tries);
					 sound.playSound("Done.wav");
					 
					 colours.createGuessedButtons();
					 
					 engine.white = 0;
					 engine.black = 0;
					 engine.nomatch = 0;
					 counter++; 
					 tries++;
					 
				 }
		    }
		    );
	}
	
}