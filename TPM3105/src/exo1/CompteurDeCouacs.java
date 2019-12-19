package exo1;

public class CompteurDeCouacs implements Cancaneur{
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
	}
	
	public void cancaner() {
		this.cancaneur.cancaner();
		nombreDeCouacs++;
	}
	
	public static int getCouacs() {
		return nombreDeCouacs;
	}

}
