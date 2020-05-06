package com.Personage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mario extends Personnage {

	
	//*****VARIABLE*****/
	private Image imgMario;
	private ImageIcon icoMario;
	
	public Mario(int x, int y) {
		super(x, y, 28, 50);

	this.icoMario = new ImageIcon("src/image/marioMarcheDroite.png");
	this.imgMario = this.icoMario.getImage();
	}
	
	// ****** GETTERS ****** //
	
	public Image getImgMario() {
		return imgMario;
	}

	//****** SETTERS *****//
	
	
	// ***** METHODE *****//
}