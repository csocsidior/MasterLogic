package MasterLogic;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Quit button handling

public class QuitHandler implements ActionListener
{
	Sound sound = new Sound();

	public void actionPerformed(ActionEvent event)
	
		{
		sound.playSound("Button_Push.wav");
		
		int Option = JOptionPane.showOptionDialog(null, "Are you sure you want to quit?",null, JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null, null,null); 
		
 		if(Option == JOptionPane.YES_OPTION)
 		{
 			
 			System.exit(0);
 		}
 		else
 		{
 			sound.playSound("Button_Push_back.wav");
 		}
		
		}
}


