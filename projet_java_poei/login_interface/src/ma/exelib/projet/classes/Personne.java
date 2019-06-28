package ma.exelib.projet.classes;

public class Personne {

	protected int id_Personne;
	protected String Nom_Personne;
	protected String Prenom_Personne;
	protected String Ville_Personne;

	public static int ID = 0;

	/**
	 * CONSTRUCTORS
	 */
	public Personne() {

	}

	/**
	 * @param id_Personne
	 * @param nom_Personne
	 * @param prenom_Personne
	 * @param ville_Personne
	 */

	public Personne(String n, String p, String v) {
		id_Personne = ++ID;
		Nom_Personne = n;
		Prenom_Personne = p;
		Ville_Personne = v;
	}

	@Override
	public String toString() {
		return (getNom_Personne() + "  " + getPrenom_Personne() + " " + getVille_Personne());
	}

	/*
	 * GETTER ET SETTER
	 */

	/**
	 * @return the ville_Personne
	 */
	public String getVille_Personne() {
		return Ville_Personne;
	}

	/**
	 * @param ville_Personne the ville_Personne to set
	 */
	public void setVille_Personne(String ville_Personne) {
		Ville_Personne = ville_Personne;
	}

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

}
