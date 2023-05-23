package chap06.sec08;

public class DriverExample {

	public static void main(String[] args) {
		new DriverExample().controller();		//메인메소드가 static이기 때문에 자기자신을 생성시킴
	}
	
	public void controller() {					//자기 자신을 생성하고 나서 자신에 포함된 메서드를 실행하기 때문에 굳이 static붙지 않아도 됨
												//static이 붙지 않은 메소드를 호출하는 법 -> new연산자에 의해 자기자신의 객체 생성 -> 메소드 부르기
		Driver driver=new Driver();
		Taxi taxi=new Taxi();
		driver.drive(taxi);			//부모클래스 이름으로 taxi클래스 객체를 넣어줌 -> 다형성
		driver.drive(new Bus(15));	//자식클래스 객체를 직접 인자로 넣어줌 -> 부모클래스 타입의 매개변수에 넣어줌 -> 다형성
	}

}
