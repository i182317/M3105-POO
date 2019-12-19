package exo1;

public class FabriqueDeCanards extends FabriqueDeCanardsAbstraite {
	
	@Override
	public Cancaneur creerColvert() {
		return new Colvert();
	}

	@Override
	public Cancaneur creerMandarin() {
		return new Mandarin();
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		return new CanardEnPlastique();
	}

	@Override
	public Cancaneur creerAppelant() {
		return new Appelant();
	}

	@Override
	public Cancaneur creerCanardDOie() {
		return new AdaptateurDOie(new Oie());
	}

}
