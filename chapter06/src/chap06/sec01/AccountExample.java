package chap06.sec01;

public class AccountExample {

	public static void main(String[] args) {
		new AccountExample().start();	
	}
	
	public void start() {
		Account account=new Account("ȫ�浿");
		account.deposit(10000);
		printInfo(account);
		int amt=account.withdraw(5000);
		System.out.println("��ݱݾ� : "+amt);
		printInfo(account);
	}
	
	public void printInfo(Account account) {
		System.out.println("������ : "+account.getAccountOwner());
		System.out.println("�ܰ� : "+account.getBalance());
	}

}


class Account {
	private String accountOwner;
	private int balance;
	
	Account(){}
	Account(String accountOwner){
		this.accountOwner=accountOwner;
		balance=0;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public int withdraw(int amount) {
		if(balance<amount) {
			System.out.println("�ܰ� �����մϴ�..");
			amount=0;
		}else {
			balance-=amount;
		}
		return amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public String getAccountOwner() {
		return accountOwner;
	}
}