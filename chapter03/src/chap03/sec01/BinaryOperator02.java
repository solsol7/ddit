package chap03.sec01;

public class BinaryOperator02 {

	public static void main(String[] args) {
		// 비트, 대입, 이동 =>이항연산자
		bitwiseOperator();
		//shiftOperator();
	}
	public static void bitwiseOperator() {
		//비트별 연산자 : |, &, ^
		int n1=35;
		int n2=23;
		System.out.println("n1 & n2 ="+(n1 & n2));
		System.out.println("n1 | n2 ="+(n1 | n2));
		System.out.println("n1 ^ n2 ="+(n1 ^ n2));
		
		
		
	}
	
	public static void shiftOperator() {
		//shift : >>(right shift), <<(left shift)
		//, >>>(right shift with sign bit)
		/*부호비트 이동에서 제외
		  << 결과 : 원래의 수 * 2^이동시킨비트수    ex) 35<<2 -> 35*2^2
		  >> 빈공간은 왼쪽에 발생(남은자리 부호가 확장되어 들어감)
			 (원래의수%2^이동시킬비트수)의 몫 */
		int num=35;
		System.out.println("35>>2 = "+(num>>2));
		System.out.println("35<<2 = "+(num<<2));
		num=-35;
		System.out.println("35>>>2 = "+(num>>>2));
		
	
	}
	
	public static void assignOperator() {
		//대입 : =, 우선순위가 가장 낮음
		//결합대입연산자 : +=,-=, /=, *=, %=
		//	변수=변수 연산자(+, - , / , *) 값
		//	변수 연산자= 값
		
		int res=0;
		int num=100;
		
		res=res+10; //res+=10
		
		res= res*(num/10); // res*=(num/10)
		
	}
	
}

