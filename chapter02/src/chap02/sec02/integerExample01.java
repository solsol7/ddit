package chap02.sec02;

public class integerExample01 {

	public static void main (String[] args) {
		// 정수타입: byte short int(기본형) long
		//1)
		//byteMethod();
		//shortMethod();
		intMethod();
	}
	public static void byteMethod() {
		//byte : 1 byte제공
		//       127~ -218까지의 정수를  저장, 
		//       값의 범위를 벗어나면 오류
		//       연산된 데이터가 범위를 벗어나면 순환전용된 결과 반환
		//       (0,1,2,..127,-128,-127,...-1) 
		byte b1=127;
		byte b2=-128;
		 System.out.println("b1="+b1);
		b1++; 
		// b1의 값을 1 증가 시켜라
		System.out.println("b1="+b1);
	}

		public static void shortMethod() {
			//short : 2 byte제공
			//       32767 ~ -32768 까지의 정수를  저장, 
			//       값의 범위를 벗어나면 오류
			//       연산된 데이터가 범위를 벗어나면 순환전용된 결과 반환
			//       (0,1,2,..32767,-32768,-32767,...-1) 
			
			//short sh=32768; 오류 
			short sh2=200;
			short sh3=32767;
			System.out.println(++sh3);
			
	}
		
		public static void intMethod() {
			//int :  4 byte제공
			//       기본정수형
			//       2147483647 ~ -2147483648 까지의 정수를  저장, 
			//       값의 범위를 벗어나면 오류
			//       연산된 데이터가 범위를 벗어나면 순환전용된 결과 반환
			//       (0,1,2,..2147483647,-2147483648,-2147483647,...-1) 
			//       int 보다 작은것들은  int로 변함 
			//기본 정수타입
			
			int num=200;
			int num1=1000000;
			int res=num*num1;
			System.out.println(res);
		}
}

