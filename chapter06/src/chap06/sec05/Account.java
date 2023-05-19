package chap06.sec05;		//싱글턴패턴 만들기 --> 이해 안되면 외우기

public class Account {
	private static Account ac=null;	//account의 제한자 static->객체가 생성되든말든 method area에 딱 하나만 만들어짐, 객체생성되면 ac라는 변수에 객체의 주소넣어줌
	private Account() {}
	
	public static Account getInstance() {	//어카운트 객체생성안하고 어카운트 클래스이름으로 불러다쓰겠다  마치 Math.random()<-static메소드//반환타입이 자기자신->자기클래스가 있는 주소값 던져준다  
											//어느 클래스에서든 getInstance 이름많이 사용함
		if (ac==null) ac=new Account();	//account==null ->객체생성이 안된 상태 //account!=null->객체 생성된상태 -> 한번 생성되면 객체 새로 생성안하고 생성된 주소만 계속 반환함
		return ac;								//여기까지가 싱글턴을 구성함
		}
	
}


//this참조변수 쓸 수 없음- 객체가 생성되어지기 전에 사용하기 때문에 this가 값을 배정받지 못할때부터 사용됨


/*
public class Account {
	private static Account ac=null;	//
	private Account() {}
	
	public static Account getInstance() {	//
		if (ac==null) ac=new Account();	// Account 객체를 생성하는건 new Account();로 쓸 수 없음 
										//		- 반드시 getInstance()써야함 -> 한번 선언되면 더이상 ac가 null값이 아님 
										//  	- ac가 가진 주소(처음에 getInstance 이용해서 ac에  들어간 주소)를 그대로 반환함
		return ac;						//
		}
	
}
*/

