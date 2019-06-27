package ma.exelib.projet.classes;

public class Etudiant extends Personne {

	private String cne;

	/**
	 * @param salaire
	 */
	public Etudiant(String n, String p, String v, String c) {
		super(n, p, v);
		this.cne = c;
	}

	@Override
	public String toString() {
		return (super.toString() + " commune : " + getCne());
	}

	/*
	 * GETTER ET SETTER
	 */
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

}
