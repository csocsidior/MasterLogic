package MasterLogic;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Quit handler class

public class QuitHandler implements ActionListener
{
	Sound sound = new Sound();
	Icon green = new ImageIcon(Colour.class.getResource("green.png"));

	public void actionPerformed(ActionEvent event)
		{
		sound.playSound("button_push.wav");				//clicking sound

		int option = JOptionPane.showOptionDialog(null,
					 "Are you sure you want to quit?","Quit", 
					 JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,green,
					 null,null); 
		
 		if(option == JOptionPane.YES_OPTION)			//quitting the program
 		{
 			System.exit(0);								//closing the program
 		}
 		else
 		{
 			sound.playSound("button_push_back.wav");	// "clicking back" sound
 		}
		}
}


