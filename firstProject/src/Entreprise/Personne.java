package Entreprise;

public class Personne {
	private int id_Personne;
	private String Nom_Personne;
	private String Prenom_Personne;
	private String date_N_Personne;

	private static int ID = 0;

	/**
	 * CONSTRUCTORS
	 */
	public Personne() {

	}

	/**
	 * @param id_Personne
	 * @param nom_Personne
	 * @param prenom_Personne
	 * @param date_N_Personne
	 */

	public Personne(String n, String p, String d) {

		Nom_Personne = n;
		Prenom_Personne = p;
		date_N_Personne = d;
	}

	/*
	 * GETTER ET SETTER
	 */

	// TO GET THE VALUE
	public int getId_Personne() {
		return id_Personne;
	}

	// TO SET THE VALUE
	public void setId_Personne(int id_Personne) {
		this.id_Personne = id_Personne;
	}

	public String getNom_Personne() {
		return Nom_Personne;
	}

	public void setNom_Personne(String nom_Personne) {
		Nom_Personne = nom_Personne;
	}

	public String getPrenom_Personne() {
		return Prenom_Personne;
	}

	public void setPrenom_Personne(String prenom_Personne) {
		Prenom_Personne = prenom_Personne;
	}

	public String getDate_N_Personne() {
		return date_N_Personne;
	}

	public void setDate_N_Personne(String date_N_Personne) {
		this.date_N_Personne = date_N_Personne;
	}

	public String Afficher() {
		// TODO Auto-generated method stub
		return (getNom_Personne() + "  " + getPrenom_Personne() + " né(e) le  " + getDate_N_Personne());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getNom_Personne() + "  " + getPrenom_Personne() + " né(e) le  " + getDate_N_Personne());
	}

}
