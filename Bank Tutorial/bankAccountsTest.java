
public class bankAccountsTest {
	
	public static void main(String[] args){
		
		bankAccount ba = new bankAccount();
		l(ba.getOwner());
		l(ba.getBalance()); //Testing default constructor of bankAccount
		l("\n----------------------------------------------------------------------\n");
		
		bankAccount konatsuMiyamoto = new bankAccount("Konatsu Miyamoto", 100000.00);
		l(konatsuMiyamoto.getOwner());
		l(konatsuMiyamoto.getBalance()); //Testing constructor with new owner and balance
		l("\n----------------------------------------------------------------------\n");
		
		savingsAccount sa = new savingsAccount("Balls Frenchman", 20.00);
		sa.deposit(20.00);
		sa.addInterest();
		l(sa.getOwner());
		l(sa.getBalance()); //Testing the savings account
		l("\n----------------------------------------------------------------------\n");
		
		checkingAccount ca = new checkingAccount("A random hobo", 500.00, 56);
		ca.withdraw(30.00);
		ca.useCheck();
		l(ca.getOwner());
		l(ca.checksRemaining() + " checks remaining");
		l(ca.getBalance());
		l("\n----------------------------------------------------------------------\n");
		
		checkingAccountFees caf = new checkingAccountFees("Peter Parker", 10.00, 201);
		caf.withdraw(5.00);
		caf.deductFees();
		caf.useCheck();
		l(caf.getOwner());
		l(caf.checksRemaining());
		l(caf.getBalance());
				
	}
	
	public static void l(Object s){
		System.out.println(s);
	}

}
