package chap06.sec01;

public class Circle { //예제1)
	double radius;
	final double PI=3.1415926; 
	int x;
	int y;
	
	//원의 넓이 
	public double getArea() {
		double area=radius*radius*PI;
		return area;
	}
	
	//원의 둘레
	public void getCircumference() {
		getPoint();
		System.out.println("원의 둘레 : "+(2*radius*PI));
	}
	
	public void getPoint() {
		System.out.println("원의 원점 : ("+x+","+y+")");
	}
}