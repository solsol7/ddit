package chap04.sec02;

import java.util.Scanner;

public class ForStatementExample01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForStatement fs=new ForStatement();
		//fs.method1();
		//fs.method2();
		//fs.method3();
		//fs.method4();
		fs.method1();
	}

}

class ForStatement{
	
	public void method1() {
		//1~10������ ���� ���ٿ� ���
		// �� �յ� ���Ͽ� ���
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum += i;
			
		}
	// System.out.println("i="+i);
		System.out.println("\nsum="+sum);
	}
	
	public void method2() {
		int sumOfEven=0;  //¦���� ��
		int sumOfOdd=0;   //Ȧ���� ��
	
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
		}
		System.out.println("¦���� �� = "+sumOfEven);
		System.out.println("Ȧ���� ��= "+sumOfOdd);
		
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str=sc.nextLine();
		System.out.println("���� �Է� : ");
		int count= sc.nextInt();
				
		for(int i=1; i<=count; i++) {
			System.out.print(str+",");
		}
	}
	
	public void method4() {
//		for(int ch='A'; ch<='Z'; ch++) {
//			System.out.print((char)ch);
//		}
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
		}
		

		}
	
	public void method5() {
		int rnd=(int)(Math.random()*50+1);
		int sum=0;
		for (int i=1; i<rnd; i++) {
			sum+=i;
			
		}
		System.out.println("1����"+rnd+"������ ���� = "+sum);
	}
}



