package Bank;

import Bank.ATM;
import Bank.ATMCard;
import Bank.Account1;
import Bank.BankCustomer;
import Bank.CurrentAccount;
import Bank.SavingsAccount;
import Bank.Transaction;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*ATMCard sveta=new ATMCard(1234, "SASHINA", 123456, 3000);//(��� ���,id �����, ����� �����,������ �����)
		 ATMCard lera=new ATMCard(4321, "GORLANOVA", 654321, 7000);
		 ATMCard dima=new ATMCard(3434, "BERINTSEV", 112233, 18000);
		 ATMCard ivan=new ATMCard(8978, "POCHKIN", 887744, 8000);
		 
		 ATM atm=new ATM("Perm","Permscaya,55");//(�����, �����,��� ���������)
		 atm.ReadCard(sveta);
		 
		 Account1 SS=new  CurrentAccount(300,0.01, sveta);//(����� ��������,���������� ������)
		 Account1 SSS=new SavingsAccount(300,0.01);//(����� ��������,���������� ������)
		 BankCustomer AA=new BankCustomer("SashinaS", "Perm,Deducina,24","sahinasvetas@bk.ru", sveta);//(�� �������, �����, �����,�����)
		 BankCustomer BB=new BankCustomer("Gorlanova", "Perm,Deducina,24","gotlll@bk.ru", lera);
		 BankCustomer CC=new BankCustomer("Berintsev", "Perm,Deducina,24","dimaber@mail.ru", dima);
		 BankCustomer DD=new BankCustomer("Pochkin", "Perm,Sibirskaya,33","pppooocchhkkiinn@mail.ru", ivan);
		 Transaction Perevod = new Transaction(200, lera);//(�����,���� ���������)
		 CurrentAccount CA=new CurrentAccount(40,0.01);//(����� ��������,���������� ������)
		 SavingsAccount SA=new  SavingsAccount(4,0.01);//(����� ��������,���������� ������)*/

		ATMCard sveta = new ATMCard(1234, "Sashina", 123456, 1000);
		Account1 SS = new CurrentAccount(0, sveta);
		ATM atm = new ATM("loc", "branch");
		atm.setCard(sveta);
		atm.getBalance();
		atm.putMoney(1000);
		atm.Funkcia(500);
		atm.showTransaction();
		atm.getBalance();
	}
}

