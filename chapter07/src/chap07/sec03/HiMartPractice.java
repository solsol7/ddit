package chap07.sec03;

public class HiMartPractice {

	public static void main(String[] args) {
		Buy b1=new Buy();
		
		b1.buy(new TV1());
		b1.buy(new Radio());
		b1.receipt();
		
	}
}

class Product1{
	int price;
	int point;
	
	Product1(){}
	Product1(int price){
		this.price=price;
		point=price/10;
	}
}

class TV1 extends Product1{
	TV1(){
		super(1400);
	}
	@Override
	public String toString() {
		return "TV";
	}
}

class Radio extends Product1{
	Radio(){
		super(900);
	}
	@Override
	public String toString() {
		return "Radio";
}
}

class Mouse extends Product1{
	Mouse(){
		super(700);
	}
	@Override
	public String toString() {
		return "Mouse";
}
}

class Buy{
	int money;
	int point;
	Product1[] cart=new Product1[10];
	int i=0;
	Buy(){
		money=50000;
		point=0;
	}
	
	public void buy(Product1 product) {
		money=money-product.price;
		point+=product.point;
		cart[i]=product;
		i++;
	}

	public void receipt() {
		int sum=0;
		int point=0;
		String list="";
		for(Product1 p1 : cart) {
			if(p1!=null) {
			list+=p1+",";								//자동형변환!!!! - 정수,실수,문자 + 문자열 = 문자열  ex) ""+10 = "10"
			sum+=p1.price;
			point+=p1.point;
			}
		}

		System.out.println("구매 품목 : "+list);
		System.out.println("총액 : "+sum);
		System.out.println("잔액 : "+money);
		System.out.println("포인트 : "+point);
	}

}
