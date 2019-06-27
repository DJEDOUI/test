package Livre;

public class Emprunteur extends Person {

	private int nbre_livre;

	public Emprunteur(String nom_Person, String prenom_Person, String date_N_Person, int nb) {
		super(nom_Person, prenom_Person, date_N_Person);
		this.nbre_livre = nb;
	}

	public int getNbre_livre() {
		return nbre_livre;
	}

	public void setNbre_livre(int nbre_livre) {
		this.nbre_livre = nbre_livre;
	}

}
