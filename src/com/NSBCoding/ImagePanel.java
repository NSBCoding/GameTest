package com.NSBCoding;
			
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
	
	public class ImagePanel extends JPanel{		
	
		private static final long serialVersionUID = 1L;
		public ImageIcon icon = new ImageIcon();
		
		
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		
		@Override
		    public void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        icon.paintIcon(this, g, 100, 100);           
		    }

}
