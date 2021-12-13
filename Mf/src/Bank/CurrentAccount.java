package Bank;

import Bank.Account1;

public class CurrentAccount extends Account1{//
	 private double InterestRate;// ���������� ������
	 private double Amount;//����� ��������
	public CurrentAccount(double interestRate, ATMCard card) {
		super(interestRate, card);
	}
	@Override
	public void CalculateInterest(double amount,double interestRate) {
	
	}
}
