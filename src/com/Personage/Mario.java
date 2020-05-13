package com.Personage;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.jeu.Main;

public class Mario extends Personnage {

	
	//*****VARIABLE*****/
	private Image imgMario;
	private ImageIcon icoMario;
	
	private Boolean saut; //vrai si mario saut
	private int compteurSaut; // durée du saut et hauteur
	
	public Mario(int x, int y) {
		super(x, y, 28, 50);

	this.icoMario = new ImageIcon(getClass().getResource("/image/marioMarcheDroite.png"));
	this.imgMario = this.icoMario.getImage();
	
	this.saut = false;
	this.compteurSaut = 0;
	}
	
	
	
	
	// ****** GETTERS ****** //
	
	public Image getImgMario() {
		return imgMario;
	}
	
	
	public Boolean getSaut() {return saut;}

	//****** SETTERS *****//
	public void setSaut(Boolean saut) {this.saut = saut;} 
	
	// ***** METHODE *****//
	public Image saut() {
		
		ImageIcon ico;
		Image img;
		String str;	
		
		this.compteurSaut ++;
		// montée du saut
		if(this.compteurSaut <= 35) {
			if(this.getY() > Main.scene.getHauteurPlafond()) {this.setY(this.getY() - 4);}
			else {this.compteurSaut = 36;}
			if(this.isVersDroite()== true) {str = "/image/marioArretDroite.png";}
			else { str ="/image/marioArretGauche.png";}
			
			// Retomber de mario
		}else if (this.getY() + this.getHauteur() < Main.scene.getySol()) {this.setY(this.getY() + 1);
		if(this.isVersDroite()== true) {str = "/image/marioArretDroite.png";}
		else { str ="/image/marioArretGauche.png";}
		
		// saut terminé
		}else{
			if (this.isVersDroite() == true) {
				str = "/image/marioArretDroite.png";
		} else {
				str = "/image/marioArretGauche.png";}
			this.saut = false;
			this.compteurSaut = 0;

		}
		//affichage image de mario
		
		ico = new ImageIcon(getClass(). getResource(str));
		img = ico.getImage();
		return img;
	}
	}
