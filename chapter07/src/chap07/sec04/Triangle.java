package chap07.sec04;

public class Triangle extends Shape{
	
	Triangle(String kind){
		super(kind);
	}
	
	@Override
	public void draw() {
		System.out.println(kind+"�� �׸��ϴ�");
		
	}
	
}
