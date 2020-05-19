package fr.unilim.iut.spaceinvaders.model;

public class Envahisseur extends Sprite {

	Direction direction;
	
	public Envahisseur(Dimension dimension, Position positionOrigine, int vitesse) {
		super(dimension, positionOrigine, vitesse);
		this.direction = Direction.GAUCHE;
	}

}