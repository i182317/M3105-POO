package exo1;

import java.util.ArrayList;
import java.util.List;

public class Troupe implements Cancaneur{
	
	private List<Cancaneur> lesCancaneurs;
	
	public Troupe() {
		this.lesCancaneurs = new ArrayList<>();
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
}
