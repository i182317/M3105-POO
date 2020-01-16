package exo1;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur{
	
	private List<Cancaneur> lesCancaneurs;
	private Observable observable;
	
	public Troupe() {
		this.lesCancaneurs = new ArrayList<>();
		this.observable = new Observable(this);
	}
	
	public void add(Cancaneur cancaneur) {
		this.lesCancaneurs.add(cancaneur);
	}

	@Override
	public void cancaner() {
		for(Cancaneur cancaneur : lesCancaneurs) {
			cancaneur.cancaner();
		}
		
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
		for(Cancaneur unCancaneur : lesCancaneurs) {
			unCancaneur.accept(v);
		}
	}
}
