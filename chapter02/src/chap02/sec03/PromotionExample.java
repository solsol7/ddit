package chap02.sec03;

public class PromotionExample {

	public static void main(String[] args) {
		// promotion : 자동형 변환
		//표현범위가 큰쪽으로 변환
		//수식에서는 int보다 작은 타입의 자료는  int로 변환 됨
		byte b1=100;
		short s1=20;
		
		int res1=b1+s1; //short (X) -> b1, s1가 int보다 작은 타입이므로 int로 변환
		float f1=20f;
		long l1=1000L;
		
		float res2=f1+l1;  //long (X)  -> long보다 float가 표현범위가 더 넓음
		

	}

}

