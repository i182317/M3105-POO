package exo1;

public class CompteurDeCouacs implements Cancaneur{
	private Cancaneur cancaneur;
	private static int nombreDeCouacs;
	private Observable observable;
	
	public CompteurDeCouacs(Cancaneur cancaneur) {
		this.cancaneur = cancaneur;
		this.observable = new Observable(this);
	}
	
	public void cancaner() {
		this.cancaneur.cancaner();
		nombreDeCouacs++;
	}
	
	public static int getCouacs() {
		return nombreDeCouacs;
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		this.observable.enregistrerObservateur(observateur);
		
	}

	@Override
	public void notifierObservateurs() {
		this.observable.notifierObservateurs();
		
	}

}
