package chap06.sec03;

public class Cylinder {
	private double height;
	Circle circle; //Circle Ŭ���� ��ü Ÿ���� circle			��ü��������
	
	Cylinder(){}
	Cylinder(double height, Circle circle){		//CircleŬ���� ��ü�� ����   ��ü���������� ���� - getArea��� �޼ҵ尡 ����
		this.height=height;
		this.circle=circle;
	}
	
	public double getVolumn() {
		return height*circle.getArea();//
		/*
		�Ǹ����� ���� �ʺ� �־����
		���� ��ü�� �־����-��ü�� �ִ� �ʺ� �޼ҵ带 
		���� ��ü�� �����ڸ޼ҵ�� ������
		�Ҽӵ� ���� ���� ����
		Ŭ���� ��ü�� ���� �� ���� �־�� ��
		�� Ŭ���� ��ü�� �������� Ÿ������
		�� ��ü�� ���� �� �ִ� ��ü-��������� ��������
		���� ���� �� �ִ� �׸��� ����(5�� Circle circle)
		new�����ڿ� ���� circle Ŭ���� ��ü�� �����Ǿ�
		�ִ³��� ��ŬŬ������ ��-��ŬŬ������ ����(8�� Circle circle)
		
		*/
	}
}
