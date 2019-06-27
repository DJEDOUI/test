package Livre;

public class Livre {
	private int Id_livre;
	private String titre_livre;
	private double Prix;
	private Person Auteur = new Person();

	private int ID = 0;

	/**
	 * CONSTRUCTORS
	 */
	public Livre(String titre) {
		this.titre_livre = titre;
	}

	/**
	 * @param id_livre
	 * @param titre_livre
	 * @param prix
	 * @param auteur
	 */
	public Livre(String titre_livre, double prix, Person auteur) {
		this.Id_livre = ID++;
		this.titre_livre = titre_livre;
		this.Prix = prix;
		this.Auteur = auteur;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Le livre a pour titre : " + getTitre_livre() + " \n il coûte " + getPrix()
				+ " et il a été ecrit par la personne suivante : " + getAuteur().toString());
	}

	/*
	 * GETTER ET SETTER
	 */

	// TO GET THE VALUE
	public int getId_livre() {
		return Id_livre;
	}

	// TO SET THE VALUE
	public void setId_livre(int id_livre) {
		this.Id_livre = id_livre;
	}

	public String getTitre_livre() {
		return titre_livre;
	}

	public void setTitre_livre(String titre_livre) {
		this.titre_livre = titre_livre;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		this.Prix = prix;
	}

	public Person getAuteur() {
		return Auteur;
	}

	public void setAuteur(Person auteur) {
		this.Auteur = auteur;
	}

}
