package MasterLogic;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;



public class Firstpanel_overrided extends JPanel {
	
	Image img = Toolkit.getDefaultToolkit().createImage("backGround_Startmenu1.jpg");

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, this);	
	 
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(800, 700);
    }
	
}