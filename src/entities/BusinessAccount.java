package entities;

public final class BusinessAccount extends Account {

	// Attributes
	private Double loanLimit;

	// Builders
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	// Accessor Methods
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}

	// Methods
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}

}
