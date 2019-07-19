import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		BankAccount bankaccount=new BankAccount(500.00);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your account type:\n 1)Saving Account\n 2)Checking Account ");
		int number=scanner.nextInt();
		
		if(number==1) {
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Enter your account name: ");
			String name=scanner1.nextLine();
			System.out.print("Enter your account number: ");
			String acNumber=scanner1.nextLine();
			System.out.print("What do you want?\n 1)Deposit\n 2)Withdraw");
			int choose=scanner1.nextInt();
			if(choose==1) {
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("Enter your deposit amount: ");
				int amount=scanner2.nextInt();
				SavingAccount saving=new SavingAccount(name,acNumber,bankaccount.getAccountBalance(),5);
				System.out.print("Your current account balance= "+saving.deposit(amount));
			}
			else {
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("Enter your withdraw amount: ");
				int amount=scanner2.nextInt();
				SavingAccount saving=new SavingAccount(name,acNumber,bankaccount.getAccountBalance(),5);
				System.out.print("Your current account balance= "+saving.withdraw(amount));
			}
		}
		else {
			Scanner scanner1 = new Scanner(System.in);
			System.out.print("Enter your account name: ");
			String name=scanner1.nextLine();
			System.out.print("Enter your account number: ");
			String acNumber=scanner1.nextLine();
			System.out.print("What do you want?\n 1)Balance\n 2)Withdraw\n ");
			int choose=scanner1.nextInt();
			if(choose==1) {
			CheckingAccount checking=new CheckingAccount(name,acNumber,bankaccount.getAccountBalance(),3);
				System.out.print("Your current account balance= "+checking.getAccountBalance());
			}
			else {
				Scanner scanner3 = new Scanner(System.in);
				System.out.print("Enter your withdraw amount:\n ");
				int amount=scanner3.nextInt();
				CheckingAccount checking=new CheckingAccount(name,acNumber,bankaccount.getAccountBalance(),3);
				System.out.print("Your current account balance= "+checking.withdraw(amount));
			}

		}

	}

}
