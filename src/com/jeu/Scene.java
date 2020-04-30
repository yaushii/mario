package com.jeu;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Scene extends JPanel {

	private ImageIcon icoFond; // permet de stocker l'image de fond
	private Image imgFond1;
	private Image imgFond2;

	private ImageIcon icoMario;
	private Image imgMario;

	private int xFont1; // placer le fond
	private int xFont2;
	private int dx;

	// ****** CONSTRUCTEUR ******//
	public Scene() {

		super();

		this.xFont1 = -50;
		this.xFont2 = 750;
		this.dx = 0;

		// recupere les image avec imageicon
		icoFond = new ImageIcon(getClass().getResource("/image/fondEcran.png"));
		// associe l'icone a image
		this.imgFond1 = this.icoFond.getImage();
		this.imgFond2 = this.icoFond.getImage();
		icoMario = new ImageIcon(getClass().getResource(
				"/image/marioMarcheDroite.png"));
		this.imgMario = this.icoMario.getImage();
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

	// ***** SETTERS *****//
	public void setDx(int dx) {
		this.dx = dx;
	}

	// ******* METHODES ******//

	public void deplacementFond() {
		this.xFont1 = this.xFont1 - this.dx;
		this.xFont2 = this.xFont2 - this.dx;

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
		g2.drawImage(imgMario, 300, 245, null); // dessine et place le mario sur
												// le fond

	}
}
