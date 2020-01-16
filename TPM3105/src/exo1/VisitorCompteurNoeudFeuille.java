package exo1;

public class VisitorCompteurNoeudFeuille implements Visitor{
	
	// les compteurs
	private int nbNoeud, nbFeuille;
	
	// les accesseurs aux compteurs
	public int getNbNoeud() {
		return this.nbNoeud;
	}
	
	public int getNbFeuille() {
		return this.nbFeuille;
	}

	@Override
	public void visit(Troupe t) {
		this.nbNoeud++;
		
	}

	@Override
	public void visit(Colvert c) {
		this.nbFeuille++;
		
	}

	@Override
	public void visit(Mandarin c) {
		this.nbFeuille++;
		
	}

	@Override
	public void visit(Appelant c) {
		this.nbFeuille++;
		
	}

	@Override
	public void visit(CanardEnPlastique c) {
		this.nbFeuille++;
		
	}

	@Override
	public void visit(CompteurDeCouacs c) {
		this.nbNoeud++;
		
	}

	@Override
	public void visit(AdaptateurDOie c) {
		this.nbFeuille++;
		
	}

	@Override
	public void visit(Visitable c) {
		System.out.println("classe pas encore gérée");
		
	}

}
