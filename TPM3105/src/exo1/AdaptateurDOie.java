package exo1;

public class AdaptateurDOie implements Cancaneur{
	
	private Oie oie;
	private Observable observable;
	
	public AdaptateurDOie(Oie oie) {
		this.oie = oie;
		this.observable = new Observable(this);
	}

	public void cancaner() {
		this.oie.cacarder();
	}

	@Override
	public void enregistrerObservateur(Observateur observateur) {
		this.observable.enregistrerObservateur(observateur);
		
	}

	@Override
	public void notifierObservateurs() {
		this.observable.notifierObservateurs();
		
	}

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
	

}
