package Voiture;

public class Voiture {

	// Attributs de l'objet
	private int Id;
	private String Marque;
	private double Vitesse;
	private int Puissance;

	public static int IdVoiture = 0;

	/*
	 * CONSTRUCTORS
	 *
	 */

	public Voiture(String marque, double vitesse, int puissance) {
		this.Id = ++IdVoiture;
		this.Marque = marque;
		this.Vitesse = vitesse;
		this.Puissance = puissance;
	}

	/*
	 * METHODS
	 */

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("La voiture n° " + Id + "\n Marque : " + Marque + "\n Vitesse : " + Vitesse + "\n Puissance : "
				+ Puissance);
	}

	/*
	 * GETTER ET SETTER
	 */

//TO GET THE VALUE
	public int getId() {
		return Id;
	}

//TO SET THE VALUE
	public void setId(int id) {
		this.Id = id;
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		this.Marque = marque;
	}

	public double getVitesse() {
		return Vitesse;
	}

	public void setVitesse(double vitesse) {
		this.Vitesse = vitesse;
	}

	public int getPuissance() {
		return Puissance;
	}

	public void setPuissance(int puissance) {
		this.Puissance = puissance;
	}

}
