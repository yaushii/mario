package com.Personage;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.jeu.Main;
import com.objet.Objet;


public class Personnage {

	private int largeur, hauteur; // dimmension du personnage
	private int x, y; // position du personnage
	private boolean marche; // vrai quand le personnage marche
	private boolean versDroite;// vrai quand le personnage est tourné vers la droite
	public int compteur; // compteu de pas de mario

	// ***** CONSTRUTEUR *****//

	public Personnage(int x, int y, int largeur, int hauteur) {

		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.compteur = 0;
		this.marche = false;
		this.versDroite = true;
	}

	// *****GETTERS*****//
	public int getLargeur() {
		return largeur;
	}

	public int getHauteur() {
		return hauteur;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isMarche() {
		return marche;
	}

	public boolean isVersDroite() {
		return versDroite;
	}

	public int getCompteur() {
		return compteur;
	}

	// ******SETTERS******//



	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMarche(boolean marche) {
		this.marche = marche;
	}

	public void setVersDroite(boolean versDroite) {
		this.versDroite = versDroite;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	//***** METHODE*****//
	public Image marche(String nom, int frequence) {
				
		String str;
		ImageIcon ico;
		Image img;
		
		if(this.marche == false || Main.scene.getxPos() <= 0) {
			if(this.versDroite == true) {
				str = "/image/"+ nom + "ArretDroite.png";
			}else {
				str = "/image/"+ nom + "ArretGauche.png";}
			
		}else { this.compteur++;
		if(this.compteur / frequence == 0) {
			if(this.versDroite == true) {str = "/image/"+ nom + "ArretDroite.png";}
			else {str = "/image/"+ nom + "ArretGauche.png";}
		}else {
			if(this.versDroite == true) {str = "/image/"+ nom + "MarcheDroite.png";}
			else {
				str = "/image/"+ nom + "MarcheGauche.png";}
		}
		if (this.compteur == 2 * frequence) {
			this.compteur =0;}
		
		
		}
		
		
		// Affichage de l'image du personnage
		ico = new ImageIcon(getClass().getResource(str));
		img = ico.getImage();
		return img;
		
	}

	public boolean contactAvant(Objet objet){
		if(this.isVersDroite() == true){
		if(this.x + this.largeur < objet.getX() || this.x + this.largeur > objet.getX() + 5 || this.y + this.hauteur <= objet.getY()|| this.y >= objet.getY() + objet.getHauteur()){return false;}
	 else{ return true;}
}else{return false;}
	}}
