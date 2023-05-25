package chap08.sec03;

interface I {
	public void methodB();
}



//public class A {	//사용자						--제공자와 사용자가 직접 연결되어있음 -> 직접관계 : 객체지향 프로그램에서 지양해야함
//	public void methodA(B b) {
//		b.methodB();
//	}
//}
//
//class B{	//제공자
//	public void methodB() {
//		System.out.println("methodB()");
//	}
//}

public class A {	//사용자						
public void methodA(I i) {						//--사용자는 제공자를 모름, 매개변수가 인터페이스 타입 - 인터페이스를 통함  ↓
	i.methodB();
}
}

class B implements I{	//제공자					--다형성 -> 사용자 A는 인터페이스의 methodB를 호출하지만 실제로는 인터페이스를 구현한 B클래스의 오버라이딩된 methodB가 호출됨
	@Override
	public void methodB() {					//오버라이드한 것
	System.out.println("methodB()");
}
}










