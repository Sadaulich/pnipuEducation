package Bank;

import java.util.Scanner;

//import Bank.ATMCard;
//import Bank.Transaction;

public class ATM {

	public String Location;
	public String BranchNume;
	private ATMCard karta;//���������� ��� ������ � ������
	
	Scanner scanner= new Scanner(System.in);//���� ���-����
	//���������� ��� ���-����
	public String getLocation() {//�����, � ������� ��������� ��������
		return null;
	}
	public String getBranchNume() {//�����, ��� ,� ������� ��������� ��������
		return null;
	}
	public void Show() {
	}
	public ATM(String location, String branchNume) {
		Location = location;
		BranchNume = branchNume;
	}
	public void Funkcia(double amount) {//����� ��� ������ �����
		Transaction transaction= new Transaction(-amount, karta);//������� ����������, � ��� ����� �����
		transaction.StartTransaction();
		if (transaction.getState()==1) {
			System.out.println("�������� ������");
		}
		else {
			System.out.println("������������ �������");
		}
	}

	public void putMoney(double amount) {
		Transaction tr = new Transaction(amount, this.karta);
		tr.StartTransaction();
		System.out.println("Деньги внесены на карту");
		double a = this.karta.getBalance();
		System.out.println("Баланс карты:" + a);
	}

	public void getBalance() {
		System.out.println(karta.getBalance());
	}

	public void setCard(ATMCard card) {
		karta = card;
	}

	public void showTransaction() {
		karta.showTransaction();
	}
	
	public void ejectCard() {
	}
	
	/*public void ReadCard(ATMCard atmcard) {
	karta=atmcard;
	scanner.nextInt();//���������� �������� ���-����, ������� ����� � �������	
	karta.getPIN();
	if ( karta.getPIN() == scanner.nextInt()) {
		Funkcia();//���������� � �������
	}
	ejectCard();//������ �����, ��� ��� ���-��� �� ������
	}*/
}

