//package chap07.sec03;
//
//import java.util.ArrayList;
//
//public class Buyer {//구매자 클래스
//	int money;
//	int bonusPoint;
//	Product[] cart=new Product[10];			//물건들 ->Product타입을 상속받음 -> Product타입이면 담을 수 있음
//											//new연산자에 의해 객체가 생성되려면 생성자메소드가 있어야함 -> 객체를 생성한 게 아니라 생성된 객체를 담을 수 있는 배열만 생성됨
//	
//	//ArrayList<Product> cart=new ArrayList<Product>();		//배열을 써도 되는데 배열은 크기가 정해져있음-> 크기가 가변적인 ArrayList 쓸 수 있음 . 꺼내올때는 get, 집어넣을때는 add
//	int i=0; 								//카트 배열에 사용할 인덱스
//	
//
//	Buyer(){	//멤버변수 초기화
//		money=5000;
//		bonusPoint=0;
//	}
//	
//	void buy(Product p) {		//부모클래스인  Product클래스에 자식클래스인 컴퓨터, 스마트폰, Tv들이 각각 배정이 되어짐  // 판매수량도 매개변수로 받으면 수량도 체크할 수 있음
//		money=money-p.price;
//		bonusPoint+=p.bonusPoint;
//		//cart.add(p);		//차례대로 저장됨
//		cart[i++]=p;		
//		/*	void buy(Tv t) {
//		money=money-t.price;
//		bonusPoint+=t.bonusPoint;
//		System.out.println(t+"를 구입했습니다");
//	}
//	
//	void buy(Computer c) {
//		money=money-c.price;
//		bonusPoint+=c.bonusPoint;
//		System.out.println(c+"를 구입했습니다");
//	}
//	
//	void buy(SmartPhone s) {
//		money=money-s.price;
//		bonusPoint+=s.bonusPoint;
//		System.out.println(s+"를 구입했습니다");
//	}
//	*/
//	}
//	
//	void summary() {
//		int sum=0;			//구매금액합계 
//		String list=""; 	//구매목록 - 구매된 목록들을 보관해야함-반품... 판매수량도 결정(Product 클래스에서 멤버변수로 선언하면 됨)
//		
//		
///*		for(int i=0; i<cart.size(); i++) {
//			if(cart.get(i)!=null) {
//				sum=sum+cart.get(i).price;
//				bonusPoint+=cart.get(i).bonusPoint;
//				list+=cart.get(i)+",  ";
//			}
//		}
//		*/
//		for(Product p : cart) {
//			if(p!=null) {
//				sum=sum+p.price;
//				bonusPoint+=p.price/10;
//				list+=p+",  "; //p.toString이 생략된 것 -> 오버라이딩함
//			}
//		}
//		
//		System.out.println("구매목록 : "+list);
//		System.out.println("구매금액 합계 : "+sum);
//		System.out.println("지급 보너스포인트 : "+bonusPoint);
//		System.out.println("남은 돈 : "+(money-sum));
//	}
//	
//
//}
//
//-----------------------------
//*/
package chap07.sec03;

public class Buyer {
	int money;
	int bonusPoint;
	Product[] cart=new Product[10];			
	int i=0; 							
	

	Buyer(){
		money=50000;
		bonusPoint=0;
	}
	
	void buy(Product p) {		
		money=money-p.price;
		bonusPoint+=p.bonusPoint;
		cart[i++]=p;		

	}
	void summary() {
		int sum=0;			
		String list=""; 	
		
		
		for(Product p : cart) {
			if(p!=null) {
				sum=sum+p.price;
				bonusPoint+=p.price/10;
				list+=p+",  "; 
			}
		}
		
		System.out.println("구매목록 : "+list);
		System.out.println("구매금액 합계 : "+sum);
		System.out.println("지급 보너스포인트 : "+bonusPoint);
		System.out.println("남은 돈 : "+(money-sum));
	}
	

}
