package chap05.sec06;

import java.util.Arrays;

public class ArrayCopyExample { //배열복사

	public static void main(String[] args) { //static이 부른놈은 static이 붙은 놈을 불러와야함
/*		ArrayCopy ac= new ArrayCopy();
		//abc();     - 에러남
		new ArrayCopyExample().abc();//부를 수 있는 방법  
									// 자기 자신의 객체를 생성한 후에는 static이 아닌 놈도 부를 수 o
		ac.method1();							*/  //얕은 복사
		//DeepCopy dc=new DeepCopy();
		//dc.method1();
		//dc.method2();
		ArrayCopy ar=new ArrayCopy();
		ar.method1();
	}
	
	public void abc() {
		System.out.println("일반 메서드");
	}
}

class ArrayCopy{ //얕은 복사
	public void method1() {
		int[] num= {10,20,30,40,50};
		for(int su : num) {
			System.out.println(su);
		}
	}
	
	public void method2(int[] tar) {
		tar[2]=1000;
	}
	
}

class DeepCopy{	//깊은 복사

	public void method1() {	//1. for문 이용하여 배열 복사
		int[] num= {100, 200, 300, 400, 500};
		int[] tar=new int[5];
		for(int i=0; i<num.length; i++) {
			tar[i]=num[i];
		}
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num)); 
									//Arrays.toString() : 배열명을 매개변수로 전달 - [배열에 있는 내용들] 출력
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
	public void method2() {	//System.arraycopy() 이용
		int[] num= {10, 20, 30, 40, 50};
		int[] tar=new int[5];
		System.arraycopy(num, 0, tar, 0, num.length);
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
	public void method3() {	//clone메소드 이용
		int[] num= {1, 2, 3, 4, 5};
		int[] tar=new int[5];
		tar=num.clone();   //clone -> Object클래스꺼
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
}

