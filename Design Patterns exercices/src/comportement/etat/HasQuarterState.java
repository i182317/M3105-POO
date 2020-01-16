package comportement.etat;

//import java.util.Random;

public class HasQuarterState implements State {
	GumballMachine gumballMachine;
 
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		//TODO: complete
		this.gumballMachine.setState(this.gumballMachine.noQuarterState);
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		//TODO: complete
		if(this.gumballMachine.count > 0) 
			this.gumballMachine.setState(this.gumballMachine.soldState);
		else
			this.gumballMachine.setState(this.gumballMachine.soldOutState);
	}

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
