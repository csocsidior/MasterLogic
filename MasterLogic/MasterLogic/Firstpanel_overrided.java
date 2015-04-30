package MasterLogic;

import java.awt.Graphics;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;



public class Firstpanel_overrided extends JPanel {
	
	public  Firstpanel_overrided()
	{}
	
	
	Image image = Toolkit.getDefaultToolkit().createImage("backGround_Startmenu1.jpg");
	//public ImageIcon imageIcon = new ImageIcon("backGround_Startmenu.png");
	//public Image image = imageIcon.getImage();
	
	public void paintComponent(Graphics g) {
		
		
		
		//g.drawImage(img, 0, 0, this);
		super.paintComponent(g);
		
		if (image != null)
		{
			System.out.println("miafasz?");
			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
		}
		
		//super.setOpaque(false);
	    
	    //super.setOpaque(true);
	        
			
	        
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(800, 700);
    }
	
}