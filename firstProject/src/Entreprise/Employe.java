package Entreprise;

public class Employe extends Person {

	private double salaire;

	/**
	 * @param Salaire
	 *
	 */
	public Employe(String n, String p, String d, double s) {
		super(n, p, d);
		salaire = s;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String Afficher() {
		// super.Afficher();
		return (super.Afficher() + " salaire : " + getSalaire() + " € / mois.");
	}

}
