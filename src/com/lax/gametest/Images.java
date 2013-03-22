package com.lax.gametest;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;



public class Images extends JPanel {

    private static final long serialVersionUID = 1L;

	public int w = Main.w;
	public int h = Main.h;

    public boolean imagesLoaded = false;
    public Image bg;


	public Images(){
		this.setBackground(Color.WHITE);

            }



    public void loadImages(){
        bg = new ImageIcon("~/Desktop/bg.png").getImage();
        imagesLoaded = true;  }
    }


