package comportement.patron2methode;

public class TestBoisson {

	public static void main(String[] args) {
		//TODO: complete
		BoissonCafeinee coffee = new Coffee();
		coffee.suivreRecette();
		
		System.out.println();
		
		BoissonCafeinee the = new The();
		the.suivreRecette();
	}

}
