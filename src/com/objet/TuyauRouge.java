package com.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class TuyauRouge extends Objet {

	private Image imgTuyau;
	private ImageIcon icoTuyau;

	public TuyauRouge(int x, int y) {
		super(x, y, 43, 65);

		this.icoTuyau = new ImageIcon(getClass().getResource("/image/tuyauRouge.png"));
		this.imgTuyau = this.icoTuyau.getImage();
	}

	/***** GETTERS *****/
	public Image getImgTuyau() {
		return imgTuyau;
	}
}
