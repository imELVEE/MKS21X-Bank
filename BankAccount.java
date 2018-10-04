public class BankAccount{
	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newBalance, int newAccountID, String newPassword) {
		balance = newBalance;
		accountID = newAccountID;
		password = newPassword;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String toString() {
		return accountID + "\t" + balance;
	}

	public boolean deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			return true;
		}
		return false;
	}
		
	public boolean withdraw(double amount) {
		if (amount >= 0 && amount < balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

}
