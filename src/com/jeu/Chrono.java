package com.jeu;
// fait defill� le fond d'ecran pour faire avancer mario
public class Chrono implements Runnable {
 
	private final int PAUSE = 3; // temps d'attente entre 2 tours de boucles
	
	
	
	@Override
	public void run() {
		
		while(true){
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e){}
		}
	}

	
}
