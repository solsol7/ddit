package chap06.sec01;

public class CircleExample { //예제1)

	public static void main(String[] args) {
		Circle circle=new Circle();
		circle.radius=10.2;
		circle.x=300;
		circle.y=500;
		
		circle.getPoint();
		/*double res=circle.getArea();
		System.out.println("원의 넓이 : "+res); */
		System.out.println("원의 넓이 : "+circle.getArea());  //위 코드랑 똑같음
		
		circle.getCircumference();
	}

}
