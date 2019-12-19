package exo1;

public class FabriqueDeComptage extends FabriqueDeCanardsAbstraite {
	
	private FabriqueDeCanards fabriqueDeCanards;
	
	public FabriqueDeComptage() {
		this.fabriqueDeCanards = new FabriqueDeCanards();
	}

	@Override
	public Cancaneur creerColvert() {
		return new CompteurDeCouacs(this.fabriqueDeCanards.creerColvert());
	}

	@Override
	public Cancaneur creerMandarin() {
		return new CompteurDeCouacs(this.fabriqueDeCanards.creerColvert());
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		return new CompteurDeCouacs(this.fabriqueDeCanards.creerCanardEnPlastique());
	}

	@Override
	public Cancaneur creerAppelant() {
		return new CompteurDeCouacs(this.fabriqueDeCanards.creerAppelant());
	}

	@Override
	public Cancaneur creerCanardDOie() {
		return new CompteurDeCouacs(this.fabriqueDeCanards.creerCanardDOie());
	}

}
