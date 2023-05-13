package chap05.sec02;

public class OneDimArrayExample {

	public static void main(String[] args) {
		int score[]= {80,75,95,80,88};
		OneDimArray od=new OneDimArray();
		//od.method1();
		od.addArray(score);
		System.out.println("합계="+od.addArray(score));
		
		
		
	}

}

class OneDimArray{
	
	public void method1() {
		//[예제1]정수 5개를 저장하는 배열을 생성하고 10, 20, 30, 40, 50을 저장한 후  출력하시오.
		int[] num1=null;
		num1=new int[5];
		
		char[] num2;
		num2=new char[]{'a','b','c','d','e'};
		
		char[] num4= new char[] {'a','b','c','d','e'};
		char[] num5= {'a','b','c','d','e'}; 		 //배열과 String 클래스에서만 new가 생략되어질 수 있다.
		boolean[] num3=new boolean[5];
		
		for(int i=0; i<num2.length; i++) {
			System.out.print(num2[i]+","); 
		}
		
		
	}
	
	public int/*반환하는 값이 int형 -> return int 있어야함*/ addArray(int[] jumsu) {
		int sum=0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;

	}
}


