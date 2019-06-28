package ma.exelib.projet.classes;

public class Professeur extends Employe {

	private String specialite;

	/**
	 * @param n
	 * @param p
	 * @param s
	 * @param salaire
	 * @param specialite
	 */
	public Professeur(String n, String p, String s, Double salaire, String specialite) {
		super(n, p, s, salaire);
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return (super.toString() + " de spécialité : " + getSpecialite());
	}

	/*
	 * GETTER ET SETTER
	 */
	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

}
