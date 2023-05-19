package chap06.sec05;

public class ProductExample {

	public static void main(String[] args) {
		Product p1=new Product("����");
		System.out.println(p1);	//p1.toString�ε� toString�� �����Ǿ����� -> toString �������̵���
		
		Product p2=new Product("���찳");
		System.out.println(p2);
		
		Product p3=new Product("����Ʈ��");
		System.out.println(p3);
		System.out.println(p1);			//static���̸� �ʱ�ȭ�� �� �ѹ� �Ͼ-���� �������� ����� ���� ���� �� �ۿ� ����

	}

}
//���赵 ���Ĵ�� �����Ҹ� ����-
//Product p1-������ ����(ȣ�⽺��) / new product()-heap -> new product() �ּҰ��� ȣ�⽺���� p1�� �Ѱ���   //�����ڸ޼ҵ� ����- ������� �ʱ�ȭ
//1. new -> 2.�����ڸ޼ҵ� -> ������ ��
class Product{		 //��ǰ�ڵ�� 1001������ �ڵ����� �����Ǿ� pid�� ����
	static long pid=1000;		//static���̸� �ʱ�ȭ�� �� �ѹ� �Ͼ-���� �������� ����� ���� ���� �� �ۿ� ����
	String pName; 
	Product(){}
	Product(String pName){ //��ǰ�ڵ�� �ڵ����� ���� - ���忡�� ������� �������/  �ܺο��� �޾Ƶ��̴°�X, ���ο��� ó�����ִ°�-��ü�� ������ �� ȣ��Ǿ ����->�����ڸ޼ҵ�
		pid++;				//static - �̱������Ͽ��� ���� ���� ���
		this.pName=pName;
	}
	
	@Override
	public String toString() {//StringŬ������ Object Ŭ�����ǵ� ObjectŬ�������� �̹� public���� ����Ǿ���-�ڽ��� ������ ���� ����� �� ���� ->public�� ����
		return "��ǰ��ȣ : "+pid+"\n��ǰ�� : "+pName;				//�ּҸ� ��ȯ�ϰ� �����Ǿ��־��� - �ش�Ŭ������ ����(��������� �������ִ� ��)�� ���ڿ��� ��ȯ�ϴ� ������ �ٲ�
		
		//������ �������°� -> getter(), toString()
		//getter->���� �ϳ��ϳ��� ������ ������ �� / toString -�װ͵��� �ϳ��� ��� ������
		//get pid / get pName
	}
}


/*
	�����ڸ޼ҵ带 �ٸ� Ŭ�������� �ҷ�����
	�����ڸ޼ҵ�� private�� ������ �ȵ� -> �ٸ� Ŭ�������� �ҷ��� �� ����
	==>�̱�������
	���� ��ü�� ��ü1�� �����ص� ��ü1�� �ϳ��� �������
	
	
*/