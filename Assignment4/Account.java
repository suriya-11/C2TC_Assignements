package assignemnt4;

public  abstract class Account {
	
	 protected String accountHolder;
	 protected double balance;

	 public Account(String accountHolder, double initialBalance) {
	     this.accountHolder = accountHolder;
	     this.balance = initialBalance;
	     Bank.incrementAccounts(); // Increase total accounts count
	 }

	 // Abstract Methods
	 public abstract void deposit(double amount);
	 public abstract void withdraw(double amount);
	 public abstract double getBalance();

	 // Common Method
	 public void displayAccountInfo() {
	     System.out.println("Account Holder: " + accountHolder);
	     System.out.println("Balance: " + balance);
	 }

}
