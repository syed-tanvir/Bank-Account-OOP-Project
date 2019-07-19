
public class BankAccount {
	
	private String accountName;
	private String accountNumber;
	private double accountBalance=0.00;
	
	public BankAccount(String accountName, String accountNumber, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public BankAccount(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}

	public double deposit(double amount) {
		accountBalance+=amount;
		return accountBalance;
	}
	
	public double withdraw(double amount) {
		accountBalance-=amount;
		return accountBalance;
	}
	

}
