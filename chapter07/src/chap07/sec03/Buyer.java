//package chap07.sec03;
//
//import java.util.ArrayList;
//
//public class Buyer {//������ Ŭ����
//	int money;
//	int bonusPoint;
//	Product[] cart=new Product[10];			//���ǵ� ->ProductŸ���� ��ӹ��� -> ProductŸ���̸� ���� �� ����
//											//new�����ڿ� ���� ��ü�� �����Ƿ��� �����ڸ޼ҵ尡 �־���� -> ��ü�� ������ �� �ƴ϶� ������ ��ü�� ���� �� �ִ� �迭�� ������
//	
//	//ArrayList<Product> cart=new ArrayList<Product>();		//�迭�� �ᵵ �Ǵµ� �迭�� ũ�Ⱑ ����������-> ũ�Ⱑ �������� ArrayList �� �� ���� . �����ö��� get, ����������� add
//	int i=0; 								//īƮ �迭�� ����� �ε���
//	
//
//	Buyer(){	//������� �ʱ�ȭ
//		money=5000;
//		bonusPoint=0;
//	}
//	
//	void buy(Product p) {		//�θ�Ŭ������  ProductŬ������ �ڽ�Ŭ������ ��ǻ��, ����Ʈ��, Tv���� ���� ������ �Ǿ���  // �Ǹż����� �Ű������� ������ ������ üũ�� �� ����
//		money=money-p.price;
//		bonusPoint+=p.bonusPoint;
//		//cart.add(p);		//���ʴ�� �����
//		cart[i++]=p;		
//		/*	void buy(Tv t) {
//		money=money-t.price;
//		bonusPoint+=t.bonusPoint;
//		System.out.println(t+"�� �����߽��ϴ�");
//	}
//	
//	void buy(Computer c) {
//		money=money-c.price;
//		bonusPoint+=c.bonusPoint;
//		System.out.println(c+"�� �����߽��ϴ�");
//	}
//	
//	void buy(SmartPhone s) {
//		money=money-s.price;
//		bonusPoint+=s.bonusPoint;
//		System.out.println(s+"�� �����߽��ϴ�");
//	}
//	*/
//	}
//	
//	void summary() {
//		int sum=0;			//���űݾ��հ� 
//		String list=""; 	//���Ÿ�� - ���ŵ� ��ϵ��� �����ؾ���-��ǰ... �Ǹż����� ����(Product Ŭ�������� ��������� �����ϸ� ��)
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
//				list+=p+",  "; //p.toString�� ������ �� -> �������̵���
//			}
//		}
//		
//		System.out.println("���Ÿ�� : "+list);
//		System.out.println("���űݾ� �հ� : "+sum);
//		System.out.println("���� ���ʽ�����Ʈ : "+bonusPoint);
//		System.out.println("���� �� : "+(money-sum));
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
		
		System.out.println("���Ÿ�� : "+list);
		System.out.println("���űݾ� �հ� : "+sum);
		System.out.println("���� ���ʽ�����Ʈ : "+bonusPoint);
		System.out.println("���� �� : "+(money-sum));
	}
	

}
