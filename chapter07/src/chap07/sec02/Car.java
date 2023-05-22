package chap07.sec02;

public class Car { //다형성

	public static void main(String[] args) {
		Car01 c1=new FireEngine();  //upcasting
		
		System.out.println("c1.color="+c1.color);  //변수-> 부모클래스의 변수를 호출함
		c1.drive(); //Car 클래스에 있는 drive 메소드
		c1.stop();	//FireEngine 클래스에 있는 stop메소드(오버라이딩된 것)
		//c1.water(); //->에러 : water메소드는 자식클래스인 FireEngine이라는 클래스에서 고유하게 정의된 것 이기 때문에 Car01클래스에서 호출 될 수 없음
						//자식클래스에서 고유하게 정의 된 메소드는 부모클래스로 불러서 사용할 수 없다
		FireEngine fe=null;
		if(c1 instanceof FireEngine) {	//downcasting --자식클래스 고유의 메소드를 가져오고싶으면  c1 클래스 객체가 FireEngine타입인지 판별해줘야함
			fe=(FireEngine)c1; 	//캐스트연산자 생략될 수 없음
		}
		fe.water();
		System.out.println("fe.color="+fe.color);
	}
}

class Car01{
	String color="blue";
	int door;
	
	public void drive() {
		System.out.println("차가 운행 중입니다");
	}
	public void stop() {
		 System.out.println("차가 멈추었습니다");
	}
	
}
