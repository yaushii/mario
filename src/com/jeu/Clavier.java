package com.jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener {

	@Override
	// quand on presse la touche
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT){
			Main.scene.setDx(1);
		}else if (  e.getKeyCode() == KeyEvent.VK_LEFT){
			Main.scene.setDx(-1);
		}
	}

	@Override
	// quand on relache la touche
	public void keyReleased(KeyEvent e) {
		Main.scene.setDx(0);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}

}
