package principal;

/**
 * 
 * @author fep
 *
 */

public class Main {
	public static void main(String[] args) {
  
		Jeu j = new Jeu();
		int nbreArg = args.length;
		// Prise en compte de l'argument de commande en ligne en admin (triche) (nbreArg est le nombre d'arguments dans la ligne de commande)
		for (nbreArg=0; nbreArg<args.length; nbreArg++) {
			System.out.print("L'argument 'admin' est le "+nbreArg+1+" argument de la commande en ligne!");
				System.out.println("args= "+ args[nbreArg] );
				if (args[nbreArg].contentEquals("admin")) {
					j.setAdminCommande();
				}
			}	
		
		j.getTl4j().debutJeu();
		j.setJeu();
		j.doJeu();
		System.out.println("Fin définitive du jeu!");
		System.out.println("_________________________");
		j.getTl4j().finJeu();
   }
}


