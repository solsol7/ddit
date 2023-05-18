package chap06.sec03;

public class CylinderExample {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder(32.5,new Circle(10)); //radius를 가지고 있는Circle 클래스 객체가 있으면 됨
										//원의 클래스 객체가 new연산자에 의해 생성됨 - 주소값이 들어감 -> 실린더 클래스에 있는 Circle circle에 들어감(8행)
		
		System.out.println("원통의 부피 : "+c1.getVolumn());
	}

}
