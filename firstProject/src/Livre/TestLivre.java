package Livre;

import java.util.ArrayList;

public class TestLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		ArrayList<Livre> listOeuvres = new ArrayList<Livre>();
		Livre livre1 = new Livre("Le rouge et le noir");
		Livre livre2 = new Livre("le rose et le bleu");
		listOeuvres.add(livre1);
		listOeuvres.add(livre2);
		Auteur persona1 = new Auteur("BEYLE", "Henry", "23 janvier 1783", listOeuvres);
		Livre livre = new Livre("Le Rouge Et Le Noir", 6.98, persona1);
		Emprunteur emp1 = new Emprunteur("DJEDOUI", "Jamila", "26 juillet 1979", 2);
		System.out.println(livre.toString());
		System.out.println(emp1.getNom_Person() + " " + emp1.getPrenom_Person() + " a emprunté " + emp1.getNbre_livre()
				+ " Ouvrage(s).");

	}

}
