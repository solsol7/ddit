package chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample {  

	public static void main(String[] args) {
		SwitchStatement sw=new SwitchStatement(); //객체 생성 / 힙에 생성한 메모리 주소를 sw에게 줌, sw출력하면 주소값 나옴
		//sw.method1();
		//sw.method2();
		//sw.method3();
		sw.method5();

}
}

class SwitchStatement {//메인메소드가 포함된 클래스만 public이 붙어야 함, 다른 파일로 만들때는 붙어도 O
	//지역변수는 초기화시켜야함, 멤버변수는 초기화 안시켜도 자바에서 초기화시켜줌
	Scanner sc=new Scanner(System.in);   // 메인메소드에서 쓰면(static이 붙은 메소드) Scanner 앞에 static을 써야함
										//										static - 전역변수, 여러 클래스가 사용하는 변수
	public void method1() {//메소드 만들 때 접근제어자 써야함(public- 어디에서나(다른 클래스, 다른 메소드) 불러서 쓸 수 O)
			//					 protected 패키지 안에 있는 모든 파일에서 사용할 수 O
			// 					default 같은 패키지 안에서만 접근 가능
			//					private 하나의 클래스 안에서만 접근 가능 (대부분의 멤버변수)
			// void - 반환타입 없다. 되돌려주는 값이 없다
			System.out.println("회원등급입력(1-3) : ");
			int grade = Integer.parseInt(sc.nextLine());
			
			switch(grade) {
			case 1 : 
				System.out.println("VIP회원 입니다");
				break;
			case 2 : 
				System.out.println("우수 회원입니다");
				break;
			case 3 :
				System.out.println("일반 회원입니다");
				break;
			default : 
				System.out.println(grade+"는 잘못된 등급 코드 입니다.");
			}
	}
	
	public void method2() {
		System.out.print("월 입력(1-12) : ");
		int month = sc.nextInt();//->공백기준 구분 /  int month=Integer.parseInt(sc.nextLine());-->엔터기준 구분
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: // or로 연결될 때 쭉 연결해서 써도 o
			 System.out.println(month+"월은 끝나는 날짜가 31일까지 있는 달입니다");
			 break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월은 끝나는 날짜가 30일까지 있는 달입니다");
		default : 
			System.out.println(month+"월은 끝나는 날짜가 28일인 2월입니다.");
		}
	}
	
	public void method3() {
		System.out.println("국가명 영문 코드 입력(kr, jp, ch) : ");
		String code=sc.nextLine();
		switch (code) {
		case "kr" :
			System.out.println("대한민국");
			break;
		case "jp" : 
			System.out.println("일본");
			break;
		case "ch" : 
			System.out.println("중국");
			break;
		}
	}
	
	public void method4() {
		System.out.println("점수 입력 : ");
		int score=sc.nextInt();
		String grade = "";
		switch (score/10) {
		case 10 :
			grade = "A";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		default :
			grade = "fail";
		}
			switch(score%10) {
			case 0: case 1: case 2:
				grade=grade+"-";
				break;
			case 3: case 4: case 5:
				grade=grade+"0";
				break;
			case 7: case 8: case 9:
				grade=grade+"+";
		}
		System.out.println("점수"+score+"는 "+grade+" 학점입니다.");
	}
	
	public void method5() {
		double i = 0.2422;
		double a = i*24;
		int c = 52;
		System.out.println(a);
		System.out.println(a%1); // 5.8128을 1로 나눈 나머지를 구했더니 0.8128이 나옴
		System.out.println(a%2);
		System.out.println(c%10); // 52/10=5.2 -->  5.2인데 왜 나머지가 0.2가 아니라 2가 나옴?
	}
}

