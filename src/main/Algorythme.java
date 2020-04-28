package main;

public class Algorythme {
	public static void demenager(){
		int ancienlocal = 34;
		int nouveaulocal = 0;
		int contenancecamion = 9;
		float poidscamion = 0;
		int caisse_en_transport = 0;
		while (ancienlocal > 0) {
			System.out.println(ancienlocal);
			caisse_en_transport = Actions.chargementcamion(ancienlocal, contenancecamion); // <>//
			ancienlocal = ancienlocal - caisse_en_transport;
			System.out.println("Un Voyage de " + caisse_en_transport + " cartons. ");
			System.out.println(ancienlocal);
			nouveaulocal = Actions.dechargement_camion(caisse_en_transport, nouveaulocal);
			caisse_en_transport = 0;
			System.out.println(nouveaulocal);
		}
		System.out.println(nouveaulocal);
	}
}
