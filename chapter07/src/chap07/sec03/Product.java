package chap07.sec03;

public class Product { //다형성
	int price; //상속받아야하기 때문에 앞에 private붙이면 안됨
	int bonusPoint;
	
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}
}
