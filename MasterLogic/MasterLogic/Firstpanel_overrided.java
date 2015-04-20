package MasterLogic;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;



public class Firstpanel_overrided extends JPanel {
	
	public  Firstpanel_overrided()
	{}
	
	Image img = Toolkit.getDefaultToolkit().createImage("backGround_Startmenu1.jpg");
	

	
	public void paintComponent(Graphics g) {

	    super.paintComponent(g);
	        g.drawImage(img, 1, 1, this);
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(800, 700);
    }
	
}