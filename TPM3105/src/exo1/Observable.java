package exo1;

import java.util.ArrayList;
import java.util.List;

public class Observable implements CouacObservable {

	private List<Observateur> observateurs;
	private CouacObservable canard;
	
	
	public Observable(CouacObservable canard) {
		this.observateurs = new ArrayList<>();
		this.canard = canard;
	}
	
	@Override
	public void enregistrerObservateur(Observateur observateur) {
		this.observateurs.add(observateur);
	}
	
	@Override
	public void notifierObservateurs() {
		for(Observateur observateur : observateurs) {
			observateur.actualiser(this.canard);
		}
	}
}
