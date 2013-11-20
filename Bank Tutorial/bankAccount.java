
public class bankAccount {
	
	private String owner;
	private double accountBalance;
	
	public bankAccount(){
		owner = "Billy Bob Jenkins";
		accountBalance = 0.00;
		//Default Constructor sets account owner to Billy Bob Jenkins, with $0.00 in the bank
	}
	
	public bankAccount(String owner, double accountBalance){
		this.owner = owner;
		this.accountBalance = accountBalance;
		//Constructor with a new bank account with owner and account balance
	}
	
	public void deposit(double amount){
		accountBalance += amount;
		// accountBalance = accountBalance + amount;
	}
	
	public void withdraw(double amount){
		accountBalance -= amount;
		//accountBalance = accountBalance - amount;
	}
	
	public String getOwner(){
		return this.owner; //Returns owner
	}
	
	public double getBalance(){
		return this.accountBalance; //Returns account balance
	}
}
