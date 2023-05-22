package chap07.sec03;

public class Computer extends Product{//Product상속받음
	Computer(){
		super(1500);
	}
	
	@Override
	public String toString() {
		return "COMPUTER";
	}
}
