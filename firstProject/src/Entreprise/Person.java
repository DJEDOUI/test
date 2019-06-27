package Entreprise;

public class Person {
	private int id_P;
	private String Nom_P;
	private String Prenom_P;
	private String date_N_P;

	private static int ID = 0;

	/**
	 * CONSTRUCTORS
	 */
	public Person() {

	}

	/**
	 * @param id_P
	 * @param Nom_P
	 * @param Prenom_P
	 * @param date_N_P
	 */

	public Person(String n, String p, String d) {

		Nom_P = n;
		Prenom_P = p;
		date_N_P = d;
	}

	/*
	 * GETTER ET SETTER
	 */

	// TO GET THE VALUE
	public int getid_P() {
		return id_P;
	}

	// TO SET THE VALUE
	public void setId_Personne(int id_P) {
		this.id_P = id_P;
	}

	public String getNom_P() {
		return Nom_P;
	}

	public void setNom_P(String Nom_Pers) {
		Nom_P = Nom_Pers;
	}

	public String getPrenom_P() {
		return Prenom_P;
	}

	public void setPrenom_P(String prenom_Pers) {
		Prenom_P = prenom_Pers;
	}

	public String getDate_N_P() {
		return date_N_P;
	}

	public void setDate_N_P(String date_N_Personne) {
		this.date_N_P = date_N_Personne;
	}

	public String Afficher() {
		// TODO Auto-generated method stub
		return (getNom_P() + "  " + getPrenom_P() + " né(e) le  " + getDate_N_P());
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getNom_P() + "  " + getPrenom_P() + " né(e) le  " + getDate_N_P());
	}

}
