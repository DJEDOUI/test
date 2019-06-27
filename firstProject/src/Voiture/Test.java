package Voiture;

import java.util.ArrayList;

public class Test {

	static Voiture[] ListeVoitures = new Voiture[3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Display Hello world
		System.out.println("Hello World !");
		ArrayList<Voiture> listCars = new ArrayList<Voiture>();
		// Create 3 cars with constructor

		ListeVoitures[0] = new Voiture("BMW", 220.0, 8);
		ListeVoitures[1] = new Voiture("FORD", 200.0, 6);
		ListeVoitures[2] = new Voiture("AUDI", 240.0, 8);

		listCars.add(ListeVoitures[0]);
		listCars.add(ListeVoitures[1]);
		listCars.add(ListeVoitures[2]);

		// Display the informations about the cars created with for loop
		for (Voiture voiture : ListeVoitures) {
			System.out.println(voiture.toString());
		}
		for (Voiture voiture : listCars) {
			System.out.println(voiture.toString());
		}

		System.out
				.println("Le nombre de voiture dans le magasin est " + listCars.size() + " ou " + ListeVoitures.length);

	}

}
