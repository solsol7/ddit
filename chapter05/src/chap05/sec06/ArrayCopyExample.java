package chap05.sec06;

import java.util.Arrays;

public class ArrayCopyExample { //�迭����

	public static void main(String[] args) { //static�� �θ����� static�� ���� ���� �ҷ��;���
/*		ArrayCopy ac= new ArrayCopy();
		//abc();     - ������
		new ArrayCopyExample().abc();//�θ� �� �ִ� ���  
									// �ڱ� �ڽ��� ��ü�� ������ �Ŀ��� static�� �ƴ� �� �θ� �� o
		ac.method1();							*/  //���� ����
		//DeepCopy dc=new DeepCopy();
		//dc.method1();
		//dc.method2();
		ArrayCopy ar=new ArrayCopy();
		ar.method1();
	}
	
	public void abc() {
		System.out.println("�Ϲ� �޼���");
	}
}

class ArrayCopy{ //���� ����
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

class DeepCopy{	//���� ����

	public void method1() {	//1. for�� �̿��Ͽ� �迭 ����
		int[] num= {100, 200, 300, 400, 500};
		int[] tar=new int[5];
		for(int i=0; i<num.length; i++) {
			tar[i]=num[i];
		}
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num)); 
									//Arrays.toString() : �迭���� �Ű������� ���� - [�迭�� �ִ� �����] ���
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
	public void method2() {	//System.arraycopy() �̿�
		int[] num= {10, 20, 30, 40, 50};
		int[] tar=new int[5];
		System.arraycopy(num, 0, tar, 0, num.length);
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
	public void method3() {	//clone�޼ҵ� �̿�
		int[] num= {1, 2, 3, 4, 5};
		int[] tar=new int[5];
		tar=num.clone();   //clone -> ObjectŬ������
		tar[2]=1000;
		System.out.println("num : "+Arrays.toString(num));
		System.out.println("tar : "+Arrays.toString(tar));
	}
	
}

