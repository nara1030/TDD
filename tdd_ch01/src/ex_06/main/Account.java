package ex_06.main;

public class Account {
	private int balance;

	public Account(int money) {
		this.balance = money;
	}

	public int getBalance() {
		return this.balance;
	}

	public void deposit(int money) {
		this.balance += money;
	}

	public void withdraw(int money) {
		this.balance -= money;
	}

}
