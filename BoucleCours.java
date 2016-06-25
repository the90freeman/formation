public class BoucleCours {
	public static void main (String[] args) {
	int[] montants = new int[3];
	
	//initialiser le tableau
	montants[0] = 2329;
	montants[1] = 293;
	montants[2] = 3943;
	
	//afficher le contenu du tableau
	for (int i=0; i< montants.length; i++) {

		int montantTemporaire = montants[i];
		System.out.println(montantTemporaire);
		}

	//afficher le contenu avec un for each

	for (int montant : montants) {
		System.out.println(montant);
		}

	// Afficher le contenu du tableau avec un while
	int compteur = 0;
	while (compteur < montants.length) {
		System.out.println(montants[compteur++]);
		}

	// Affiche le contenu du tableau avec do while
	compteur = 0;//reinitialisation du compteur
	do {
		System.out.println(montants[compteur]);
		compteur ++;
		}while ( compteur < montants.length); 
	}
}
