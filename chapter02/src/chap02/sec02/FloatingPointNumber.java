package chap02.sec02;

public class FloatingPointNumber {

	public static void main(String[] args) {
		//1)float : 4byte(1bit(��ȣ), 8bit(����), 23bit(����))
		//			1.4e-45 ~ 3.4e+38
		//			���� ���� F(f)�߰� �ؾ� ��
		//2)double : 8byte(1bit(��ȣ), 11bit(����), 52bit(����))
		//			4.0e-324 ~ 1.8e+308
		//			�⺻ �Ǽ� Ÿ��
		
		float pi=3.1415926f;
		double d1=3.1415926;
		double d3=3.1415926d;
		
		float f2=0.1f;
		double d2=0.1;
		double res=f2;
		
		System.out.println(res);
		
		if(f2==d2) {
			System.out.println("���� ��");}
		else {
			System.out.println("�ٸ� ��");}
		}
		
		
		

	}
