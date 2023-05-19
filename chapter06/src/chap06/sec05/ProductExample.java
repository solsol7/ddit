package chap06.sec05;

public class ProductExample {

	public static void main(String[] args) {
		Product p1=new Product("볼펜");
		System.out.println(p1);	//p1.toString인데 toString이 생략되어진것 -> toString 오버라이딩함
		
		Product p2=new Product("지우개");
		System.out.println(p2);
		
		Product p3=new Product("포스트잇");
		System.out.println(p3);
		System.out.println(p1);			//static붙이면 초기화가 단 한번 일어남-가장 마지막에 변경된 값을 가질 수 밖에 없음

	}

}
//설계도 형식대로 기억장소를 만듦-
//Product p1-기억장소 마련(호출스택) / new product()-heap -> new product() 주소값을 호출스택의 p1에 넘겨줌   //생성자메소드 목적- 멤버변수 초기화
//1. new -> 2.생성자메소드 -> 변수로 들어감
class Product{		 //상품코드는 1001번부터 자동으로 생성되어 pid에 저장
	static long pid=1000;		//static붙이면 초기화가 단 한번 일어남-가장 마지막에 변경된 값을 가질 수 밖에 없음
	String pName; 
	Product(){}
	Product(String pName){ //상품코드는 자동으로 생성 - 공장에서 만들어진 순서대로/  외부에서 받아들이는것X, 내부에서 처리해주는것-객체가 생성될 때 호출되어서 실행->생성자메소드
		pid++;				//static - 싱글톤패턴에서 가장 많이 사용
		this.pName=pName;
	}
	
	@Override
	public String toString() {//String클래스가 Object 클래스건데 Object클래스에서 이미 public으로 선언되었음-자식은 범위를 좁혀 사용할 수 없음 ->public만 가능
		return "제품번호 : "+pid+"\n제품명 : "+pName;				//주소를 반환하게 설정되어있었음 - 해달클래스의 정보(멤버변수가 가지고있는 값)를 문자열로 반환하는 것으로 바꿈
		
		//밖으로 내보내는것 -> getter(), toString()
		//getter->변수 하나하나를 밖으로 내보낼 때 / toString -그것들을 하나로 묶어서 내보냄
		//get pid / get pName
	}
}


/*
	생성자메소드를 다른 클래스에서 불러쓸때
	생성자메소드는 private이 붙으면 안됨 -> 다른 클래스에서 불러쓸 수 없음
	==>싱글톤패턴
	많은 객체가 객체1를 참조해도 객체1는 하나만 만들어짐
	
	
*/