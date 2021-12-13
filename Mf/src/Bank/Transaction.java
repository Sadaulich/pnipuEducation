//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package Bank;

import java.util.Date;

public class Transaction {
	private double Amount;
	private ATMCard Poluchatel;
	private Date Date1;
	private Date Date2;
	private int state;
	private double cardBalance;

	public Transaction(double amount, ATMCard poluchatel) {
		this.Amount = amount;
		this.Poluchatel = poluchatel;
	}

	public double CalculateBalance(double Balance) {
		return 0.0D;
	}

	public void StartTransaction() {
		this.Poluchatel.addTransaction(this);
		this.state = 0;
		this.setDate1(new Date());
		this.Poluchatel.getBalance();
		if (this.Amount < 0.0D) {
			if (Math.abs(this.Amount) <= this.Poluchatel.getBalance()) {
				this.Poluchatel.setBalance(this.Poluchatel.getBalance() + this.Amount);
				this.state = 1;
				this.setDate2(new Date());
				cardBalance = Poluchatel.getBalance();
			} else {
				this.state = -1;
				this.setDate2(new Date());
			}
		} else {
			this.Poluchatel.setBalance(this.Amount + this.Poluchatel.getBalance());
			this.state = 1;
			this.setDate2(new Date());
			cardBalance = Poluchatel.getBalance();
		}
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public void CancelTransaction() {
	}

	public Date getDate1() {
		return this.Date1;
	}

	public void setDate1(Date date1) {
		this.Date1 = date1;
	}

	public Date getDate2() {
		return this.Date2;
	}

	public void setDate2(Date date2) {
		this.Date2 = date2;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"\nAmount= " + Amount +
				"\n Date1= " + Date1 +
				"\n Date2= " + Date2 +
				"\n state= " + state +
				"\nbalance= " + cardBalance +
				'}';
	}
}
