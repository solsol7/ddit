package chap06.sec03;

public class Cylinder {
	private double height;
	Circle circle; //Circle 클래스 객체 타입의 circle			객체참조변수
	
	Cylinder(){}
	Cylinder(double height, Circle circle){		//Circle클래스 객체를 받음   객체참조변수를 받음 - getArea라는 메소드가 있음
		this.height=height;
		this.circle=circle;
	}
	
	public double getVolumn() {
		return height*circle.getArea();//
		/*
		실린더에 원의 너비가 있어야함
		원의 객체가 있어야함-객체에 있는 너비 메소드를 
		원의 객체를 생성자메소드로 받으면
		소속된 원도 같이 들어옴
		클래스 객체를 만들 때 원도 있어야 함
		원 클래스 객체를 참조변수 타입으로
		이 객체를 담을 수 있는 객체-멤버변수를 만들어놓음
		원을 담을 수 있는 그릇을 만듦(5행 Circle circle)
		new연산자에 의해 circle 클래스 객체가 생성되어
		주는놈이 써클클래스로 줌-써클클래스로 받음(8행 Circle circle)
		
		*/
	}
}
