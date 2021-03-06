package exo1;

public class CanardEnPlastique implements Cancaneur{
	
	private Observable observable;
	
	public CanardEnPlastique() {
		super();
		this.observable = new Observable(this);
	}
	
	public void cancaner(){
		System.out.println("Couincouin");
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

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}
}
