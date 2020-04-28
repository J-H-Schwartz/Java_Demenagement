package main;

public class Demenagement {

	public static int chargementcamion(int ancienlocal, int contenancecamion) {
		int caisse_a_charger = ancienlocal;
		int contenu_camion = 0;
		while (caisse_a_charger > 0 && contenu_camion < contenancecamion) {
			caisse_a_charger -= 1;
			contenu_camion += 1;
		}
		return contenu_camion;
	}

	public static int dechargement_camion(int caisse_en_transport, int nouveaulocal) {
		int caisse_a_decharger = nouveaulocal;
		int contenu_camion = caisse_en_transport;
		while (contenu_camion > 0) // <>//
		{
			contenu_camion -= 1;
			caisse_a_decharger += 1;
		}
		return caisse_a_decharger;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ancienlocal = 34;
		int nouveaulocal = 0;
		int contenancecamion = 9;
		float poidscamion = 0;
		int caisse_en_transport = 0;
		while (ancienlocal > 0) {
			System.out.println(ancienlocal);
			caisse_en_transport = Demenagement.chargementcamion(ancienlocal, contenancecamion); // <>//
			ancienlocal = ancienlocal - caisse_en_transport;
			System.out.println("Un Voyage de " + caisse_en_transport + " cartons. ");
			System.out.println(ancienlocal);
			nouveaulocal = Demenagement.dechargement_camion(caisse_en_transport, nouveaulocal);
			caisse_en_transport = 0;
			System.out.println(nouveaulocal);
		}
		System.out.println(nouveaulocal);
	}

}
