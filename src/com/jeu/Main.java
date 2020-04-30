package com.jeu;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	
	public static void main(String[] args) {
//permet de créer une fnêtre fait appel a la classe JFrame
		// cree une fenetre qui s'appelle Jeu style mario
JFrame fenetre = new JFrame ("Jeu style mario");
// permet de fermer le programme en cliquant sur la croix
 	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	//donne la definition de la fenetre
 	fenetre.setSize(700, 360);
 	// permet de centrer la fenetre
 	fenetre.setLocationRelativeTo(null);
 	// empeche de la redimensionner
 	fenetre.setResizable(false);
 	// la fenetre au dessus des autres
 	fenetre.setAlwaysOnTop(true);
 		
 	//
 	//instanciation de l'objet scene
 	scene = new Scene();
 		fenetre.setContentPane(scene);// associe la scene a la fenetre
 		fenetre.setVisible(true);
 	
		
	}

}
