package MasterLogic;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

	//This class provides the sound effects on the buttons
	
	public Sound()
	{}
	
	public void playSound(String Done)
	 {
	   try 
	   {
	    AudioInputStream audioInputStream = 
	    AudioSystem.getAudioInputStream(new File(Done).getAbsoluteFile( ));
	    
	    Clip clip = AudioSystem.getClip( );
	    clip.open(audioInputStream);
	    clip.start();
	   }
	   catch(Exception ex)
	   {
	     System.out.println("Error with playing sound.");
	     ex.printStackTrace( );
	   }
	 }
}
