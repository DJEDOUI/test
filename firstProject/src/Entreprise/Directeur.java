package Entreprise;

public class Directeur extends Chef {

	private String societe;

	public Directeur(String n, String p, String d, double s, String serv, String soc) {
		super(n, p, d, s, serv);
		societe = soc;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	@Override
	public String Afficher() {
		return (super.Afficher() + " et la société affiliée : " + getSociete());
	}
}
