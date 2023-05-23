/*
 * ����1] ��(Circle), �簢��(Rectangle), �ﰢ��(Triangle) Ŭ������ ����Ŭ����(Shape)�� ��� �޾�
	�����ȴ�.
	1) ����Ŭ������ ������ ���ϴ� �޼���(calcArea)�� �����Ѵ�. -System.out.println("������ ���");
	2) ��(Circle) - �Ӽ� : ������
		     �޼��� : ������ ���ϴ� �޼���(calcArea),   -�������ϼ�
		     �ѷ��� ���ϴ� �޼���(clacCircum)
	3) �簢��(Rectangle) - �Ӽ� : ����(width), ����(height)
			    �޼��� : ������ ���ϴ� �޼���(calcArea)
	4) �ﰢ��(Triangle) - �Ӽ� : �غ�(width), ����(height)
			  �޼��� : ������ ���ϴ� �޼���(calcArea)�̴�.
 */


package chap06.sec07;

public class ShapePractice {

	public static void main(String[] args) {
		//Circle c1=new Circle(10);
		//c1.calcArea();
		//c1.length();
		
		
		
		//������ -> �θ�Ÿ�� ������ �ڽ� ��ü �� ������� �� o
		Shape s1=new Circle(10);
		Shape s2=new Rectangle(3,6);
		s1.calcArea();
						//s1.lengt() X �ڽ�Ŭ���� ������ �޼ҵ� ȣ��X
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
		System.out.println("������ ���");
		
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
		System.out.println("���� �ʺ� : "+radius*radius*PI);
	}
	
	public void length() {
		System.out.println("���� �ѷ� : "+(2*PI*radius));
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
		System.out.println("�簢���� ���� : "+(width*height));		
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
		System.out.println("�ﰢ���� ���� : "+(width*height*0.5));		
	}
}