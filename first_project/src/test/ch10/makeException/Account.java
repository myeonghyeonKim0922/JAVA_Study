package test.ch10.makeException;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws IntsuffException {
		//잔고보다 큰 돈을 출금하면 예외 발생
		if (balance < money) {
			throw new IntsuffException("잔고부족 "+ (money - balance)+"원이 모자람");
		}
		balance -= money;
	}
}
