package com.NSBCoding;


import javax.swing.*;
import java.awt.*;


public class Display extends JFrame{
	

	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public JPanel gp = (JPanel) getGlassPane();
public ImagePanel i;
public Keys k;



public Display(){
	i = new ImagePanel();
	gp.setVisible(true);
	k = new Keys(this, i);
    





	gp.setLayout(new GridLayout(1, 1, 0, 0));
	this.setLayout(new GridLayout(1, 1, 0, 0));


	gp.add(k);
	this.add(i);

}




}
