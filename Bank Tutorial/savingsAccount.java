
public class savingsAccount extends bankAccount {

	private final double INTEREST_RATE = 0.05; //Extra state for savings account is the interest rate
	
	public savingsAccount(){
		super(); //Default bankAccount constructor
	}
	
	public savingsAccount(String owner, double initialBalance){
		super(owner, initialBalance); //Constructor with new account and balance
	}
	
	public void addInterest(){
		 double increaseByInterest = this.getBalance() * INTEREST_RATE; //finds the value to add as interest
		 this.deposit(increaseByInterest); //adds the interest
	}
	
}
