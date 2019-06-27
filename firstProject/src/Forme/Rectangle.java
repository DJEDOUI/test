package Forme;

public class Rectangle {

	double Longueur;
	double Largeur;

	/*
	 * GETTER ET SETTER
	 */

//TO GET THE VALUE
	public double getLongueur() {
		return Longueur;
	}

//TO SET THE VALUE
	public void setLongueur(int longueur) {
		this.Longueur = longueur;
	}

	public double getLargeur() {
		return Largeur;
	}

	public void setLargeur(int largeur) {
		this.Largeur = largeur;
	}

	/**
	 * @param longueur
	 * @param largeur
	 */
	public Rectangle(int longueur, int largeur) {
		this.Longueur = longueur;
		this.Largeur = largeur;
	}

	/*
	 * Calculate and return the perimeter of the form
	 */
	public double perimetre() {
		return 2 * (Longueur + Largeur);
	}

	/*
	 * Calculate and return the aire of the form
	 */
	public double aire() {
		return Longueur * Largeur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Le rectangle mesure " + Longueur + " en longueur et " + Largeur + " en largeur "
				+ "\n Son périmètre est : " + perimetre() + " cm. \n Son aire vaut : " + aire() + " cm².");
	}

}
