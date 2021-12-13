package Bank;

public class BankCustomer {

	private String CustomerName; //имя клиента
	private String Address; //адрес
	private String Email; //почта
	private ATMCard Card; //карта
	private Account1 acc;//аккаунт
	public Account1 getAcc() {
		return acc;
	}
	public void setAcc(Account1 acc) {
		this.acc = acc;
	}
	public void InsertCard() {
	}
	public void SlectTranssaction() {
	}
	public void EnterPIN(int Number) {
	}
	public void ChangePin() {
	}
	public void WithdrawCash(){
	}
	public void RequestTransactionSummary() {
	}
	public void AcceptAmount() {
	}
	public BankCustomer(String customerName, String address,String email, ATMCard card) {
		CustomerName=customerName;
		Address=address;
		Email=email;
		Card=card;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public ATMCard getCard() {
		return Card;
	}
	public void setCard(ATMCard card) {
		Card = card;
	}
}


