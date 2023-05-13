package chap04.sec01;

import java.util.Scanner;

public class ifStatement {
	static Scanner sc=new Scanner(System.in); //멤버필드(멤버변수)
	public static void main(String[] args) {
		method09();
	}

	public static void method01() {
		//사용자 이름과 점수를 입력 받아 60점 이상이면 
		// "이름 합격입니다" 메시지 출력
		String message="";
		System.out.print("이름 입력 : ");
		String name=sc.nextLine();
		System.out.print("점수 입력 : ");
		int score=sc.nextInt();
		
		if(score>=60) {
			message=name+"은(는) 합격입니다";
			System.out.println(message);
		}
	}
	
	public static void method02() {
		//사용자 이름과 점수를 입력 받아 60점 이상이면 
		// "이름 합격입니다" 메시지 출력
		// 60점 이하이면 "이름 불합격입니다" 메시지 출력
		String message="";
		System.out.print("이름 입력 : ");
		String name=sc.nextLine();
		System.out.print("점수 입력 : ");
		int score=sc.nextInt();
		
		if(score>=60) {
			message=name+"은(는) 합격입니다";
		}else {
			message=name+"은(는) 불합격입니다";
		}
		System.out.println(message);
}
	
	public static void method03() {
		/* [문제] 월을 입력받아
	3~5월 : "봄입니다", 
	6~8월 : "여름입니다",
	9~11월 : "가을입니다",
	12~2월 : "겨울입니다"를 출력하는 프로그램 작성 */
		System.out.print("월 입력 : ");
		int month=sc.nextInt();
		if(3<=month && month<=5) {
			System.out.println("봄입니다");
		} else if(6<=month && month<=8) {
			System.out.println("여름입니다");
		} else if(9<=month && month<=11) {
			System.out.println("가을입니다");
		} else if(12<=month && month<=2) {
			System.out.println("겨울입니다");
		}
	}
	
	public static void method04() {
		/*  [문제] 체중과 키를 입력하여 BMI지수를 구하고 BMI지수에 따른 평가를 출력하는 프로그램 작성
		BMI지수 = 체중(kg)/(키(cm)*키(cm))
		BMI지수			판정
		-------------------
		0.0 ~ 18.4		저체중
		18.5 ~ 22.9		정상
		23.0 ~ 24.9		과제충
		25.0 ~ 29.9		비만
		30.0 그 이상 		고도비만        */
		System.out.print("체중 입력(kg) : ");
		double kg = sc.nextDouble();
		System.out.print("키 입력(cm) : ");
		double cm = sc.nextDouble();
		double m = cm*0.01;
		double BMI = kg/(m*m);
		if(0.0<=BMI && BMI<=18.4) {
			System.out.println("저체중");
		} else if(18.5<=BMI && BMI<=22.9) {
			System.out.println("정상");
		} else if(23.0<=BMI && BMI<=24.9) {
			System.out.println("과제충");
		} else if(25.0<=BMI && BMI<=29.9) {
			System.out.println("비만");
		} else if(30.0<=BMI) {
			System.out.println("고도비만");
		}
	}
	
	public static void method05() {
		/* [문제] 헌혈하려고 한다. 헌혈의 조건은 나이가 18세 이상이며, 몸무게가 50kg이상이어야 한다.
		 		이를 중첩 if문을 사용하여 구성하시오.
		 		나이와 몸무게는 설정함.  */
		System.out.print("나이 입력 : ");
		int age=sc.nextInt();
		System.out.print("체중 입력 : ");
		double kg=sc.nextDouble();
		if(age>=18) {
			if(kg>=50) {
				System.out.println("가능");
			}else {
				System.out.println("불가능");
			}
		}else {
			System.out.println("불가능");
		}
	}
	
	public static void method06() {
		// [문제] 임의의 수를 입력 받아 홀수와 짝수를 판별하시오.
		System.out.print("숫자 입력 : ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
	}
	
	public static void method07() {
		/* [문제] 점수를 입력 받아 그 값이  99-97:A+ / 96-93:A0 / 92-90:A-
		  						89-87:B+ / 86-83:B0 / 82-80:B-
		  						79-77:C+ / 76-73:C / 72-70:C-
		  						그 이하는 F, 중첩 if 사용  */
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		String grade="";
		if(score>=90) {
			grade="A";
			if(90<=score && score<= 92) {
				grade=grade+"-";
			}else if (93<=score && score<=96) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else if(80<=score && score<=89) {
			grade="B";
			if(80<=score && score<= 82) {
				grade=grade+"-";
			}else if (83<=score && score<=86) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else if(70<=score && score<=79) {
			grade="C";
			if(70<=score && score<= 72) {
				grade=grade+"-";
			}else if (73<=score && score<=76) {
				grade=grade+"0";
			} else {
				grade=grade+"+";
			}
		}else {
			grade="F";
		}
		System.out.println(grade);
}
	

	public static void method08() {
		// [문제] 임의의 수를 입력 받아 홀수와 짝수를 판별하시오. (삼항연산자)
		String s="";
		System.out.print("숫자 입력  : ");
		int i = sc.nextInt();
		s= i%2==0?"짝수":"홀수";
		System.out.println(s);
		
	}
	
	public static void method09() {
		System.out.print("값을 입력하시오.");
		String me=sc.nextLine();
		int a=(int)(Math.random()*2+1);
		String sys="";
		if(a==0) {
			sys="시스템 : 바위";
		}else if(a==1) {
			sys="시스템 : 가위";
		}else {
			sys="시스템 : 보";
		}
		System.out.println(sys);
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
//		}



