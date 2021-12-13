package Bank;

import java.util.ArrayList;
//import Bank.Account;
//import Bank.Transaction;

public class ATMCard {
	private int PIN;//���-��� �����
	private double CardID; //����� �����
	private String Card; //��� �����
	Account1 account;//�������
	double Balance;//������
	private ArrayList<Transaction> transactions=new ArrayList<>();//<�������>
	
	public void addTransaction(Transaction transaction ) {//� ������ ���������� ��������� ���� ����������
		transactions.add(transaction);
	}

	public void showTransaction() {
		for (Transaction transaction : transactions) {
			System.out.println();
			System.out.println(transaction);
		}
	}
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}
	public double getCardID() {
		return CardID;
	}
	public void setCardID(double cardID) {
		CardID = cardID;
	}
	public String getCard() {
		return Card;
	}
	public void setCard(String card) {
		Card = card;
	}

	/*
	 * public Account getAccount() { return account; } public void
	 * setAccount(Account account) { this.account = account; } public Account Acc()
	 * { return null; }
	 */
	public ATMCard(int pin, String card, double cardid, double balance) {
		PIN = pin;
		CardID = cardid;
		Card= card;
	    Balance=balance;
	}	
	}


