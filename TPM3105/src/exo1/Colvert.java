package exo1;

public class Colvert implements Cancaneur{
	
	private Observable observable;
	
	public Colvert() {
		super();
		this.observable = new Observable(this);
	}
	
	public void cancaner() {
		System.out.println("Coincoin");
		this.observable.notifierObservateurs();
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
