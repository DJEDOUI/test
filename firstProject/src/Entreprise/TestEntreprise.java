package Entreprise;

import java.util.ArrayList;

public class TestEntreprise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !!!");
		// Person personne1 = new Person("DJEDOUI", "Jamila", "26/07/1979");
		// System.out.println("Une première personne : " + personne1.Afficher());
//		Employe emp1 = new Employe("DJEDOUI", "Jamila", "26/07/1979", 1400.23);
//		System.out.println(emp1.Afficher());
//		Chef chefchef = new Chef("JACQUES", "Medhi", "10/03/1987", 2300.48, "RH");
//		System.out.println(chefchef.Afficher());
//		Directeur director = new Directeur("DUPONT", "Francis", "26 mai 1999", 15_989.54, "Direction Générale",
//				"Vitale");
//		System.out.println(director.Afficher());
//
		ArrayList<Person> listEntrepise = new ArrayList<Person>();
		Employe emp1 = new Employe("DJEDOUI", "Jamila", "26/07/1979", 1550.23);
		Employe emp2 = new Employe("DURAND", "Luc", "26/01/1989", 1560.79);
		Employe emp3 = new Employe("BENIWORTH", "Alfred", "16/06/1959", 1860.73);
		Employe emp4 = new Employe("UNDERWOOD", "Frank", "06/12/1969", 1560.99);
		Employe emp5 = new Employe("COBBLEPOT", "Ozwalt", "03/03/1975", 1559.30);
		Chef chef1 = new Chef("GORDON", "James", "01/08/1981", 2836.45, "Team Produit");
		Chef chef2 = new Chef("NIGMA", "Edouard", "23/04/1987", 3500.45, "Team Devops");
		Directeur director = new Directeur("WAYNE", "Bruce", "19/01/2002", 1500800.564, "Direction Générale",
				"Wayne Entreprise");
		listEntrepise.add(emp1);
		listEntrepise.add(emp2);
		listEntrepise.add(emp3);
		listEntrepise.add(emp4);
		listEntrepise.add(emp5);
		listEntrepise.add(chef1);
		listEntrepise.add(chef2);
		listEntrepise.add(director);

//		for (int i = 0; i < listEntrepise.size(); i++) {
//			System.out.println(listEntrepise.get(i).Afficher());
//		}

		for (Person eltPersonne : listEntrepise) {
			System.out.println(eltPersonne.Afficher());
		}

	}

}
