package chap07.sec04;

public class ShapeExample {

	public static void main(String[] args) {
//		Triangle t1=new Triangle("삼각형");
//		Circle c1=new Circle("타원형");
		
//		Shape s1=new Triangle("삼각형");
//		Shape s2=new Circle("타원형");
		
//		t1.draw();
//		c1.draw();
		
		draw(new Triangle("삼각형"));
		draw(new Circle("타원형"));
	}
	
	public static void draw(Shape shape) {
		shape.draw();
	}

}
