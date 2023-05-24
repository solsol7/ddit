package chap05.sec07;

public class Controller {

		public static void main(String[] args) {
			Menu[] m1=Menu.values();		//value의 값이 지정되었을 때 값들이 클래스객체의 배열 타입으로 반환됨 / 반환타입이 해당 열거형 객체의 배열 타입
			for(int i=0; i<m1.length; i++) {
				System.out.println(m1[i]);  //m1만 쓰면 주소값 반환됨    //m1[i] -> 상수값 반환
			}
			
			for(Menu m:Menu.values()) {				
				System.out.print(m+"(");
				System.out.println(m.getValue()+")");		//value를 반환하게 하는 메소드 호출
			}
		}
}
