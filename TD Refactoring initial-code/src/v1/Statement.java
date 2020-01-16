package v1;


public abstract class Statement {
	
	private Customer customer;
	
	public Statement(Customer customer) {
		super();
		this.customer = customer;
	} 
	
	public final String value(Customer aCustomer) {
		String result = headerString(aCustomer.getName());
	}
	
	
	protected abstract String header();
	
	protected abstract String body();
	
	protected abstract String footer();
	
	
	public Customer getCustomer() {
		return this.customer;
	}
}
