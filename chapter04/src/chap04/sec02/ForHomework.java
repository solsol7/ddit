package chap04.sec02;

import java.util.Scanner;

public class ForHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework hm=new Homework();
		hm.home1();
	}

}

class Homework {
	
	public void home1() {
		//[문제1]
				double sum=0;
				for(double i=1; i<=10; i++) {
					sum=sum+(1/i);
				}
				System.out.println(sum);
	}
	
	
	
	public void home2() {
	//[문제2]
			int sum=0;
			int a=0;
			for (int i=1; i<=10; i++) {
				if(i!=1 && a>=0) {
					a=-i;			//i->양수이기 때문에 a->음수
				}else {
					a=i;			//i->양수이기 때문에 a->양수
				}
				sum=sum+a;
				
				
				if(a>=0 && a!=1) {
				System.out.print("+"+a);}
				else {
				System.out.print(a);
				}
			}
			
			System.out.println("="+sum);
	}



//	public void home2() {
//	//[문제2]
//			int sum=0;
//			int a=0;
//			for (int i=1; i<=10; i++) {
//				if(i!=1 && a>=0) {
//					a=-i;			//i->양수이기 때문에 a->음수
//				}else {
//					a=i;			//i->양수이기 때문에 a->양수
//				}
//				sum=sum+a;
//				
//				
//				if(a>=0 && a!=1) {
//				System.out.print("+"+a);}
//				else {
//				System.out.print(a);
//				}
//			}
//			
//			System.out.println("="+sum);
//	}
//-------------------------------------------------				
//	public void home2() {
//	//[문제2]
//			int sum=0;
//			for(int i=1; i<=10; i++) {
//				if(i%2==0) {
//					i=-1*i;
//				}
//				sum=sum+i;
//				
//				
//				if(i>=0 && i!=1){
//					System.out.print("+"+i);
//				}else {
//				System.out.print(i);
//				}
//				
//				
//				if(i%2==0) {
//					i=-1*i;
//				}
//			}
//			System.out.println("="+sum);
//	}
//				


	public void home3() {
		System.out.print("값을 입력하시오.(가위, 바위, 보) : ");
		Scanner sc=new Scanner(System.in);
		String me=sc.nextLine();
		int a=(int)(Math.random()*3);
		String com="";
		if(a==0) {
			com="컴퓨터 : 바위";
		}else if(a==1) {
			com="컴퓨터 : 가위";
		}else {
			com="컴퓨터 : 보";
		}
		System.out.println(com);
		String result="";
		if(me.equals("가위")) {
			if(a==0) {
				result="패배";
			}else if(a==1) {
				result="무승부";
			}else {
				result="승리";
			}
		}else if(me.equals("바위")) {
			if(a==0) {
				result="무승부";
			}else if(a==1) {
				result="승리";
			}else {
				result="패배";
			}
		}else {
			if(a==0) {
				result="승리";
			}else if(a==1) {
				result="패배";
			}else {
				result="무승부";
			}
		}
			System.out.println(result);
		
	}
}

//		if(me=="가위") {
//			if(a==0) {
//				result="패배";
//			}else if(a==1) {
//				result="무승부";
//			}else {
//				result="승리";
//			}
//		}else if(me=="바위") {
//			if(a==0) {
//				result="무승부";
//			}else if(a==1) {
//				result="승리";
//			}else {
//				result="패배";
//			}
//		}else {
//			if(a==0) {
//				result="승리";
//			}else if(a==1) {
//				result="패배";
//			}else {
//				result="무승부";
//			}



