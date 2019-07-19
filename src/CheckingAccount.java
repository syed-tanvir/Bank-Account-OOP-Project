
public class CheckingAccount extends BankAccount {
	private double serviceCharge;

	public CheckingAccount(String accountName,String accountNumber,double accountBalance,double serviceCharge) {
		super(accountName,accountNumber,accountBalance);
		this.serviceCharge = serviceCharge;
	}
	
	public double getserviceCharge() {
		return serviceCharge;
	}

}
