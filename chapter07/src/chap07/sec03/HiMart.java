package chap07.sec03;

public class HiMart {

	public static void main(String[] args) {
/*		Buyer b=new Buyer();
		Tv t=new Tv();
		Computer c=new Computer();
		SmartPhone s=new SmartPhone();
		
		b.buy(t);
//		System.out.println("³²Àº µ· : "+b.money);
		
		b.buy(s);	
		b.buy(c);
		b.summary();
		*/
		Buyer b=new Buyer();
		
		b.buy(new Tv());
		b.buy(new SmartPhone());
		b.buy(new Computer());
		b.summary();
	}
	
		
		

}
