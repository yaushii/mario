package com.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.Personage.Mario;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond; // permet de stocker l'image de fond
	private Image imgFond1;
	private Image imgFond2;
	
	private ImageIcon icoChateau1;
	private Image imgchateau;
	
	private ImageIcon icoDepart;
	private Image imgDepart;

	private int xFont1; // placer le fond
	private int xFont2;
	private int dx;

	private int xPos; // position absolue
	
	public Mario mario; 
	
	
	
	// ****** CONSTRUCTEUR ******//
	public Scene() {

		super();

		this.xFont1 = -50;
		this.xFont2 = 750;
		this.dx = 0;
		this.xPos = -1;

		// recupere les image avec imageicon
		icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
		icoChateau1 = new ImageIcon(getClass().getResource("/image/chateau1.png"));
		icoDepart = new ImageIcon(getClass().getResource("/image/depart.png"));
		
		// associe l'icone a image
		this.imgDepart = this.icoDepart.getImage();
		this.imgchateau = this.icoChateau1.getImage();
		this.imgFond1 = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		
		
		mario = new Mario(300, 245);
		
		
		this.setFocusable(true);
		this.requestFocusInWindow();

		this.addKeyListener(new Clavier());

		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();

	}

	

	// ***** GETTERS *****//
	public int getDx() {
		return dx;
	}
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	// ***** SETTERS *****//
	public void setDx(int dx) {
		this.dx = dx;
	}
	
	public void setxFont1(int xFont1) {
		this.xFont1 = xFont1;
	}
	
	public void setxFont2(int xFont2) {
		this.xFont2 = xFont2;
	}
	

	// ******* METHODES ******//



	public void deplacementFond() {
		
		// mise a jour des position des �l�ments du jeu lors du deplacement de mario
		if (this.xPos >= 0){
			this.xPos = this.xPos + this.dx;
		this.xFont1 = this.xFont1 - this.dx;
		this.xFont2 = this.xFont2 - this.dx;
		}

		// permanance du fond
		if (this.xFont1 == -800) {
			this.xFont1 = 800;
		} else if (this.xFont2 == -800) {
			this.xFont2 = 800;
		} else if (this.xFont1 == 800) {
			this.xFont1 = -800;
		} else if (this.xFont2 == 800) {
			this.xFont2 = -800;
		}

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		Graphics g2 = (Graphics2D) g;

		this.deplacementFond();
		g2.drawImage(this.imgFond1, this.xFont1, 0, null);// dessin de l'image
															// de fond
		g2.drawImage(this.imgFond2, this.xFont2, 0, null);
		g2.drawImage(this.mario.marche("mario", 30), 300, 245, null); // dessine et place le mario sur le fond
		g2.drawImage(this.imgDepart, 220 - this.xPos, 234,null);
		g2.drawImage(this.imgchateau, 10 - this.xPos, 95,null);
												

	}
}