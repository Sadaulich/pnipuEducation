package Bank;

import Bank.Account1;

public class SavingsAccount extends Account1{
	 private double Sber;//c������������� ����
	 private double Amount;//����� ��������
	 private double InterestRate;// ���������� ������
	public SavingsAccount(double interestRate, ATMCard card) {
		super(interestRate, card);
		
	}
	public  void CalculateInterest(double amount,double interestRate) {
		setSber(interestRate*amount);
	}
	public double getSber() {
		return Sber;
	}
	public void setSber(double sber) {
		Sber = sber;
	}
}
