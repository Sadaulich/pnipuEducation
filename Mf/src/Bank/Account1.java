package Bank;

public abstract class Account1 {

	private  double InterestRate;
	private  double Amount;
	private ATMCard card;
	
	public abstract void CalculateInterest(double amount,double interestRate);

	public Account1(double interestRate, ATMCard card) {
		this.card = card;
		setInterestRate(interestRate);
	}

	public void VentyWithdrawAmount() {// ����� ������ ������� 	
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public double getAmount() {
		return card.getBalance();
	}
	public void setAmount(double amount) {
		card.setBalance(amount);
	}
}
