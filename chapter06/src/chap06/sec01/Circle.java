package chap06.sec01;

public class Circle { //����1)
	double radius;
	final double PI=3.1415926; 
	int x;
	int y;
	
	//���� ���� 
	public double getArea() {
		double area=radius*radius*PI;
		return area;
	}
	
	//���� �ѷ�
	public void getCircumference() {
		getPoint();
		System.out.println("���� �ѷ� : "+(2*radius*PI));
	}
	
	public void getPoint() {
		System.out.println("���� ���� : ("+x+","+y+")");
	}
}