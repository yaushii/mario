package com.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Bloc extends Objet {

	private Image imgBloc;
	private ImageIcon icoBloc;

	public Bloc(int x, int y) {
		super(x, y, 41, 65);

		this.icoBloc = new ImageIcon(getClass().getResource("/image/bloc.png"));
		this.imgBloc = this.icoBloc.getImage();
	}

	/***** GETTERS *****/
	public Image getImgBloc() {
		return imgBloc;
	}
}
