package chap06.sec03;

public class CylinderExample {

	public static void main(String[] args) {
		Cylinder c1=new Cylinder(32.5,new Circle(10)); //radius�� ������ �ִ�Circle Ŭ���� ��ü�� ������ ��
										//���� Ŭ���� ��ü�� new�����ڿ� ���� ������ - �ּҰ��� �� -> �Ǹ��� Ŭ������ �ִ� Circle circle�� ��(8��)
		
		System.out.println("������ ���� : "+c1.getVolumn());
	}

}
