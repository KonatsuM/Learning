
public class checkingAccount extends bankAccount {

	private int remainingChecks;
	
	public checkingAccount(){
		super();
		remainingChecks = 100;
	}
	
	public checkingAccount(String owner, double initialBalance, int remainingChecks){
		super(owner, initialBalance);
		this.remainingChecks = remainingChecks;
	}
	
	public void useCheck(){
		remainingChecks--;
	}
	
	public void addCheck(){
		remainingChecks++;
	}
	
	public int checksRemaining(){
		return remainingChecks;
	}
	
}
