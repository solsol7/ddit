package chap07.sec03;

public class Product { //������
	int price; //��ӹ޾ƾ��ϱ� ������ �տ� private���̸� �ȵ�
	int bonusPoint;
	
	public Product(int price) {
		this.price=price;
		bonusPoint=price/10;
	}
}
