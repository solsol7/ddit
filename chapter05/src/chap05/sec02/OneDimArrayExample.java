package chap05.sec02;

public class OneDimArrayExample {

	public static void main(String[] args) {
		int score[]= {80,75,95,80,88};
		OneDimArray od=new OneDimArray();
		//od.method1();
		od.addArray(score);
		System.out.println("�հ�="+od.addArray(score));
		
		
		
	}

}

class OneDimArray{
	
	public void method1() {
		//[����1]���� 5���� �����ϴ� �迭�� �����ϰ� 10, 20, 30, 40, 50�� ������ ��  ����Ͻÿ�.
		int[] num1=null;
		num1=new int[5];
		
		char[] num2;
		num2=new char[]{'a','b','c','d','e'};
		
		char[] num4= new char[] {'a','b','c','d','e'};
		char[] num5= {'a','b','c','d','e'}; 		 //�迭�� String Ŭ���������� new�� �����Ǿ��� �� �ִ�.
		boolean[] num3=new boolean[5];
		
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+","); 
		}
		
		
	}
	
	public int/*��ȯ�ϴ� ���� int�� -> return int �־����*/ addArray(int[] jumsu) {
		int sum=0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;

	}
}


