/*
 * 문제1] 원(Circle), 사각형(Rectangle), 삼각형(Triangle) 클래스는 도형클래스(Shape)를 상속 받아
	생성된다.
	1) 도형클래스는 면적을 구하는 메서드(calcArea)만 존재한다. -System.out.println("면적을 계산");
	2) 원(Circle) - 속성 : 반지름
		     메서드 : 면적을 구하는 메서드(calcArea),   -재정의하셈
		     둘레를 구하는 메서드(clacCircum)
	3) 사각형(Rectangle) - 속성 : 가로(width), 세로(height)
			    메서드 : 면적을 구하는 메서드(calcArea)
	4) 삼각형(Triangle) - 속성 : 밑변(width), 높이(height)
			  메서드 : 면적을 구하는 메서드(calcArea)이다.
 */


package chap06.sec07;

public class ShapePractice {

	public static void main(String[] args) {
		//Circle c1=new Circle(10);
		//c1.calcArea();
		//c1.length();
		
		
		
		//다형성 -> 부모타입 변수에 자식 객체 다 집어넣을 수 o
		Shape s1=new Circle(10);
		Shape s2=new Rectangle(3,6);
		s1.calcArea();
						//s1.lengt() X 자식클래스 고유의 메소드 호출X
		s2.calcArea();
	}

}

class Shape{
	//int width;
	//int height;
	
	Shape(){}
	//Shape(int width, int height){
	//	this.width=width;
	//	this.height=height;
	//}

	public void calcArea() {
		System.out.println("면적을 계산");
		
	}
}

class Circle extends Shape{
	private int radius;
	private final double PI=3.14;
	
	Circle(){}
	Circle(int radius){
		super();
		this.radius=radius;
	}
	
	@Override
	public void calcArea() {
		System.out.println("원의 너비 : "+radius*radius*PI);
	}
	
	public void length() {
		System.out.println("원의 둘레 : "+(2*PI*radius));
	}
}

class Rectangle extends Shape{
	int width;
	int height;
	Rectangle(int width, int height){
		super();
		this.width=width;
		this.height=height;
		
	}
	@Override
	public void calcArea() {
		System.out.println("사각형의 면적 : "+(width*height));		
	}
	
}

class Triangle extends Shape{
	int width;
	int height;
	Triangle(int width, int height){
		super();
		this.width=width;
		this.height=height;
		
	}
	@Override
	public void calcArea() {
		System.out.println("삼각형의 면적 : "+(width*height*0.5));		
	}
}