public class Tableau {
	public static void main (String[] args) {
	int[] tab = new int[10];

	//initialiser le tableau
	tab[0] = 1;
	tab[1] = 20;
	tab[2] = 10;
	tab[3] = 15;
	tab[4] = 12;
	tab[5] = 18;
	tab[6] = 16;
	tab[7] = 23;
	tab[8] = 9;
	tab[9] = 6;
	
	//aficher le contenu du tableau avec for
	for (int i = 0; i < tab.length; i++) {
	
		System.out.println(+tab[i]);
	}
}
}
