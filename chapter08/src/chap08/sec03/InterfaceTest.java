package chap08.sec03;

public class InterfaceTest {

	public static void main(String[] args) {
		A a=new A();  		//사용자 생성
		a.methodA(new B());		//생성된 사용자가 매개변수(interface) i
	}
}
