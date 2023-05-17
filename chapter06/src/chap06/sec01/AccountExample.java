package chap06.sec01;

public class AccountExample {

	public static void main(String[] args) {
		new AccountExample().start();	
	}
	
	public void start() {
		Account account=new Account("홍길동");
		account.deposit(10000);
		printInfo(account);
		int amt=account.withdraw(5000);
		System.out.println("출금금액 : "+amt);
		printInfo(account);
	}
	
	public void printInfo(Account account) {
		System.out.println("계좌주 : "+account.getAccountOwner());
		System.out.println("잔고 : "+account.getBalance());
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
			System.out.println("잔고가 부족합니다..");
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