package exo1;

public class FabriqueDeComptage extends FabriqueDeCanardsAbstraite {

	@Override
	public Cancaneur creerColvert() {
		return new CompteurDeCouacs(new Colvert());
	}

	@Override
	public Cancaneur creerMandarin() {
		return new CompteurDeCouacs(new Mandarin());
	}

	@Override
	public Cancaneur creerCanardEnPlastique() {
		return new CompteurDeCouacs(new CanardEnPlastique());
	}

	@Override
	public Cancaneur creerAppelant() {
		return new CompteurDeCouacs(new Appelant());
	}

	@Override
	public Cancaneur creerCanardDOie() {
		return new CompteurDeCouacs(new AdaptateurDOie(new Oie()));
	}

}
