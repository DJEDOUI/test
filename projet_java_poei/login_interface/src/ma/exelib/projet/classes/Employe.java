package ma.exelib.projet.classes;

public class Employe extends Personne {

	protected double salaire;

	/**
	 * @param salaire
	 */
	public Employe(String n, String p, String v, Double salaire) {
		super(n, p, v);
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return (super.toString() + " salaire : " + getSalaire() + " € / mois.");
	}

	/*
	 * GETTER ET SETTER
	 */
	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
