package com.lax.gametest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Display extends JFrame{
	
public JPanel gp = (JPanel) getGlassPane();
public Images i;
public Keys k;



public Display(){
	i = new Images();
	gp.setVisible(true);
	k = new Keys(this, i);
    i.loadImages();





	gp.setLayout(new GridLayout(1, 1, 0, 0));
	this.setLayout(new GridLayout(1, 1, 0, 0));


	gp.add(k);
	this.add(i);

}




}
