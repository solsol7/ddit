package chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		// boolean : true/false를 표현하는 논리타입
		//			1byte, 조건문에 사용되어 프로그램 실행제어 수행
		//			다른 데이터타입과 형변환이 발생되지 않음
		int age=30;
		boolean flag=false;
		
		flag=age>=25;
		
		System.out.println(flag);

	}

}

