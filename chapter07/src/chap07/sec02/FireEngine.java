package chap07.sec02;

public class FireEngine extends Car01 { //Car01클래스를 상속받음
	int amountWater;
	String color="red";
	
	public void water() {
		System.out.println("물을 뿌리다");
	}
	
	public void stop() {
		System.out.println("소방차가 도착했습니다");
	}
}
