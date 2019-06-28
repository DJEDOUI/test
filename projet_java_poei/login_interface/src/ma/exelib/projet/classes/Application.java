package ma.exelib.projet.classes;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) throws Exception {

		System.out.println("Hello World ! ");

		ArrayList<Personne> list = new ArrayList<Personne>();

		Etudiant etudiant1 = new Etudiant("WAYNE", "Bruce", "Gotham", "Metropolis");
		Etudiant etudiant2 = new Etudiant("KENT", "Clark", "Smallville", "Krypton");
		Employe emp1 = new Employe("BENIWORTH", "Alfred", "Metropolis", 2015.23);
		Employe emp2 = new Employe("LANE", "Loïs", "Metropolis", 1915.35);
		Professeur prof1 = new Professeur("CAYLE", "Selina", "Paris", 3500.12, "Biologie");
		Professeur prof2 = new Professeur("LANG", "Lana", "Lyon", 3500.12, "Physique");

		list.add(etudiant1);
		list.add(etudiant2);
		list.add(emp1);
		list.add(emp2);
		list.add(prof1);
		list.add(prof2);
		/*
		 * TESTER LA CONNEXION
		 */

//		ConnectionBDD.Connect();

		/*
		 * INSERER DES DONNEES
		 */

		for (Personne eltPersonne : list) {
			System.out.println(eltPersonne.toString());
			ConnectionBDD.insertPersonne(eltPersonne);
		}

		/*
		 * RECUPERER UNE PERSONNE AVEC SON ID
		 */

//		Personne lambdaPersonne = ConnectionBDD.selecPersonneWithId(4);
//		System.out.println(lambdaPersonne);

		/*
		 * RECUPERER DES DONNEES
		 */

//		ArrayList<Personne> listeretour = new ArrayList<Personne>();
//		listeretour = ConnectionBDD.requetSelectPersonne();
//		for (Personne pers : listeretour) {
//			System.out.println(pers);
//		}

		/*
		 * MISE A JOUR AVEC NOM ET ID
		 */
		// ConnectionBDD.updatePersonne("WAYNE", 1);

		/*
		 * MISE A JOUR AVEC NOM
		 */
		// ConnectionBDD.updatePersonne("WAYNE", "WAYYYYYYYYYYYYYYYNE", "GOT");

		/*
		 * SUPPRIMER UNE PERSONNE AVEC SON NOM
		 */
		// ConnectionBDD.deletePersonne("CAYLE");

		/*
		 * SUPPRIMER UNE TABLE
		 */
		// ConnectionBDD.deleteTable();

	}

}
