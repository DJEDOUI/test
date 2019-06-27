package Batiment;

public class TestBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batiment batiment = new Batiment("250 avenue Jean Jules 32000 Montauban");
		System.out.println("Le bâtiment se situe : " + batiment.toString());
		Maison manoirWayneMaison = new Maison("1rst street de Gotham 06154 Gotham City. \n", 562);
		System.out.println("La maison de Bruce est située : " + manoirWayneMaison);
		Maison M2 = new Maison();
		M2.setAdresse("21 rue de la plage residence 37.2° 11056 Gruissan.");
		M2.setNbrePieces(5);
		System.out.println("Mon chalet à Gruissan ..." + M2.toString());
	}

}
