package Batiment;

public class Batiment {

	private String adresse;

	/**
	 * CONSTRUCTOR
	 */
	public Batiment() {
		super();
	}

	/**
	 * @param adresse
	 */
	public Batiment(String adresse) {
		super();
		this.adresse = adresse;
		this.adresse = adresse;
	}

	/*
	 * GETTER ET SETTER
	 */
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return getAdresse();
	}

}
