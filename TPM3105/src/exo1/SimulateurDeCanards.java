package exo1;

public class SimulateurDeCanards {
	
	public static void main(String[] args) {
		SimulateurDeCanards simulateur = new SimulateurDeCanards();
		FabriqueDeComptage fabriqueDeCanards = new FabriqueDeComptage();
		simulateur.simuler(fabriqueDeCanards);
		}
	
	public void simuler(FabriqueDeComptage fabriqueDeCanards) {
		Cancaneur colvert = fabriqueDeCanards.creerColvert();
		Cancaneur mandarin = fabriqueDeCanards.creerMandarin();
		
		Troupe troupe = new Troupe();
		troupe.cancaner();
		}	
	
	public void simuler(Cancaneur canard) {
		canard.cancaner();
	}
}
