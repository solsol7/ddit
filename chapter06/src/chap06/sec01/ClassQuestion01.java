package chap06.sec01;

import java.util.Scanner;

/*
//[����1] main�޼��带 ��������� �� ����ȸ��, ����⵵, ũ�⸦ ����ϴ� TvŬ������ �ۼ��Ͻÿ�.
public class ClassQuestion01 {

	public static void main(String[] args) {
		ClassTv tv=new ClassTv("�Ｚ",2019,"200*300");
		System.out.println(tv);
	}

}

class ClassTv{
	private String maker;
	private int year;
	private String size;
	
	
	public ClassTv() {};
	
	public ClassTv(String maker,int year,String size) {  //�� �޼ҵ�Ⱦ��� �����ڸ޼ҵ�?
		this.maker=maker;
		this.year=year;
		this.size=size;
	}

	
	@Override
	public String toString() {
		return "������ : "+maker+"       ����⵵ : "+year+"    ũ�� : "+size;
	}
}
*/


///*
//2)�������� ������ �Է¹޾� ������ ����� ����ϴ� Grade Ŭ���� ����
public class ClassQuestion01 {

	public static void main(String[] args) {
		ClassGrade gr=new ClassGrade();
		gr.classGrade();
		System.out.println("���� : "+gr.sum());
		int s=gr.sum();				//return ���� s������ �ֱ�
		System.out.println("��� : "+gr.average(s));
	}
}

class ClassGrade {
	int[] score=new int[3]; //(1����, 2����, 3����)
	
	public ClassGrade() {};
	
	public void classGrade() {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"���� ������ �Է��ϼ��� : ");
			score[i]=Integer.parseInt(sc.nextLine());
			this.score[i]=score[i];
		}
	}

	public int sum() {
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		return sum;
		}
	
	public int average(int s) {		//s���� ������ ����ϱ�
		int average=s/score.length;
		return average;
	}
}

//*/

/*
//3)�Ա�(deposit), ���(withdraw), �ܰ�Ȯ��(getbalance)�� �����ϴ� ����Ŭ����(Account)�� �����Ͻÿ�.
public class ClassQuestion01 {

	public static void main(String[] args) {
		ClassBank bk=new ClassBank();
		bk.selection();
		
	}
}

class ClassBank{
	Scanner sc=new Scanner(System.in);
	private int deposit;
	private int withdraw;
	private int getBalance=100000;
	
	
	public ClassBank() {}
/*	public ClassBank(int deposit, int withdraw, int getBalance) {
		this.deposit=deposit;
		this.withdraw=withdraw;
		this.getBalance=getBalance;
	}
	
	public void selection() {
		boolean a=true;
		while(a) {
			System.out.println("---------------------------");
			System.out.println("����� �����ϼ���.");
			System.out.print("1. �ܾ���ȸ   2.�Ա�   3.���  4.����");
			int selection=sc.nextInt();
			switch(selection) {
			case 1 :
				getBalance(45);
				break;
			case 2 :
				deposit();
				break;
			case 3 :
				withdraw();
				break;
			case 4 :
				System.out.println("����Ǿ����ϴ�.");
				a=false;
				break;
			default :
				System.out.print("�߸��� �Է��Դϴ�.  ");
			}
			
		}
	}

	public void getBalance(){
		System.out.println("�ܾ� : "+this.getBalance);
	}

	public void deposit() {
		System.out.print("�Աݾ� : ");
		int money=sc.nextInt();
		this.getBalance=this.getBalance+money;
		System.out.println("�ܾ� : "+this.getBalance);
	}

	public void withdraw() {
		System.out.println("��ݾ� : ");
		int money=sc.nextInt();
		if(money<=this.getBalance) {
			this.getBalance=this.getBalance-money;
			System.out.println("�ܾ� : "+this.getBalance);
		}else {
			money=0;
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}
*/


