package entities;

public class BusinessAccount extends Account {

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

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	// Methods
	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}

}
