package Livre;

import java.util.ArrayList;

public class Auteur extends Person {

	ArrayList<Livre> listBooks = new ArrayList<Livre>();

	public Auteur(String nom_Person, String prenom_Person, String date_N_Person, ArrayList<Livre> listBooks) {
		super(nom_Person, prenom_Person, date_N_Person);
		this.listBooks = listBooks;
	}
}
