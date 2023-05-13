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
		//1~10사이의 수를 한줄에 출력
		// 그 합도 구하여 출력
		int sum=0;
		for(int i=0; i<10; i++) {
			System.out.printf("%3d",(i+1));
			sum += i;
			
		}
	// System.out.println("i="+i);
		System.out.println("\nsum="+sum);
	}
	
	public void method2() {
		int sumOfEven=0;  //짝수의 합
		int sumOfOdd=0;   //홀수의 합
	
		for(int i=1; i<101; i++) {
			if(i%2==0) {
				sumOfEven+=i;
			}else {
				sumOfOdd+=i;
			}
		}
		System.out.println("짝수의 합 = "+sumOfEven);
		System.out.println("홀수의 합= "+sumOfOdd);
		
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str=sc.nextLine();
		System.out.println("정수 입력 : ");
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
		System.out.println("1부터"+rnd+"까지의 합은 = "+sum);
	}
}



