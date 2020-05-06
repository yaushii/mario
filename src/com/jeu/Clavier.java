package com.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	// quand on presse la touche
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Main.scene.setDx(1);
			if (Main.scene.getxPos() == -1) {
				Main.scene.setxPos(0); // réinitialisation de setxPos
				Main.scene.setxFont1(-50);// réinitialisation de setxFont1
				Main.scene.setxFont2(750);// réinitialisation de setxFont2
			}

			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(true);
			Main.scene.setDx(1); // deplacement du fond vers la gauche quand on appui sur la fleche droite

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.mario.setMarche(true);
			Main.scene.mario.setVersDroite(false);
			Main.scene.setDx(-1); // deplacement du fond vers la droite quand on appui sur la fleche gauche
		}
	}

	@Override
	// quand on relache la touche remise a 0 de la variable Dx de l'objet scene lrs
	// du relachement des touches
	public void keyReleased(KeyEvent e) {
		Main.scene.mario.setMarche(false);
		Main.scene.setDx(0);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
