package exo1;

public interface CouacObservable {
	public void enregistrerObservateur(Observateur observateur);
	public void notifierObservateurs();
}
