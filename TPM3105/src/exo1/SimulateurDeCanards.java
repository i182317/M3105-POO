package exo1;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeCanards fabriqueDeCanards = new FabriqueDeCanards();
		simulateur.simuler(fabriqueDeCanards);
		
		}
	
	public void simuler(FabriqueDeCanards fabriqueDeCanards) {
		Cancaneur colvert = fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		
		
		Cancanologue cancanologue = new Cancanologue();
		colvert.enregistrerObservateur(cancanologue);
		colvert.cancaner();
		
		/*
		Troupe troupe = new Troupe();
		troupe.add(mandarin);
		troupe.cancaner();
		*/
		}	
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
}
