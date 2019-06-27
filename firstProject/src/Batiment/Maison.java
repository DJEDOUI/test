package Batiment;

public class Maison extends Batiment {

	int nbrePieces;

	/**
	 * CONSTRUCTOR
	 */
	public Maison() {
	}

	public Maison(String adr, int n) {
		super(adr);
		nbrePieces = n;
	}

	/*
	 * GETTER ET SETTER
	 */
	public int getNbrePieces() {
		return nbrePieces;
	}

	public void setNbrePieces(int nbrePieces) {
		this.nbrePieces = nbrePieces;
	}

	@Override
	public String toString() {
		return super.toString() + "Elle dispose de " + getNbrePieces() + " pièces.";
	}

}
