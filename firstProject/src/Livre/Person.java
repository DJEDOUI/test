package Livre;

public class Person {
	private int id_Person;
	private String Nom_Person;
	private String Prenom_Person;
	private String date_N_Person;

	private static int ID = 0;

	/**
	 * CONSTRUCTORS
	 */
	protected Person() {

	}

	/**
	 * @param id_Person
	 * @param nom_Person
	 * @param prenom_Person
	 * @param date_N_Person
	 */

	protected Person(String nom_Person, String prenom_Person, String date_N_Person) {
		this.id_Person = ID++;
		this.Nom_Person = nom_Person;
		this.Prenom_Person = prenom_Person;
		this.date_N_Person = date_N_Person;
	}

	/*
	 * GETTER ET SETTER
	 */

	// TO GET THE VALUE
	public int getId_Person() {
		return id_Person;
	}

	// TO SET THE VALUE
	public void setId_Person(int id_Person) {
		this.id_Person = id_Person;
	}

	public String getNom_Person() {
		return Nom_Person;
	}

	public void setNom_Person(String nom_Person) {
		Nom_Person = nom_Person;
	}

	public String getPrenom_Person() {
		return Prenom_Person;
	}

	public void setPrenom_Person(String prenom_Person) {
		Prenom_Person = prenom_Person;
	}

	public String getDate_N_Person() {
		return date_N_Person;
	}

	public void setDate_N_Person(String date_N_Person) {
		this.date_N_Person = date_N_Person;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (getNom_Person() + "  " + getPrenom_Person() + " né(e) le  " + getDate_N_Person());
	}

}
