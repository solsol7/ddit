package chap07.sec04;

public class ShapeExample {

	public static void main(String[] args) {
//		Triangle t1=new Triangle("�ﰢ��");
//		Circle c1=new Circle("Ÿ����");
		
//		Shape s1=new Triangle("�ﰢ��");
//		Shape s2=new Circle("Ÿ����");
		
//		t1.draw();
//		c1.draw();
		
		draw(new Triangle("�ﰢ��"));
		draw(new Circle("Ÿ����"));
	}
	
	public static void draw(Shape shape) {
		shape.draw();
	}

}
