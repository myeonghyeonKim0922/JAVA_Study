package quiz;

public class Account {

	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	private int balance = 0;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance < MIN_BALANCE || balance > MAX_BALANCE) return;
		this.balance = balance;
	}
	
	
}
