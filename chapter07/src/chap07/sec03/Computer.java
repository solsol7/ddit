package chap07.sec03;

public class Computer extends Product{//Product��ӹ���
	Computer(){
		super(1500);
	}
	
	@Override
	public String toString() {
		return "COMPUTER";
	}
}
