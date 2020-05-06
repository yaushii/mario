package com.objet;

public class Objet {

	private int largeur, hauteur;
	private int x, y;

	/***** CONSTRUCTEUR *****/
	public Objet(int x, int y, int largeur, int hauteur) {
		this.x = x;
		this.y = y;
		this.hauteur = hauteur;
		this.largeur = largeur;
	}

	/***** GETTERS *****/
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

	/***** Setters ******/

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
