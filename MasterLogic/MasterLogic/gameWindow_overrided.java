package MasterLogic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class gameWindow_overrided extends JPanel {

	Image img;
	
	public gameWindow_overrided()
	{
		img = Toolkit.getDefaultToolkit().getImage("backGround_Startmenu1.jpg");
	}
	
	//Image img = Toolkit.getDefaultToolkit().createImage("backGround_Startmenu1.jpg");
	//ImageIcon ic = new ImageIcon("backGround_Startmenu1.jpg");
	
	
	public void paintComponent (Graphics g){

		
	    super.paintComponent(g);
	    g.drawImage(img, 0, 0, this);
	    g.drawLine(100, 100, 100, 800);
	   
	
}}
