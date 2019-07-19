
public class SavingAccount extends BankAccount {
	
	private double interestrate;

	public SavingAccount(String accountName,String accountNumber,double accountBalance,double interestrate) {
		super(accountName,accountNumber,accountBalance);
		this.interestrate = interestrate;
	}

	public double getInterestrate() {
		return interestrate;
	}
	
	public double withdraw(double amount) {
		if(amount>super.getAccountBalance()) {
			System.out.println("Sorry! You have not enough balance.");
		}
		return super.getAccountBalance();
	}
}
