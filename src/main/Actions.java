package main;

public class Actions {
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

}
