package chap06.sec01;

import java.util.Scanner;

/*
//[문제1] main메서드를 실행시켰을 때 제조회사, 생산년도, 크기를 출력하는 Tv클래스를 작성하시오.
public class ClassQuestion01 {

	public static void main(String[] args) {
		ClassTv tv=new ClassTv("삼성",2019,"200*300");
		System.out.println(tv);
	}

}

class ClassTv{
	private String maker;
	private int year;
	private String size;
	
	
	public ClassTv() {};
	
	public ClassTv(String maker,int year,String size) {  //왜 메소드안쓰고 생성자메소드?
		this.maker=maker;
		this.year=year;
		this.size=size;
	}

	
	@Override
	public String toString() {
		return "제조사 : "+maker+"       생산년도 : "+year+"    크기 : "+size;
	}
}
*/


///*
//2)세과목의 점수를 입력받아 총점과 평균을 출력하는 Grade 클래스 생성
public class ClassQuestion01 {

	public static void main(String[] args) {
		ClassGrade gr=new ClassGrade();
		gr.classGrade();
		System.out.println("총점 : "+gr.sum());
		int s=gr.sum();				//return 값을 s변수에 넣기
		System.out.println("평균 : "+gr.average(s));
	}
}

class ClassGrade {
	int[] score=new int[3]; //(1과목, 2과목, 3과목)
	
	public ClassGrade() {};
	
	public void classGrade() {
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"과목 점수를 입력하세요 : ");
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
	
	public int average(int s) {		//s값을 가져와 계산하기
		int average=s/score.length;
		return average;
	}
}

//*/

/*
//3)입금(deposit), 출금(withdraw), 잔고확인(getbalance)을 수행하는 계좌클래스(Account)를 생성하시오.
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
			System.out.println("기능을 선택하세요.");
			System.out.print("1. 잔액조회   2.입금   3.출금  4.종료");
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
				System.out.println("종료되었습니다.");
				a=false;
				break;
			default :
				System.out.print("잘못된 입력입니다.  ");
			}
			
		}
	}

	public void getBalance(){
		System.out.println("잔액 : "+this.getBalance);
	}

	public void deposit() {
		System.out.print("입금액 : ");
		int money=sc.nextInt();
		this.getBalance=this.getBalance+money;
		System.out.println("잔액 : "+this.getBalance);
	}

	public void withdraw() {
		System.out.println("출금액 : ");
		int money=sc.nextInt();
		if(money<=this.getBalance) {
			this.getBalance=this.getBalance-money;
			System.out.println("잔액 : "+this.getBalance);
		}else {
			money=0;
			System.out.println("잔액이 부족합니다.");
		}
	}
}
*/


