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
		//[����1]
				double sum=0;
				for(double i=1; i<=10; i++) {
					sum=sum+(1/i);
				}
				System.out.println(sum);
	}
	
	
	
	public void home2() {
	//[����2]
			int sum=0;
			int a=0;
			for (int i=1; i<=10; i++) {
				if(i!=1 && a>=0) {
					a=-i;			//i->����̱� ������ a->����
				}else {
					a=i;			//i->����̱� ������ a->���
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
//	//[����2]
//			int sum=0;
//			int a=0;
//			for (int i=1; i<=10; i++) {
//				if(i!=1 && a>=0) {
//					a=-i;			//i->����̱� ������ a->����
//				}else {
//					a=i;			//i->����̱� ������ a->���
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
//	//[����2]
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
		System.out.print("���� �Է��Ͻÿ�.(����, ����, ��) : ");
		Scanner sc=new Scanner(System.in);
		String me=sc.nextLine();
		int a=(int)(Math.random()*3);
		String com="";
		if(a==0) {
			com="��ǻ�� : ����";
		}else if(a==1) {
			com="��ǻ�� : ����";
		}else {
			com="��ǻ�� : ��";
		}
		System.out.println(com);
		String result="";
		if(me.equals("����")) {
			if(a==0) {
				result="�й�";
			}else if(a==1) {
				result="���º�";
			}else {
				result="�¸�";
			}
		}else if(me.equals("����")) {
			if(a==0) {
				result="���º�";
			}else if(a==1) {
				result="�¸�";
			}else {
				result="�й�";
			}
		}else {
			if(a==0) {
				result="�¸�";
			}else if(a==1) {
				result="�й�";
			}else {
				result="���º�";
			}
		}
			System.out.println(result);
		
	}
}

//		if(me=="����") {
//			if(a==0) {
//				result="�й�";
//			}else if(a==1) {
//				result="���º�";
//			}else {
//				result="�¸�";
//			}
//		}else if(me=="����") {
//			if(a==0) {
//				result="���º�";
//			}else if(a==1) {
//				result="�¸�";
//			}else {
//				result="�й�";
//			}
//		}else {
//			if(a==0) {
//				result="�¸�";
//			}else if(a==1) {
//				result="�й�";
//			}else {
//				result="���º�";
//			}



