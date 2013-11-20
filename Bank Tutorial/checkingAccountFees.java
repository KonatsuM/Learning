
public class checkingAccountFees extends checkingAccount {

	private final double FEES = 20.00; //Fee is always 20 dollars
	
	public checkingAccountFees(){
		super();
	}
	
	public checkingAccountFees(String owner, double initialBalance, int initialChecks){
		super(owner, initialBalance, initialChecks);
	}
	
	public void deductFees(){
		this.withdraw(FEES);
	}
	
}
