package entities;

public class Account {

	// Attributes
	private Integer number;
	private String holder;
	private Double balance;

	// Builders
	public Account() {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// Accessor Methods
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public Double getBalance() {
		return balance;
	}

	// Methods
	public void withdraw(Double amount) {
		balance -= amount;
	}

	public void deposit(Double amount) {
		balance += amount;
	}

}