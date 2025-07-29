package assignemnt4;

public class SavingsAccounts  extends Account {
	
	 public SavingsAccount(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited to Savings Account.");
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn from Savings Account.");
	        } else {
	            System.out.println("Insufficient balance in Savings Account.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
