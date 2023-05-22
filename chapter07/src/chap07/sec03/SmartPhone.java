package chap07.sec03;

public class SmartPhone extends Product {//Product상속받음
	SmartPhone(){
		super(500);
	}
	
	@Override
	public String toString() {
		return "SMARTPHONE";
	}
}
