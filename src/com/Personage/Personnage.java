package com.Personage;

public class Personnage {

	private int largeur, hauteur; // dimension du personnage
	private int x, y; // position du personnage
	private boolean marche; // vrai quand le personnage marche
	private boolean versDroite;// vrai quand le perso est tournée vers la droite
	private int compteur; // compteur des pas du personnage


/***** CONSTRUCTEUR *****/

public Personnage(int x, int y, int largeur, int hauteur){
	this.x = x;
	this.y = y;
	this. largeur = largeur;
	this.hauteur = hauteur;
	this.compteur = 0;
	this.marche = false;
	this.versDroite = true;
}

/******GETTERS*****/
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
	/***** SETTERS *****/
	
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




}