import java.util.Scanner; // package가 먼저 나오고 import가 나중에 나와야 함

public class TrinomialOperator {
		static Scanner sc= new Scanner(System.in);    // static을 불러다 쓰려면 불러다 쓰려는 것도 static이어야 함
													//  static --객체 생성안해도됨
													//클래스들이 공통으로 사용해야 할 기억공간을 static으로 씀
		public static void main(String[] args) {
		// 삼항연산자 : (조건식)? 명령문1 : 명령문2
		// - 조건식의 평가 결과 참이면 명령문1을 수행하고, 
		//	 거짓이면 명령문2를 수행함
		// - 명령문1,2에는 값이나 연산식을 기술
		method2();
	}
	public static void method1() {
		// 나이를 입력 받아 성년인지 미성년인지를 판별하는 프로그램

		System.out.print("나이입력 : ");
		int age=sc.nextInt();   //문자열 입력받아 정수로 형변환 / <처음부터 정수로 입력받기>
		String str=(age>=18)? "성년자입니다" : "미성년자입니다";
		System.out.println("나이 : "+age+"==>"+str);
	}
	
	public static void method2() {
		//키보드로 정수를 입력받아 
		// 100~90 : A, 89~80 : B, 79~70 : C
		// 69~60 : D, 그 이하이면 F출력
		System.out.print("점수 입력 : ");
		int score=Integer.parseInt(sc.nextLine());  //(nextLine)엔터 키 치기 전까지 입력받은 모든게 입력되어짐
													//   - (Integer.parseInt(문자열을 정수형으로 바꿈))입력받은 것을 Integer로 바꿔줌
													//ex) 문자열 -> 실수형 (Double.parseDouble())
		String grade=(score>=90)? "A" : (score>=80)? "B" : (score>=70) ? "C" : (score>=60) ? "D" : "F";
		//String grade=(score>=90? "A" : (score>=80? "B" : (score>=70 ? "C" : (score>=60 ? "D" : "F"))) );
		System.out.println(score+"=>"+grade+"학점");
	}
	
}

//static : 프로그램이 적재될 때 만들어짐, 적재될 때 초기화됨, 메소드영역에 단 하나만 만들어짐, 


//지역변수(메소드 안에서 선언되어지는 변수), 전역변수(static), 멤버변수(클래스에 객체가 생성될 때마다 초기화)
//초기화방법  : =0, 생성자메소드 이용(멤버변수 초기화), 초기화블럭 사용

