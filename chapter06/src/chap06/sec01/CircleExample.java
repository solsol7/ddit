package chap06.sec01;

public class CircleExample { //����1)

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.radius=10.2;
		circle.x=300;
		circle.y=500;
		
		circle.getPoint();
		/*double res=circle.getArea();
		System.out.println("���� ���� : "+res); */
		System.out.println("���� ���� : "+circle.getArea());  //�� �ڵ�� �Ȱ���
		
		circle.getCircumference();
	}

}
